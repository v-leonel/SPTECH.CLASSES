CREATE DATABASE exercicio11;
USE exercicio11;
DROP DATABASE exercicio11;

CREATE TABLE Departamento(
idDepto INT PRIMARY KEY,
nomeDepto VARCHAR(45),
fkGerente INT,
dataInicioGer DATE
);
ALTER TABLE Departamento ADD CONSTRAINT FOREIGN KEY (fkGerente) REFERENCES funcionario(idFunc);

INSERT INTO Departamento VALUES
(105, 'Pesquisa', 2, '2008-05-22'),
(104, 'Administração', 7, '2015-01-01'),
(101, 'Matriz', 8, '2001-06-19');

CREATE TABLE Funcionario(
idFunc INT PRIMARY KEY,
nomeFunc VARCHAR(30),
salario DEC(5.2),
sexo VARCHAR(20),
fkSupervisor INT,
dataNasc DATE,
fkDepto INT,
FOREIGN KEY (fkDepto) REFERENCES Departamento(idDepto)
);

INSERT INTO Funcionario VALUES
(1, 'Joao Silva', 3500, 'm', 2, '1985-01-09', 105),
(2, 'Fernando Wong', 4500, 'm', 8, '1975-12-08', 105),
(3, 'Alice Sousa', 2500, 'f', 7, '1988-01-19', 104),
(4, 'Janice Morais', 4300, 'f', 8, '1970-06-20', 104),
(5, 'Ronaldo Lima', 3800, 'm', 1, '1982-09-15', 105),
(6, 'Joice Leite', 2500, 'f', 1, '1992-07-31', 104),
(7, 'Antonio Pereira', 2500, 'm', 4, '1989-03-29', 104),
(8, 'Juliano Brito', 5500, 'm', null, '1957-11-10', 101);


CREATE TABLE Projeto(
idProj INT PRIMARY KEY,
nomeProj VARCHAR(45),
localProj VARCHAR(45),
fkDeptoProj INT,
FOREIGN KEY (fkDeptoProj) REFERENCES Departamento(idDepto)
);

INSERT INTO Projeto VALUES
(1, 'Produto X', 'Santo André', 105),
(2, 'Produto Y', 'Itu', 105),
(3, 'Produto Z', 'São Paulo', 105),
(10, 'Informatização', 'Mauá', 104),
(20, 'Reorganização', 'São Paulo', 101),
(30, 'Benefícios', 'Mauá', 104);

CREATE TABLE Funcproj(
fkFunc INT,
fkProj INT,
horas DEC(3.1),
PRIMARY KEY (fkFunc, fkProj)
);

INSERT INTO Funcproj VALUES
(1, 1, 32.5),
(1, 2, 7.5),
(5, 3, 40.0),
(6, 1, 20.0),
(6, 2, 20.0),
(2, 2, 10.0),
(2, 3, 10.0),
(2, 10, 10.0),
(2, 20, 10.0),
(3, 30, 30.0),
(3, 10, 10.0),
(7, 10, 35.0),
(7, 30, 5.0),
(4, 30, 20.0),
(4, 20, 15.0),
(8, 20, null);

SELECT * FROM departamento;
SELECT * FROM funcionario;
SELECT * FROM funcproj;
SELECT * FROM projeto;

INSERT INTO funcionario VALUES
(9, 'Cecília Ribeiro', 2800, 'f', null, '1980-04-05', 104);
 
INSERT INTO funcionario VALUES
(10, 'Alice Sousa', 2800, 'f', 4, '1980-04-05', 104);

INSERT INTO funcionario VALUES
(11, 'Cecília Ribeiro', 2800, 'f', 4, '1980-04-05', 105);

SELECT * FROM funcproj;
DELETE FROM funcproj WHERE fkFunc = 3 and fkProj = 10;

SELECT * FROM funcionario;
DELETE FROM funcionario WHERE idFunc = 4;

DELETE FROM funcionario WHERE idFunc = 2;

UPDATE funcionario SET salario = 2800 WHERE idFunc = 3;

UPDATE funcionario SET idFunc = 101 WHERE idFunc = 3;

UPDATE funcionario SET idFunc = 107 WHERE idFunc = 3;

describe funcionario;
SELECT * FROM funcionario;
SELECT 
f.dataNasc AS DataNascimentoFuncioario,
f.salario AS SalarioFuncionario
FROM funcionario AS f
WHERE nomeFunc = 'João Silva';

SELECT (salario) FROM funcionario;

