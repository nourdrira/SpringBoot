package tn.esprit.etudecas1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudecas1.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository <Etudiant,Long> {

}
