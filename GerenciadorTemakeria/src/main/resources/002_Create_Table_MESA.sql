CREATE TABLE `temakeria`.`mesa` (
  `id` INT NOT NULL COMMENT '',
  `codigo` INT NOT NULL COMMENT '',
  `qtdPessoas` INT NULL COMMENT '',
  `descricao` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '')
COMMENT = 'Tabela de mesas.';


ALTER TABLE `temakeria`.`mesa` 
CHANGE COLUMN `id` `id` INT(11) NOT NULL DEFAULT 0 COMMENT '' ;

ALTER TABLE `temakeria`.`mesa` 
CHANGE COLUMN `id` `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT
