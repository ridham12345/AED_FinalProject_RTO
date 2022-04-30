-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Apr 30, 2022 at 02:24 PM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `driving`
--

-- --------------------------------------------------------

--
-- Table structure for table `addnewvehicle`
--

DROP TABLE IF EXISTS `addnewvehicle`;
CREATE TABLE IF NOT EXISTS `addnewvehicle` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `anv_Name` varchar(20) NOT NULL,
  `anv_Fee` varchar(20) NOT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `anv_Name` (`anv_Name`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `addnewvehicle`
--

INSERT INTO `addnewvehicle` (`Id`, `anv_Name`, `anv_Fee`) VALUES
(1, '2 Wheeler', '2000'),
(2, '3 Wheeler', '5000'),
(5, '4 Wheeler', '6000'),
(6, ',,,', 'pppp'),
(7, '2 w', '100');

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `admin_id` int(11) NOT NULL,
  `admin_name` varchar(30) NOT NULL,
  `admin_mobile` varchar(10) NOT NULL,
  `admin_password` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin_id`, `admin_name`, `admin_mobile`, `admin_password`) VALUES
(1, 'Bhavik Patel', '9428580825', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `apply_driving_license`
--

DROP TABLE IF EXISTS `apply_driving_license`;
CREATE TABLE IF NOT EXISTS `apply_driving_license` (
  `apply_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) NOT NULL,
  `driving_school_id` int(11) NOT NULL,
  `vehicle_id` int(11) NOT NULL,
  `apply_date` varchar(20) NOT NULL,
  `status` enum('Pending','Accepted','Rejected') NOT NULL DEFAULT 'Pending',
  `added_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`apply_id`),
  KEY `customer_id` (`customer_id`),
  KEY `driving_school_id` (`driving_school_id`),
  KEY `driving_school_id_2` (`driving_school_id`),
  KEY `vehicle_id` (`vehicle_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `apply_driving_license`
--

INSERT INTO `apply_driving_license` (`apply_id`, `customer_id`, `driving_school_id`, `vehicle_id`, `apply_date`, `status`, `added_date`) VALUES
(1, 3, 3, 1, '2022-04-30', 'Pending', '2022-04-29 07:33:02'),
(3, 4, 5, 1, '2022-01-01', 'Pending', '2022-04-29 12:23:42'),
(4, 4, 5, 1, '2022-01-01', 'Pending', '2022-04-30 05:42:43');

-- --------------------------------------------------------

--
-- Table structure for table `authority`
--

DROP TABLE IF EXISTS `authority`;
CREATE TABLE IF NOT EXISTS `authority` (
  `a_id` int(11) NOT NULL AUTO_INCREMENT,
  `aname` varchar(40) DEFAULT NULL,
  `amobile` varchar(20) NOT NULL,
  `apassword` varchar(20) NOT NULL,
  `isActive` enum('ACTIVE','DEACTIVE') NOT NULL DEFAULT 'ACTIVE',
  PRIMARY KEY (`a_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `authority`
--

INSERT INTO `authority` (`a_id`, `aname`, `amobile`, `apassword`, `isActive`) VALUES
(1, 'Yash Patel', '1234567890', 'admin', 'ACTIVE');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `dob` varchar(23) NOT NULL,
  `birth_place` varchar(50) NOT NULL,
  `email_id` varchar(30) NOT NULL,
  `current_address` text NOT NULL,
  `mobile` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL,
  `customer_status` enum('ACTIVE','DEACTIVE') NOT NULL DEFAULT 'ACTIVE',
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customer_id`, `first_name`, `last_name`, `dob`, `birth_place`, `email_id`, `current_address`, `mobile`, `password`, `customer_status`) VALUES
(3, 'a', 'a', '1-JAN-1991', 'a', 'a', 'a', '1234567890', 'abcdef', 'ACTIVE'),
(4, 'Bhavik', 'Patel', '1-JAN-1991', 'Surat', 'aa@gmail.com', 'Bhatar	', '6353539097', 'admin', 'ACTIVE');

-- --------------------------------------------------------

--
-- Table structure for table `driving_school`
--

DROP TABLE IF EXISTS `driving_school`;
CREATE TABLE IF NOT EXISTS `driving_school` (
  `driving_school_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(70) NOT NULL,
  `address` text NOT NULL,
  `email` varchar(30) NOT NULL,
  `year_of_establishment` int(11) NOT NULL,
  `contact_no` varchar(12) NOT NULL,
  `contact_person` varchar(20) NOT NULL,
  `mobile` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL,
  `active_status` enum('ACTIVE','DEACTIVE') NOT NULL DEFAULT 'ACTIVE',
  PRIMARY KEY (`driving_school_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `driving_school`
--

INSERT INTO `driving_school` (`driving_school_id`, `name`, `address`, `email`, `year_of_establishment`, `contact_no`, `contact_person`, `mobile`, `password`, `active_status`) VALUES
(3, 'Shrdha', 'Bhatar	', 'aa@gmail.com', 1991, '0261227482', 'Bhavik', '8733070825', 'admin1', 'DEACTIVE'),
(4, 'Shrdha1', 'Bhatar	1', 'aa@gmail.com', 1991, '0261227482', 'Bhavik', '8733070825', 'admin1', 'ACTIVE'),
(5, 'Shrdha2', 'Bhatar	', 'aa@gmail.com', 1991, '0261227482', 'Bhavik', '8733070825', 'admin1', 'ACTIVE'),
(6, 'Shrdha4', 'Bhatar	', 'aa@gmail.com', 1991, '0261227482', 'Bhavik', '8733070825', 'admin1', 'ACTIVE');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `apply_driving_license`
--
ALTER TABLE `apply_driving_license`
  ADD CONSTRAINT `apply_driving_license_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `apply_driving_license_ibfk_2` FOREIGN KEY (`driving_school_id`) REFERENCES `driving_school` (`driving_school_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `apply_driving_license_ibfk_3` FOREIGN KEY (`vehicle_id`) REFERENCES `addnewvehicle` (`Id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
