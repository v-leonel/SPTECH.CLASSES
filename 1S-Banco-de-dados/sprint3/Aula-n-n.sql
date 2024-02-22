-- AULA RELACIONAMENTO N:N
-- REVISÃO SPRINT 2

CREATE DATABASE CONSULTA;
USE CONSULTA;

CREATE TABLE paciente(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(45)
);

INSERT INTO paciente (nome) VALUES
('Bryan'),
('Toreto');

CREATE TABLE medico (
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(45),
salario DECIMAL (10,2)
)AUTO_INCREMENT = 100;

INSERT INTO medico (nome, salario) VALUES
('Mia', 100.99),
('Letty', 200.99),
('Han', 99.99);

-- CRIAR TABELA ASSOCIATIVA
-- A TABELA ASSOCIATIVA SEMPRE SERÁ FRACA
-- ELA TERA A CHAVE PRIMARIA COMPOSTA

CREATE TABLE consulta (
idConsulta INT,
fkMedico INT,
fkPaciente INT,
PRIMARY KEY (idConsulta, fkMedico, fkPaciente),
dtConsulta DATETIME,
CONSTRAINT fkMedicoConsulta FOREIGN KEY (fkMedico) REFERENCES medico(id),
CONSTRAINT fkPacienteConsulta FOREIGN KEY (fkPaciente) REFERENCES paciente(id)
);

INSERT INTO consulta VALUES
(1,100,1, '2023-10-30 14:00:00'),
(2,100,1, '2023-10-30 14:00:00'),
(1, 101, 2, '2023-10-30 14:00:00');

SELECT * FROM medico
JOIN consulta 
ON fkMedico = medico.id
JOIN paciente
ON fkPaciente = paciente.id
WHERE dtConsulta LIKE '%2023-10-30%';

SELECT * FROM consulta
JOIN medico
ON fkMedico = medico.id
JOIN paciente 
ON fkPaciente = paciente.id;
