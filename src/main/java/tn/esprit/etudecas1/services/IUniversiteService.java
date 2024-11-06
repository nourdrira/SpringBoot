package tn.esprit.etudecas1.services;

import tn.esprit.etudecas1.entities.Foyer;
import tn.esprit.etudecas1.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    List<Universite> retrieveAllUniversites();
    Universite retrieveUniversiteById(long idU);
    Universite affecterFoyerAUniversite(long idF, long idU);
    Universite desaffecterFoyerAUniversite(long idUniversite);

    // Méthode pour ajouter un foyer, ses blocs associés et l'affecter à une université
    Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite);
}
