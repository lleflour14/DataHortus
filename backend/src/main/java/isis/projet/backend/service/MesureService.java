package isis.projet.backend.service;

import isis.projet.backend.dao.MesureRepository;
import isis.projet.backend.entity.Capteur;
import isis.projet.backend.entity.Mesure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MesureService {

    @Autowired
    private final MesureRepository mesureDao;

    public MesureService(MesureRepository mesureDao) {
        this.mesureDao = mesureDao;
    }

    // public List<Mesure> getMesuresParGrandeur(final Capteur cap){
    //     return mesureDao.trouverMesuresParCapteur(cap);
    // }
    
}
