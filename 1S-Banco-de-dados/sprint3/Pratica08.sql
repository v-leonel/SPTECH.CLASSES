CREATE DATABASE venda;
USE venda;

CREATE TABLE Cliente(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(45),
email VARCHAR(45),
logradouro VARCHAR(45),
numero VARCHAR(5),
fkIndicador int,
CONSTRAINT fkIndicador FOREIGN KEY (fkIndicador) REFERENCES Cliente(id)
);

INSERT INTO Cliente VALUES
(null, 'Victor', 'victor@hh.com', 'avenida paulista', '130', null),
(null, 'Matheus', 'matheus@hh.com', 'avenida brigadeiro', '1050', 1);

CREATE TABLE Venda(
id INT PRIMARY KEY AUTO_INCREMENT,
total DECIMAL(5.2),
dtVenda DATETIME,
fkCliente INT,
CONSTRAINT fkCliente FOREIGN KEY (fkCliente) REFERENCES Cliente(id)
);

INSERT INTO Venda VALUES
(null, 100.90, '2023-10-30 14:50:00', 1),
(null, 250.00, '2023-10-29 13:40:00', 2);

CREATE TABLE Produto(
idProduto INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(45),
descricao VARCHAR(45),
preco DECIMAL (5.2)
);

INSERT INTO Produto VALUE
(null, 'Chocolate', 'Chocolate ao leite 90g', 10.90),
(null, 'Caixa da água', 'Caixa da água azul 500l', 1.99);

INSERT INTO Produto VALUE
(null, 'Caixa da água', 'Caixa da água azul 500l', 1.99);


CREATE TABLE notaFiscal(
idNotaFiscal INT,
fkProduto INT,
fkVenda INT,
qtdProduto INT,
desconto DECIMAL (5.2),
PRIMARY KEY (idNotaFiscal, fkProduto, fkVenda),
CONSTRAINT fkProduto FOREIGN KEY (fkProduto) REFERENCES produto(idProduto),
CONSTRAINT fkVenda FOREIGN KEY (fkVenda) REFERENCES venda(id)
);

INSERT INTO notaFiscal VALUES
(1, 1, 1, 10, 5.00),
(2, 2, 2, 5, 3.00);

SELECT * FROM Cliente;
SELECT * FROM Venda;
SELECT * FROM Produto;
SELECT * FROM notaFiscal;

SELECT * FROM Cliente
JOIN venda ON venda.id = fkCliente;

SELECT * FROM Cliente
JOIN venda ON venda.id = fkCliente
WHERE Cliente.nome = 'Victor';

SELECT * FROM 
Cliente AS ClienteIndicador 
JOIN Cliente AS Indicado 
ON indicado.fkIndicador = ClienteIndicador.id;


SELECT * FROM Cliente AS ClienteIndicador 
JOIN Cliente AS Indicado 
ON indicado.fkIndicador = ClienteIndicador.id
WHERE ClienteIndicador.nome = 'Victor';

SELECT * FROM Cliente AS ClienteIndicador
JOIN Cliente AS Indicado
ON indicado.fkIndicador = ClienteIndicador.id
JOIN venda ON venda.id = fkCliente
JOIN notaFiscal ON venda.id = fkVenda
JOIN Produto ON idProduto = fkProduto;

SELECT 
venda.dtVenda AS DataVenda, 
Produto.nome AS NomeProduto,
notaFiscal.qtdProduto AS QuantidadeProduto
FROM Venda 
JOIN notaFiscal ON venda.id = fkCliente
JOIN Produto ON idProduto = fkProduto
WHERE venda.id = 1;

SELECT 
Produto.nome AS NomeProduto,
Produto.preco AS ValorProduto,
notaFiscal.qtdProduto AS QuantidadeProduto
FROM Produto 
JOIN notaFiscal ON idProduto = fkProduto
WHERE Produto.nome LIKE '%Chocolate%';

INSERT INTO Cliente (id, nome, email, logradouro, numero)VALUES
(null, 'Luana', 'luana@hh.com', 'avenida faria lima', '2000');

SELECT * FROM Cliente;
SELECT * FROM venda;

SELECT * FROM Cliente
LEFT JOIN venda ON Cliente.id = fkCliente;

SELECT max(preco) AS PrecoMaximo, min(preco) AS PrecoMinimo 
FROM produto;

SELECT sum(preco) AS somaProdutos, avg(preco) AS mediaProdutos 
FROM produto;

SELECT sum(distinct preco) AS somaProdutos 
FROM produto;

SELECT sum(preco) 
FROM produto
JOIN notaFiscal ON idProduto = fkProduto
JOIN venda ON id = fkVenda
WHERE id = 1 GROUP BY id;