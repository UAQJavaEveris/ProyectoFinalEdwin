-- phpMyAdmin SQL Dump
-- version 4.4.12
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-12-2016 a las 00:41:28
-- Versión del servidor: 5.6.25
-- Versión de PHP: 5.6.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectojava`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personaje`
--

CREATE TABLE IF NOT EXISTS `personaje` (
  `idPersonaje` int(11) NOT NULL,
  `nombre` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `descripcion` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `personaje`
--

INSERT INTO `personaje` (`idPersonaje`, `nombre`, `fechaNacimiento`, `descripcion`) VALUES
(8, 'Bill Gates', '1955-10-28', 'Es un empresario, informático y filántropo estadounidense, cofundador de la empresa de software Microsoft junto con Paul Allen. Su fortuna está estimada en 82.600 millones de dólares según la revista Forbes, hecho que le define como el hombre más rico del mundo.En marzo de 1999, antes del estallido de la burbuja de las punto com, su patrimonio neto ascendió a 136 000 millones de dólares, lo que lo convirtió en la duodécima persona más drica en toda la historia de la humanidad.'),
(10, 'Steve Jobs', '1955-02-24', 'Fundó Apple en 1976 junto con un amigo de la adolescencia, Steve Wozniak, con ayuda del ex-compañero de Jobs en Atari, Ron Wayne en el garaje de su casa. Aupado por el éxito del Apple II Jobs obtuvo una gran relevancia pública, siendo portada de Time en 1982. Contaba 26 años y ya era millonario gracias a la exitosa salida a bolsa de la compañía a finales del año anterior.'),
(11, 'Stephen Wozniak', '1950-11-11', 'Sus inventos y máquinas están reconocidos como grandes contribuciones a la revolución del ordenador personal en los años setenta. Fundó Apple Computer junto con Steve Jobs y Ronald Wayne en 1976 y creó los ordenadores Apple I y Apple II a mediados de los años setenta. Se afirma que Steve Jobs y Wozniak son también los padres de la era PC. El Apple II se convirtió en el ordenador mejor vendido de los años setenta e inicios de los ochenta, y es a menudo reconocido como el primer ordenador personal');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `personaje`
--
ALTER TABLE `personaje`
  ADD PRIMARY KEY (`idPersonaje`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `personaje`
--
ALTER TABLE `personaje`
  MODIFY `idPersonaje` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
