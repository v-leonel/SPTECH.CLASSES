CREATE DATABASE sprint1;

USE sprint1;

CREATE TABLE Atleta(
idAtleta INT PRIMARY KEY,
nome VARCHAR(40),
modalidade VARCHAR(40),
qtdMedalha INT
);

DESCRIBE Atleta;

INSERT INTO Atleta VALUES
(1, 'Matheus', 'Futebol', 18),
(2, 'Leonel', 'Futebol', 25),
(3, 'Leo', 'Handebol', 3),
(4, 'Giulia', 'Handebol', 10),
(5, 'Humberto', 'Handebol', 1);

INSERT INTO Atleta VALUES
(6, 'Curry', 'Futebol', 2);

SELECT * FROM Atleta;

SELECT nome, qtdMedalha FROM Atleta;

SELECT * FROM Atleta
	WHERE modalidade = 'Futebol';
    
SELECT * FROM Atleta ORDER BY modalidade;

SELECT * FROM Atleta ORDER BY qtdMedalha DESC;

Select * FROM Atleta
	WHERE nome LIKE '%s%';
    
SELECT * FROM Atleta
	WHERE nome LIKE 'l%';
    
SELECT * FROM Atleta
	Where nome LIKE '%o';
    
SELECT * FROM Atleta
	WHERE nome LIKE '%r_';
    
DROP TABLE Atleta;

-- -----------------------------------------------------------------------------------------

CREATE TABLE Musica(
IdMusica INT PRIMARY KEY,
titulo VARCHAR(40),
artista VARCHAR(40),
genero VARCHAR(40)
);

INSERT INTO Musica VALUES
(1, 'Ghost', 'Justin Bieber','Pop'),
(2, 'Sorry', 'Justin Bieber', 'Pop'),
(3, 'Hold On', 'Justin Bieber', 'Pop'),
(4, 'Leão', 'Marília Mendonça', 'Sertanejo'),
(5, 'Hackearam-me', 'Marília Mendonça', 'Sertanejo'),
(6, 'Mal Feito', 'Marília Mendonça', 'Sertanejo'),
(7, 'Noites Traiçoeiras,', 'Padre Marcelo Rossi', 'Gospel'),
(8, 'Maria Passa à Frente', 'Padre Marcelo Rossi', 'Gospel'),
(9, 'Pai Nosso,', 'Padre Marcelo Rossi', 'Gospel');

SELECT * FROM Musica;

SELECT titulo, artista from Musica;

SELECT *FROM Musica
 WHERE genero = 'Pop';
 
 SELECT * FROM Musica
	WHERE artista = 'Padre Marcelo Rossi';

SELECT * FROM Musica ORDER BY titulo;

SELECT * FROM Musica ORDER BY artista DESC;

SELECT * FROM Musica 
	WHERE titulo LIKE 'h%';
    
SELECT * FROM Musica
	WHERE artista LIKE '%a';

SELECT * FROM Musica
	WHERE genero LIKE '_o%';

SELECT * FROM Musica
	WHERE titulo LIKE '%a_';
    
DROP TABLE Musica;

-- ---------------------------------------------------------------------------------

CREATE TABLE Filme(
IdFilme INT PRIMARY KEY,
titulo VARCHAR(50),
genero VARCHAR(40),
diretor VARCHAR(40)
);

INSERT INTO Filme VALUES
(1, 'Avatar', 'Fantasia', 'James Cameron'),
(2, 'Avatar O Caminho da Água', 'Fantasia', 'James Cameron'),
(3, 'Velozes e furiosos', 'Aventura', 'Rob Cohen'),
(4, 'Interestelar', 'Ficção científica', 'Christopher Nolan'),
(5, 'Tenet', 'Ficção científica', 'Christopher Nolan'),
(6, 'Carros', 'Animação', 'John Lasseter' ),
(7, 'Carros2', 'Animação', 'John Lasseter');

SELECT * FROM Filme;

SELECT titulo, diretor FROM Filme;

SELECT * FROM Filme
	WHERE genero = 'Animação';
    
SELECT * FROM Filme
	WHERE diretor = 'James Cameron';
    
SELECT * FROM Filme ORDER BY titulo;

SELECT * FROM Filme ORDER BY titulo DESC;

SELECT * FROM Filme
	WHERE titulo LIKE 'v%';
    
SELECT * FROM Filme
	WHERE diretor LIKE 'j%';
    
SELECT * FROM Filme
	WHERE genero LIKE '_a%';
    
