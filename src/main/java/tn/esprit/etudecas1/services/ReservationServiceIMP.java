package tn.esprit.etudecas1.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.etudecas1.entities.Etudiant;
import tn.esprit.etudecas1.entities.Reservation;
import tn.esprit.etudecas1.repository.ReservationRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ReservationServiceIMP implements IReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation retrieveReservation(long idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }
}
