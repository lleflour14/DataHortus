INSERT INTO Capteur(grandeur) VALUES 
('Température'),
('Humidité'),
('Luminosité');

INSERT INTO Mesure(valeur, capteursource) VALUES
    (1, SELECT Capteur FROM Capteur WHERE grandeur = 'Température'),
    (1, SELECT Capteur FROM Capteur WHERE grandeur = 'Température'),
    (1, SELECT Capteur FROM Capteur WHERE grandeur = 'Température'),



