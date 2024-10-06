package tn.esprit.etudecas1.services;

import tn.esprit.etudecas1.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    public Foyer addFoyer(Foyer foyer);
    public Foyer updateFoyer(Foyer foyer);
    public List<Foyer> retrieveAllFoyer();
    public Foyer retrieveFById(long idF);
    public void deleteFoyer(long idF);

}
