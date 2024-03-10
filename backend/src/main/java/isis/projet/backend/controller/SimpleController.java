package isis.projet.backend.controller;

import isis.projet.backend.service.CapteurService;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/rest")
@Slf4j
//ici toute les URLs de mon API que je voudrais appeler dans mon front
public class SimpleController {
    private CapteurService CapteurService;

    public SimpleController(CapteurService CapteurService) {
        this.CapteurService = CapteurService;
    }

    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        log.info("Service Hello World");
        return Map.of("message", "Hello, World !");
    }

    @GetMapping("/capteurs")
    public Map<Integer,String> getCapteurs() {
        log.info("test");
        return Map.of(1,CapteurService.quelType());
    }
    

}


