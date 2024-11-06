package tn.esprit.etudecas1.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.etudecas1.entities.Bloc;
import tn.esprit.etudecas1.entities.Chambre;
import tn.esprit.etudecas1.repository.BlocRepository;
import tn.esprit.etudecas1.repository.ChambreRepository;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BlocServiceIMP implements IBlocService {

    private final BlocRepository blocRepository;
    private final ChambreRepository chambreRepository;

    @Override
    public List<Bloc> retrieveBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        // Vous pouvez ajouter des validations ou des ajustements avant la mise à jour
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        // Ajoutez des validations si nécessaire avant l'ajout
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        Optional<Bloc> bloc = blocRepository.findById(idBloc);
        return bloc.orElse(null); // Renvoie null si le bloc n'existe pas
    }

    @Override
    public void deleteBloc(long idB) {blocRepository.deleteById(idB);}
    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) {
        // Récupérer le Bloc à partir de son id
        Bloc bloc = blocRepository.findById(idBloc).orElse(null);

        if (bloc == null) {
            throw new RuntimeException("Bloc non trouvé");
        }

        // Récupérer les chambres à partir des numéros
        List<Chambre> chambres = chambreRepository.findByNumcIn(numChambre);

        if (chambres.isEmpty()) {
            throw new RuntimeException("Aucune chambre trouvée avec les numéros spécifiés");
        }

        // Associer chaque chambre au Bloc
        for (Chambre chambre : chambres) {
            chambre.setBloc(bloc);  // Met à jour la relation entre Chambre et Bloc
        }

        // Sauvegarder les chambres mises à jour
        chambreRepository.saveAll(chambres);

        // Retourner le Bloc avec les chambres affectées
        return bloc;
    }

}
