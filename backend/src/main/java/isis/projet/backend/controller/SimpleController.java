package isis.projet.backend.controller;

import isis.projet.backend.entity.Capteur;
import isis.projet.backend.entity.Mesure;
import isis.projet.backend.service.CapteurService;
import isis.projet.backend.service.MesureService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping("/rest")
@Slf4j
//ici toute les URLs de mon API que je voudrais appeler dans mon front
public class SimpleController {
    private CapteurService capteurService;
    private MesureService mesureService;

    public SimpleController(CapteurService capteurService) {
        this.capteurService = capteurService;
    }

    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        log.info("Service Hello World");
        return Map.of("message", "Hello, World !");
    }

    //je veux toute les mesures pour une certaine grandeur
    // @GetMapping("/capteurs/{id_capteur}/mesures")
    // public ResponseEntity<List<Mesure>> getMesuresParGrandeur(@PathVariable(name = "id_capteur") final Integer id_capteur) {
    //     log.info("Obtenir toute les mesures d'une grandeur");
    //     final Optional<Capteur> capteurSource = capteurService.getCapteurById(id_capteur);
    //     List<Mesure> mesures = capteurSource.getMesures();
    //     return new ResponseEntity<>(mesures, HttpStatus.OK);
    // }
    
}


