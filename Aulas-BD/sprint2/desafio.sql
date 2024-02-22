CREATE DATABASE desafio;
USE desafio;


CREATE TABLE Pessoa(
  idPessoa INT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(45),
  cpf VARCHAR(45),
  dtNasc DATE,
  fkMae INT,
  CONSTRAINT fk_pessoa FOREIGN KEY (fkMae) REFERENCES Pessoa(idPessoa)
);

INSERT INTO Pessoa VALUES
(null, 'Lorenzeti', '745-222-16-28', '1970-05-12', null),
(null, 'Rayssa', '235-172-11-38', '1960-06-13', 1);

SELECT * FROM Pessoa AS filho JOIN Pessoa AS Mae ON Mae.fkMae = Filho.idPessoa;


