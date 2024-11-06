package tn.esprit.etudecas1.services;

import tn.esprit.etudecas1.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant e);
    Etudiant updateEtudiant(Etudiant e);
    List<Etudiant> retrieveAllEtudiant();
    Etudiant retrieveById(long idE);
    void deleteEtudiant(long idE);
}
