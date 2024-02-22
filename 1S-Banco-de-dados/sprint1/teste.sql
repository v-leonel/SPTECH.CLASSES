create database nomedatabase;

use nomedatabase;

create table nometabela(
id
nome

);
describe nometabela;

insert into nometabela
(),
(),
();

-- atualizar um elemento da tabela
update nometabela
set id = 2
where id = 3

-- selecionar um elemento da tabela
select nome
from nometabela
where nome like 'a%';

-- deletar um elemento da tabela
delete from nometabela
where id = 3;

-- renomear uma coluna da tabela
ALTER TABLE empresa RENAME COLUMN id TO idEmpresa;
    
-- alterar a quantidade de caracteres do campo nome
ALTER TABLE empresa MODIFY COLUMN nome varchar(100);

-- adicionar uma nova coluna
ALTER TABLE empresa ADD COLUMN salario int;

-- excluir uma coluna
ALTER TABLE empresa DROP COLUMN salario;

-- CONSTRAINT CHECK - RESTRIÇÃO
-- SÓ PODE INSERIR OU ATUALIZAR O DADO QUE ESTÁ ESPECIFICADO NO CHECK
ALTER TABLE revista ADD constraint chkCategoria
	CHECK (categoria IN ('Diversos', 'Infanto-juvenil'));
    
-- ADD CONSTRAINT 
ALTER TABLE professor ADD COLUMN funcao varchar(40),
	ADD CONSTRAINT chkFuncao 
		CHECK (funcao in ('Monitor', 'Titular'));
        
-- APELIDAR - ALIASES
SELECT funcao AS Função FROM professor;
SELECT funcao Função FROM professor;

-- CONCATENAR
SELECT concat(nome, funcao) FROM professor;
SELECT concat(nome,' ', funcao) FROM professor;
SELECT concat('O nome do professor é ', nome,' ', funcao)
 FROM professor;
SELECT concat('O nome do professor é ', nome,' ', funcao) 
	AS Frase FROM professor;