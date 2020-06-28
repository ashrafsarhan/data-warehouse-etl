-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema bdd_allelectronics
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bdd_allelectronics
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bdd_allelectronics` DEFAULT CHARACTER SET utf8 ;

USE `bdd_allelectronics` ;

-- -----------------------------------------------------
-- Table `bdd_allelectronics`.`Article`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdd_allelectronics`.`Article` (
  `id_Article` INT NOT NULL AUTO_INCREMENT,
  `Nom_article` VARCHAR(45) NOT NULL,
  `Marque` VARCHAR(45) NOT NULL,
  `Categorie` VARCHAR(45) NOT NULL,
  `Prix` REAL NOT NULL,
  `Fabrique_en` VARCHAR(45) NOT NULL,
  `Fournisseur` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_Article`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdd_allelectronics`.`Client`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdd_allelectronics`.`Client` (
  `id_Client` INT NOT NULL AUTO_INCREMENT,
  `Nom_client` VARCHAR(45) NOT NULL,
  `Adresse` VARCHAR(45) NOT NULL,
  `Age` INT(45) NOT NULL,
  `Revenu` REAL NOT NULL,
  `Info_credit` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_Client`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdd_allelectronics`.`Branche`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdd_allelectronics`.`Branche` (
  `id_Branche` INT NOT NULL AUTO_INCREMENT,
  `Nom_branche` VARCHAR(45) NOT NULL,
  `Adresse_branche` VARCHAR(45) NOT NULL,
  `Ville_branche` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_Branche`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdd_allelectronics`.`Employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdd_allelectronics`.`Employee` (
  `id_Employee` INT NOT NULL AUTO_INCREMENT,
  `Nom_empl` VARCHAR(45) NOT NULL,
  `Categorie` VARCHAR(45) NOT NULL,
  `Groupe` INT NOT NULL,
  `Salaire` REAL NOT NULL,
  `Branche_id_Branche` INT NOT NULL,
  PRIMARY KEY (`id_Employee`, `Branche_id_Branche`),
  INDEX `fk_Employee_Branche1_idx` (`Branche_id_Branche` ASC),
  CONSTRAINT `fk_Employee_Branche1`
    FOREIGN KEY (`Branche_id_Branche`)
    REFERENCES `bdd_allelectronics`.`Branche` (`id_Branche`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdd_allelectronics`.`Article_has_Employee_has_Client`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdd_allelectronics`.`Article_has_Employee_has_Client` (
  `Article_id_Article` INT NOT NULL,
  `Employee_id_Employee` INT NOT NULL,
  `Client_id_Client` INT NOT NULL,
  `Num_tecket` INT(45) NOT NULL,
  `temps` VARCHAR(45) NOT NULL,
  `date` DATE NOT NULL,
  `mode_paiment` VARCHAR(45) NOT NULL,
  `QTE` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Article_id_Article`, `Employee_id_Employee`, `Client_id_Client`),
  INDEX `fk_Article_has_Employee_has_Client_Article1_idx` (`Article_id_Article` ASC),
  INDEX `fk_Article_has_Employee_has_Client_Employee1_idx` (`Employee_id_Employee` ASC),
  INDEX `fk_Article_has_Employee_has_Client_Client1_idx` (`Client_id_Client` ASC),
  CONSTRAINT `fk_Article_has_Employee_has_Client_Article1`
    FOREIGN KEY (`Article_id_Article`)
    REFERENCES `bdd_allelectronics`.`Article` (`id_Article`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Article_has_Employee_has_Client_Employee1`
    FOREIGN KEY (`Employee_id_Employee`)
    REFERENCES `bdd_allelectronics`.`Employee` (`id_Employee`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Article_has_Employee_has_Client_Client1`
    FOREIGN KEY (`Client_id_Client`)
    REFERENCES `bdd_allelectronics`.`Client` (`id_Client`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
