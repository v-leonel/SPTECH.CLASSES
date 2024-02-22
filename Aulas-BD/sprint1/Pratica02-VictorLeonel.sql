CREATE DATABASE sprint1;

USE sprint1;


CREATE TABLE atleta(
idAtleta INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(40),
modalidade VARCHAR(40),
qtdMedalha INT
);


describe atleta;

INSERT INTO Atleta VALUES
(null, 'Matheus', 'Futebol', 18),
(null, 'Leonel', 'Futebol', 25),
(null, 'Leo', 'Handebol', 3),
(null, 'Giulia', 'Handebol', 10),
(null, 'Humberto', 'Handebol', 1);

INSERT INTO atleta VALUES
(null, 'Michael Felps', 'Natação', 78, '1990-07-08');

SELECT * FROM atleta;

UPDATE atleta SET qtdMedalha = 23
	WHERE idAtleta = 1;
    
UPDATE atleta SET qtdMedalha = 6
	WHERE idAtleta IN (2, 3);

UPDATE atleta SET nome = 'Giulia Kuhl'
	WHERE idAtleta = 4;
    
ALTER TABLE atleta ADD COLUMN dtNasc date;

UPDATE atleta SET dtNasc = '2004-05-16'
	WHERE idAtleta = 1;
    
UPDATE atleta SET dtNasc  = '2003-04-04'
	WHERE idAtleta = 2;
    
UPDATE atleta SET dtNasc = '2000-10-08'
	WHERE idAtleta = 3;

UPDATE atleta SET dtNasc = '2005-04-26'
	WHERE idAtleta = 4;
    
UPDATE atleta SET dtNasc = '1993-03-30'
	WHERE idAtleta = 5;
    
DELETE FROM atleta
	WHERE idAtleta = 5;
    
SELECT nome FROM atleta
	WHERE modalidade != 'Natação';
    
SELECT * FROM atleta
	WHERE qtdMedalha >= 3;   

ALTER TABLE atleta MODIFY COLUMN modalidade VARCHAR(60);

DESCRIBE atleta;

TRUNCATE TABLE atleta;

-- -----------------------------------------------------------------------------------

CREATE TABLE musica(
idMusica INT PRIMARY KEY AUTO_INCREMENT,
titulo VARCHAR(40),
artista VARCHAR(40),
genero VARCHAR(40)
);

INSERT INTO musica VALUES
(null, 'Ghost', 'Justin Bieber','Pop'),
(null, 'Sorry', 'Justin Bieber', 'Pop'),
(null, 'Hold On', 'Justin Bieber', 'Pop'),
(null, 'Leão', 'Marília Mendonça', 'Sertanejo'),
(null, 'Hackearam-me', 'Marília Mendonça', 'Sertanejo'),
(null, 'Mal Feito', 'Marília Mendonça', 'Sertanejo'),
(null, 'Noites Traiçoeiras,', 'Padre Marcelo Rossi', 'Gospel'),
(null, 'Maria Passa à Frente', 'Padre Marcelo Rossi', 'Gospel'),
(null, 'Pai Nosso,', 'Padre Marcelo Rossi', 'Gospel');

INSERT INTO musica VALUES 
(null, 'Ta ok', 'Kevin o Chris', 'Funk', 101001010);

SELECT * FROM musica;

ALTER TABLE musica ADD COLUMN curtidas INT;

UPDATE musica SET curtidas = 100000
	WHERE idMusica = 1;
    
UPDATE musica SET curtidas = 34300000
	WHERE idMusica = 2;

UPDATE musica SET curtidas = 284028
	WHERE idMusica = 3;
    
UPDATE musica SET curtidas = 2000000
	WHERE idMusica = 4;
    
UPDATE musica SET curtidas = 1909283
	WHERE idMusica = 5;
    
UPDATE musica SET curtidas = 2462876
	WHERE idMusica = 6;
    
UPDATE musica SET curtidas = 3874892
	WHERE idMusica = 7;
    
UPDATE musica SET curtidas = 37498219
	WHERE idMusica = 8;
    
UPDATE musica SET curtidas = 1000000000
	WHERE idMusica = 9;
    
ALTER TABLE musica MODIFY COLUMN artista VARCHAR(80);

UPDATE musica SET curtidas = 15
	WHERE idMusica =1;
    
UPDATE musica SET curtidas = 12312
	WHERE idMusica IN (2, 3);
    
UPDATE musica SET titulo = 'fui tapeado'
	WHERE idMusica = 5;
    
