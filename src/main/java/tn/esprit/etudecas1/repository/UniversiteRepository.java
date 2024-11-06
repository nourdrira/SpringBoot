package tn.esprit.etudecas1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudecas1.entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}