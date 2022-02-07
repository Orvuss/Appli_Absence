-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 07 fév. 2022 à 14:36
-- Version du serveur : 5.7.36
-- Version de PHP : 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `absence`
--

-- --------------------------------------------------------

--
-- Structure de la table `aout`
--

DROP TABLE IF EXISTS `aout`;
CREATE TABLE IF NOT EXISTS `aout` (
  `dateDebutA` varchar(200) NOT NULL,
  `dateFinA` varchar(200) NOT NULL,
  `affectationA` varchar(200) NOT NULL,
  `autreA` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `avril`
--

DROP TABLE IF EXISTS `avril`;
CREATE TABLE IF NOT EXISTS `avril` (
  `dateDebutA` varchar(200) NOT NULL,
  `dateFinA` varchar(200) NOT NULL,
  `affectationA` varchar(200) NOT NULL,
  `autreA` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `avril`
--

INSERT INTO `avril` (`dateDebutA`, `dateFinA`, `affectationA`, `autreA`) VALUES
('2022-02-03', '2022-02-10', '<html><p bgcolor=\'#2FE4D8\' color=\'black\'>cet</p></html>', '<html><p></p></html>'),
('2022-02-09', '2022-02-16', '<html><p bgcolor=\'#E434DB\' color=\'black\'>tp</p></html>', '<html><p></p></html>');

-- --------------------------------------------------------

--
-- Structure de la table `decembre`
--

DROP TABLE IF EXISTS `decembre`;
CREATE TABLE IF NOT EXISTS `decembre` (
  `dateDebutD` varchar(200) NOT NULL,
  `dateFinD` varchar(200) NOT NULL,
  `affectationD` varchar(200) NOT NULL,
  `autreD` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `fevrier`
--

DROP TABLE IF EXISTS `fevrier`;
CREATE TABLE IF NOT EXISTS `fevrier` (
  `dateDebutF` varchar(200) NOT NULL,
  `dateFinF` varchar(200) NOT NULL,
  `affectationF` varchar(200) NOT NULL,
  `autreF` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `fevrier`
--

INSERT INTO `fevrier` (`dateDebutF`, `dateFinF`, `affectationF`, `autreF`) VALUES
('2022-02-15', '2022-02-21', '<html><p bgcolor=\'#891B3C\' color=\'white\'>rh</p></html>', '<html><p></p></html>');

-- --------------------------------------------------------

--
-- Structure de la table `janvier`
--

DROP TABLE IF EXISTS `janvier`;
CREATE TABLE IF NOT EXISTS `janvier` (
  `dateDebutJ` varchar(200) NOT NULL,
  `dateFinJ` varchar(200) NOT NULL,
  `affectationJ` varchar(200) NOT NULL,
  `autreJ` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `juillet`
--

DROP TABLE IF EXISTS `juillet`;
CREATE TABLE IF NOT EXISTS `juillet` (
  `dateDebutJ` varchar(200) NOT NULL,
  `dateFinJ` varchar(200) NOT NULL,
  `affectationJ` varchar(200) NOT NULL,
  `autreJ` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `juin`
--

DROP TABLE IF EXISTS `juin`;
CREATE TABLE IF NOT EXISTS `juin` (
  `dateDebutJ` varchar(200) NOT NULL,
  `dateFinJ` varchar(200) NOT NULL,
  `affectationJ` varchar(200) NOT NULL,
  `autreJ` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `mai`
--

DROP TABLE IF EXISTS `mai`;
CREATE TABLE IF NOT EXISTS `mai` (
  `dateDebutMai` varchar(200) NOT NULL,
  `dateFinMai` varchar(200) NOT NULL,
  `affectationMai` varchar(200) NOT NULL,
  `autreMai` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `mai`
--

INSERT INTO `mai` (`dateDebutMai`, `dateFinMai`, `affectationMai`, `autreMai`) VALUES
('2022-02-09', '2022-02-09', '<html><p bgcolor=\'#8F6498\' color=\'white\'>tac</p></html>', '<html><p></p></html>'),
('2022-02-16', '2022-02-16', '<html><p bgcolor=\'#F8F00A\' color=\'black\'>rc</p></html>', '<html><p></p></html>');

-- --------------------------------------------------------

--
-- Structure de la table `mars`
--

DROP TABLE IF EXISTS `mars`;
CREATE TABLE IF NOT EXISTS `mars` (
  `dateDebutM` varchar(200) NOT NULL,
  `dateFinM` varchar(200) NOT NULL,
  `affectationM` varchar(200) NOT NULL,
  `autreM` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `novembre`
--

DROP TABLE IF EXISTS `novembre`;
CREATE TABLE IF NOT EXISTS `novembre` (
  `dateDebutN` varchar(200) NOT NULL,
  `dateFinN` varchar(200) NOT NULL,
  `affectationN` varchar(200) NOT NULL,
  `autreN` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `octobre`
--

DROP TABLE IF EXISTS `octobre`;
CREATE TABLE IF NOT EXISTS `octobre` (
  `dateDebutO` varchar(200) NOT NULL,
  `dateFinO` varchar(200) NOT NULL,
  `affectationO` varchar(200) NOT NULL,
  `autreO` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `personnel`
--

DROP TABLE IF EXISTS `personnel`;
CREATE TABLE IF NOT EXISTS `personnel` (
  `Nom_p` varchar(200) NOT NULL,
  `Prénom_p` varchar(200) NOT NULL,
  `Service_p` varchar(200) NOT NULL,
  `Matricule_p` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `personnel`
--

INSERT INTO `personnel` (`Nom_p`, `Prénom_p`, `Service_p`, `Matricule_p`) VALUES
('BEGHIN', 'Eric', 'Production', 'G09308'),
('DELECROIX', 'Laure', 'Coordination Globale Production', 'G09086'),
('EURAXIEL', 'LC', 'Coordination Globale Production', 'E51300'),
('MARTIN', 'José', 'Exploitation & Services', 'G01838'),
('CUNIN', 'Thierry', 'Pilotage', 'G09844'),
('COULOMBEL', 'Olivier', 'DBA-Metrologie', 'G02486'),
('FOREST', 'Pierre', 'DBA-Metrologie', 'G09304'),
('INETUM', 'CM', 'DBA-Metrologie', 'E51349'),
('INETUM', 'PI', 'DBA-Metrologie', 'E51408'),
('BUI', 'Tin', 'Editique et Archivage', 'G09311'),
('PASQUET', 'Nicolas', 'Editique et Archivage', 'G09513'),
('BAHANI', 'Hassan', '....', 'G02634'),
('INETUM', 'BM', '....', 'E51634'),
('CARRU', 'Thierry', 'Service Desk', 'G09057'),
('OHANA', 'Alain', 'Service Desk', 'G02662'),
('GLEMAIN', 'Sandrine', 'Changement, MEP', 'G09305'),
('INETUM', 'OT', 'Changement, MEP', 'E51122'),
('INETUM', 'EW', 'Changement, MEP', 'E51713'),
('THIERRY', 'Philippe', 'Integration - STE - GDF - EAR', 'G09307'),
('ABOJIAN', 'Laurent', 'Integration MF', 'G03087'),
('INETUM', 'SM', 'Integration MF', 'E51679'),
('REMENE', 'DANIEL', 'Integration MF', 'G00994'),
('LEBLOND', 'Hervé', 'Integration MF', 'G01221'),
('GUIGNEBERT', 'Régis', 'Integration MF', 'G01304'),
('FERTER', 'Grégory', 'Integration MF', 'G02428'),
('DIDARET', 'Jean-Jacques', 'Integration MF', 'G09626'),
('INETUM', 'DA', 'Integration MF', 'E51710'),
('SAIDOU', 'Karim', 'Integration Open', 'G03547'),
('INETUM', 'YB', 'Integration Open', 'E51574'),
('INETUM', 'FB', 'Integration Open', 'E51575'),
('BOISSET', 'Jean-Marc', 'Flux', 'G09566'),
('INETUM', 'CB', 'Flux', 'E51126'),
('DUCHAUSSOY', 'Frédérique', 'STE', 'G01646'),
('ANOLIS', 'TH', 'STE', 'E51369'),
('INETUM', 'TP', 'STE', 'E51660'),
('FONTESSE', 'Fabienne', 'Securite', 'B50424'),
('GILLE', 'Frederik', 'SECOP', 'G03713'),
('HABACHOU', 'Mokrane', 'SECOP', 'G03546'),
('ARDILIO', 'Isabelle', 'SECOP', 'G09108'),
('BEYLIER', 'Teiva', 'SECOP', 'G03973'),
('NSIS', 'MB', 'SECOP', 'E51427'),
('CATTAINI', 'Fabrice', 'RSI', 'G03459'),
('BIGOT', 'Valérie', 'SOC', 'G03431'),
('CLINKAST', 'ZZ', 'SOC', 'E51659'),
('CLINKAST', 'MA', 'SOC', 'E51707'),
('BUTEUX', 'Arnaud', 'Architecture Infra & Systeme', 'G09282'),
('BAUDOIN', 'Fabrice', 'Architecture Technique', 'G09262'),
('JEAN', 'Alain', 'Systeme', 'G02763'),
('HUMBERT', 'Ludovic', 'Systeme', 'G01984'),
('MENARD', 'Thomas', 'Systeme', 'G09265'),
('RIEUX', 'Julien', 'Systeme', 'G09104'),
('ROULLAND', 'Jean-François', 'Systeme', 'G09641'),
('ADONYS', 'DC', 'Systeme', 'E51424'),
('LEROUX', 'Ludovic', 'Reseaux, Serveurs, Bureautique', 'G02520'),
('ERDINC', 'Aykut', 'Reseaux', 'G02539'),
('MARCHAND', 'Philippe', 'Reseaux', 'G09735'),
('KHY', 'François', 'Reseaux', 'G03329'),
('SCC', 'AR', 'Reseaux', 'E51438'),
('', '', 'Serveurs et Bureautique', ''),
('Bouloc', 'Laurent', 'Windows', 'G03739'),
('VAN DER CRUYSSEN', 'Axel', 'Windows', 'G04030'),
('HT TEAM', 'HC', 'Windows', 'E51507'),
('CELAD', 'RD', 'Windows', 'E51570'),
('CELAD', 'LF', 'Windows', 'E51627'),
('CELAD', 'ABA', 'Windows', 'E51648'),
('CELAD', 'GK', 'Windows', 'E51681'),
('COESSI', 'RB', 'Windows', 'E51533'),
('CELAD', 'ABH', 'Windows', 'E5704'),
('CELAD', 'HF', 'Windows', 'E51700'),
('METSYS', 'NP', 'Windows', 'E51705'),
('OLIER', 'Laurent', 'Linux', 'G09258'),
('MARLIERE', 'Cyril', 'Linux', 'B50423'),
('ELANZ', 'LR', 'Linux', 'E51576'),
('HR TEAM', 'RM', 'Linux', 'E51665');

-- --------------------------------------------------------

--
-- Structure de la table `septembre`
--

DROP TABLE IF EXISTS `septembre`;
CREATE TABLE IF NOT EXISTS `septembre` (
  `dateDebutS` varchar(200) NOT NULL,
  `dateFinS` varchar(200) NOT NULL,
  `affectationS` varchar(200) NOT NULL,
  `autreS` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
