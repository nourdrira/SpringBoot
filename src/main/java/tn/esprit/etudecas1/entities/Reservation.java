package tn.esprit.etudecas1.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
    public class Reservation implements Serializable {
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private long idReservation;

        @Temporal (TemporalType.DATE)
        private Date anneeUniversitaire;
        private boolean estValide;

@ManyToMany
        private Set<Etudiant> etudiants;

}