SELECT distinct(salario) FROM funcionario;

SELECT * FROM funcionario
ORDER BY nomeFunc;

SELECT * FROM funcionario
ORDER BY salario DESC;

SELECT 
f.idFunc AS id,
f.nomeFunc AS nome,
f.salario AS salario,
f.sexo AS sexualidade,
f.dataNasc AS dataNascimento
FROM funcionario AS f
WHERE salario >= 2000 AND salario <= 4000;

SELECT 
f.nomeFunc,
f.salario
FROM funcionario AS f
WHERE nomeFunc LIKE 'J%';

SELECT 
f.nomeFunc,
f.salario
FROM funcionario AS f
WHERE nomeFunc LIKE '%a';

SELECT 
f.nomeFunc
FROM funcionario AS f
WHERE nomeFunc LIKE '%__n%';

SELECT
f.nomeFunc,
f.dataNasc
FROM funcionario AS f
WHERE nomeFunc LIKE '%S____%';

INSERT INTO funcionario VALUES
(10, 'Lucas', null, null, null, null, null);

DESCRIBE funcionario;
describe departamento;
SELECT 
f.idFunc,
f.nomeFunc,
f.salario,
f.sexo,
f.dataNasc,
d.nomeDepto AS Departamento
FROM funcionario AS f
JOIN departamento AS d ON fkDepto = idDepto
WHERE nomeDepto = 'Pesquisa';

SELECT 
f.idFunc,
f.nomeFunc,
f.salario,
f.sexo,
f.dataNasc,
d.nomeDepto AS Departamento
FROM funcionario AS f
JOIN departamento AS d ON fkDepto = idDepto
WHERE nomeDepto = 'Pesquisa'
AND
salario > 3500;

SELECT 
f.idFunc,
f.nomeFunc,
f.salario,
f.sexo,
f.dataNasc,
d.nomeDepto AS Departamento
FROM funcionario AS f
JOIN departamento AS d ON fkDepto = idDepto
WHERE nomeDepto = 'Pesquisa'
AND
nomeFunc LIKE 'J%';

DESCRIBE funcionario;
SELECT 
f.idFunc AS idFuncionario,
f.nomeFunc AS nomeFuncionario,
s.idFunc AS idSupervisor,
s.nomeFunc AS nomeSupervisor
FROM funcionario AS f
JOIN funcionario AS s ON f.idFunc = s.fkSupervisor;

SELECT 
p.idProj,
d.idDepto,
d.fkGerente,
f.nomeFunc,
f.dataNasc
FROM projeto AS p
JOIN departamento AS d ON fkDeptoProj = idDepto
JOIN funcionario AS f ON idDepto = fkDepto
WHERE localProj = 'São Paulo';

SELECT 
f.idFunc,
f.nomeFunc,
p.nomeProj,
fp.horas
FROM funcionario AS f
JOIN departamento AS d ON idDepto = fkDepto
JOIN projeto AS p ON fkDeptoProj = idDepto
JOIN funcProj AS fp ON idProj = fkProj;

SELECT 
nomeFunc
FROM funcionario
WHERE dataNasc < '1980-01-01';

SELECT distinct(salario)
FROM funcionario;

SELECT distinct(localProj)
FROM projeto;

SELECT 
avg(salario) AS media,
sum(salario) AS soma
FROM funcionario;

SELECT 
min(salario) AS menorSalario,
max(salario) AS maiorSalario
FROM funcionario;

SELECT
d.idDepto,
avg(f.salario) AS SalarioMedio,
sum(f.salario) AS SomaSalarios
FROM departamento AS d
JOIN funcionario AS f
ON idDepto = fkDepto
GROUP BY idDepto;

SELECT 
d.nomeDepto,
min(f.salario) AS MenorSalario,
max(f.salario) AS MaiorSalario
FROM departamento AS d
JOIN funcionario AS f
ON idDepto = fkDepto
GROUP BY nomeDepto;

SELECT 
d.nomeDepto,
min(f.salario) AS MenorSalario,
max(f.salario) AS MaiorSalario
FROM departamento AS d
JOIN funcionario AS f
ON idDepto = fkDepto
GROUP BY nomeDepto;

INSERT INTO funcionario VALUES
(11, 'José da Silva', '1800', 'm', 3, '2000-10-12', null),
(12, 'Benedito Almeida', '1200', 'm', 5, '2001-09-01', null);

INSERT INTO departamento VALUES
(110, 'RH', 3, '2018-11-10');

 