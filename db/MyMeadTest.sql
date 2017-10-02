-- MySQL Script generated by MySQL Workbench
-- Sun Oct  1 23:55:10 2017
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering


-- -----------------------------------------------------
-- Schema mymeadtest
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mymeadtest` ;

-- -----------------------------------------------------
-- Schema mymeadtest
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mymeadtest` DEFAULT CHARACTER SET utf8 ;
USE `mymeadtest` ;

-- -----------------------------------------------------
-- Table `mymeadtest`.`brewmaster`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mymeadtest`.`brewmaster` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mymeadtest`.`mead`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mymeadtest`.`mead` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `created` DATE NOT NULL,
  `name` VARCHAR(45) NULL,
  `comments` VARCHAR(1000) NULL,
  `brewmasterid` INT NOT NULL,
  `casted` TINYINT NOT NULL,
  PRIMARY KEY (`id`, `brewmasterid`),
  INDEX `fk_mead_brewmaster1_idx` (`brewmasterid` ASC),
  CONSTRAINT `fk_mead_brewmaster1`
    FOREIGN KEY (`brewmasterid`)
    REFERENCES `mymeadtest`.`brewmaster` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mymeadtest`.`ingredients`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mymeadtest`.`ingredients` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `quantity` FLOAT NULL,
  `description` VARCHAR(155) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mymeadtest`.`storagelocation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mymeadtest`.`storagelocation` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `location` VARCHAR(155) NOT NULL,
  `meadid` INT NOT NULL,
  PRIMARY KEY (`id`, `meadid`),
  INDEX `fk_storagelocation_mead1_idx` (`meadid` ASC),
  CONSTRAINT `fk_storagelocation_mead1`
    FOREIGN KEY (`meadid`)
    REFERENCES `mymeadtest`.`mead` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mymeadtest`.`meadingredientsmap`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mymeadtest`.`meadingredientsmap` (
  `mead_id` INT NOT NULL,
  `mead_brewmasterid` INT NOT NULL,
  `ingredients_id` INT NOT NULL,
  PRIMARY KEY (`mead_id`, `mead_brewmasterid`, `ingredients_id`),
  INDEX `fk_mead_has_ingredients_ingredients1_idx` (`ingredients_id` ASC),
  INDEX `fk_mead_has_ingredients_mead1_idx` (`mead_id` ASC, `mead_brewmasterid` ASC),
  CONSTRAINT `fk_mead_has_ingredients_mead1`
    FOREIGN KEY (`mead_id` , `mead_brewmasterid`)
    REFERENCES `mymeadtest`.`mead` (`id` , `brewmasterid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_mead_has_ingredients_ingredients1`
    FOREIGN KEY (`ingredients_id`)
    REFERENCES `mymeadtest`.`ingredients` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;