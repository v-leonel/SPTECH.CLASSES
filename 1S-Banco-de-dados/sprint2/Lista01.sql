USE sprint2;

CREATE TABLE Atleta(
idAtleta INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome VARCHAR(40),
modalidade VARCHAR(40),
qtdMedalha INT
);

INSERT INTO Atleta (nome, modalidade, qtdMedalha) VALUES
('Neymar', 'Futebol', 19),
('Cristiano Ronaldo', 'Futebol', 33),
('Michael Felps', 'Natação', 38 ),
('Cesar Cielo', 'Natação', 4),
('Gustavo Kuerten', 'tenis', 20);

CREATE TABLE Pais(
idPais INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome VARCHAR(80),
capital VARCHAR(40)
);

INSERT INTO Pais (nome, capital) VALUES
('Brasil', 'Brasilia'),
('Estados Unidos', 'Washington, D.C'),
('Japão', 'Tóquio'),
('França', 'Paris');

INSERT INTO pais (nome, capital) VALUES
('Portugal', 'Lisboa');

ALTER TABLE Atleta 
ADD COLUMN fkPais INT;

DESCRIBE Atleta;

ALTER TABLE Atleta ADD CONSTRAINT fkP 
FOREIGN KEY(fkPais) REFERENCES pais(idPais);

UPDATE Atleta SET fkPais = 1 
WHERE idAtleta = 1;

UPDATE Atleta SET fkPais = 5 
WHERE idAtleta = 2;

UPDATE Atleta SET fkPais = 1 
WHERE idAtleta = 4;

UPDATE Atleta SET fkPais = 1 
WHERE idAtleta = 5;

UPDATE Atleta SET fkPais = 2 
WHERE idAtleta = 3;

SELECT * FROM Atleta JOIN Pais 
ON idPais = fkPais;

SELECT a.nome AS NomeAtleta,
p.nome AS NomePais
FROM Atleta AS a JOIN Pais AS p 
ON idPais = fkPais;

SELECT a.nome AS NomeAtleta,
p.nome AS NomePais
FROM Atleta AS a JOIN Pais AS p 
ON idPais = fkPais 
WHERE idAtleta = 1;

SELECT * FROM Atleta AS a JOIN Pais AS p 
ON idPais = fkPais 
WHERE capital = 'Brasilia';


