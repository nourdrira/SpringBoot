package tn.esprit.etudecas1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudecas1.entities.Chambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}
