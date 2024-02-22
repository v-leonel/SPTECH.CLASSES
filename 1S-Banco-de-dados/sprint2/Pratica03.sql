-- EXERCÍCIO 1
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

ALTER TABLE Atleta ADD COLUMN fkPais INT;
DESCRIBE Atleta;
ALTER TABLE Atleta ADD CONSTRAINT fkP FOREIGN KEY(fkPais) REFERENCES pais(idPais);

UPDATE Atleta SET fkPais = 1 WHERE idAtleta = 1;
UPDATE Atleta SET fkPais = 5 WHERE idAtleta = 2;
UPDATE Atleta SET fkPais = 1 WHERE idAtleta = 4;
UPDATE Atleta SET fkPais = 1 WHERE idAtleta = 5;
UPDATE Atleta SET fkPais = 2 WHERE idAtleta = 3;

SELECT * FROM Atleta JOIN Pais ON idPais = fkPais;

SELECT a.nome AS NomeAtleta, p.nome AS NomePais
FROM Atleta AS a JOIN Pais AS p ON idPais = fkPais;

SELECT a.nome AS NomeAtleta,
p.nome AS NomePais
FROM Atleta AS a JOIN Pais AS p ON idPais = fkPais WHERE idAtleta = 1;

SELECT * FROM Atleta AS a JOIN Pais AS p ON idPais = fkPais WHERE capital = 'Brasilia';

-- ------------------------------------------------------------------------------------------------------------------
-- EXERCÍCIO 2 ------------------------------------------------------------------------------------------------------
-- ------------------------------------------------------------------------------------------------------------------

CREATE TABLE Musica(
idMusica INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
titulo VARCHAR(40),
artista VARCHAR(40),
genero VARCHAR(40)
);

INSERT INTO Musica VALUES
(null, 'Ghost', 'Justin Bieber','Pop'),
(null, 'Sorry', 'Justin Bieber', 'Pop'),
(null, 'Hold On', 'Justin Bieber', 'Pop'),
(null, 'Leão', 'Marília Mendonça', 'Sertanejo'),
(null, 'Hackearam-me', 'Marília Mendonça', 'Sertanejo');

CREATE TABLE Album(
idAlbum INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome VARCHAR(40),
tipo VARCHAR(10),
dtLancamento DATE
);

INSERT INTO Album VALUES
(null, 'Justice', 'Digital', '2021-03-21'),
(null, 'Decretos Reais', 'Digital', '2023-05-25');

INSERT INTO Album VALUES
(null, 'Purpose', 'Digital', '2020-10-01'),
(null, 'Acertou na Mosca', 'Digital', '2015-11-15');

SELECT * FROM Musica;
SELECT * FROM Album;

ALTER TABLE musica ADD COLUMN fkAlbum INT;
DESCRIBE musica;
ALTER TABLE musica ADD CONSTRAINT fkAlb FOREIGN KEY (fkAlbum) REFERENCES Album(idAlbum);

UPDATE musica SET fkAlbum = 1 WHERE idMusica = 1;
UPDATE musica SET fkAlbum = 2 WHERE idMusica = 4;
UPDATE musica SET fkAlbum = 1 WHERE idMusica = 3;
UPDATE musica SET fkAlbum = 3 WHERE idMusica = 2;
UPDATE musica SET fkAlbum = 4 WHERE idMusica = 5;

SELECT m.nome AS NomeMusica, a.nome AS NomeAlbum FROM musica AS m JOIN Album AS a ON idAlbum = fkAlbum;

SELECT m.titulo AS TituloMusica, a.nome AS NomeAlbum 
FROM Musica AS m JOIN Album AS a ON idAlbum = fkAlbum;

SELECT m.titulo AS TituloMusica, a.nome AS NomeAlbum
FROM Musica AS m JOIN Album AS a ON idAlbum = fkAlbum WHERE idMusica = 1;

SELECT * FROM MUSICA AS m JOIN Album AS a ON idAlbum = fkAlbum WHERE tipo = 'Digital';
SELECT * FROM Musica AS m JOIN Album AS a ON idAlbum = fkAlbum WHERE tipo = 'Fisico';

