INSERT INTO Capteur(grandeur) VALUES 
('Température'),
('Humidité'),
('Luminosité');

INSERT INTO Mesure(valeur,dateMesure,capteur_id) VALUES
    (1.0, '01-2023 blabla',SELECT id FROM Capteur WHERE grandeur='Température'),
    (2.0, '01-2023 blabla',SELECT id FROM Capteur WHERE grandeur='Température');
