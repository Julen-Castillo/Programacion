-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 16-04-2019 a las 06:53:27
-- Versión del servidor: 5.6.13
-- Versión de PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `gabinete`
--
CREATE DATABASE IF NOT EXISTS `gabinete` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `gabinete`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `abogado`
--

CREATE TABLE IF NOT EXISTS `abogado` (
  `dni` varchar(12) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `direccion` varchar(40) NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `abogado`
--

INSERT INTO `abogado` (`dni`, `nombre`, `apellidos`, `direccion`) VALUES
('1', 'abogado uno', 'abogado uno', 'abogado uno'),
('2', 'abogado dos', 'abogado dos', 'abogado dos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `abogado_lleva_caso`
--

CREATE TABLE IF NOT EXISTS `abogado_lleva_caso` (
  `Abogado_dni` varchar(12) NOT NULL,
  `Caso_expediente` varchar(12) NOT NULL,
  PRIMARY KEY (`Abogado_dni`,`Caso_expediente`),
  KEY `fk_Abogado_has_Caso_Caso1_idx` (`Caso_expediente`),
  KEY `fk_Abogado_has_Caso_Abogado_idx` (`Abogado_dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `abogado_lleva_caso`
--

INSERT INTO `abogado_lleva_caso` (`Abogado_dni`, `Caso_expediente`) VALUES
('1', '2'),
('1', '3'),
('2', '3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `caso`
--

CREATE TABLE IF NOT EXISTS `caso` (
  `nroExp` varchar(12) NOT NULL,
  `Cliente_dni` varchar(12) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaFin` date DEFAULT NULL,
  `estado` varchar(1) NOT NULL,
  `descripcion` varchar(40) NOT NULL,
  PRIMARY KEY (`nroExp`),
  KEY `fk_Caso_Cliente1_idx` (`Cliente_dni`),
  KEY `Cliente_dni` (`Cliente_dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `caso`
--

INSERT INTO `caso` (`nroExp`, `Cliente_dni`, `fechaInicio`, `fechaFin`, `estado`, `descripcion`) VALUES
('2', '11', '2019-04-16', NULL, 'A', 'CCCCCCCCCCCCCCCCCCC'),
('3', '22', '2019-04-16', NULL, 'T', 'aaaaaaaaaaaaaa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `dni` varchar(12) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `direccion` varchar(40) NOT NULL,
  `telefono` varchar(13) NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`dni`, `nombre`, `apellidos`, `direccion`, `telefono`) VALUES
('11', 'Cliente uno', 'Cliente uno', 'Cliente uno', 'Cliente uno'),
('22', 'Cliente dos', 'Cliente dos', 'Cliente dos', 'Cliente dos');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `abogado_lleva_caso`
--
ALTER TABLE `abogado_lleva_caso`
  ADD CONSTRAINT `fk_Abogado_has_Caso_Abogado` FOREIGN KEY (`Abogado_dni`) REFERENCES `abogado` (`dni`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Abogado_has_Caso_Caso1` FOREIGN KEY (`Caso_expediente`) REFERENCES `caso` (`nroExp`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `caso`
--
ALTER TABLE `caso`
  ADD CONSTRAINT `fk_Caso_Cliente1` FOREIGN KEY (`Cliente_dni`) REFERENCES `cliente` (`dni`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
