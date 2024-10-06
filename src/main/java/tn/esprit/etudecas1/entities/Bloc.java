package tn.esprit.etudecas1.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Bloc {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long idBloc;
    private String nomBloc;
    private long capaciteBloc;


@ManyToOne
    public Foyer foyer;

@OneToMany(mappedBy = "blocs")
    private Set<Chambre> chambres;
}
