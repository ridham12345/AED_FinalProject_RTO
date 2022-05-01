-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 01, 2022 at 08:49 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.4.28

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

CREATE TABLE `addnewvehicle` (
  `Id` int(11) NOT NULL,
  `anv_Name` varchar(20) NOT NULL,
  `anv_Fee` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `addnewvehicle`
--

INSERT INTO `addnewvehicle` (`Id`, `anv_Name`, `anv_Fee`) VALUES
(13, 'car', '70'),
(14, 'truck', '100'),
(15, 'bike', '50');

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL,
  `admin_name` varchar(30) NOT NULL,
  `admin_mobile` varchar(10) NOT NULL,
  `admin_password` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin_id`, `admin_name`, `admin_mobile`, `admin_password`) VALUES
(1, 'Bhavik Patel', '9428580825', 'sumit'),
(2, 'Admin', '8573769658', 'admin'),
(2, 'Admin', '8573769658', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `apply_driving_license`
--

CREATE TABLE `apply_driving_license` (
  `apply_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `driving_school_id` int(11) NOT NULL,
  `vehicle_id` int(11) NOT NULL,
  `apply_date` varchar(20) NOT NULL,
  `status` enum('Pending','Accepted','Rejected') NOT NULL DEFAULT 'Pending',
  `added_date` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `apply_driving_license`
--

INSERT INTO `apply_driving_license` (`apply_id`, `customer_id`, `driving_school_id`, `vehicle_id`, `apply_date`, `status`, `added_date`) VALUES
(12, 6, 8, 13, '2022-01-01', 'Pending', '2022-05-01 18:27:49');

-- --------------------------------------------------------

--
-- Table structure for table `authority`
--

CREATE TABLE `authority` (
  `a_id` int(11) NOT NULL,
  `aname` varchar(40) DEFAULT NULL,
  `amobile` varchar(20) NOT NULL,
  `apassword` varchar(20) NOT NULL,
  `isActive` enum('ACTIVE','DEACTIVE') NOT NULL DEFAULT 'ACTIVE'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `authority`
--

INSERT INTO `authority` (`a_id`, `aname`, `amobile`, `apassword`, `isActive`) VALUES
(1, 'Authority', '8573769658', 'admin', 'ACTIVE');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `dob` varchar(23) NOT NULL,
  `birth_place` varchar(50) NOT NULL,
  `email_id` varchar(30) NOT NULL,
  `current_address` text NOT NULL,
  `mobile` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL,
  `customer_status` enum('ACTIVE','DEACTIVE') NOT NULL DEFAULT 'ACTIVE'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customer_id`, `first_name`, `last_name`, `dob`, `birth_place`, `email_id`, `current_address`, `mobile`, `password`, `customer_status`) VALUES
(6, 'ridham', 'mangukia', '5-JUN-1997', 'surat', 'ridham123@gmail.com', '95 alphonsus street,boston,MA', '8573769658', 'admin', 'ACTIVE');

-- --------------------------------------------------------

--
-- Table structure for table `driving_school`
--

CREATE TABLE `driving_school` (
  `driving_school_id` int(11) NOT NULL,
  `name` varchar(70) NOT NULL,
  `address` text NOT NULL,
  `email` varchar(30) NOT NULL,
  `year_of_establishment` int(11) NOT NULL,
  `contact_person` varchar(20) NOT NULL,
  `mobile` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL,
  `active_status` enum('ACTIVE','DEACTIVE') NOT NULL DEFAULT 'ACTIVE'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `driving_school`
--

INSERT INTO `driving_school` (`driving_school_id`, `name`, `address`, `email`, `year_of_establishment`, `contact_person`, `mobile`, `password`, `active_status`) VALUES
(8, 'riddhi siddhi driving school', '75 alphonsus street,boston,MA', 'rsd123@gmail.com', 2011, 'sunder', '8573769658', 'admin', 'ACTIVE');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addnewvehicle`
--
ALTER TABLE `addnewvehicle`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `anv_Name` (`anv_Name`);

--
-- Indexes for table `apply_driving_license`
--
ALTER TABLE `apply_driving_license`
  ADD PRIMARY KEY (`apply_id`),
  ADD KEY `customer_id` (`customer_id`),
  ADD KEY `driving_school_id` (`driving_school_id`),
  ADD KEY `driving_school_id_2` (`driving_school_id`),
  ADD KEY `vehicle_id` (`vehicle_id`);

--
-- Indexes for table `authority`
--
ALTER TABLE `authority`
  ADD PRIMARY KEY (`a_id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_id`);

--
-- Indexes for table `driving_school`
--
ALTER TABLE `driving_school`
  ADD PRIMARY KEY (`driving_school_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `addnewvehicle`
--
ALTER TABLE `addnewvehicle`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `apply_driving_license`
--
ALTER TABLE `apply_driving_license`
  MODIFY `apply_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `authority`
--
ALTER TABLE `authority`
  MODIFY `a_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `customer_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `driving_school`
--
ALTER TABLE `driving_school`
  MODIFY `driving_school_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

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
