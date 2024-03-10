package isis.projet.backend.controller;

import isis.projet.backend.service.MesureService;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;
import java.util.Map;

@RestController
@RequestMapping("/rest")
@Slf4j
public class SimpleController {
    private final MesureService MesureService;

    public SimpleController(MesureService MesureService) {
        this.MesureService = MesureService;
    }

    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        log.info("Service Hello World");
        return Map.of("message", "Hello, World !");
    }


}


