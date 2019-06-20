
drop database if exists examsystem;
create database examsystem;
use examsystem;

DROP TABLE IF EXISTS `banji`;

CREATE TABLE `banji` (
  `bjdh` char(4) NOT NULL,
  `bjmc` char(20) NOT NULL,
  `xydh` char(2) NOT NULL,
  PRIMARY KEY (`bjdh`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;




LOCK TABLES `banji` WRITE;

INSERT INTO `banji` VALUES ('0701','计算机科学与技术','07'),('0101','农学','01'),('0705','电子与信息工程','07'),('0102','植物保护','01'),('0201','动物科学','02'),('0103','园艺','01'),('0104','园林','01'),('0105','农业资源与环境','01'),('0106','水土保持与荒漠化防治','01'),('0107','环境科学','01'),('0202','动物医学','02'),('0203','草业科学','02'),('0204','动物药学','02'),('0301','工业设计','03'),('0302','机械设计制造及其自动化','03'),('0303','农业机械化及其自动化','03'),('0304','交通运输','03'),('0402','国际经济与贸易','04'),('0401','会计学','04'),('0305','土木工程','03'),('0306','建筑环境与设备工程','03'),('0403','财务管理','04'),('0404','物流管理','04'),('0405','市场营销','04'),('0406','人力资源管理','04'),('0407','农林经济管理','04'),('0501','食品科学与工程','05'),('0502','食品质量与安全','05'),('0503','包装工程','05'),('0504','粮食工程','05'),('0601','公共事业管理','06'),('0602','政治学与行政学','06'),('0603','社会工作','06'),('0703','电气工程及自动化','07'),('0704','通信工程','07'),('0702','农业电气与自动化','07'),('0801','生物科学','08'),('0802','生物技术','08'),('0803','生物工程','08'),('0804','制药工程','08'),('0903','物理','09'),('0904','化学','09'),('0901','信息与计算科学','09'),('0902','英语','09'),('1001','计算机','10');

UNLOCK TABLES;



DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `courseid` char(2) NOT NULL,
  `courseName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`courseid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;




LOCK TABLES `course` WRITE;

INSERT INTO `course` VALUES ('01','java'),('02','linux');
UNLOCK TABLES;



DROP TABLE IF EXISTS `college`;

CREATE TABLE `college` (
  `xydh` char(2) NOT NULL,
  `xymc` char(20) NOT NULL,
  PRIMARY KEY (`xydh`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;




LOCK TABLES `college` WRITE;

INSERT INTO `college` VALUES ('07','信息技术学院'),('06','人文社会科学学院'),('05','食品学院'),('04','经济管理学院'),('03','工程学院'),('02','动物科技学院'),('01','植物科技学院'),('08','生命科学技术学院'),('09','文理学院');

UNLOCK TABLES;



DROP TABLE IF EXISTS `question`;

CREATE TABLE `question` (
  `questionID` int(11) NOT NULL AUTO_INCREMENT,
  `subject` varchar(300) DEFAULT NULL,
  `choiceA` varchar(100) DEFAULT NULL,
  `choiceB` varchar(100) DEFAULT NULL,
  `choiceC` varchar(100) DEFAULT NULL,
  `choiceD` varchar(100) DEFAULT NULL,
  `answer` varchar(4) DEFAULT NULL,
  `typeID` char(2) DEFAULT NULL,
  `courseID` char(2) DEFAULT NULL,
  PRIMARY KEY (`questionid`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;




LOCK TABLES `question` WRITE;

INSERT INTO `question` VALUES (1,'ActionEvent??(     )','java.util','java.io ','java.awt','java.awt.event','d','01','01'),(2,'下述选项中不属于JDBC基本功能的是：','与数据库建立连接','提交SQL语句','数据库维护管理','处理查询结果','c','01','01'),(3,'mysql数据库的JDBC驱动程序类名及完整包路径为：','jdbc.driver.mysql.Driver','jdbc.com.driver.Driver','mysql.com.jdbc.Driver','com.mysql.jdbc.Driver','d','01','01'),(4,'执行完以下代码int[ ] x = new int[25]；后，以下哪项说明是正确的：','x[24]为0','x[24]未定义 ','x[25]为0 ','x[0]为空','a','01','01'),(5,'FileReader类在(     )包中','java.util','java.io ','java.awt ','java.lang','b','01','01'),(6,'ArrayList类在(     )包中','java.util','java.io ','java.awt ','java.lang','a','01','01'),(7,'(  )命令可以从文本文件的每一行中截取指定内容的数据。','cp','dd','fmt','cut','d','01','02'),(8,'改变文件所有者的命令为','chmod','touch','chown','cat','c','01','02'),(9,'在unix下以小圆点开头的文件名是','可执行文件','子目录','隐藏文件','当前目录','c','01','02'),(10,'下面（  ）命令可以删除一个用户并同时删除用户的主目录。','rmuser -r','deluser -r','userdel -r','usermgr -r','c','01','02');

UNLOCK TABLES;



DROP TABLE IF EXISTS `score`;

CREATE TABLE `score` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userID` char(11) DEFAULT NULL,
  `courseID` char(2) DEFAULT NULL,
  `cj` int(11) DEFAULT NULL,
  `pscj` int(11) DEFAULT NULL,
  `kscj` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;


LOCK TABLES `score` WRITE;

INSERT INTO `score` VALUES (7,'1','01',NULL,NULL,20),(6,'1',NULL,NULL,NULL,40),(5,'1',NULL,NULL,NULL,40);

UNLOCK TABLES;



DROP TABLE IF EXISTS `shijuan`;

CREATE TABLE `shijuan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `shijuanmingcheng` varchar(255) DEFAULT NULL,
  `timu` varchar(255) DEFAULT NULL,
  `bjdh` varchar(255) DEFAULT NULL,
  `courseID` varchar(255) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;



LOCK TABLES `shijuan` WRITE;

INSERT INTO `shijuan` VALUES (3,'javaks2','1,3,4,5','0701','01','start');

UNLOCK TABLES;







DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userID` varchar(20) NOT NULL,
  `userName` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `userType` char(2) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `bjdh` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;




LOCK TABLES `user` WRITE;

INSERT INTO `user` VALUES ('admin','张三','c4ca4238a0b923820dcc509a6f75849b','3@126.com','01',NULL,'1001'),
('1','cde','c4ca4238a0b923820dcc509a6f75849b','1@163.com','02','c:/temp/20121015/20121015194055.JPG','0701'),('20074071003','ert','68053af2923e00204c3ca7c6a3150cf7','1@163.com','02',NULL,'0701'),('4','ghi','147','2@tom.com','01',NULL,'0701'),('5','ijk','258','3@126.com','02',NULL,'0701'),('6','abc','123','1@163.com','02',NULL,'0701'),('g001','abc','123','1@163.com','01',NULL,'0701');

UNLOCK TABLES;

