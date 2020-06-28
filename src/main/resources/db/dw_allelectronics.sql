-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema dw_allelectronics
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dw_allelectronics` ;
USE `dw_allelectronics` ;

-- -----------------------------------------------------
-- Table `dw_allelectronics`.`Article`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dw_allelectronics`.`Article` (
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
-- Table `dw_allelectronics`.`temps`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dw_allelectronics`.`temps` (
  `id_temps` INT NOT NULL AUTO_INCREMENT,
  `N_quarter` INT NOT NULL,
  `Annee` INT NOT NULL,
  PRIMARY KEY (`id_temps`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dw_allelectronics`.`Emplacement`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dw_allelectronics`.`Emplacement` (
  `id_Emplacement` INT NOT NULL AUTO_INCREMENT,
  `Nom_ville` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_Emplacement`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dw_allelectronics`.`ventes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dw_allelectronics`.`ventes` (
  `id_ventes` INT NOT NULL AUTO_INCREMENT,
  `montant_ventes` REAL NOT NULL,
  `Article_id_Article` INT NOT NULL,
  `temps_id_temps` INT NOT NULL,
  `Emplacement_id_Emplacement` INT NOT NULL,
  PRIMARY KEY (`id_ventes`, `Article_id_Article`, `temps_id_temps`, `Emplacement_id_Emplacement`),
  INDEX `fk_ventes_Article_idx` (`Article_id_Article` ASC),
  INDEX `fk_ventes_temps1_idx` (`temps_id_temps` ASC),
  INDEX `fk_ventes_Emplacement1_idx` (`Emplacement_id_Emplacement` ASC) ,
  CONSTRAINT `fk_ventes_Article`
    FOREIGN KEY (`Article_id_Article`)
    REFERENCES `dw_allelectronics`.`Article` (`id_Article`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ventes_temps1`
    FOREIGN KEY (`temps_id_temps`)
    REFERENCES `dw_allelectronics`.`temps` (`id_temps`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ventes_Emplacement1`
    FOREIGN KEY (`Emplacement_id_Emplacement`)
    REFERENCES `dw_allelectronics`.`Emplacement` (`id_Emplacement`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
