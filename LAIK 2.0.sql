-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.7.11-log - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para lalk
CREATE DATABASE IF NOT EXISTS `lalk` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `lalk`;


-- Volcando estructura para tabla lalk.alquileres
CREATE TABLE IF NOT EXISTS `alquileres` (
  `idAlquiler` int(5) NOT NULL AUTO_INCREMENT,
  `idArrendatario` int(5) NOT NULL,
  `idInmueble` int(5) NOT NULL,
  `fechaEgreso` date NOT NULL,
  `precioAlquiler` double NOT NULL,
  `plazoContractual` int(3) NOT NULL,
  `garantia1` enum('Anda','Porto','CGN') NOT NULL,
  `garantia2` enum('BHU','Fianza','Fiador') DEFAULT NULL,
  `nombreFia` varchar(50) DEFAULT NULL,
  `telFia` int(15) DEFAULT NULL,
  `emailFia` varchar(50) DEFAULT NULL,
  `detalleFia` varchar(350) DEFAULT NULL,
  `detalleGar` varchar(350) DEFAULT NULL,
  `detalleAlq` varchar(350) DEFAULT NULL,
  PRIMARY KEY (`idAlquiler`),
  KEY `idArrendatario` (`idArrendatario`),
  KEY `idInmueble` (`idInmueble`),
  CONSTRAINT `alquileres_ibfk_1` FOREIGN KEY (`idArrendatario`) REFERENCES `arrendatarios` (`idArrendatario`),
  CONSTRAINT `alquileres_ibfk_2` FOREIGN KEY (`idInmueble`) REFERENCES `inmuebles` (`idInmueble`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla lalk.alquileres: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `alquileres` DISABLE KEYS */;
/*!40000 ALTER TABLE `alquileres` ENABLE KEYS */;


-- Volcando estructura para tabla lalk.apartamentos
CREATE TABLE IF NOT EXISTS `apartamentos` (
  `idApartamento` int(5) NOT NULL AUTO_INCREMENT,
  `idInmueble` int(5) NOT NULL,
  `unidad` int(2) DEFAULT NULL,
  `ubicarEdificio` varchar(50) NOT NULL,
  `ubicarPlanta` varchar(50) NOT NULL,
  `habitacionSocial` varchar(50) NOT NULL,
  `cocina` varchar(50) NOT NULL,
  `monoambiente` varchar(50) DEFAULT NULL,
  `unAmbiente` varchar(50) DEFAULT NULL,
  `dorm` int(2) NOT NULL,
  `dormConSuite` varchar(50) DEFAULT NULL,
  `dormConVestidor` varchar(50) DEFAULT NULL,
  `baños` int(2) NOT NULL,
  `bañoSocial` varchar(50) DEFAULT NULL,
  `bañoServicio` varchar(50) DEFAULT NULL,
  `bañoJacuzzi` varchar(50) DEFAULT NULL,
  `balcon` varchar(50) DEFAULT NULL,
  `terrazaPrincipal` varchar(50) DEFAULT NULL,
  `terrazaLavadero` varchar(50) DEFAULT NULL,
  `garaje` varchar(50) DEFAULT NULL,
  `cochAbierta` varchar(50) DEFAULT NULL,
  `cochTechada` varchar(50) DEFAULT NULL,
  `amenities` text,
  `gastosComunes` int(10) NOT NULL,
  `areaEdificada` int(11) NOT NULL,
  `detalleApto` text,
  `rutaImagenApto` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idApartamento`),
  KEY `idInmueble` (`idInmueble`),
  CONSTRAINT `apartamentos_ibfk_1` FOREIGN KEY (`idInmueble`) REFERENCES `inmueble2` (`refInmueble`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla lalk.apartamentos: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `apartamentos` DISABLE KEYS */;
INSERT INTO `apartamentos` (`idApartamento`, `idInmueble`, `unidad`, `ubicarEdificio`, `ubicarPlanta`, `habitacionSocial`, `cocina`, `monoambiente`, `unAmbiente`, `dorm`, `dormConSuite`, `dormConVestidor`, `baños`, `bañoSocial`, `bañoServicio`, `bañoJacuzzi`, `balcon`, `terrazaPrincipal`, `terrazaLavadero`, `garaje`, `cochAbierta`, `cochTechada`, `amenities`, `gastosComunes`, `areaEdificada`, `detalleApto`, `rutaImagenApto`) VALUES
	(1, 3, 1, 'Planta Baja', 'Frente', 'Living', 'Cocina', 'SI', 'SI', 0, 'SI', 'SI', 1, 'SI', 'SI', 'SI', 'SI', 'SI', 'SI', 'SI', 'SI', 'SI', 'Ej. Amenities ...', 1, 1, 'Ej. Detalles ...', 'C:\\Users\\Mariu\\Desktop\\img\\incognita.jpg'),
	(2, 11, 1005, '10º Piso', 'Lateral', 'Living', 'Cocina con Office', 'NO', 'NO', 0, 'SI', 'SI', 4, 'SI', 'SI', 'SI', 'SI', 'SI', 'SI', 'SI', 'NO', 'NO', 'Amenities', 3001, 101, 'Esto es un ejemplo de update', 'C:\\Users\\Mariu\\Desktop\\img\\incognita.jpg');
/*!40000 ALTER TABLE `apartamentos` ENABLE KEYS */;


-- Volcando estructura para tabla lalk.arrendatarios
CREATE TABLE IF NOT EXISTS `arrendatarios` (
  `idArrendatario` int(5) NOT NULL AUTO_INCREMENT,
  `idPersona` int(5) NOT NULL,
  `detalleArr` varchar(350) DEFAULT NULL,
  PRIMARY KEY (`idArrendatario`),
  KEY `idPersona` (`idPersona`),
  CONSTRAINT `arrendatarios_ibfk_1` FOREIGN KEY (`idPersona`) REFERENCES `personas` (`idPersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla lalk.arrendatarios: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `arrendatarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `arrendatarios` ENABLE KEYS */;


-- Volcando estructura para tabla lalk.casas
CREATE TABLE IF NOT EXISTS `casas` (
  `idCasa` int(5) NOT NULL AUTO_INCREMENT,
  `idInmueble` int(5) NOT NULL,
  `situacionJuridica` varchar(50) NOT NULL,
  `estructura` varchar(50) DEFAULT NULL,
  `habitacionSocial` varchar(50) NOT NULL,
  `estar` varchar(50) DEFAULT NULL,
  `dormitorios` int(2) NOT NULL,
  `dormConSuite` varchar(50) DEFAULT NULL,
  `dormSocial` varchar(50) DEFAULT NULL,
  `baños` int(2) NOT NULL,
  `bañoServicio` varchar(50) DEFAULT NULL,
  `bañoSocial` varchar(50) DEFAULT NULL,
  `bañoConJacuzzi` varchar(50) DEFAULT NULL,
  `fondo` varchar(50) DEFAULT NULL,
  `patio` varchar(50) DEFAULT NULL,
  `jardin` varchar(2) DEFAULT NULL,
  `garaje` varchar(50) DEFAULT NULL,
  `cocheraAbierta` varchar(50) DEFAULT NULL,
  `cocheraTechada` varchar(50) DEFAULT NULL,
  `amenities` text,
  `areaEdificada` double NOT NULL,
  `metrosFrente` double NOT NULL,
  `detalleCasa` text,
  `Cocina` varchar(20) DEFAULT NULL,
  `AreaTotal` int(11) NOT NULL,
  `rutaImagenCasa` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idCasa`),
  KEY `casas_ibfk_1` (`idInmueble`),
  CONSTRAINT `casas_ibfk_1` FOREIGN KEY (`idInmueble`) REFERENCES `inmueble2` (`refInmueble`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla lalk.casas: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `casas` DISABLE KEYS */;
INSERT INTO `casas` (`idCasa`, `idInmueble`, `situacionJuridica`, `estructura`, `habitacionSocial`, `estar`, `dormitorios`, `dormConSuite`, `dormSocial`, `baños`, `bañoServicio`, `bañoSocial`, `bañoConJacuzzi`, `fondo`, `patio`, `jardin`, `garaje`, `cocheraAbierta`, `cocheraTechada`, `amenities`, `areaEdificada`, `metrosFrente`, `detalleCasa`, `Cocina`, `AreaTotal`, `rutaImagenCasa`) VALUES
	(1, 8, 'Padrón Único', 'Dúplex', 'Living', 'Estar', 6, 'SI', 'SI', 6, 'SI', 'SI', 'SI', 'NO', 'SI', 'SI', 'NO', 'NO', 'SI', 'UPDATE', 100, 100, 'UPDATE', NULL, 0, 'C:\\Users\\Mariu\\Desktop\\img\\responsabildad.jpg'),
	(2, 7, 'Propiedad Horizontal', 'Planta', 'Living', 'Estar', 1, 'SI', 'SI', 1, 'SI', 'SI', 'SI', 'SI', 'SI', 'SI', 'SI', 'NO', 'SI', 'asdf', 243, 24, 'asdf', NULL, 0, NULL);
/*!40000 ALTER TABLE `casas` ENABLE KEYS */;


-- Volcando estructura para tabla lalk.compradores
CREATE TABLE IF NOT EXISTS `compradores` (
  `idComprador` int(5) NOT NULL AUTO_INCREMENT,
  `idPersona` int(5) NOT NULL,
  `detalleComp` varchar(350) DEFAULT NULL,
  PRIMARY KEY (`idComprador`),
  KEY `idPersona` (`idPersona`),
  CONSTRAINT `compradores_ibfk_1` FOREIGN KEY (`idPersona`) REFERENCES `personas` (`idPersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla lalk.compradores: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `compradores` DISABLE KEYS */;
/*!40000 ALTER TABLE `compradores` ENABLE KEYS */;


-- Volcando estructura para tabla lalk.control_ingreso
CREATE TABLE IF NOT EXISTS `control_ingreso` (
  `usuario` varchar(50) NOT NULL,
  `clave` varchar(50) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla lalk.control_ingreso: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `control_ingreso` DISABLE KEYS */;
INSERT INTO `control_ingreso` (`usuario`, `clave`, `id`) VALUES
	('adm', '123', 1),
	('Carlos', '123', 2);
/*!40000 ALTER TABLE `control_ingreso` ENABLE KEYS */;


-- Volcando estructura para tabla lalk.formas_pago
CREATE TABLE IF NOT EXISTS `formas_pago` (
  `idVenta` int(5) NOT NULL,
  `formaDePago` enum('Contado','Financiado','Permuto') NOT NULL,
  `detalleFP` varchar(350) DEFAULT NULL,
  KEY `idVenta` (`idVenta`),
  CONSTRAINT `formas_pago_ibfk_1` FOREIGN KEY (`idVenta`) REFERENCES `ventas` (`idVenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla lalk.formas_pago: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `formas_pago` DISABLE KEYS */;
/*!40000 ALTER TABLE `formas_pago` ENABLE KEYS */;


-- Volcando estructura para tabla lalk.inmueble2
CREATE TABLE IF NOT EXISTS `inmueble2` (
  `refInmueble` int(9) NOT NULL AUTO_INCREMENT,
  `tipoMonedaPrecioLista` int(9) NOT NULL,
  `precioLista` int(9) NOT NULL,
  `contribucionInmobiliaria` int(9) NOT NULL,
  `areaTotal` int(9) NOT NULL,
  `exclusividad` varchar(2) NOT NULL,
  `estadoDisponibilidad` varchar(12) NOT NULL,
  `fechaIngreso` varchar(12) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `padron` int(9) DEFAULT NULL,
  `barrio` varchar(30) DEFAULT NULL,
  `departamento` varchar(30) DEFAULT NULL,
  `estadoDetalle` text NOT NULL,
  `detalleInmueble` text NOT NULL,
  `antiguedad` int(4) NOT NULL,
  `estadoConservacion` varchar(30) NOT NULL,
  PRIMARY KEY (`refInmueble`),
  KEY `tipoMonedaPrecioLista` (`tipoMonedaPrecioLista`),
  CONSTRAINT `FK_inmueble2_monedalista` FOREIGN KEY (`tipoMonedaPrecioLista`) REFERENCES `monedalista` (`idMonLista`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla lalk.inmueble2: ~8 rows (aproximadamente)
/*!40000 ALTER TABLE `inmueble2` DISABLE KEYS */;
INSERT INTO `inmueble2` (`refInmueble`, `tipoMonedaPrecioLista`, `precioLista`, `contribucionInmobiliaria`, `areaTotal`, `exclusividad`, `estadoDisponibilidad`, `fechaIngreso`, `direccion`, `padron`, `barrio`, `departamento`, `estadoDetalle`, `detalleInmueble`, `antiguedad`, `estadoConservacion`) VALUES
	(3, 3, 95000, 1200, 50, 'SI', 'Disponible', '19/01/2017', 'Jackson ', 800, 'Palermo', 'Montevideo', 'Para actualizar baño y cocina', 'Ubicado en una zona residencial.', 1987, 'bueno'),
	(4, 3, 50000, 5000, 150, 'SI', 'Disponible', '18/01/2017', 'Colonia numero', 860, 'Cordón', 'Montevideo', 'Actualizar baño y cocina', 'Zona próxima a rambla', 1987, 'bueno'),
	(6, 3, 95012, 1201, 51, 'SI', 'Disponible', '01/01/2017', 'Jackson ', 800, 'Pocitos', 'Montevideo', 'UPDATE', 'UPDATE', 1987, 'bueno'),
	(7, 3, 95000, 1200, 50, 'SI', 'Disponible', '19/01/2017', 'Jackson ', 800, 'Palermo', 'Montevideo', 'Para actualizar baño y cocina', 'Ubicado en una zona residencial.', 1987, 'bueno'),
	(8, 3, 63000, 2000, 65, 'SI', 'Disponible', '31/01/2017', 'Ramon Anador', 1234, 'Brazo Oriental', 'Montevideo', 'Detalles en techos, humedades.', 'Proximidad ómnibus, líneas varias.', 1980, 'regular'),
	(9, 3, 95000, 1200, 50, 'SI', 'Disponible', '19/01/2017', 'Jackson ', 800, 'Palermo', 'Montevideo', 'Para actualizar baño y cocina', 'Ubicado en una zona residencial.', 1987, 'bueno'),
	(10, 3, 63000, 2000, 65, 'SI', 'Disponible', '31/01/2017', 'Ramon Anador', 1234, 'Carrasco', 'Montevideo', 'Detalles en techos, humedades.', 'Proximidad ómnibus, líneas varias.', 1980, 'regular'),
	(11, 3, 95000, 1200, 50, 'SI', 'Disponible', '19/01/2017', 'Jackson ', 800, 'Palermo', 'Montevideo', 'Para actualizar baño y cocina', 'Ubicado en una zona residencial.', 1987, 'bueno');
/*!40000 ALTER TABLE `inmueble2` ENABLE KEYS */;


-- Volcando estructura para tabla lalk.monedalista
CREATE TABLE IF NOT EXISTS `monedalista` (
  `monLista` varchar(10) NOT NULL,
  `idMonLista` int(2) NOT NULL,
  PRIMARY KEY (`idMonLista`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla lalk.monedalista: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `monedalista` DISABLE KEYS */;
INSERT INTO `monedalista` (`monLista`, `idMonLista`) VALUES
	('$UY', 1),
	('$AR', 2),
	('USD Americ', 3),
	('USD Canadi', 4),
	('$R', 5),
	('Libra', 6),
	('Euro', 7);
/*!40000 ALTER TABLE `monedalista` ENABLE KEYS */;


-- Volcando estructura para tabla lalk.operadores
CREATE TABLE IF NOT EXISTS `operadores` (
  `idOperador` int(5) NOT NULL AUTO_INCREMENT,
  `idPersona` int(5) NOT NULL,
  `fechaIngOpe` date NOT NULL,
  `detalleOpe` varchar(350) DEFAULT NULL,
  PRIMARY KEY (`idOperador`),
  KEY `idPersona` (`idPersona`),
  CONSTRAINT `operadores_ibfk_1` FOREIGN KEY (`idPersona`) REFERENCES `personas` (`idPersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla lalk.operadores: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `operadores` DISABLE KEYS */;
/*!40000 ALTER TABLE `operadores` ENABLE KEYS */;


-- Volcando estructura para tabla lalk.personas
CREATE TABLE IF NOT EXISTS `personas` (
  `idPersona` int(5) NOT NULL AUTO_INCREMENT,
  `nombrePer` varchar(50) NOT NULL,
  `emailPer` varchar(50) DEFAULT NULL,
  `detallePer` varchar(350) DEFAULT NULL,
  PRIMARY KEY (`idPersona`)
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla lalk.personas: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
INSERT INTO `personas` (`idPersona`, `nombrePer`, `emailPer`, `detallePer`) VALUES
	(1, 'MARU', 'DFASDF', 'ADSF'),
	(4, 'Manuelita Infantozzi', 'manuelita@gmail.com', 'persona sin celular.'),
	(8, 'Federica', 'ejemplo@gmail.com', 'vende para comprar'),
	(9, 'Maximo Infantozzi', 'maxi@gmail.com', 'dejar mensaje en celular'),
	(10, 'Ej. Martín Rodriguez ...', 'asdf', 'asdf'),
	(12, 'Maruchan', 'maru@chan.com.uy', 'Observadora y atenta.'),
	(111, 'asdfas', 'asdf', 'sdfasdf');
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;


-- Volcando estructura para tabla lalk.propietarios
CREATE TABLE IF NOT EXISTS `propietarios` (
  `idPropietario` int(5) NOT NULL AUTO_INCREMENT,
  `idPersona` int(5) NOT NULL,
  `detalleCli` varchar(350) DEFAULT NULL,
  PRIMARY KEY (`idPropietario`),
  KEY `idPersona` (`idPersona`),
  CONSTRAINT `propietarios_ibfk_1` FOREIGN KEY (`idPersona`) REFERENCES `personas` (`idPersona`)
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla lalk.propietarios: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `propietarios` DISABLE KEYS */;
INSERT INTO `propietarios` (`idPropietario`, `idPersona`, `detalleCli`) VALUES
	(8, 8, 'coordinar con 24 hoas de antelación, tiene la llave'),
	(10, 10, 'asdf'),
	(12, 12, 'Coordinar antes.'),
	(111, 111, 'asdfasdf');
/*!40000 ALTER TABLE `propietarios` ENABLE KEYS */;


-- Volcando estructura para tabla lalk.tel_personas
CREATE TABLE IF NOT EXISTS `tel_personas` (
  `telPersona` int(15) NOT NULL,
  `idPersona` int(5) NOT NULL AUTO_INCREMENT,
  `detalleTel` varchar(350) DEFAULT NULL,
  UNIQUE KEY `telPersona` (`telPersona`),
  KEY `tel_persona_ibfk_1` (`idPersona`),
  CONSTRAINT `tel_persona_ibfk_1` FOREIGN KEY (`idPersona`) REFERENCES `personas` (`idPersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla lalk.tel_personas: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tel_personas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tel_personas` ENABLE KEYS */;


-- Volcando estructura para tabla lalk.terrenos
CREATE TABLE IF NOT EXISTS `terrenos` (
  `idTerreno` int(5) NOT NULL AUTO_INCREMENT,
  `idInmueble` int(5) NOT NULL,
  `FOS` int(3) DEFAULT NULL,
  `alturaEdificable` double DEFAULT NULL,
  `frente` double NOT NULL,
  `situacionJuridicaSuelo` varchar(50) NOT NULL,
  `productividad` varchar(50) NOT NULL,
  `conMejoras` varchar(50) DEFAULT NULL,
  `Coneat` int(3) DEFAULT NULL,
  `AreaTotal` int(11) NOT NULL,
  `detalleTerr` varchar(350) DEFAULT NULL,
  `rutaImagenTerreno` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idTerreno`),
  KEY `terreno_ibfk_1` (`idInmueble`),
  CONSTRAINT `terrenos_ibfk_1` FOREIGN KEY (`idInmueble`) REFERENCES `inmueble2` (`refInmueble`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla lalk.terrenos: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `terrenos` DISABLE KEYS */;
INSERT INTO `terrenos` (`idTerreno`, `idInmueble`, `FOS`, `alturaEdificable`, `frente`, `situacionJuridicaSuelo`, `productividad`, `conMejoras`, `Coneat`, `AreaTotal`, `detalleTerr`, `rutaImagenTerreno`) VALUES
	(1, 3, 70, 70, 70, 'URBANO', 'FRUTIVINÍCOLA', 'SI', NULL, 0, 'UPDATE UPDATE UPDATE', 'C:\\Users\\Mariu\\Desktop\\img\\responsabildad.jpg');
/*!40000 ALTER TABLE `terrenos` ENABLE KEYS */;


-- Volcando estructura para tabla lalk.ventas
CREATE TABLE IF NOT EXISTS `ventas` (
  `idVenta` int(5) NOT NULL AUTO_INCREMENT,
  `idComprador` int(5) NOT NULL,
  `idInmueble` int(5) NOT NULL,
  `precioVenta` double NOT NULL,
  `fechaEgreso` date NOT NULL,
  `gravamen` varchar(350) DEFAULT NULL,
  `nombreEsc` varchar(50) NOT NULL,
  `telEsc` int(15) DEFAULT NULL,
  `emailEsc` varchar(50) DEFAULT NULL,
  `detalleEsc` varchar(350) DEFAULT NULL,
  `detalleVen` varchar(350) DEFAULT NULL,
  PRIMARY KEY (`idVenta`),
  KEY `idComprador` (`idComprador`),
  KEY `idInmueble` (`idInmueble`),
  CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`idComprador`) REFERENCES `compradores` (`idComprador`),
  CONSTRAINT `ventas_ibfk_2` FOREIGN KEY (`idInmueble`) REFERENCES `inmuebles` (`idInmueble`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla lalk.ventas: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
