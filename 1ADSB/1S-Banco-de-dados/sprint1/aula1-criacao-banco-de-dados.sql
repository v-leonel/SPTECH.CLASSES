-- criação de banco de dados.
CREATE DATABASE bd1adsb;

-- selecionar o banco de dados.
USE bd1adsb;

-- criar tabela
CREATE TABLE empresa
(
empresa_id INT PRIMARY KEY,
nome_empresa VARCHAR(40),
responsavel_empresa VARCHAR(40)
);

DROP TABLE empresa;

-- descrever dados da tabela
DESCRIBE empresa;


-- inserir dados
INSERT INTO empresa VALUES
	(100, 'STEFANINI', 'RAFAEL'),
    (101, 'C6', 'ANDREZA'),
	(102, 'ACCENTURE', 'RENATA');
    
-- exibir os dados da tabela
SELECT * FROM empresa;

UPDATE empresa SET nome_empresa ='ACCENTURE'
	WHERE empresa_id = 102;
    
SELECT responsavel_empresa FROM empresa
	WHERE responsavel_empresa LIKE '%A';
    
UPDATE empresa SET responsavel_empresa = 'ANDREZA SILVA'
	WHERE empresa_id = 100;

UPDATE empresa SET responsavel_empresa = 'ANDREZA SILVA'
	WHERE empresa_id = 101;
    
SELECT responsavel_empresa FROM empresa
	WHERE responsavel_empresa LIKE '_N%';
    
SELECT responsavel_empresa FROM empresa
	WHERE responsavel_empresa LIKE '% %';
    
DELETE FROM empresa
	WHERE id = 102;
    
INSERT INTO empresa VALUES
	(102, 'ACCENTURE', 'RENATA');
ALTER TABLE empresa RENAME COLUMN empresa_id TO id;

ALTER TABLE empresa RENAME COLUMN nome_empresa TO nome;

ALTER TABLE empresa RENAME COLUMN responsavel_empresa TO responsavel;

ALTER TABLE empresa MODIFY COLUMN nome_empresa VARCHAR(100);

ALTER TABLE empresa ADD COLUMN salario int;

ALTER TABLE empresa DROP COLUMN salario;

SELECT * FROM empresa ORDER BY nome DESC;

SELECT * FROM empresa ORDER BY nome;

CREATE TABLE turma(
turma_id INT PRIMARY KEY,
nome_turma VARCHAR(40)
);

DESCRIBE turma;

INSERT INTO turma VALUES
	(1, '1adsb'),
	(2, '1adsa'),
	(3, '1adsc');
    
DROP TABLE turma;

SELECT * FROM turma;

CREATE TABLE aluno(
id_aluno CHAR(40) PRIMARY KEY,
nome_aluno VARCHAR(40),
bairro_aluno VARCHAR(40),
turma_id INT NOT NULL,
empresa_id INT NOT NULL,
FOREIGN KEY (turma_id) REFERENCES turma(turma_id),
FOREIGN KEY (empresa_id) REFERENCES empresa(empresa_id)
);

DESCRIBE aluno;

INSERT INTO aluno VALUES
	('01232204', 'VICTOR', 'VILA JOANIZA', 2, 101);
    
    
INSERT INTO aluno VALUES 
	('01232503', 'zezinho', 'vila da banana', 1, 100);
    
INSERT INTO aluno VALUES
	('01232999', 'Vivian', 'Sacomã', 2, 100);

SELECT * FROM empresa WHERE responsavel_empresa ='ANDREZA';
    
SELECT * FROM aluno; 

DROP TABLE aluno;


