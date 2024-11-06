package tn.esprit.etudecas1.services;

import lombok.AllArgsConstructor;
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
    public void deleteUniversite(long idU) {
        universiteRepository.deleteById(idU);
    }


    @Override
    public Universite affecterFoyerAUniversite(long idF, long idU) {
        Foyer f = foyerRepository.findById(idF).orElse(null);
        Universite u = universiteRepository.findById(idU).orElse(null);
        u.setFoyer(f);

        return universiteRepository.save(u);
    }


}