SELECT * FROM Filme
	WHERE titulo LIKE '%a_';
	
DROP TABLE Filme;

-- -----------------------------------------------------------------------------------
CREATE TABLE Professor(
idProfessor INT PRIMARY KEY,
nome VARCHAR(50),
especialidade VARCHAR(40),
dtNasc date
);

INSERT INTO Professor VALUES
(1, 'Vivian', 'Banco de dados', '1983-10-13'),
(2, 'Fernanda', 'Pesquisa Inovação', '1999-05-20'),
(3, 'Rayssa', 'Socioemocional', '1991-11-09'),
(4, 'Kaline', 'Socioemocional', '1976-03-22'),
(5, 'Caio', 'Algoritmos', '1997-12-01'),
(6, 'João Pedro', 'Algoritmos', '2000-07-15');

SELECT * FROM Professor;

SELECT especialidade FROM Professor;

SELECT * FROM Professor
	WHERE especialidade = 'Algoritmos';
    
SELECT * FROM Professor ORDER BY nome;
    
SELECT * FROM Professor ORDER BY dtNasc DESC;

SELECT * FROM Professor 
	WHERE nome LIKE 'c%';

SELECT * FROM Professor
	WHERE nome LIKE '%a';
    
SELECT * FROM Professor
	WHERE nome LIKE '_a%';

SELECT * FROM Professor
	WHERE nome LIKE '%a_';

DROP TABLE Professor;

-- -----------------------------------------------------------------------------------------
CREATE TABLE Curso(
idCurso INT PRIMARY KEY,
nome VARCHAR(50),
sigla VARCHAR(3),
coordenador VARCHAR(40)
);

INSERT INTO Curso VALUES
(1, 'Banco de dados', 'Bd', 'Vivian'),
(2, 'Algoritmos', 'Alg', 'Caio'),
(3, 'Socioemocional', 'Se', 'Rayssa'),
(4, 'Arquitetura computacional', 'Arq', 'Marise'),
(5, 'Pesquisa Inovação', 'Pi', 'Fernanda');

SELECT * FROM Curso;

SELECT coordenador from Curso;

SELECT * FROM Curso
	WHERE sigla = 'Bd';
    
SELECT * FROM Curso ORDER BY nome;

SELECT * FROM Curso ORDER BY coordenador DESC;

SELECT * FROM Curso
	WHERE nome LIKE 'a%';
    
SELECT * FROM Curso
	WHERE nome LIKE '%l';

SELECT * FROM Curso
	WHERE nome LIKE '_a%';
    
SELECT * FROM Curso 
	WHERE nome LIKE '%o_';
    
DROP TABLE Curso;

-- ----------------------------------------------------------------------------------------

CREATE TABLE Revista(
idRevista INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(40),
categoria VARCHAR(30)
);

INSERT INTO Revista (nome) VALUES
('Veja'),
('Quatro Rodas'),
('Epoca'),
('Isto é');

SELECT * FROM Revista;

UPDATE Revista SET categoria = 'Automotiva'
	WHERE idRevista = 2;
    
UPDATE Revista SET categoria = 'Noticias e entretenimento'
	WHERE idRevista = 1;

UPDATE Revista SET categoria = 'Noticias e atualidades'
	WHERE idRevista = 4;
    
UPDATE Revista SET categoria = 'Noticias e atualidades'
		WHERE idRevista = 3;
        
UPDATE Revista SET categoria = 'Noticias'
	WHERE idRevista IN (1, 2, 3, 4, 5, 6, 7);
        
SELECT * FROM Revista;

INSERT INTO Revista VALUES
(5, 'Exame', 'Negocios e economia'),
(6, 'Caras', 'Celebridades e entretenimento'),
(7, 'Veja São Paulo', 'Guia da cidade');

SELECT * FROM Revista;

DESCRIBE Revista;

ALTER TABLE revista ADD COLUMN preco FLOAT(7);

ALTER TABLE Revista MODIFY COLUMN categoria VARCHAR(40);

UPDATE revista SET preco = 1.99
	WHERE idRevista = 1;

DESCRIBE Revista;

ALTER TABLE Revista ADD COLUMN periodicidade VARCHAR(15);

SELECT * FROM Revista;

ALTER TABLE Revista ADD COLUMN dtLancamento datetime;

UPDATE revista SET dtLancamento = (1976-12-01)
	WHERE idRevista = 1;

ALTER TABLE Revista DROP COLUMN periodicidade;

DROP TABLE Revista;

DROP DATABASE sprint1;



