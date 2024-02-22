USE sprint1;

DROP TABLE professor;

CREATE TABLE professor(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(50) NOT NULL,
cpf CHAR(11) UNIQUE, -- O CPF NÃO PODE SE REPETIR
dtAtual DATETIME default current_timestamp,
email VARCHAR(30) default 'Sem e-mail'
);

DESCRIBE professor;

INSERT INTO professor (nome)VALUES
('Vivian'),
('JP'),
('Caramico');

    
SELECT * FROM professor;
    
-- ADD CONSTRAINT 
ALTER TABLE professor 
ADD COLUMN funcao VARCHAR(40),
ADD CONSTRAINT chkFuncao 
CHECK (funcao IN('Monitor',  'Titular'));

-- APELIDAR ALIASES
SELECT funcao AS Função FROM professor;
SELECT funcao Função FROM professor;

-- CONCATENAR

SELECT concat(nome, funcao) FROM professor;
SELECT concat(nome,'', funcao) FROM professor;
SELECT concat('O nome do professor é', nome,'', funcao) AS Frase FROM professor;