DELETE FROM musica
	WHERE idMusica = 4;
    
SELECT titulo FROM musica
	WHERE genero != 'Funk';
    
SELECT * FROM musica
	WHERE curtidas >= 20;
    
DESCRIBE musica;

TRUNCATE TABLE musica;

-- --------------------------------------------------------------------------------------

CREATE TABLE filme(
idFilme INT PRIMARY KEY AUTO_INCREMENT,
titulo VARCHAR(50),
genero VARCHAR(50),
diretor VARCHAR(40)
);

INSERT INTO Filme VALUES
(null, 'Avatar', 'Fantasia', 'James Cameron'),
(null, 'Avatar O Caminho da Água', 'Fantasia', 'James Cameron'),
(null, 'Velozes e furiosos', 'Aventura', 'Rob Cohen'),
(null, 'Interestelar', 'Ficção científica', 'Christopher Nolan'),
(null, 'Tenet', 'Ficção científica', 'Christopher Nolan'),
(null, 'Carros', 'Animação', 'John Lasseter' ),
(null, 'Carros2', 'Animação', 'John Lasseter');

SELECT * FROM filme;


ALTER TABLE filme ADD COLUMN protagonista VARCHAR(50);

UPDATE filme SET protagonista = 'Jake Sully'
	WHERE idFilme = 1;
    
UPDATE filme SET protagonista = 'Jake Sully'
	WHERE idFilme = 2;

UPDATE filme SET protagonista = 'Dominic Toretto'
	WHERE idFilme = 3;
    
UPDATE filme SET protagonista = 'Cooper'
	WHERE idFilme = 4;
    
UPDATE filme SET protagonista = 'Neil'
	WHERE idFilme = 5;

UPDATE filme SET protagonista = 'MC Queen'
	WHERE idFilme = 6;
    
UPDATE filme SET protagonista = 'Mate'
	WHERE idFilme = 7;
    
ALTER TABLE filme MODIFY COLUMN diretor VARCHAR(150);

DESCRIBE filme;

UPDATE filme SET diretor = 'Jon Watts'
	WHERE idFilme = 5;

UPDATE filme SET diretor = 'Joe Russo'
	WHERE idFilme IN (2, 7);
    
UPDATE filme SET titulo = 'Jurassic Park'
	WHERE idFilme = 6;
    
DELETE FROM filme
	WHERE idFilme = 3;
    
SELECT * FROM filme
	WHERE genero != 'drama';
    
SELECT * FROM filme
	WHERE genero = 'suspense';
    
DESCRIBE filme;

TRUNCATE TABLE filme;

-- --------------------------------------------------------------------------------

CREATE TABLE professor(
idProfessor INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(50),
especialidade VARCHAR(40),
dtNasc DATE
);

INSERT INTO Professor VALUES
(null, 'Vivian', 'Banco de dados', '1983-10-13'),
(null, 'Fernanda', 'Pesquisa Inovação', '1999-05-20'),
(null, 'Rayssa', 'Socioemocional', '1991-11-09'),
(null, 'Kaline', 'Socioemocional', '1976-03-22'),
(null, 'Caio', 'Algoritmos', '1997-12-01'),
(null, 'João Pedro', 'Algoritmos', '2000-07-15');

SELECT * FROM professor;

ALTER TABLE professor ADD COLUMN funcao VARCHAR(50)
	CONSTRAINT chkFuncao
    CHECK (funcao IN ('monitor', 'assistente', 'titular'));
    
describe professor;
    
UPDATE professor SET funcao = 'Titular'
	WHERE idProfessor IN (1, 2, 3, 4, 5, 6);
    
INSERT INTO professor VALUES
(null, 'Leonardo', 'Banco de dados', '2000-10-08', 'monitor');

DELETE FROM professor
	WHERE idProfessor = 5;
    
SELECT nome FROM professor
	WHERE funcao = 'titular';
    
SELECT especialidade, dtNasc FROM professor
	WHERE funcao = 'monitor';
    
UPDATE professor SET dtNasc = '1999-06-22'
	WHERE idProfessor = 3;
    
TRUNCATE TABLE professor;








    

    




















































-- Tipagem numérica

-- inteiros INT

-- DECIMAIS

-- FLOAT 7 digitos 12345,67

-- 	DOUBLE 15 dígitos 12345678900,1234

-- DECIMAL () 32 dígitos

-- 1234,678 (7,3)

-- 12,87654 (7,5)




