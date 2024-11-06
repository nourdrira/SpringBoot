package tn.esprit.etudecas1.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.etudecas1.entities.Chambre;
import tn.esprit.etudecas1.repository.ChambreRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ChambreServiceIMP implements IChambreService {

    private final ChambreRepository chambreRepository;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        Optional<Chambre> chambre = chambreRepository.findById(idChambre);
        return chambre.orElse(null);  // Retourne null si la chambre n'est pas trouvée
    }


}
