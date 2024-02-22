-- Aula 10
-- Revisão dos tipos de atributos
-- Relacionamento forte e fraco
-- Relacionamento recursivo ou auto-relacionamento

-- Criar banco de dados

CREATE DATABASE convenio;
USE convenio;

CREATE TABLE funcionario(
idFunc INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(45), -- + sobrenome = atributo composto.
sobrenome VARCHAR(45),
emailP VARCHAR(45), -- + emailS = atributo multivalorado.
emailS VARCHAR(45),
fkSuper int,
CONSTRAINT fkSupervisor FOREIGN KEY (fkSuper) REFERENCES funcionario(idFunc)
);

-- inserir primeiro o supervisor

INSERT INTO funcionario (nome, emailP) VALUES
('Dumblodore', 'dumb@hh.com');

-- inserir os funcionarios

INSERT INTO funcionario (nome, emailP, fkSuper) VALUES
('Harry', 'harry@hh.com', 1),
('Hermione', 'hermione@hh.com', 1),
('Rony', 'rony@hh.com', 1),
('Malfoy', 'malf@hh.com', null);

SELECT f.nome AS NomeFuncionario, s.nome AS NomeSupervisor 
FROM funcionario AS f
JOIN funcionario AS s
ON f.fkSuper = s.idFunc;

CREATE TABLE dependente(
idDep INT,
fkFunc INT,
PRIMARY KEY (idDep, fkFunc),
nome VARCHAR(45),
parentesco VARCHAR(45),
dtNasc DATE, -- a idade é um atributo derivado
CONSTRAINT fkFuncDep FOREIGN KEY (fkFunc) REFERENCES funcionario(idFunc)
);

INSERT INTO dependente VALUES
(1,2, 'Dobby', 'primo', '2000-10-13'),
(2,2, 'Coruja', 'prima', '2000-10-23'),
(1,4, 'Rato', 'tio', '2000-10-18');

SELECT * FROM dependente;

SELECT * FROM funcionario JOIN dependente ON idFunc = fkFunc;

SELECT f.nome AS NomeFunc, s.nome AS NomeSuper, d.nome AS NomeDep
FROM funcionario AS f
JOIN funcionario AS s
ON f.fkSuper = s.idFunc
JOIN dependente AS d
ON f.idFunc = d.fkFunc;

SELECT * FROM funcionario;

SELECT * FROM funcionario AS funcionario RIGHT JOIN funcionario AS supervisor
ON funcionario.fkSuper = supervisor.idFunc;


-- EXIBIR APENAS OS FUNCIONARIOS SEM SUPERVISOR
SELECT * FROM funcionario AS funcionario LEFT JOIN funcionario AS supervisor
ON funcionario.fkSuper = supervisor.idFunc
WHERE funcionario.fkSuper is null;

