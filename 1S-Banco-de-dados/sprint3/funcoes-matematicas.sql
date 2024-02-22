-- FUNÇÕES MATEMÁTICA
-- COUNT
SELECT count(preco) FROM produto;

-- DISTINCT
SELECT distinct(preco) FROM produto;

-- SUM
SELECT sum(preco) FROM produto WHERE preco = 11;
SELECT sum(preco) FROM produto WHERE idProduto IN (101,102);

-- MÉDIA
SELECT avg(preco) FROM produto;

-- ARREDONDAR
SELECT round(avg(preco), 2) FROM produto;

-- MAIOR
SELECT max(preco) FROM produto;

-- MENOR
SELECT min(preco) FROM produto;

-- AGRUPAR
SELECT validade, sum(preco) FROM produto
GROUP BY validade;

-- LIMIT
SELECT * FROM produto LIMIT 2;

SELECT CASE WHEN preco <= 9.99 THEN 'BARATO' ELSE 'CARO' END AS Campo FROM produto;