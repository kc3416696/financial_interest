-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- 主機： localhost
-- 產生時間： 2023 年 05 月 14 日 17:32
-- 伺服器版本： 10.4.21-MariaDB
-- PHP 版本： 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 資料庫： `financial_interest`
--

-- --------------------------------------------------------

--
-- 資料表結構 `like_list`
--

CREATE TABLE `like_list` (
  `SN` int(11) NOT NULL COMMENT 'Primary Key 流水序號',
  `OrderName` int(11) NOT NULL COMMENT '購買數量',
  `Account` text NOT NULL COMMENT '扣款帳號',
  `TotalFee` int(11) NOT NULL COMMENT '總手續費用(台幣計價)',
  `TotalAmount` int(11) NOT NULL COMMENT '預計扣款總金額'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- 資料表結構 `product`
--

CREATE TABLE `product` (
  `No` int(11) NOT NULL COMMENT 'Primary Key 產品流水號',
  `ProductName` text NOT NULL COMMENT '產品名稱',
  `Price` int(11) NOT NULL COMMENT '產品價格',
  `FeeRate` float NOT NULL COMMENT '手續費率(%) ex: 0.1 (10%) / 0.01 (1%)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- 資料表結構 `user`
--

CREATE TABLE `user` (
  `UserID` varchar(11) NOT NULL COMMENT '使用者 ID (Primary Key)',
  `UserName` text NOT NULL COMMENT '使用者名稱',
  `Email` text NOT NULL COMMENT '使用者電子郵件',
  `Account` text NOT NULL COMMENT '扣款帳號'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 傾印資料表的資料 `user`
--

INSERT INTO `user` (`UserID`, `UserName`, `Email`, `Account`) VALUES
('A12345678', 'name', 'test@gmail.com', '123123123'),
('A123456789', '王 o 明', 'test@email.com', '1111999666');

--
-- 已傾印資料表的索引
--

--
-- 資料表索引 `like_list`
--
ALTER TABLE `like_list`
  ADD PRIMARY KEY (`SN`),
  ADD KEY `SN` (`SN`);

--
-- 資料表索引 `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`No`);

--
-- 資料表索引 `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UserID`);

--
-- 在傾印的資料表使用自動遞增(AUTO_INCREMENT)
--

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `like_list`
--
ALTER TABLE `like_list`
  MODIFY `SN` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Primary Key 流水序號';

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `product`
--
ALTER TABLE `product`
  MODIFY `No` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Primary Key 產品流水號';
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
