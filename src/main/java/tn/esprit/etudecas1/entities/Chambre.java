package tn.esprit.etudecas1.entities;

import jakarta.persistence.*;
import tn.esprit.etudecas1.enums.TypeChambre;

import java.util.Set;

@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idC;
    private long numC;

    @Enumerated(EnumType.STRING)
    private TypeChambre TypeC;
    @OneToMany
    private Set<Reservation> reservations;

    @ManyToOne
    private Bloc blocs;
}
