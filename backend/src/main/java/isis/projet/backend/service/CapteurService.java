package isis.projet.backend.service;

import isis.projet.backend.dao.CapteurRepository;
import isis.projet.backend.entity.Capteur;
import jakarta.transaction.Transactional;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class CapteurService {
    private final CapteurRepository capteurDao;

    public CapteurService(CapteurRepository capteurDao) {
        this.capteurDao = capteurDao;
    }

    //obtenir le capteur par l'ID
    public Optional<Capteur> getCapteurById(final int capteur_Id) {
        return capteurDao.findById(capteur_Id);
    }

    public Iterable<Capteur> getCapteurs() {
        return capteurDao.findAll();
    }
}
