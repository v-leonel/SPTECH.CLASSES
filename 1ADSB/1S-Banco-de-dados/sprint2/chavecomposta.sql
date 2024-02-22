CREATE DATABASE tabelafraca;

USE tabelafraca;


CREATE TABLE tbA(
idA INT PRIMARY KEY,
nome VARCHAR(45),
fkSup INT,
CONSTRAINT fkSupervisor FOREIGN KEY (fkSup) REFERENCES tbA(idA)
);

CREATE TABLE tbB(
idB INT,
fkA INT,
nome VARCHAR(45),
PRIMARY KEY (idB, fkA),
CONSTRAINT fkBA FOREIGN KEY (fkA) REFERENCES tbA(idA)
);

INSERT INTO tbB VALUES 
(1,1, 'Ribeiro'),
(1,2, 'Silva');

INSERT INTO tbA VALUES
(1, 'Cascão', null);

INSERT INTO tbA VALUES
(2, 'Monica', 1);

SELECT * FROM tbA;

SELECT 
a.nome AS pessoa,
s.nome AS supervisor
FROM tbA AS a
JOIN tbA AS s
ON a.fkSup = s.idA;

SELECT 
a.nome AS pessoa,
s.nome AS supervisor,
b.nome AS sobrenome
FROM tbA AS a
JOIN tbA AS s
ON a.fkSup = s.idA
JOIN tbB AS b
ON b.fkA = idB;
