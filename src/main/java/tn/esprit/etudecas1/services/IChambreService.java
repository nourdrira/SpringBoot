package tn.esprit.etudecas1.services;

import tn.esprit.etudecas1.entities.Chambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    Chambre retrieveChambre(long idChambre);

}
