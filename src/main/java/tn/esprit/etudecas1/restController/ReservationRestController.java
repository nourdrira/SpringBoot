package tn.esprit.etudecas1.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudecas1.entities.Reservation;
import tn.esprit.etudecas1.services.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservations")
public class ReservationRestController {

    private final IReservationService iReservationService;

    // Récupérer toutes les réservations
    @GetMapping("/getAllReservations")
    public List<Reservation> retrieveAllReservations() {
        return iReservationService.retrieveAllReservation();
    }

    // Mettre à jour une réservation
    @PutMapping("/updateReservation")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return iReservationService.updateReservation(reservation);
    }

    // Récupérer une réservation par son ID
    @GetMapping("/findById/{idReservation}")
    public Reservation retrieveReservation(@PathVariable long idReservation) {
        return iReservationService.retrieveReservation(idReservation);
    }
}
