INSERT INTO Capteur(grandeur) VALUES 
('Température'),
('Humidité'),
('Luminosité');

INSERT INTO Mesure(valeur, capteurSource, dateMesure) VALUES
    (1, SELECT id FROM Capteur WHERE grandeur = 'Température', "01-2023 blabla"),
    (1, SELECT id FROM Capteur WHERE grandeur = 'Température', "02-2023"),
    (1, SELECT id FROM Capteur WHERE grandeur = 'Température', "03-2023"),



