INSERT INTO Capteur(grandeur) VALUES 
('Température'),
('Humidité'),
('Luminosité');

INSERT INTO Mesure(valeur,dateMesure,capteur_id) VALUES
    (1.0, '01-2023 blabla',SELECT id FROM Capteur WHERE grandeur='Température'),
    (2.0, '01-2 blabla',SELECT id FROM Capteur WHERE grandeur='Température'),
    (17.0, '04-2023 blabla',SELECT id FROM Capteur WHERE grandeur='Humidité'),
    (19.0, '05-2023 blabla',SELECT id FROM Capteur WHERE grandeur='Luminosité'),
    (88.0, '01-25 blabla',SELECT id FROM Capteur WHERE grandeur='Température');

