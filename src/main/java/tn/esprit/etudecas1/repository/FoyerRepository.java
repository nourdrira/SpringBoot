package tn.esprit.etudecas1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudecas1.entities.Foyer;

import java.util.Optional;


public interface FoyerRepository extends JpaRepository <Foyer,Long> {



}
