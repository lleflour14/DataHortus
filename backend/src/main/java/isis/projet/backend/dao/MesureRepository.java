package isis.projet.backend.dao;

import isis.projet.backend.entity.Capteur;
import isis.projet.backend.entity.Mesure;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MesureRepository extends JpaRepository<Mesure, Integer> {
        public Mesure findById(int mesureId);

        List<Mesure> findByCapteur(Capteur capteur);
        
}
