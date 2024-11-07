package tn.esprit.etudecas1.services;

import tn.esprit.etudecas1.entities.Bloc;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveBlocs();
    Bloc updateBloc(Bloc bloc);
    Bloc addBloc(Bloc bloc);
    Bloc retrieveBloc(long idBloc);

    void deleteBloc(long idB);
//    Bloc affecterChambresABloc(List<Long> numChambre, long idBloc);
}
