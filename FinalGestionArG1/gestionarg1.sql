-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-06-2023 a las 22:43:59
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

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
(5, 'emma me paso la sala', '2023-06-10', 4, 1);

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
(1, 1, 'grupo 1', '2023-05-30', 1),
(2, 2, 'grupo 15', '2023-05-25', 1),
(3, 3, 'grupo test', '2023-06-12', 1),
(5, 10, 'TestdesdemainM', '2017-01-01', 1),
(7, 20, 'EquipoZ', '2016-02-20', 1);

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
(37, '2030-01-01', 10, 14, 1),
(39, '2017-01-01', 20, 16, 1);

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
(3, 39091538, 'alcaraz', 'rodrigo', 1),
(4, 33969341, 'aguirre', 'adrian', 1),
(5, 12345678, 'canenas', 'helto', 1),
(6, 987654321, 'celestino', 'urgencio', 1),
(7, 123, 'testapellido', 'testNombre', 1),
(8, 153251, 'alverti', 'juan carlos', 1),
(13, 22222, 'faustino', 'sarmiento', 1),
(14, 32112, 'alquilar', 'piso', 1),
(16, 4136, 'roman', 'ruperto', 1);

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
(2, 'herencia', 'señora de los gatos', '2023-05-31', 1),
(3, 'Materia2', 'materia dificil2', '2023-06-12', 1),
(4, 'Materia', 'materia dificil', '2023-06-12', 1),
(5, 'Materia rara', 'dificilisima', '2023-06-12', 1),
(7, 'proshecto zeta', 'zeta', '2023-06-12', 1);

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
(4, 'limpiar', '2020-02-02', '2023-06-11', 1, 39);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comentarios`
--
ALTER TABLE `comentarios`
  ADD PRIMARY KEY (`idComentario`),
  ADD UNIQUE KEY `idTarea` (`idTarea`);

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
  ADD PRIMARY KEY (`idMiembro`);

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
  ADD UNIQUE KEY `idMiembroEq` (`idMiembroEq`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comentarios`
--
ALTER TABLE `comentarios`
  MODIFY `idComentario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `idEquipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `equipomiembros`
--
ALTER TABLE `equipomiembros`
  MODIFY `idMiembroEq` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT de la tabla `miembro`
--
ALTER TABLE `miembro`
  MODIFY `idMiembro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `proyecto`
--
ALTER TABLE `proyecto`
  MODIFY `idProyecto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `tarea`
--
ALTER TABLE `tarea`
  MODIFY `idTarea` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

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
  ADD CONSTRAINT `idmiembrorelacion` FOREIGN KEY (`idMiembro`) REFERENCES `miembro` (`idMiembro`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `tarea`
--
ALTER TABLE `tarea`
  ADD CONSTRAINT `tarea_ibfk_1` FOREIGN KEY (`idMiembroEq`) REFERENCES `equipomiembros` (`idMiembroEq`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
