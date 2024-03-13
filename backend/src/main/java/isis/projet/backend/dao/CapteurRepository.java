package isis.projet.backend.dao;

import isis.projet.backend.entity.Capteur;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CapteurRepository extends JpaRepository<Capteur, Integer> {

    Optional<Capteur> findById(Integer id);
}
