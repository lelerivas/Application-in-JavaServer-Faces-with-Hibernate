CREATE TABLE `hibernate`.`tbproduct` (
  `cod` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `maker` VARCHAR(45) NOT NULL,
  `manufdate` DATE NOT NULL,
  `qtd` INT NOT NULL,
  `price` FLOAT NOT NULL,
  PRIMARY KEY (`cod`));
