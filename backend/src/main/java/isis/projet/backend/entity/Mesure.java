package isis.projet.backend.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import org.apache.commons.lang3.time.DateFormatUtils;

import jakarta.persistence.*;

import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Mesure {
    // Identifiant technique
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;


    @Column(unique=true)
    private Float valeur;
    
    @Column(unique=true,name = "DATEMESURE")
    @NonNull
    private String dateMesure;


    @NonNull
    @ManyToOne(optional = false) // obligatoire, la clé étrangère ne doit pas être nulle
    private Capteur capteur;
}
