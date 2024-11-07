package tn.esprit.etudecas1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private long idUniversite;
private String nomUniversite;
private long adresse;

@OneToOne
@JoinColumn(name = "foyer_id")  // Ajout de la clé étrangère dans l'entité Universite
    private Foyer foyer;


}
