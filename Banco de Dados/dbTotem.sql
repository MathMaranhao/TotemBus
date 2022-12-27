-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: dbtotem
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `item_de_itinerario`
--

DROP TABLE IF EXISTS `item_de_itinerario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item_de_itinerario` (
  `iditem` int NOT NULL AUTO_INCREMENT,
  `fk_idtipo` int NOT NULL,
  `nome` varchar(250) NOT NULL,
  PRIMARY KEY (`iditem`,`fk_idtipo`),
  KEY `fk_item_de_itinerario_tipo_item_itinerario1_idx` (`fk_idtipo`),
  CONSTRAINT `fk_item_de_itinerario_tipo_item_itinerario1` FOREIGN KEY (`fk_idtipo`) REFERENCES `tipo_item_itinerario` (`idtipo`)
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_de_itinerario`
--

LOCK TABLES `item_de_itinerario` WRITE;
/*!40000 ALTER TABLE `item_de_itinerario` DISABLE KEYS */;
INSERT INTO `item_de_itinerario` VALUES (1,4,'IFMA/Monte Castelo'),(3,4,'Escola Adventista/Cidade Operária'),(5,5,'Rio Anil Shopping'),(7,5,'Pátio Norte'),(8,5,'Shopping São Luís'),(9,5,'Shopping da Ilha'),(10,3,'Hospital São Domingos'),(12,3,'UDI'),(14,1,'Cohab'),(15,1,'Monte Castelo'),(16,1,'Centro'),(17,1,'Angelim'),(18,1,'Cidade Operária'),(19,1,'Maranhão Novo'),(21,1,'João Paulo'),(72,1,'Maiobão'),(73,1,'Vila Cafeteira'),(74,3,'UPA Maiobão'),(76,1,'Cidade Verde');
/*!40000 ALTER TABLE `item_de_itinerario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itinerario`
--

DROP TABLE IF EXISTS `itinerario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itinerario` (
  `iditinerario` int NOT NULL AUTO_INCREMENT,
  `fk_idlinhas` int NOT NULL,
  `fk_iditem` int NOT NULL,
  `fk_idtipo_sentido` int NOT NULL,
  `ordem` int DEFAULT NULL,
  PRIMARY KEY (`iditinerario`,`fk_idlinhas`,`fk_iditem`),
  KEY `fk_itinerario_linhas_de_onibus_idx` (`fk_idlinhas`),
  KEY `fk_itinerario_item_de_itinerario1_idx` (`fk_iditem`),
  KEY `fk_itinerario_tipo_sentido1_idx` (`fk_idtipo_sentido`),
  CONSTRAINT `fk_itinerario_item_de_itinerario1` FOREIGN KEY (`fk_iditem`) REFERENCES `item_de_itinerario` (`iditem`),
  CONSTRAINT `fk_itinerario_linhas_de_onibus` FOREIGN KEY (`fk_idlinhas`) REFERENCES `linhas_de_onibus` (`idlinhas`),
  CONSTRAINT `fk_itinerario_tipo_sentido1` FOREIGN KEY (`fk_idtipo_sentido`) REFERENCES `tipo_sentido` (`idtipo_sentido`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itinerario`
--

LOCK TABLES `itinerario` WRITE;
/*!40000 ALTER TABLE `itinerario` DISABLE KEYS */;
INSERT INTO `itinerario` VALUES (1,2,18,1,1),(2,2,14,1,2),(3,2,5,1,3),(4,2,17,1,4),(5,2,19,1,5),(6,2,1,1,6),(7,2,16,1,7);
/*!40000 ALTER TABLE `itinerario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `linhas_de_onibus`
--

DROP TABLE IF EXISTS `linhas_de_onibus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `linhas_de_onibus` (
  `idlinhas` int NOT NULL AUTO_INCREMENT,
  `codigo` varchar(5) DEFAULT NULL,
  `nome` varchar(100) NOT NULL,
  `caracteristica` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`idlinhas`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `linhas_de_onibus`
--

LOCK TABLES `linhas_de_onibus` WRITE;
/*!40000 ALTER TABLE `linhas_de_onibus` DISABLE KEYS */;
INSERT INTO `linhas_de_onibus` VALUES (1,'A252','Cohama','Vermelho'),(2,'T070','UEMA-IPASE','Amarelo'),(3,'T076','São Raimundo/São Francisco','Amarelo'),(4,'T084','Cohatrac IV','Verde');
/*!40000 ALTER TABLE `linhas_de_onibus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `terminal`
--

DROP TABLE IF EXISTS `terminal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `terminal` (
  `idterminal` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idterminal`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `terminal`
--

LOCK TABLES `terminal` WRITE;
/*!40000 ALTER TABLE `terminal` DISABLE KEYS */;
INSERT INTO `terminal` VALUES (1,'Terminal Praia Grande'),(2,'Terminal Distrito Industrial'),(3,'Terminal Cohab-Cohatracterminal'),(4,'Terminal São Cristóvão'),(5,'Terminal Cohama-Vinhais');
/*!40000 ALTER TABLE `terminal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `terminal_linhas`
--

DROP TABLE IF EXISTS `terminal_linhas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `terminal_linhas` (
  `idterminal_linhas` int NOT NULL AUTO_INCREMENT,
  `fk_idterminal` int NOT NULL,
  `fk_idlinhas` int NOT NULL,
  `plataforma` varchar(5) DEFAULT NULL,
  `fk_idtipo_sentido` int NOT NULL,
  PRIMARY KEY (`idterminal_linhas`),
  KEY `fk_terminal_has_linhas_de_onibus_linhas_de_onibus1_idx` (`fk_idlinhas`),
  KEY `fk_terminal_has_linhas_de_onibus_terminal1_idx` (`fk_idterminal`),
  KEY `fk_terminal_linhas_tipo_sentido1_idx` (`fk_idtipo_sentido`),
  CONSTRAINT `fk_terminal_has_linhas_de_onibus_linhas_de_onibus1` FOREIGN KEY (`fk_idlinhas`) REFERENCES `linhas_de_onibus` (`idlinhas`),
  CONSTRAINT `fk_terminal_has_linhas_de_onibus_terminal1` FOREIGN KEY (`fk_idterminal`) REFERENCES `terminal` (`idterminal`),
  CONSTRAINT `fk_terminal_linhas_tipo_sentido1` FOREIGN KEY (`fk_idtipo_sentido`) REFERENCES `tipo_sentido` (`idtipo_sentido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `terminal_linhas`
--

LOCK TABLES `terminal_linhas` WRITE;
/*!40000 ALTER TABLE `terminal_linhas` DISABLE KEYS */;
/*!40000 ALTER TABLE `terminal_linhas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_item_itinerario`
--

DROP TABLE IF EXISTS `tipo_item_itinerario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_item_itinerario` (
  `idtipo` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idtipo`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_item_itinerario`
--

LOCK TABLES `tipo_item_itinerario` WRITE;
/*!40000 ALTER TABLE `tipo_item_itinerario` DISABLE KEYS */;
INSERT INTO `tipo_item_itinerario` VALUES (1,'BAIRRO'),(2,'PONTO TURÍSTICO'),(3,'HOSPITAL'),(4,'ESCOLA'),(5,'SHOPPING CENTER'),(6,'PRAIA');
/*!40000 ALTER TABLE `tipo_item_itinerario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_sentido`
--

DROP TABLE IF EXISTS `tipo_sentido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_sentido` (
  `idtipo_sentido` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`idtipo_sentido`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_sentido`
--

LOCK TABLES `tipo_sentido` WRITE;
/*!40000 ALTER TABLE `tipo_sentido` DISABLE KEYS */;
INSERT INTO `tipo_sentido` VALUES (1,'BAIRRO'),(2,'CENTRO');
/*!40000 ALTER TABLE `tipo_sentido` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-27 15:36:08
