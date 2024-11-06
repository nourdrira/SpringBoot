package tn.esprit.etudecas1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudecas1.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
