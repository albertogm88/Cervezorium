-- phpMyAdmin SQL Dump
-- version 4.9.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Oct 13, 2020 at 02:02 PM
-- Server version: 5.7.30
-- PHP Version: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `Cervezorium`
--

-- --------------------------------------------------------

--
-- Table structure for table `Cerveza`
--

CREATE TABLE `Cerveza` (
  `id` int(11) NOT NULL,
  `nombre` varchar(120) NOT NULL,
  `idMarca` int(11) NOT NULL,
  `foto` varchar(256) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Marca`
--

CREATE TABLE `Marca` (
  `id` int(11) NOT NULL,
  `name` varchar(120) NOT NULL,
  `codPais` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Pais`
--

CREATE TABLE `Pais` (
  `id` int(11) NOT NULL,
  `nombre` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Cerveza`
--
ALTER TABLE `Cerveza`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fkMarca` (`idMarca`);

--
-- Indexes for table `Marca`
--
ALTER TABLE `Marca`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fkPais` (`codPais`);

--
-- Indexes for table `Pais`
--
ALTER TABLE `Pais`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Cerveza`
--
ALTER TABLE `Cerveza`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Marca`
--
ALTER TABLE `Marca`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Pais`
--
ALTER TABLE `Pais`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Cerveza`
--
ALTER TABLE `Cerveza`
  ADD CONSTRAINT `fkMarca` FOREIGN KEY (`idMarca`) REFERENCES `Marca` (`id`);

--
-- Constraints for table `Marca`
--
ALTER TABLE `Marca`
  ADD CONSTRAINT `fkPais` FOREIGN KEY (`codPais`) REFERENCES `Pais` (`id`);
