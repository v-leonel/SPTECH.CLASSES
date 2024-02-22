-- INTEGRANTES DO GRUPO

-- Victor Leonel
-- Matheus Kikuti
-- Luana Leite
-- Marayah Piccinini 
-- Gustavo Samuel da Silva
-- Nathan Piazentin

create database exercicio01;
use exercicio01;

DROP TABLE Aluno;
DROP TABLE Grupo;


CREATE TABLE Grupo(
idGrupo INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome VARCHAR(45),
tema VARCHAR(45)
);

alter table aluno add constraint
 fkGrupo foreign key (fkGrupo) references grupo (idGrupo);

CREATE TABLE Aluno(
idAluno INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome VARCHAR(45),
turma VARCHAR(45),
fkGrupo INT,
CONSTRAINT fkGrupo FOREIGN KEY (fkGrupo) REFERENCES Grupo(idGrupo)
);

INSERT INTO Aluno (ra, nome, turma) VALUES
('01234848', 'Victor', '1adsb'),
('01232484', 'Matheus', '1adsb'),
('01234564', 'Nathan', '1adsb');

INSERT INTO Grupo VALUES
(null, 'HDLife', 'Controle de data center'),
(null, 'Sensorize', 'Controle de fluxo de clientes em academia'),
(null, 'GranjaTech', 'Controle do galinheiro');

SELECT * FROM Aluno;
SELECT * FROM Grupo;

UPDATE Aluno SET fkGrupo = 1 WHERE ra = '01234564';
UPDATE Aluno SET fkGrupo = 2 WHERE ra = '01232484';
UPDATE Aluno SET fkGrupo = 3 WHERE ra = '01234848';

SELECT * FROM Aluno JOIN Grupo ON idGrupo = fkGrupo;

-- PRATICANDO

-- Como criar uma chave estrangeira
-- Direto na tabela

CREATE TABLE Grupo(
idGrupo INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome VARCHAR(45),
tema VARCHAR(45)
);

SELECT * FROM Grupo;


CREATE TABLE Aluno(
ra CHAR(8) PRIMARY KEY NOT NULL,
nome VARCHAR(45),
turma VARCHAR(45),
fkGrupo INT,
CONSTRAINT fkGrupo FOREIGN KEY (fkGrupo) REFERENCES Grupo(idGrupo)
);

DROP TABLE Aluno;
DROP TABLE Grupo;

-- Adcionando fora da tabela

CREATE TABLE Aluno(
ra CHAR(8) PRIMARY KEY NOT NULL,
nome VARCHAR(45),
turma VARCHAR(45),
fkGrupo INT
);

ALTER TABLE Aluno ADD CONSTRAINT fkGrupo FOREIGN KEY (fkGrupo) REFERENCES Grupo(idGrupo);
DESCRIBE Aluno;

SELECT * FROM Aluno JOIN Grupo ON fkGrupo = idGrupo;
-- Forma Extensa
SELECT a.nome as NomeAluno, g.nome AS NomeGrupo FROM Aluno AS a JOIN Grupo AS g ON idGrupo = fkGrupo;
 -- Forma Pratica

SELECT Aluno.nome, Grupo.nome FROM aluno JOIN Grupo ON idGrupo = fkGrupo;

SELECT a.nome AS NomeAluno, g.nome AS NomeGrupo FROM Aluno AS a JOIN Grupo AS g ON fkGrupo = idGrupo;

SELECT Aluno.nome, Grupo.nome
FROM Aluno JOIN Grupo ON fkGrupo = idGrupo;

SELECT a.nome AS NomeAluno, g.nome AS NomeGrupo
FROM Aluno AS a JOIN Grupo AS g ON fkGrupo = idGrupo;

-- ORDEM PARA UTILIZAR UM SELECT EM TABELAS COM CHAVE ESTRANGEIRA

-- CRIAR TABELAS
CREATE TABLE Grupo(
idGrupo INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome VARCHAR(45),
tema VARCHAR(45)
);


CREATE TABLE Aluno(
ra CHAR(8) PRIMARY KEY,
nome VARCHAR(45),
turma VARCHAR(6),
fkGrupo INT,
CONSTRAINT fkGrupo FOREIGN KEY (fkGrupo) REFERENCES Grupo(idGrupo)
);

-- INSERIR DADOS NAS TABELAS

INSERT INTO Grupo VALUES
(NULL, 'Grupo1', 'Controle de umidade'),
(NULL, 'Grupo2', 'Controle de temperatura'),
(NULL, 'Grupo3', 'Controle de iluminação');

INSERT INTO Aluno (ra, nome, turma) VALUES
('01232204', 'Victor Leonel','1adsb'),
('01232678', 'Matheus Kikuti', '1adsb'),
('01232456', 'Nathan', '1adsb');

UPDATE Aluno SET fkGrupo = 1 WHERE ra = '01232204';
UPDATE Aluno SET fkGrupo = 1 WHERE ra = '01232678';

SELECT Aluno.nome, Grupo.nome FROM Aluno JOIN Grupo ON fkGrupo = idGrupo;

SELECT a.nome AS NomeAluno, g.nome AS NomeGrupo FROM Aluno AS a JOIN Grupo AS g ON fkGrupo = idGrupo;















