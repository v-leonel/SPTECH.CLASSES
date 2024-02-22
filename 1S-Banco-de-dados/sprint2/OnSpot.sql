CREATE DATABASE OnSpot;
USE OnSpot;
DROP DATABASE OnSpot;

-- TABELA PARA ACESSO DA ADMINISTRAÇÃO
CREATE TABLE Administrador(
idAdmin int primary key auto_increment,
nomeAdmin varchar(40),
emailAdmin varchar(40),
senhaAdmin varchar(40)
);

-- TABELA PARA CONTROLE E CADASTRO DE EMPRESAS CLIENTES --
 CREATE TABLE empresa(
idEmpresa int primary key auto_increment,
cnpj char(18),
logradouro varchar(60),
numero varchar(10),
bairro varchar(60),
cidade varchar(60),
uf char(2),
cep char(9),
nomeEmpresa varchar(50),
razaoSocial varchar(100),
emailEmpresa varchar(50),
telefoneEmpresa varchar(12)
);

-- TABELA PARA CONTROLE E LOGIN DE CLEINTES --
CREATE TABLE funcionario_empresa(
idFuncionarioEmpresa int primary key auto_increment,
emailFuncionarioEmpresa varchar(50),
idEmpresa int,
nomeFuncionarioEmpresa varchar(40),
cpf varchar(18),
senha varchar(40),
fkEmpresa INT,
CONSTRAINT fkEmpresa FOREIGN KEY (fkEmpresa) REFERENCES empresa(idEmpresa)
);

-- TABELA DOS SENSORES
CREATE TABLE sensores(
	idSensor int PRIMARY KEY auto_increment,
	nomeSensor varchar(40),
	TipoSensor DATETIME default current_timestamp,
	statusDoSensor varchar(25),
	CONSTRAINT chkstatusDoSensor CHECK(statusDoSensor in('ativo', 'inativo'))
);

 -- TABELA DE DADOS DO SENSOR --
CREATE TABLE dados(
	registro int primary key auto_increment,
    nome_sensor varchar(40),
    id_empresa int,
    pos_x_sensor int,
    pos_y_sensor int,
    pos_z_sensor int,
    temperatura double,
    umidade double,
    data_hora dateTime default current_timestamp
);