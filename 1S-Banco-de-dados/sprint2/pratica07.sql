CREATE DATABASE AlunoProjeto;
USE AlunoProjeto;

CREATE TABLE projeto(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(45),
descricao VARCHAR(45)
);

INSERT INTO projeto VALUES
(null, 'OnSpot', 'Soluções para datacenter'),
(null, 'CoffeeFlow', 'Soluções para cafeeiros'),
(null, 'HdLife', 'Soluções para datacenter');

CREATE TABLE aluno(
ra INT PRIMARY KEY NOT NULL,
nome VARCHAR(45),
telefone CHAR(13),
fkRep INT,
fkProjeto INT,
CONSTRAINT fkRepresentante FOREIGN KEY (fkRep) REFERENCES aluno(ra),
CONSTRAINT fkProjeto FOREIGN KEY (fkProjeto) REFERENCES projeto(id)
);

INSERT INTO aluno (ra, nome, telefone, fkprojeto) VALUES
(01232204, 'Victor Leonel', '11989121266', 1);

INSERT INTO aluno VALUES
(01232345, 'Matheus Kikuti', '11973546361', 01232204, 1),
(01232253, 'Gustavo Henrique', '11976435674', 01232204, 2);

CREATE TABLE acompanhante(
idAcomp INT,
fkAluno INT,
PRIMARY KEY (idAcomp, fkAluno),
nome VARCHAR(45),
parentesco VARCHAR(45),
CONSTRAINT fkCompAluno FOREIGN KEY (fkAluno) REFERENCES aluno(ra)
);

INSERT INTO acompanhante VALUES 
(1,01232204, 'Giulia Kuhl', 'namorada'),
(1,01232345, 'Jair', 'pai'),
(1,01232253, 'Carlos', 'irmão');

SELECT * FROM projeto;
SELECT * FROM acompanhante;
SELECT * FROM aluno;

SELECT * FROM aluno JOIN projeto ON fkProjeto = id;

SELECT * FROM aluno JOIN acompanhante ON fkAluno = ra;

SELECT * FROM aluno JOIN aluno ON fkRep = ra;

SELECT * FROM aluno AS aluno 
LEFT JOIN aluno AS representante
ON aluno.ra = aluno.fkRep;

SELECT * FROM aluno ;

SELECT * FROM aluno AS aluno 
JOIN projeto AS projeto 
ON fkProjeto = id
WHERE projeto.nome = 'OnSpot';

SELECT * FROM aluno
JOIN projeto 
ON fkprojeto = id
JOIN acompanhante 
ON fkAluno = ra;

-- EXERCICIO 2
CREATE DATABASE Campanha;
USE Campanha;

CREATE TABLE Organizador(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(45),
rua  VARCHAR(45),
bairro VARCHAR(45),
email VARCHAR(45),
fkOrientador INT,
CONSTRAINT fkOrientador FOREIGN KEY (fkOrientador) REFERENCES Organizador(id)
)AUTO_INCREMENT = 30;

INSERT INTO Organizador VALUES
(null, 'Victor', 'Avenida Yervant', 'Cidade Ademar', 'victor@hh.com', null),
(null, 'Matheus', 'Avenida Jabaquara', 'Mirandópolis', 'matheus@hh.com', 30),
(null, 'Claudio', 'Avenida Paulista', 'Bela Vista', 'claudio@hh.com', '30');


CREATE TABLE Campanha(
id INT PRIMARY KEY AUTO_INCREMENT,
categoria VARCHAR(50),
instituicao1 VARCHAR(45),
instituicao2 VARCHAR(45),
dt_final DATE,
fkOrganizador INT,
CONSTRAINT fkOrganizador FOREIGN KEY (fkOrganizador) REFERENCES Organizador(id)
)AUTO_INCREMENT = 500;

INSERT INTO campanha VALUES
(null, 'Doação de alimentos', 'naacao', 'Instituto Alimentar', '2023-10-22', '30'),
(null, 'Doação de sangue','Fundação Pró-Sangue', null, '2023-12-01', 30),
(null, 'Doação de animais', 'Instituto Caramelo', null, '2023-11-10', 31),
(null, 'Doação de cabelo', 'Cabelegria', null, '2023-10-31', 32);

SELECT * FROM organizador;
SELECT * FROM campanha;

SELECT * FROM organizador 
JOIN campanha ON fkOrganizador = organizador.id;

SELECT * FROM organizador 
JOIN campanha ON fkOrganizador = organizador.id 
WHERE organizador.nome = 'Victor';

SELECT * FROM organizador AS novato 
JOIN organizador AS orientador 
ON novato.fkOrientador = orientador.id;

SELECT * FROM organizador AS novato 
JOIN organizador AS orientador 
ON novato.fkOrientador = orientador.id 
WHERE orientador.nome = 'Victor';

SELECT * FROM organizador AS novato 
JOIN campanha ON fkOrganizador = novato.id 
JOIN organizador AS orientador ON novato.fkOrientador = orientador.id;

SELECT * FROM organizador AS novato
JOIN campanha ON fkOrganizador = novato.id
JOIN organizador AS orientador ON novato.fkOrientador = orientador.id
WHERE novato.nome = 'Matheus';


