package isis.projet.backend.dao;

import isis.projet.backend.entity.Capteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapteurRepository extends JpaRepository<Capteur, Integer> {
    
}
