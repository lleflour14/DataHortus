package isis.projet.backend.service;

import isis.projet.backend.dao.MesureRepository;
import org.springframework.stereotype.Service;

@Service
public class MesureService {
    private final MesureRepository mesureDao;

    public MesureService(MesureRepository mesureDao) {
        this.mesureDao = mesureDao;
    }


}
