package tn.esprit.etudecas1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity



public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;

//    @OneToOne(mappedBy = "foyer")
//    private Universite universite;

    // Déclaration de la relation OneToOne avec Universite
    @OneToOne
    @JoinColumn(name = "idUniversite")  // Cette colonne contiendra la clé étrangère
    private Universite universite;  // La référence vers l'entité Universite


    @OneToMany(mappedBy = "foyer")
    private Set<Bloc> blocs;
}