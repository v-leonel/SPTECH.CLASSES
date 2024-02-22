CREATE DATABASE grupo;
USE grupo;

CREATE TABLE grupo(
idGrupo INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome VARCHAR(45),
descricao VARCHAR(100)
);

CREATE TABLE Aluno(
ra CHAR(8) PRIMARY KEY,
nome VARCHAR(45),
email VARCHAR(45),
fkGrupo INT,
FOREIGN KEY (fkGrupo) REFERENCES grupo(idGrupo)
);
CREATE TABLE professor(
idProfessor INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(45),
disciplina VARCHAR(45)
);

CREATE TABLE avaliacao(
idAvaliacao INT,
fkAvaliacaoGrupo INT,
fkProfessor INT,
dthAvaliacao DATETIME,
nota decimal(2.2),
PRIMARY KEY(idAvaliacao, fkAvaliacaoGrupo, fkProfessor),
FOREIGN KEY (fkAvaliacaoGrupo) REFERENCES Grupo(idGrupo),
FOREIGN KEY (fkProfessor) REFERENCES Professor(idProfessor)
);

DESCRIBE grupo;
INSERT INTO Grupo VALUES
(null, 'OnSpot', 'Controle de temperatura e umidade em data center'),
(null, 'GranjaTech', 'Controle de temperatura e umidade em galinheiro');

DESCRIBE aluno;
INSERT INTO aluno VALUES
('01232087', 'Gustavo Henrique', 'gustavo@hh.com', 2),
('01232204', 'Victor Leonel', 'victor@hh.com', 1),
('01232086', 'Matheus Kikuti', 'matheus@hh.com', 1);


ALTER TABLE professor auto_increment = 10000;
DESCRIBE Professor;
INSERT INTO professor VALUES
(null, 'Fernanda Caramico', 'Pesquise e Inovação'),
(null, 'Vivian', 'Banco de Dados');

DESCRIBE avaliacao;
INSERT INTO avaliacao VALUES
(1, 1,10000, '2023-11-06 15:46:00', 8.90),
(2, 2,10000, '2023-11-06 15:47:00', 10.00),
(3, 1,10001, '2023-11-06 15:48:00', 10.00),
(4, 2,10001, '2023-11-06 15:49:00', 7.85);


SELECT * FROM grupo;
SELECT * FROM aluno;
SELECT * FROM professor;
SELECT * FROM avaliacao;


-- 05
SELECT * FROM grupo
JOIN aluno
ON idGrupo = fkGrupo;

-- 06
SELECT * FROM grupo
JOIN aluno 
ON idGrupo = fkGrupo
WHERE Grupo.nome = 'OnSpot';

-- 07
SELECT avg(nota) AS mediaGrupos FROM grupo
JOIN avaliacao
ON idGrupo = fkAvaliacaoGrupo;

-- 08
SELECT min(nota) AS notaMinima, max(nota) AS notaMaxima
FROM grupo
JOIN avaliacao
ON idGrupo = fkAvaliacaoGrupo;

-- 09
SELECT sum(nota) AS SomaTodasNotas
FROM grupo
JOIN avaliacao
ON idGrupo = fkAvaliacaoGrupo;

-- 10
SELECT 
p.idProfessor AS idProfessor,
p.nome AS nomeProfessor,
p.disciplina AS disciplinaProfessor,
g.idGrupo AS idGrupo,
g.nome AS NomeGrupo,
g.descricao AS descricaoGrupo,
a.dthAvaliacao AS DataAvaliacao
FROM professor AS p
JOIN avaliacao AS a
ON idProfessor = fkProfessor
JOIN grupo AS g
ON fkAvaliacaoGrupo = idGrupo;

