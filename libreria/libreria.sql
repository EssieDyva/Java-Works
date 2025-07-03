-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Creato il: Lug 03, 2025 alle 13:13
-- Versione del server: 10.4.32-MariaDB
-- Versione PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `libreria`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `AUTORE`
--

CREATE TABLE `AUTORE` (
  `MATRICOLA_AUTORE` varchar(10) NOT NULL,
  `NOME_AUTORE` varchar(30) NOT NULL,
  `COGNOME_AUTORE` varchar(30) NOT NULL,
  `GENERE_PREFERITO` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `GENERE`
--

CREATE TABLE `GENERE` (
  `NOME_GENERE` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `LIBRO`
--

CREATE TABLE `LIBRO` (
  `ISBN` varchar(64) NOT NULL,
  `NOME_LIBRO` varchar(100) NOT NULL,
  `ANNO_PUBBLICAZIONE` int(11) NOT NULL,
  `CASA_EDITRICE` varchar(100) NOT NULL,
  `GENERE` varchar(50) NOT NULL,
  `MATRICOLA_AUTORE` varchar(10) DEFAULT NULL,
  `QUANTITA` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `UTENTE`
--

CREATE TABLE `UTENTE` (
  `CODICE_CLIENTE` int(11) NOT NULL,
  `NOME_CLIENTE` varchar(30) NOT NULL,
  `COGNOME_CLIENTE` varchar(30) NOT NULL,
  `NUMERO_CELLULARE` int(11) NOT NULL,
  `INDIRIZZO` varchar(50) NOT NULL,
  `GENERE` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `UTENTE`
--

INSERT INTO `UTENTE` (`CODICE_CLIENTE`, `NOME_CLIENTE`, `COGNOME_CLIENTE`, `NUMERO_CELLULARE`, `INDIRIZZO`, `GENERE`) VALUES
(1, 'stefano', 'desiena', 32786534, 'via da casa mia', 'maschio');

-- --------------------------------------------------------

--
-- Struttura della tabella `UTENTE_LIBRO`
--

CREATE TABLE `UTENTE_LIBRO` (
  `ID_ORDINE` int(11) NOT NULL,
  `CODICE_CLIENTE` int(11) NOT NULL,
  `ISBN` varchar(64) NOT NULL,
  `DATA_AFFITTO` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `DATA_RESTITUZIONE` timestamp NULL DEFAULT NULL ON UPDATE current_timestamp(),
  `RESTITUITO` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `AUTORE`
--
ALTER TABLE `AUTORE`
  ADD PRIMARY KEY (`MATRICOLA_AUTORE`);

--
-- Indici per le tabelle `GENERE`
--
ALTER TABLE `GENERE`
  ADD PRIMARY KEY (`NOME_GENERE`);

--
-- Indici per le tabelle `LIBRO`
--
ALTER TABLE `LIBRO`
  ADD PRIMARY KEY (`ISBN`),
  ADD UNIQUE KEY `NOME_LIBRO` (`NOME_LIBRO`),
  ADD KEY `GENERE` (`GENERE`),
  ADD KEY `MATRICOLA_AUTORE` (`MATRICOLA_AUTORE`);

--
-- Indici per le tabelle `UTENTE`
--
ALTER TABLE `UTENTE`
  ADD PRIMARY KEY (`CODICE_CLIENTE`),
  ADD UNIQUE KEY `NUMERO_CELLULARE` (`NUMERO_CELLULARE`);

--
-- Indici per le tabelle `UTENTE_LIBRO`
--
ALTER TABLE `UTENTE_LIBRO`
  ADD PRIMARY KEY (`ID_ORDINE`),
  ADD KEY `CODICE_CLIENTE` (`CODICE_CLIENTE`),
  ADD KEY `ISBN` (`ISBN`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `UTENTE`
--
ALTER TABLE `UTENTE`
  MODIFY `CODICE_CLIENTE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT per la tabella `UTENTE_LIBRO`
--
ALTER TABLE `UTENTE_LIBRO`
  MODIFY `ID_ORDINE` int(11) NOT NULL AUTO_INCREMENT;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `LIBRO`
--
ALTER TABLE `LIBRO`
  ADD CONSTRAINT `LIBRO_ibfk_1` FOREIGN KEY (`GENERE`) REFERENCES `GENERE` (`NOME_GENERE`),
  ADD CONSTRAINT `LIBRO_ibfk_2` FOREIGN KEY (`MATRICOLA_AUTORE`) REFERENCES `AUTORE` (`MATRICOLA_AUTORE`);

--
-- Limiti per la tabella `UTENTE_LIBRO`
--
ALTER TABLE `UTENTE_LIBRO`
  ADD CONSTRAINT `UTENTE_LIBRO_ibfk_1` FOREIGN KEY (`CODICE_CLIENTE`) REFERENCES `UTENTE` (`CODICE_CLIENTE`),
  ADD CONSTRAINT `UTENTE_LIBRO_ibfk_2` FOREIGN KEY (`ISBN`) REFERENCES `LIBRO` (`ISBN`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
