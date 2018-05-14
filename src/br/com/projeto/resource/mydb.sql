CREATE DATABASE jdbc_teste01;

USE jdbc_teste01;

CREATE TABLE cliente (
   id_cliente INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,
   nome_cliente VARCHAR(45) NOT NULL,
   sexo_cliente VARCHAR(10) ,
   rg_cliente VARCHAR(15) NOT NULL,
   cpf_cliente VARCHAR(15) NOT NULL,
   data_nasc_cliente DATE NOT NULL,
   email_cliente VARCHAR(100) NULL,
   celular_cliente VARCHAR(15) NOT NULL,
   telefone_cliente VARCHAR(15) NOT NULL,
   data_cadastro_cliente DATE NOT NULL,
   enabled BOOLEAN

 
);