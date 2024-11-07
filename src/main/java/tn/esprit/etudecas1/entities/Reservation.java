package tn.esprit.etudecas1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
    public class Reservation implements Serializable {
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private long idReservation;
        private String numReservation;
    @Temporal (TemporalType.DATE)
        private Date debutAnneeUniv;
       private Date finAnneeUniv;
    private boolean estValide;

@ManyToMany
        private Set<Etudiant> etudiants;

}
