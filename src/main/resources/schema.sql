DROP TABLE IF EXISTS PUBLIC.TB_CLIENTES;

CREATE TABLE PUBLIC.TB_CLIENTES
(
    id      BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome    VARCHAR(150) NOT NULL,
    salario DECIMAL      NOT NULL,
    email   VARCHAR(60) DEFAULT NULL
);


INSERT INTO PUBLIC.TB_CLIENTES (nome, salario, email)
VALUES ('Italo', 3600, 'italo@gmail.com'),
       ('Yuri', 4300, 'yuri@gmail.com'),
       ('Victor', 6300, 'victor@gmail.com'),
       ('walisson', 3300, 'walisson@gmail.com');
