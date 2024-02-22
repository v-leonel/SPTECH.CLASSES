CREATE DATABASE bd_HardwareLife;
USE bd_HardwareLife;

 -- TABELA PARA ADMINISTRAÇÃO -- 
 
CREATE TABLE administrador(
	id_administrador INT PRIMARY KEY AUTO_INCREMENT,
    email_admin VARCHAR(40),
    nome_admin VARCHAR(40),
    senha VARCHAR(40)
);

 -- TABELA PARA CONTROLE E CADASTRO DE EMPRESAS CLIENTES --
 
 CREATE TABLE empresa(
	id_empresa INT PRIMARY KEY AUTO_INCREMENT,
	cnpj CHAR(18),
    nome_empresa VARCHAR(50),
    razao_social VARCHAR(100),
    email_empresa VARCHAR(50),
    telefone_empresa VARCHAR(15)
 );

 -- TABELA PARA CONTROLE E LOGIN DE CLEINTES --
 
CREATE TABLE funcionario_empresa(
	id_funcionario INT PRIMARY KEY AUTO_INCREMENT,
    email_funcionario VARCHAR(50),
    nome_funcionario VARCHAR(40),
    cpf VARCHAR(18),
    senha VARCHAR(40)
);

 -- TABELA DE DADOS DO SENSOR --

CREATE TABLE medicao(
	id_medicao INT PRIMARY KEY,
    nome_sensor VARCHAR(40),
    data_hora DATETIME,
    temperatura DOUBLE,
    umidade DOUBLE
);
CREATE TABLE posicao(


);

