-- MySQL Script generated by MySQL Workbench
-- Wed May  9 21:29:07 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`cliente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`cliente` ;

CREATE TABLE IF NOT EXISTS `mydb`.`cliente` (
  `id_cliente` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome_cliente` VARCHAR(45) NOT NULL,
  `sexo_cliente` VARCHAR(2) NOT NULL,
  `rg_cliente` INT NOT NULL,
  `cpf_cliente` INT NOT NULL,
  `data_nasc_cliente` DATE NOT NULL,
  `email_cliente` VARCHAR(100) NULL,
  `celular_cliente` VARCHAR(14) NOT NULL,
  `telefone_cliente` VARCHAR(14) NOT NULL,
  `data_cadastro_cliente` DATE NOT NULL,
  `enable` TINYINT NULL,
  PRIMARY KEY (`id_cliente`),
  UNIQUE INDEX `id_cliente_UNIQUE` (`id_cliente` ASC),
  UNIQUE INDEX `rg_cliente_UNIQUE` (`rg_cliente` ASC),
  UNIQUE INDEX `cpf_cliente_UNIQUE` (`cpf_cliente` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`end_cliente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`end_cliente` ;

CREATE TABLE IF NOT EXISTS `mydb`.`end_cliente` (
  `rua_cliente` VARCHAR(150) NOT NULL,
  `numero_cliente` VARCHAR(5) NOT NULL,
  `bairro_cliente` VARCHAR(50) NOT NULL,
  `cidade_cliente` VARCHAR(20) NOT NULL,
  `uf_cliente` VARCHAR(2) NOT NULL,
  `cep_cliente` INT NOT NULL,
  `complemento_cliente` VARCHAR(45) NULL,
  `cliente_id_cliente` INT UNSIGNED NOT NULL)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`produto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`produto` ;

CREATE TABLE IF NOT EXISTS `mydb`.`produto` (
  `id_produto` INT NOT NULL AUTO_INCREMENT,
  `nome_produto` VARCHAR(45) NOT NULL,
  `genero_produto` VARCHAR(15) NOT NULL,
  `cor` VARCHAR(45) NOT NULL,
  `tamanho_produto` VARCHAR(1) NOT NULL,
  `descricao_produto` VARCHAR(100) NULL,
  `preco_produto` VARCHAR(45) NOT NULL,
  `quant_estoque_produto` INT UNSIGNED NOT NULL,
  `data_cadastro_produto` DATE NOT NULL,
  `enable` TINYINT NULL,
  PRIMARY KEY (`id_produto`),
  UNIQUE INDEX `id_produto_UNIQUE` (`id_produto` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`venda`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`venda` ;

CREATE TABLE IF NOT EXISTS `mydb`.`venda` (
  `id_cliente` INT UNSIGNED NOT NULL,
  `data_venda` DATE NOT NULL,
  `enable` TINYINT NULL,
  PRIMARY KEY (`id_cliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`itemVenda`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`itemVenda` ;

CREATE TABLE IF NOT EXISTS `mydb`.`itemVenda` (
  `venda_id_cliente` INT UNSIGNED NOT NULL,
  `venda_id_produto` INT NOT NULL,
  `quantidade_produto` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`venda_id_cliente`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
