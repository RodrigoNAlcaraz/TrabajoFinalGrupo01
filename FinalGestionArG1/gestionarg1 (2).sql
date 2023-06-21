-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-06-2023 a las 18:02:55
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gestionarg1`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comentarios`
--

CREATE TABLE `comentarios` (
  `idComentario` int(11) NOT NULL,
  `comentario` varchar(50) NOT NULL,
  `fechaAvance` date NOT NULL,
  `idTarea` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comentarios`
--

INSERT INTO `comentarios` (`idComentario`, `comentario`, `fechaAvance`, `idTarea`, `estado`) VALUES
(7, 'comentario 1', '2023-06-14', 3, 0),
(8, 'comentario 2', '2023-06-14', 3, 1),
(9, 'dia del padre', '2023-06-16', 3, 1),
(10, 'asdasdasd1', '2023-06-19', 3, 0),
(11, 'commit 1', '2023-06-20', 5, 0),
(12, 'probando123', '2023-06-20', 5, 0),
(13, 'probando1234', '2023-06-20', 5, 1),
(14, 'viendo q pasa', '2023-06-20', 3, 1),
(15, 'probando 2', '2023-06-20', 7, 1),
(16, 'asdasd 3', '2023-06-20', 8, 1),
(17, 'zfdsdfs', '2023-06-19', 3, 0),
(18, 'asdas', '2023-06-12', 8, 1),
(19, 'termine el descanso', '2023-06-20', 3, 1),
(20, 'terminada 2.0', '2023-06-20', 3, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `idProyecto` int(11) NOT NULL,
  `idEquipo` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `fechaCreacion` date NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`idProyecto`, `idEquipo`, `nombre`, `fechaCreacion`, `estado`) VALUES
(1, 1, 'grupo 1', '2023-05-05', 1),
(2, 2, 'grupo 15', '2023-05-25', 1),
(3, 3, 'grupo test', '2023-06-12', 1),
(5, 10, 'TestdesdemainM', '2017-01-01', 1),
(4, 12, 'jkl', '2023-06-14', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipomiembros`
--

CREATE TABLE `equipomiembros` (
  `idMiembroEq` int(11) NOT NULL,
  `fechaIncorporacion` date NOT NULL,
  `idEquipo` int(11) NOT NULL,
  `idMiembro` int(11) NOT NULL,
  `Estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `equipomiembros`
--

INSERT INTO `equipomiembros` (`idMiembroEq`, `fechaIncorporacion`, `idEquipo`, `idMiembro`, `Estado`) VALUES
(23, '2023-06-09', 1, 1, 1),
(32, '2023-06-13', 1, 2, 1),
(37, '2023-06-17', 1, 4, 1),
(38, '2023-06-17', 2, 6, 1),
(39, '2023-06-17', 1, 3, 1),
(40, '2023-06-17', 2, 13, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `miembro`
--

CREATE TABLE `miembro` (
  `idMiembro` int(11) NOT NULL,
  `dni` int(15) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `miembro`
--

INSERT INTO `miembro` (`idMiembro`, `dni`, `apellido`, `nombre`, `estado`) VALUES
(1, 41298481, 'aguilar', 'facundo', 1),
(2, 44600506, 'angel', 'emmanuel', 1),
(3, 39091538, 'alcaraz', 'rodrigo Nicolas', 1),
(4, 33969341, 'aguirre', 'adrian', 1),
(5, 12345678, 'canenas', 'helto', 1),
(6, 987654321, 'celestino', 'urgencio', 1),
(7, 123, 'testapellido', 'testNombre', 1),
(8, 153251, 'alverti', 'juan carlos', 1),
(13, 22222, 'faustino', 'sarmiento', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyecto`
--

CREATE TABLE `proyecto` (
  `idProyecto` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `fechaInicio` date NOT NULL,
  `estado` tinyint(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proyecto`
--

INSERT INTO `proyecto` (`idProyecto`, `nombre`, `descripcion`, `fechaInicio`, `estado`) VALUES
(1, 'carrera mortal', 'cashera mortah', '2023-05-30', 1),
(2, 'herenciaa', 'señora de los cat', '2023-05-31', 1),
(3, 'Materia2', 'materia dificil2', '2023-06-12', 1),
(4, 'Materia', 'materia dificil', '2023-06-12', 1),
(5, 'Materia rara2.0', 'dificilisima', '2023-06-12', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarea`
--

CREATE TABLE `tarea` (
  `idTarea` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `fechaCreacion` date NOT NULL,
  `fechaCierre` date DEFAULT NULL,
  `estado` tinyint(4) NOT NULL,
  `idMiembroEq` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tarea`
--

INSERT INTO `tarea` (`idTarea`, `nombre`, `fechaCreacion`, `fechaCierre`, `estado`, `idMiembroEq`) VALUES
(3, 'Descansar el dia del padre', '2023-06-18', '2023-06-19', 3, 39),
(5, 'nose 1', '2023-06-20', '2023-06-21', 1, 39),
(6, 'ver 22', '2023-06-20', '2023-06-21', 1, 23),
(7, 'probando estados 2', '2023-06-19', '2023-06-20', 2, 39),
(8, 'probando estados 3', '2023-06-19', '2023-06-20', 0, 39),
(9, 'probando estados 1', '2023-06-19', '2023-06-20', 1, 39);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comentarios`
--
ALTER TABLE `comentarios`
  ADD PRIMARY KEY (`idComentario`);

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`idEquipo`),
  ADD UNIQUE KEY `idProyecto` (`idProyecto`);

--
-- Indices de la tabla `equipomiembros`
--
ALTER TABLE `equipomiembros`
  ADD PRIMARY KEY (`idMiembroEq`),
  ADD UNIQUE KEY `idMiembro` (`idMiembro`),
  ADD KEY `equipomiembros_ibfk_1` (`idEquipo`);

--
-- Indices de la tabla `miembro`
--
ALTER TABLE `miembro`
  ADD PRIMARY KEY (`idMiembro`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `proyecto`
--
ALTER TABLE `proyecto`
  ADD PRIMARY KEY (`idProyecto`);

--
-- Indices de la tabla `tarea`
--
ALTER TABLE `tarea`
  ADD PRIMARY KEY (`idTarea`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comentarios`
--
ALTER TABLE `comentarios`
  MODIFY `idComentario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `idEquipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `equipomiembros`
--
ALTER TABLE `equipomiembros`
  MODIFY `idMiembroEq` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT de la tabla `miembro`
--
ALTER TABLE `miembro`
  MODIFY `idMiembro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT de la tabla `proyecto`
--
ALTER TABLE `proyecto`
  MODIFY `idProyecto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `tarea`
--
ALTER TABLE `tarea`
  MODIFY `idTarea` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `comentarios`
--
ALTER TABLE `comentarios`
  ADD CONSTRAINT `comentarios_ibfk_1` FOREIGN KEY (`idTarea`) REFERENCES `tarea` (`idTarea`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD CONSTRAINT `conectando id Proyecto` FOREIGN KEY (`idProyecto`) REFERENCES `proyecto` (`idProyecto`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `equipomiembros`
--
ALTER TABLE `equipomiembros`
  ADD CONSTRAINT `IdEquipo` FOREIGN KEY (`idEquipo`) REFERENCES `equipo` (`idEquipo`) ON UPDATE CASCADE,
  ADD CONSTRAINT `equipomiembros_ibfk_2` FOREIGN KEY (`idMiembro`) REFERENCES `miembro` (`idMiembro`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `tarea`
--
ALTER TABLE `tarea`
  ADD CONSTRAINT `tarea_ibfk_1` FOREIGN KEY (`idMiembroEq`) REFERENCES `equipomiembros` (`idMiembroEq`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
