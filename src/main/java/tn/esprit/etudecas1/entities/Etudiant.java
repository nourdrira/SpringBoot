package tn.esprit.etudecas1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idEtud;
    private String nomEtud;
    private String prenomEtud;
    private long cin;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private String ecole;

    @ManyToMany(mappedBy="etudiants")
    private Set<Reservation> reservations;

}
