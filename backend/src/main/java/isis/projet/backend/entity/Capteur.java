package isis.projet.backend.entity;

import jakarta.persistence.*;

import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter 
@Entity // Une entité JPA
public enum Capteur {
    TEMPERATURE, LUMINOSITE, HUMIDITE
}