-- 11
SELECT 
p.idProfessor AS idProfessor,
p.nome AS nomeProfessor,
p.disciplina AS disciplinaProfessor,
g.idGrupo AS idGrupo,
g.nome AS nomeGrupo,
g.descricao AS descricaoGrupo,
a.dthAvaliacao AS DataAvaliacao
FROM professor AS p
JOIN avaliacao AS a
ON idProfessor = fkProfessor
JOIN grupo AS g
ON fkAvaliacaoGrupo = idGrupo
WHERE g.nome = 'onspot';

-- 12
SELECT 
g.nome AS NomeGrupo
FROM grupo AS g
JOIN avaliacao
ON idGrupo = fkAvaliacaoGrupo
JOIN professor
ON idProfessor = fkProfessor
WHERE idProfessor = 10000;

-- 13
SELECT 
g.idGrupo AS idGrupo,
g.nome AS nomeGrupo,
g.descricao AS descricaoGrupo,
al.ra AS raAluno,
al.nome AS nomeAluno,
al.email AS emailAluno,
p.idProfessor AS idProfessor,
p.nome AS nomeProfessor,
p.disciplina AS DisciplinaProfessor,
a.dthAvaliacao AS dataHoraAvaliacao
FROM GRUPO AS g
JOIN aluno AS al
ON idGrupo = fkGrupo
JOIN avaliacao AS a
ON idGrupo = fkAvaliacaoGrupo
JOIN professor AS p
ON idProfessor = fkProfessor;

-- 14
SELECT count(distinct nota) FROM avaliacao;

-- 15
SELECT 
p.nome AS identificacaoProfessor,
avg(nota) AS mediaNotas,
sum(nota) AS somaNotas
FROM professor AS p
JOIN avaliacao 
ON idProfessor = fkProfessor
GROUP BY nome;

-- 16
SELECT 
g.idGrupo AS identificacaoGrupo,
avg(nota) AS mediaNotas,
sum(nota) AS somaNotas
FROM grupo AS g
JOIN avaliacao
ON idGrupo = fkAvaliacaoGrupo
JOIN professor 
ON idProfessor = fkProfessor
GROUP BY idGrupo;

-- 17
SELECT 
p.nome AS identificacaoProfessor,
min(nota) AS menorNota,
max(nota) AS maiorNota
FROM professor AS p
JOIN avaliacao
ON idProfessor = fkProfessor
GROUP BY nome;

-- 18
SELECT
g.nome AS identificaoGrupo,
min(nota) AS menorNota,
max(nota) AS maiorNota
FROM grupo AS g
JOIN avaliacao 
ON idGrupo = fkAvaliacaoGrupo
GROUP BY nome;

-- Criando Views

CREATE VIEW todos_dados_grupos AS
SELECT * FROM dados_grupo_aluno_professor
JOIN menor_maior_nota_grupo
;

CREATE VIEW dados_grupo_aluno_professor AS
SELECT 
g.idGrupo AS idGrupo,
g.nome AS nomeGrupo,
g.descricao AS descricaoGrupo,
al.ra AS raAluno,
al.nome AS nomeAluno,
al.email AS emailAluno,
p.idProfessor AS idProfessor,
p.nome AS nomeProfessor,
p.disciplina AS DisciplinaProfessor,
a.dthAvaliacao AS dataHoraAvaliacao
FROM GRUPO AS g
JOIN aluno AS al
ON idGrupo = fkGrupo
JOIN avaliacao AS a
ON idGrupo = fkAvaliacaoGrupo
JOIN professor AS p
ON idProfessor = fkProfessor;

CREATE VIEW menor_maior_nota_grupo AS
SELECT
g.nome AS identificaoGrupo,
min(nota) AS menorNota,
max(nota) AS maiorNota
FROM grupo AS g
JOIN avaliacao 
ON idGrupo = fkAvaliacaoGrupo
GROUP BY nome;

SELECT * FROM todos_dados_grupos;

SELECT * FROM dados_grupo_aluno_professor;

SELECT * FROM dados_grupo_aluno_professor
JOIN menor_maior_nota_grupo
;

CREATE VIEW teste AS




