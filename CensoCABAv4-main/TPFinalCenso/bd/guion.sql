-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema censocabatp
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema censocabatp
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `censocabatp` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `censocabatp` ;

-- -----------------------------------------------------
-- Table `censocabatp`.`comuna`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `censocabatp`.`comuna` (
  `sede` INT NOT NULL,
  `numComuna` INT NOT NULL,
  `cantidadBarrios` INT NOT NULL,
  PRIMARY KEY (`numComuna`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `censocabatp`.`barrio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `censocabatp`.`barrio` (
  `nombre` VARCHAR(45) NOT NULL,
  `superficie` DECIMAL(10,2) NOT NULL,
  `cantEdificios` INT NULL DEFAULT NULL,
  `asfaltoEnCalles` DECIMAL(10,2) NULL DEFAULT NULL,
  `numLey` INT NULL DEFAULT NULL,
  `tieneConformidad` TINYINT NULL DEFAULT NULL,
  `cantMonoblocks` INT NULL DEFAULT NULL,
  `tieneConsorcio` TINYINT NULL DEFAULT NULL,
  `tipoDeBarrio` VARCHAR(45) NOT NULL,
  `comuna_numComuna` INT NOT NULL,
  PRIMARY KEY (`nombre`, `comuna_numComuna`),
  INDEX `fk_barrio_comuna1_idx` (`comuna_numComuna` ASC) VISIBLE,
  CONSTRAINT `fk_barrio_comuna1`
    FOREIGN KEY (`comuna_numComuna`)
    REFERENCES `censocabatp`.`comuna` (`numComuna`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `censocabatp`.`personas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `censocabatp`.`personas` (
  `DNI` VARCHAR(8) NOT NULL,
  `nombreCompleto` VARCHAR(45) NOT NULL,
  `situacionLaboral` VARCHAR(45) NOT NULL,
  `fechaNacimiento` DATE NOT NULL,
  `Barrio_nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`DNI`, `Barrio_nombre`),
  UNIQUE INDEX `DNI_UNIQUE` (`DNI` ASC) VISIBLE,
  INDEX `fk_Personas_Barrio_idx` (`Barrio_nombre` ASC) VISIBLE,
  CONSTRAINT `fk_Personas_Barrio`
    FOREIGN KEY (`Barrio_nombre`)
    REFERENCES `censocabatp`.`barrio` (`nombre`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;