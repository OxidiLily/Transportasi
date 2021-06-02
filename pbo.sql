-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 02, 2021 at 04:15 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `kendaraan`
--

CREATE TABLE `kendaraan` (
  `Nama_Kendaraan` varchar(100) DEFAULT NULL,
  `Nama_Merk` varchar(50) DEFAULT NULL,
  `Tujuan` varchar(100) DEFAULT NULL,
  `kecepatan` int(11) DEFAULT NULL,
  `waktu` int(11) DEFAULT NULL,
  `jarak` int(11) DEFAULT NULL,
  `Nama_Pemilik` varchar(100) DEFAULT '1',
  `id_User` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kendaraan`
--

INSERT INTO `kendaraan` (`Nama_Kendaraan`, `Nama_Merk`, `Tujuan`, `kecepatan`, `waktu`, `jarak`, `Nama_Pemilik`, `id_User`) VALUES
('Honda', 'Honda', 'Jakarta', 54, 4, 216, 'Helmi', 1),
('Honda', 'Honda', 'Tegal', 20, 8, 160, 'Sigit', 2),
('MegaPro', 'Honda', 'Semarang', 50, 2, 100, 'Aziz', 3),
('YAMAHA', 'HONDA', 'SEMARANG', 80, 50, 4000, 'Agung', 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kendaraan`
--
ALTER TABLE `kendaraan`
  ADD PRIMARY KEY (`id_User`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kendaraan`
--
ALTER TABLE `kendaraan`
  MODIFY `id_User` int(10) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
