package tn.esprit.etudecas1.services;

import tn.esprit.etudecas1.entities.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();
    Reservation updateReservation(Reservation reservation);
    Reservation retrieveReservation(long idReservation);
}
