package isis.projet.backend.service;

import isis.projet.backend.dao.CapteurRepository;
import jakarta.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
public class CapteurService {
    private final CapteurRepository capteurDao;

    public CapteurService(CapteurRepository capteurDao) {
        this.capteurDao = capteurDao;
    }

}
