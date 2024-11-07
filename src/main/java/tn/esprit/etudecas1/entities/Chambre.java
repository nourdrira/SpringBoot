package tn.esprit.etudecas1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import tn.esprit.etudecas1.enums.TypeChambre;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private long numChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre TypeC;
    @OneToMany
    private Set<Reservation> reservations;

    @ManyToOne
    @JoinColumn(name = "id_bloc", nullable = false)
    private Bloc blocs;

    public void setBloc(Bloc bloc) {
    }
}
