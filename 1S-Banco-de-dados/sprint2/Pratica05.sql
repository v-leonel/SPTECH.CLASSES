USE sprint2;

CREATE TABLE Professor(
  idProfessor INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(50),
  sobrenome VARCHAR(30),
  especialidade1 VARCHAR(40),
  especialidade2 VARCHAR(40)
);

INSERT INTO professor VALUES
	(null, 'Vivian', 'Silva', 'Analise e Desenvolvimento de Sistemas', 'Banco de dados'),
    (null, 'Fernanda', 'Caramico', 'Analise e Desenvolvimento de Sistemas', 'Gestão'),
    (null, 'Gerson', 'Santos', 'Gestão', 'Marketing'),
    (null, 'Vera', 'Goulart', 'Recursos Humanos', 'Administração'),
    (null, 'Alex', 'Barreira', 'Processamento de dados', 'Administração'),
    (null, 'Marise', 'Miranda' , 'Engenharia', 'Ciência da Computação'),
	(null, 'Caio', 'Santos', 'Analise de desenvolvimento de Sistemas', 'Gestão');
    
CREATE TABLE Disciplina(
  idDisc INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nomeDisc VARCHAR(45) NULL,
  fkProfessor INT NOT NULL,
  CONSTRAINT fkProfessor FOREIGN KEY (fkProfessor) REFERENCES Professor (idProfessor)
);

INSERT INTO disciplina VALUES 
	(NULL, 'Algoritmos', 7),
    (null, 'Pesquisa Inovação', 2),
    (null, 'Pesquisa Inovação', 3),
    (null, 'Arquitetura Computacional', 6),
    (null, 'Banco de dados', 1),
    (null, 'Socioemocional', 5);

SELECT * FROM professor;

SELECT * FROM professor JOIN disciplina ON fkProfessor = idProfessor;

SELECT d.nomeDisc AS NomeDisciplina, p.nome AS NomeProfessor FROM disciplina AS d JOIN professor AS p ON idProfessor = fkProfessor;

SELECT * FROM professor JOIN disciplina ON fkProfessor = idProfessor
WHERE sobrenome = 'Silva';

SELECT especialidade1, nomeDisc FROM professor JOIN disciplina ON fkProfessor = idProfessor
WHERE nome = 'Vivian' ORDER BY especialidade1 ASC;


-- exercicio2


CREATE TABLE Curso(
idCurso INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
nome  VARCHAR(50),
sigla VARCHAR(3),
coordenador VARCHAR(50)
);

INSERT INTO Curso VALUES
(null, 'Analise de desenvolvimento de Sistemas', 'Ads', 'Gerson Santos'),
(null, 'Ciência da Computação', 'Cco', 'Marise Miranda'),
(null, 'Sistemas da informação', 'Sis', 'Alex Barreira');

CREATE TABLE Aluno(
idAluno INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
nome VARCHAR(50),
sala VARCHAR(10),
fkCurso INT,
CONSTRAINT fkCurso FOREIGN KEY (fkCurso) REFERENCES Curso(idCurso)
);

INSERT INTO Aluno VALUES 
(null, 'Victor Leonel', '1AdsB', 1),
(null, 'Matheus', '1CcoA', 2),
(null, 'Guilherme', '1SisC', 3);

SELECT * FROM Curso JOIN Aluno ON fkCurso = idCurso;

SELECT a.nome AS NomeAluno, c.nome AS NomeCurso FROM Curso AS c JOIN Aluno AS a ON fkCurso = idCurso
WHERE sala = '1AdsB';

ALTER TABLE Curso ADD CONSTRAINT chkSigla check (sigla in('Ads','Cco', 'Sis'));





