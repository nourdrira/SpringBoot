package tn.esprit.etudecas1.services;

import tn.esprit.etudecas1.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    List<Universite> retrieveAllUniversites();
    Universite retrieveUniversiteById(long idU);
    void deleteUniversite(long idU);
    Universite affecterFoyerAUniversite(long idF, long idU);
}
