-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Apr 28, 2022 at 06:12 AM
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
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `addnewvehicle`
--

INSERT INTO `addnewvehicle` (`Id`, `anv_Name`, `anv_Fee`) VALUES
(1, '2 Wheeler', '2000'),
(2, '3 Wheeler', '5000'),
(5, '4 Wheeler', '6000');

-- --------------------------------------------------------

--
-- Table structure for table `apply_driving_license`
--

DROP TABLE IF EXISTS `apply_driving_license`;
CREATE TABLE IF NOT EXISTS `apply_driving_license` (
  `apply_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) NOT NULL,
  `driving_school_id` int(11) NOT NULL,
  `added_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`apply_id`),
  KEY `customer_id` (`customer_id`),
  KEY `driving_school_id` (`driving_school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `authority`
--

DROP TABLE IF EXISTS `authority`;
CREATE TABLE IF NOT EXISTS `authority` (
  `a_id` int(11) NOT NULL AUTO_INCREMENT,
  `amobile` varchar(20) NOT NULL,
  `apassword` varchar(20) NOT NULL,
  PRIMARY KEY (`a_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `authority`
--

INSERT INTO `authority` (`a_id`, `amobile`, `apassword`) VALUES
(1, '123456789', 'admin');

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
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customer_id`, `first_name`, `last_name`, `dob`, `birth_place`, `email_id`, `current_address`, `mobile`, `password`) VALUES
(3, 'a', 'a', '1-JAN-1991', 'a', 'a', 'a', '1234567890', 'abcdef'),
(4, 'Bhavik', 'Patel', '1-JAN-1991', 'Surat', 'aa@gmail.com', 'Bhatar	', '6353539097', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `customer_login`
--

DROP TABLE IF EXISTS `customer_login`;
CREATE TABLE IF NOT EXISTS `customer_login` (
  `login_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) NOT NULL,
  `customer_mobile` varchar(10) NOT NULL,
  `customer_password` varchar(30) NOT NULL,
  `login_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`login_id`),
  KEY `customer_id` (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
  `contact_no` varchar(10) NOT NULL,
  `contact_person` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `active_status` enum('ACTIVE','DEACTIVE') NOT NULL DEFAULT 'ACTIVE',
  PRIMARY KEY (`driving_school_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `driving_school`
--

INSERT INTO `driving_school` (`driving_school_id`, `name`, `address`, `email`, `year_of_establishment`, `contact_no`, `contact_person`, `password`, `active_status`) VALUES
(3, 'Shrdha', 'Bhatar	', 'aa@gmail.com', 1991, '8733070825', 'Bhavik', 'admin1', 'ACTIVE');

-- --------------------------------------------------------

--
-- Table structure for table `driving_school_login`
--

DROP TABLE IF EXISTS `driving_school_login`;
CREATE TABLE IF NOT EXISTS `driving_school_login` (
  `school_login_id` int(11) NOT NULL AUTO_INCREMENT,
  `driving_school_id` int(11) NOT NULL,
  `school_mobile` varchar(10) NOT NULL,
  `school_password` varchar(30) NOT NULL,
  `added_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`school_login_id`),
  KEY `driving_school_id` (`driving_school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
CREATE TABLE IF NOT EXISTS `vehicle` (
  `vehicle_id` int(11) NOT NULL AUTO_INCREMENT,
  `vehicle_name` varchar(50) NOT NULL,
  PRIMARY KEY (`vehicle_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `customer_login`
--
ALTER TABLE `customer_login`
  ADD CONSTRAINT `customer_login_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
