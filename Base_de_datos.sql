CREATE SCHEMA IF NOT EXISTS 
phone_directory DEFAULT CHARACTER SET utf8mb4 ;
USE phone_directory ;

-- -----------------------------------------------------
-- Table contacts
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS contacts (
  `id_persona` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `date_of_birth` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  PRIMARY KEY (`id_persona`));

INSERT INTO `phone_directory`.`contacts` (`name`, `date_of_birth`, `email`, `phone`)
 VALUES ('JUAN RODRIGUEZ', '1997-08-10', 'jrtma34@gmail.com', '+573032165487');
