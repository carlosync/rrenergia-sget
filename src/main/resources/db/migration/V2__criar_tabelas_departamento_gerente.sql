CREATE TABLE gerente
(
    codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome   VARCHAR(150)  NOT NULL,
    tipo_gerente  VARCHAR(50)  NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE departamento
(
    codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome   VARCHAR(150)  NOT NULL,
    sigla  VARCHAR(10)  NOT NULL,
    codigo_gerente BIGINT(20) NOT NULL,
    FOREIGN KEY (codigo_gerente) REFERENCES gerente(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

