package tn.esprit.etudecas1.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.etudecas1.entities.Foyer;
import tn.esprit.etudecas1.entities.Universite;
import tn.esprit.etudecas1.repository.FoyerRepository;
import tn.esprit.etudecas1.repository.UniversiteRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UniversiteServiceIMP implements IUniversiteService {
    private final UniversiteRepository universiteRepository;
    private final FoyerRepository foyerRepository;

    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite retrieveUniversiteById(long idU) {
        return universiteRepository.findById(idU).orElse(null);
    }


    @Override
    public Universite affecterFoyerAUniversite(long idF, long idU) {
        Foyer f = foyerRepository.findById(idF).orElse(null);
        Universite u = universiteRepository.findById(idU).orElse(null);
        // Vérification si le foyer et l'université existent
        if (f == null) {
            throw new RuntimeException("Foyer non trouvé");
        }
        if (u == null) {
            throw new RuntimeException("Université non trouvée");
        }

        // Affectation du foyer à l'université
        u.setFoyer(f);

        // On assure également que l'université est assignée à l'objet Foyer (relation bidirectionnelle)
        f.setUniversite(u);

        // Sauvegarde de l'université avec l'affectation du foyer
        return universiteRepository.save(u);
    }
    // Méthode pour désaffecter un foyer d'une université
    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        // Recherche de l'université par son ID
        Universite u = universiteRepository.findById(idUniversite).orElse(null);

        // Vérification de l'existence de l'université
        if (u == null) {
            throw new RuntimeException("Université non trouvée");
        }

        // Suppression de l'affectation du foyer
        Foyer f = u.getFoyer();
        if (f != null) {
            f.setUniversite(null); // Désaffecter le foyer
        }
        u.setFoyer(null); // Désaffecter l'université du foyer

        // Sauvegarde de l'université après la désaffectation
        return universiteRepository.save(u);
    }

    // Méthode pour ajouter un foyer, ses blocs associés et l'affecter à une université
    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        // Recherche de l'université par son ID
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);

        if (universite == null) {
            throw new RuntimeException("Université non trouvée");
        }

        // Lier chaque bloc du foyer à ce foyer
        foyer.getBlocs().forEach(bloc -> bloc.setFoyer(foyer));

        // Sauvegarder le foyer avec ses blocs associés
        Foyer savedFoyer = foyerRepository.save(foyer);

        // Affecter le foyer à l'université
        universite.setFoyer(savedFoyer);

        // Sauvegarder l'université après l'affectation
        universiteRepository.save(universite);

        // Retourner le foyer qui a été ajouté et affecté à l'université
        return savedFoyer;
    }


}
