-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-05-2022 a las 15:30:59
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hoja9`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carlos`
--

CREATE TABLE `carlos` (
  `id` int(20) NOT NULL,
  `nombre` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `img_link` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `texto` varchar(255) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `carlos`
--

INSERT INTO `carlos` (`id`, `nombre`, `img_link`, `texto`) VALUES
(2, 'Juan Carlos', 'juancarlos.PNG', 'XD'),
(3, 'Carlos enfermera sexy', 'enfermera.jpg', 'Siempre llevas paracetamol en la mochila. En realidad, querías entrar en enfermería, pero no te llegó la nota. Todos te preguntan cuando no entienden y siempre ayudas a todos. A Charly le traes un poco sin cuidado, no soléis hablar'),
(4, 'Carlos Minecraft', 'minecraft.jpg', 'Enhorabuena eres un friki. Para ti una tarde con tus colegas jugando es tu plan favorito. Las hojas de programación te parecen un chiste. A tu alucinante profesor Carlos le caes muy bien porque siempre habláis de cosas frikis.'),
(5, 'BlablaCarlos', 'blablacar.PNG', 'Siempre eres el chofer del grupo. Te sacaste el carné en cuanto pudiste. Te encanta hablar de coches y la Formula 1. A Don Carlos le caes bien porque siempre participas en clase y haces los trabajos.'),
(6, 'Deja de toCAR LOS huevos', 'huevos.jpg', 'Siento que te enteres así, pero eres insoportable. No te gusta mucho hacer deberes y eso hace que te quejes. Eres buen estudiante, pero deja de toCAR LOS huevos. A Don Carlos le caes bien cuando no vienes a clase.'),
(7, 'Carlos DJ', 'dj.PNG', 'La música es tu fuerte, es tu tema de conversación favorito. El 80% de tu tiempo estás es Spotify y estas toda la semana pensando en irte de fiesta.  A nuestro maravilloso profesor Carlos le pones un poco nervioso porque siempre estás en clase con cascos.'),
(8, 'Carlos Feliz', 'risas.jpg', 'Nunca faltas a clase porque te cae bien la gente. No te importa aprobar o suspender que siempre estas con una sonrisa en la cara. A la hora de hacer las hojas de programación te pones contento y por eso eres el favorito de tu atractivo profesor Carlos.'),
(9, 'Carlos Triste', 'sad.png', 'Eres un liante. Siempre llegas tarde y montas pollos en clase. Alguna vez te has estresado haciendo las hojas y no has entregado alguna. Sacas lo peor del Señor Carlos y te llevas muchas broncas.'),
(10, 'Carlos Enfadado', 'preocupao.PNG', 'Eres un liante. Siempre llegas tarde y montas pollos en clase. Alguna vez te has estresado haciendo las hojas y no has entregado alguna. Sacas lo peor del Señor Carlos y te llevas muchas broncas.'),
(11, 'Carlos Cansado', 'sueno.PNG', 'Has ido más veces con Erica que a clases con Edu. Siempre llegas tarde a clase porque te quedas dormido, pero con un café o un colacao remontas el día. Eres buen estudiante, pero tu apoteósico profesor de programación no aguanta los retrasos y las faltas'),
(12, 'Carlos Kawaii', 'tierno.jpg', 'Eres capaz de llegar tarde por peinarte el flequillo. Siempre vas muy arreglado y no repites outfit desde septiembre. Cuando estas programando no puedes evitar mirarte en el reflejo de la pantalla. Carlos te quiere... lejos'),
(13, 'Carlos 1a Evaluación', '1ev.PNG', 'Entraste más perdido que un pulpo en un garaje, y ahora has sacado un 9 en el examen. Te pasas las tardes en eclipse y tu nivel de ansiedad está muy alto, pero sigues motivado. Mr Carlos está muy contento con tu esfuerzo.'),
(14, 'Carlos 2a Evaluación', '2ev.PNG', 'Son las 23:59 y no has entregado el trabajo. Siempre dejas todo para el último segundo y trabajas muy bien bajo presión. Tienes al señor Rufiángel un poco estresado porque siempre sacas 5 pelados.'),
(15, 'Carlos Semana Caliente', 'caliente.PNG', 'Huye del país si no quieres morir. Eres un auténtico desastre. Has suspendido todos los trabajos por cosas como no formatear. Tu majestuoso profesor Carlos te tiene mucho aprecio, pero espabila.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mood`
--

CREATE TABLE `mood` (
  `id` int(11) NOT NULL,
  `nombre_mood` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `mood`
--

INSERT INTO `mood` (`id`, `nombre_mood`) VALUES
(1, 'enfado'),
(2, 'alegre'),
(3, 'seguro'),
(4, 'preocupado'),
(5, 'tranquilo'),
(6, 'deprimido');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `preguntas`
--

CREATE TABLE `preguntas` (
  `id` int(20) NOT NULL,
  `texto` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `mood` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `preguntas`
--

INSERT INTO `preguntas` (`id`, `texto`, `mood`) VALUES
(0, 'Desconfí­o de la gente.', 3),
(1, 'Soy emocionalmente estable y difícil de alterar.', 1),
(2, 'Con frecuencia se me ocurren ideas nuevas.', 2),
(3, 'Soy minucioso/a en el trabajo.', 4),
(4, 'Me preocupo por todo.', 4),
(5, 'Hago amigos con facilidad.', 2),
(6, 'Tengo mucha imaginación.', 2),
(7, 'Confío en los demás.', 3),
(8, 'Completo las tareas con éxito.', 5),
(9, 'Me enfado con facilidad.', 1),
(10, 'Disfruto mucho en las grandes fiestas y reuniones.', 2),
(11, 'Creo que el arte es importante.', 2),
(12, 'A veces engaño a los demás para salirme con la mí­a.', 1),
(13, 'No me gusta que las cosas estén desordenadas, me gusta ordenar.', 4),
(14, 'A menudo me siento triste.', 6),
(15, 'Me gusta hacerme cargo de la situación.', 3),
(16, 'Experimento emociones profundas y variadas.', 5),
(17, 'Me encanta ayudar a los demás.', 2),
(18, 'Siempre cumplo mis promesas.', 3),
(19, 'Me resulta difícil acercarme a los demás.', 6),
(20, 'Siempre estoy ocupado, de aquí­ para allá.', 4),
(21, 'Prefiero la variedad a la rutina.', 3),
(22, 'Me encanta discutir o pelear.', 1),
(23, 'Trabajo muy duro.', 4),
(24, 'Hago excesos algunas veces.', 6),
(25, 'Me encantan las sensaciones fuertes.', 2),
(26, 'Disfruto leyendo libros y artículos interesantes.', 2),
(27, 'Creo que soy mejor que los demás.', 3),
(28, 'Siempre estoy preparado para lo que sea.', 5),
(29, 'Entro en pánico con facilidad.', 4),
(30, 'Soy una persona muy alegre.', 2),
(31, 'Tiendo a apoyar el progreso y las reformas.', 5),
(32, 'Me solidarizo con los indigentes.', 2),
(33, 'Soy muy espontáneo, actúo sin pensar.', 5),
(34, 'Siempre me temo lo peor.', 6),
(35, 'Me siento cómodo rodeado de gente.', 2),
(36, 'Me gusta dejar volar la imaginación.', 2),
(37, 'Creo que la gente, en general, tiene malas intenciones.', 1),
(38, 'Cuando hago algo, siempre lo hago bien.', 5),
(39, 'Me irrito con facilidad.', 1),
(40, 'En las fiestas siempre hablo con mucha gente distinta.', 3),
(41, 'Veo belleza en cosas que para otras personas pueden pasar inadvertidas.', 2),
(42, 'No me importa hacer trampas para progresar.', 6),
(43, 'A menudo olvido poner las cosas de nuevo en su sitio.', 2),
(44, 'A veces no me gusto.', 6),
(45, 'Intento estar al mando y liderar a los demás.', 3),
(46, 'Soy empático, capto las emociones de los demás.', 5),
(47, 'Me preocupo por los demás.', 5),
(48, 'Digo la verdad.', 5),
(49, 'Tengo miedo de llamar la atención.', 1),
(50, 'Nunca estoy quieto, siempre estoy de aquí para allá.', 4),
(51, 'Prefiero limitarme a las cosas que conozco.', 5),
(52, 'Grito a la gente.', 1),
(53, 'Hago más de lo que se espera de mí.', 4),
(54, 'Pocas veces caigo en excesos.', 3),
(55, 'Hago todo lo posible por buscar la aventura.', 5),
(56, 'Evito las discusiones filosóficas.', 1),
(57, 'Tengo un alto concepto de mí mismo.', 3),
(58, 'Saco adelante mis planes y trabajos.', 4),
(59, 'A menudo los acontecimientos me sobrepasan.', 4),
(60, 'Me divierto mucho.', 2),
(61, 'Creo que no existe el Bien o el Mal absoluto.', 6),
(62, 'Siento compasión por aquellos que están peor que yo.', 4),
(63, 'Tomo decisiones precipitadas.', 4),
(64, 'Me dan miedo muchas cosas.', 6),
(65, 'Si es posible, evito entrar en contacto con la gente.', 6),
(66, 'Me gusta soñar despierto.', 2),
(67, 'Creo lo que la gente dice.', 3),
(68, 'Hago las tareas de manera metódica.', 5),
(69, 'A menudo pierdo los estribos.', 1),
(70, 'Prefiero estar solo.', 6),
(71, 'No me gusta la poesía.', 1),
(72, 'A veces me aprovecho de los demás.', 1),
(73, 'A veces lo dejo todo muy desordenado.', 5),
(74, 'A veces estoy deprimido/a.', 6),
(75, 'Tomo el control de las situaciones.', 3),
(76, 'Pocas veces reparo en mis reacciones emocionales y sentimientos.', 6),
(77, 'Me muestro indiferente ante los sentimientos de los demás.', 6),
(78, 'Rompo las reglas.', 1),
(79, 'Solo me siento realmente cómodo con mis amigos', 6),
(80, 'Hago muchas cosas en mi tiempo libre.', 4),
(81, 'No me gustan los cambios.', 5),
(82, 'Insulto a la gente.', 1),
(83, 'Trabajo lo justo y necesario.', 5),
(84, 'Resisto las tentaciones fácilmente.', 3),
(85, 'Me gusta tomar riesgos.', 3),
(86, 'Tengo dificultades para entender las ideas abstractas.', 2),
(87, 'Tengo muy buena opinión de mí­ mismo.', 3),
(88, 'Suelo perder el tiempo.', 5),
(89, 'Siento que no soy capaz de hacer frente a las cosas.', 6),
(90, 'Adoro la vida.', 2),
(91, 'Creo que la ley se debe cumplir estrictamente.', 4),
(92, 'No me interesan los problemas de los demás.', 6),
(93, 'Suelo precipitarme.', 2),
(94, 'Me estreso con facilidad.', 4),
(95, 'Procuro mantener las distancias con los demás.', 6),
(96, 'Me gusta abstraerme.', 6),
(98, 'Sé cómo hacer las cosas.', 3),
(99, 'No me molesto con facilidad.', 2),
(100, 'Evito las multitudes.', 6),
(101, 'No me gusta ir a museos ni exposiciones de arte.', 1),
(102, 'A veces soy bastante renuente y pongo trabas a los planes de otras personas.', 1),
(103, 'Suelo dejar todas mis cosas desperdigadas.', 2),
(104, 'Me siento a gusto conmigo mismo.', 3),
(105, 'Espero a que los demás tomen el liderazgo.', 5),
(106, 'No entiendo a la gente que se pone sentimental.', 6),
(107, 'No tengo tiempo para los demás.', 4),
(108, 'A veces rompo mis promesas.', 2),
(109, 'No me afectan las situaciones sociales difíciles.', 2),
(110, 'Reacciono con lentitud.', 6),
(111, 'Simpatizo con los estilos de vida tradicionales.', 2),
(112, 'Siempre me tomo mi revancha con los demás.', 1),
(113, 'A veces dedico poco tiempo y esfuerzo a mi trabajo.', 5),
(114, 'Soy capaz de controlar mis deseos.', 5),
(115, 'Me gusta la acción y el peligro.', 2),
(116, 'No me interesan las discusiones teÃ³ricas.', 5),
(117, 'Me gusta hablar sobre mis cualidades.', 3),
(118, 'Me cuesta empezar las tareas.', 5),
(119, 'Bajo presión me mantengo en calma.', 5),
(120, 'Siempre miro el lado bueno de la vida.', 2),
(121, 'Creo que deberÃ­amos ser implacables con la delincuencia.', 4),
(122, 'Intento no pensar en los necesitados.', 5),
(123, 'Actúo sin pensar.', 1),
(124, 'Tengo claras mis metas en la vida.', 3),
(125, 'Confío en mi trabajo.', 3),
(126, 'Puedo trabajar incluso cuando hay caos a mi alrededor.', 5),
(127, 'Me esfuerzo y pongo empeÃ±o en mi trabajo.', 4),
(128, 'Prefiero alcanzar mis objetivos que ayudar a otros a que los consigan.', 1),
(129, 'Soy ambicioso/a.', 1),
(130, 'Es preferible que salga adelante el trabajo a tratar de hacerlo perfecto.', 4),
(131, 'Soy capaz de completar tareas tan bien o incluso mejor que otras personas.', 3),
(132, 'Me gusta estar al cargo de otras personas.', 3),
(133, 'El día no tiene suficientes horas para todo lo que hay que hacer.', 4),
(134, 'Me impaciento por el ritmo al que se desarrollan los acontecimientos.', 4),
(135, 'Con frecuencia me someto a plazos que son difÃ­ciles de cumplir.', 4),
(136, 'Me describiría como una persona absolutamente competente.', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `enfado` int(11) NOT NULL,
  `alegre` int(11) NOT NULL,
  `seguro` int(11) NOT NULL,
  `preocupado` int(11) NOT NULL,
  `tranquilo` int(11) NOT NULL,
  `deprimido` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `carlos`
--
ALTER TABLE `carlos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `mood`
--
ALTER TABLE `mood`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `preguntas`
--
ALTER TABLE `preguntas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `carlos`
--
ALTER TABLE `carlos`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `mood`
--
ALTER TABLE `mood`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `preguntas`
--
ALTER TABLE `preguntas`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=141;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=63;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
