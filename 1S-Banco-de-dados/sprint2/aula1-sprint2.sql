
CREATE DATABASE sprint2;
USE sprint2;

CREATE TABLE empresa(
idEmpresa INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(45),
responsavel VARCHAR(45)
);

INSERT INTO empresa VALUE 
(null, 'C6Bank', 'Andresa'),
(null, 'Accenture', 'Rafael');

CREATE TABLE aluno(
ra CHAR(8) PRIMARY KEY,
nome VARCHAR(45),
bairro VARCHAR(45),
fkEmpresa INT,
CONSTRAINT fkEmpresa FOREIGN KEY (fkEmpresa) REFERENCES empresa(idEmpresa)
);


INSERT INTO aluno VALUES
(1, 'Lucas', 'Consolação', '1');

SELECT * FROM aluno;

UPDATE aluno SET ra = '01232808' WHERE ra = '1';

SELECT * FROM empresa WHERE idEmpresa = 1;

SELECT * FROM aluno JOIN empresa
	ON idEmpresa = fkEmpresa;
    
    
SELECT a.nome AS NomeAluno,
e.nome AS NomeEmpresa
	FROM aluno AS a JOIN empresa AS e ON idEmpresa = fkEmpresa;

INSERT INTO aluno VALUES
('01232765', 'Luiz', 'Itaim Bibi', 2),
('01232097', 'Roberto', 'Santo Amaro', 1);




-- Pratica-----------------------------------------


CREATE TABLE Grupo(
idGrupo INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome VARCHAR(45),
tema VARCHAR(45)
);

CREATE TABLE Aluno(
idAluno INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome VARCHAR(45),
turma VARCHAR(45),
CONSTRAINT fkGrupo FOREIGN KEY (fkGrupo) REFERENCES Grupo(idGrupo)
);

INSERT INTO Aluno VALUES
(null, 'Victor', '1adsb'),
(null, 'Matheus', '1adsb'),
(null, 'Nathan', '1adsb');

INSERT INTO Grupo VALUES
(null, 'HDLife', 'Controle de data center'),
(null, 'Sensorize', 'Controle de fluxo de clientes em academia'),
(null, 'GranjaTech', 'Controle do galinheiro');






