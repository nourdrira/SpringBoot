package tn.esprit.etudecas1.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.etudecas1.entities.Etudiant;
import tn.esprit.etudecas1.repository.EtudiantRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class EtudiantServiceIMP implements IEtudiantService {
    private final EtudiantRepository etudiantRepository;

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> retrieveAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant retrieveById(long idE) {
        return etudiantRepository.findById(idE).orElse(null);
    }

    @Override
    public void deleteEtudiant(long idE) {
        etudiantRepository.deleteById(idE);
    }
}
