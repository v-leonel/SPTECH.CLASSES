CREATE DATABASE Pratica06;
USE Pratica06;
DROP DATABASE Pratica06;


-- EXERCICIO 2 
CREATE TABLE pessoa(
idPessoa INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome VARCHAR(45),
dtNasc DATE,
profissao VARCHAR(45)
);


INSERT INTO pessoa (nome, dtNasc, profissao) VALUES 
('Victor Leonel', '2003-04-04', 'Desenvolvedor'),
('Matheus Kikuti', '2004-06-22', 'Dba'),
('Gustavo Henrique', '2004-07-14', 'Pastor');

CREATE TABLE gasto(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
dtGasto DATE,
valor float(7.2),
descricao VARCHAR(45),
fkPessoa INT,
CONSTRAINT fkPessoa FOREIGN KEY (fkPessoa) REFERENCES pessoa(idPessoa)
);

INSERT INTO gasto (dtGasto, valor, descricao, fkPessoa) VALUES
('2023-10-09', '10.99', 'Barra de chocolate lacta 90g', 1),
('2023-10-01', '1500.00', 'Smartphone Samsung galaxy s22', 2),
('2022-08-22', '175.95', '10Litros de gasolina comum', 3);

SELECT * FROM pessoa;
SELECT * FROM gasto;

SELECT * FROM pessoa 
WHERE profissao = 'desenvolvedor';

SELECT * FROM gasto 
WHERE dtGasto = '2023-10-09';

SELECT * FROM pessoa 
JOIN gasto 
ON fkPessoa = idPessoa;

SELECT * FROM pessoa 
JOIN gasto 
ON fkpessoa = idPessoa
WHERE pessoa.nome = 'Victor Leonel';

UPDATE gasto SET valor = 9.99 WHERE id = 1;

SELECT * FROM gasto WHERE id = 1;

DELETE FROM gasto WHERE id = 1;

DELETE FROM pessoa WHERE idPessoa = 1;

SELECT * FROM pessoa;

--  Exercicio 3

CREATE DATABASE PraticaFuncionario;
USE PraticaFuncionario;

CREATE TABLE setor(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome VARCHAR(30),
andar CHAR(5)
);

INSERT INTO setor VALUES
(null, 'Recursos Humanos', '1' ),
(null, 'Tecnologia', '2'),
(null, 'Marketing', '3');


CREATE TABLE funcionario(
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
nome VARCHAR(30),
sobrenome VARCHAR(30),
telefone VARCHAR(20),
salario FLOAT(7.2),
fkSetor INT,
CONSTRAINT fkSetor FOREIGN KEY (fkSetor) REFERENCES setor(id)
);

INSERT INTO funcionario VALUES
(null, 'Victor', 'Leonel', '11989121266', 1800.00 , 2),
(null, 'Matheus', 'Kikuti', '11979367265', 1750.00 , 2),
(null, 'Luana', 'Leite', '11957537691', 1680.00 , 3),
(null, 'Nathan', 'Piazentin', '11969973167', 1900.00 , 3),
(null, 'Marayah', 'Piccinini', '11984107429', 2000.00 , 1),
(null, 'Gustavo', 'Henrique', '119599174309', 2500.00 , 1);

CREATE TABLE acompanhante(
idAcomp INT,
fkFunc INT,
PRIMARY KEY (idAcomp, fkFunc),
nome VARCHAR(30),
sobrenome VARCHAR(30),
parentesco VARCHAR(30),
dtNasc DATE,
CONSTRAINT fkAcompFunc FOREIGN KEY (fkFunc) REFERENCES funcionario(id)
);

INSERT INTO acompanhante VALUES 
(1,1, 'Marcia','Regina','Mãe','1970-06-27'),
(1,2, 'Rogério','Kikuti', 'Pai', '1973-05-22'),
(1,3, 'Marisa', 'Leite', 'Irmã', '2000-10-18');

TRUNCATE acompanhante;

SELECT * FROM setor;
SELECT * FROM funcionario;
SELECT * FROM acompanhante;

SELECT * FROM setor 
JOIN funcionario 
ON fkSetor = setor.id;

SELECT * FROM setor 
JOIN funcionario 
ON fkSetor = setor.id 
WHERE setor.nome = 'Tecnologia';

SELECT * FROM funcionario 
JOIN acompanhante 
ON funcionario.id = fkFunc;

SELECT * FROM funcionario 
JOIN acompanhante 
ON funcionario.id = fkFunc 
WHERE funcionario.nome = 'Victor';

SELECT * FROM funcionario 
JOIN setor ON fkSetor = setor.id
JOIN acompanhante ON funcionario.id = fkFunc;

-- EXERCICIO 4
CREATE DATABASE Treinador;
USE Treinador;

CREATE TABLE Treinador(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome VARCHAR(45),
sobrenome VARCHAR(45),
telefone VARCHAR(20),
email VARCHAR(50),
fkExperiente INT,
CONSTRAINT fkTreinExp  FOREIGN KEY (fkExperiente) REFERENCES Treinador(id)
)AUTO_INCREMENT = 10;

INSERT INTO Treinador VALUES
(null, 'Felipe', 'Vaz', '11975638942', 'felipevaz@hh.com', null ),
(null, 'Rogério', 'Karfunkelstein', '11967832764', 'rogerio@hh.com', 10),
(null, 'Michelle', 'Lenhardt', '11981539053', 'michelle@hh.com', 10);

CREATE TABLE nadador(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(45),
sobrenome VARCHAR(45),
estado_natal char(2),
dtNasc date,
fkTreinador INT,
CONSTRAINT fkTreinador FOREIGN KEY (fkTreinador) REFERENCES Treinador(id)
)AUTO_INCREMENT = 100;

INSERT INTO nadador VALUES
(null, 'César', 'Cielo', 'SP', '1987-01-10', 10),
(null, 'Poliana', 'Okimoto', 'SP', '1983-03-08', 11),
(null, 'Bruno', 'Fratus', 'RJ', '1989-06-30', 10);

SELECT * FROM treinador;
SELECT * FROM nadador;

SELECT * FROM treinador JOIN nadador ON fkTreinador = treinador.id;

SELECT
t.nome AS Novato,
o.nome AS Orientador,
n.nome AS Nadador
FROM treinador AS t
JOIN treinador AS o
ON t.fkExperiente = o.id
JOIN nadador AS n
ON t.id = n.fkTreinador;

SELECT * FROM treinador JOIN nadador ON fkTreinador = treinador.id WHERE Treinador.nome = 'Felipe';

SELECT * FROM treinador AS PoucoExperiente JOIN treinador AS Experiente ON Experiente.fkExperiente = PoucoExperiente.id;

SELECT * FROM treinador AS Experiente JOIN treinador AS PoucoExperiente ON PoucoExperiente.fkExperiente = Experiente.id  WHERE Experiente.nome = 'Felipe';

SELECT * FROM treinador 
LEFT JOIN nadador ON fkTreinador = Treinador.id
LEFT JOIN Treinador AS Orientador ON treinador.fkExperiente = Orientador.id;

SELECT * FROM treinador
LEFT JOIN nadador ON fkTreinador = Treinador.id
LEFT JOIN Treinador AS Orientador ON Treinador.fkExperiente = Orientador.id
WHERE Treinador.nome = 'Rogério';



