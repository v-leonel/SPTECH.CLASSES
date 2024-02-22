
-- criar usuário supervisor
use sprint2;
CREATE USER 'supervisor'@'localhost' identified by 'urubu100';

-- permissões do usuário
-- grant all privileges on faculdade. * to 'supervisor'@'localhost';
grant SELECT,UPDATE, DELETE, INSERT on sprint2.* to 'supervisor'@'localhost';

-- confirmar as permissões
flush privileges;

-- retirar permissões
revoke SELECT on sprint2.* from 'supervisor'@'localhost';

-- confirmar a retirada
flush privileges;

-- excluir usuario
drop user 'supervisor'@'localhost';

-- adicionar todos os comandos para o usuario supervisor
grant all privileges on sprint2.* to 'supervisor'@'localhost'
