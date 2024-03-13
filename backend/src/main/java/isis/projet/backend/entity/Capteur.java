package isis.projet.backend.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import jakarta.persistence.*;


import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Capteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique=true, name = "grandeur")
    @NonNull
    private String grandeur;

    //obtenir une liste de mesures pour chaque grandeur
    @OneToMany(mappedBy = "capteur")
    private List<Mesure> mesures = new ArrayList<>();

    public Optional<List<Mesure>> getMesures(){
        return Optional.ofNullable(mesures);
    }
}
