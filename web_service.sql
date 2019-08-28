/*
Navicat MySQL Data Transfer

Source Server         : MYSQL80
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : web_service

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2019-08-28 12:25:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(36) NOT NULL,
  `email` varchar(36) NOT NULL,
  `gender` int(10) NOT NULL,
  `department` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `birth` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '李华', 'lihua@gmail.com', '0', '信息化部', '1994-12-01');
INSERT INTO `employee` VALUES ('2', '徐甜', 'xutian@qq.com', '0', '网络部', '1999-11-26');
INSERT INTO `employee` VALUES ('3', '李刚', 'ligang@qq.com', '1', '保卫部', '1993-02-21');
INSERT INTO `employee` VALUES ('4', '何力', 'heli@163.com', '1', '市场部', '1999-08-04');
INSERT INTO `employee` VALUES ('5', '刘火', 'nikuvituzu@2emailock.com', '0', '信息化部', '2006-11-18');
INSERT INTO `employee` VALUES ('7', '马田', 'nikuvituzu@2emailock.com', '1', '网络部', '2006-11-21');
INSERT INTO `employee` VALUES ('8', '李乐', '666@qq.com', '1', '信息化部', '2006-11-21');
INSERT INTO `employee` VALUES ('9', '王宇', 'nikuvituzu@2emailock.com', '0', '网络部', '2006-11-21');
INSERT INTO `employee` VALUES ('10', 'E-B', 'wangyu@qq.com', '1', '保卫部', '2006-11-21');
INSERT INTO `employee` VALUES ('11', '防火阀', 'fhf@163.com', '1', '保卫部', '2006-11-21');
INSERT INTO `employee` VALUES ('12', '黄涛书', 'htshu@qq.com', '1', '网络部', '2006-11-21');
INSERT INTO `employee` VALUES ('13', '666', '666@qq.com', '1', '保卫部', '2006-11-21');
INSERT INTO `employee` VALUES ('14', 'ming', '666@qq.com', '1', '市场部', '2006-11-21');

-- ----------------------------
-- Table structure for loginnum
-- ----------------------------
DROP TABLE IF EXISTS `loginnum`;
CREATE TABLE `loginnum` (
  `id` int(10) NOT NULL,
  `num` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loginnum
-- ----------------------------
INSERT INTO `loginnum` VALUES ('1', '52');
INSERT INTO `loginnum` VALUES ('2', '18');
INSERT INTO `loginnum` VALUES ('3', '14');
INSERT INTO `loginnum` VALUES ('4', '35');
INSERT INTO `loginnum` VALUES ('5', '9');
INSERT INTO `loginnum` VALUES ('6', '0');
INSERT INTO `loginnum` VALUES ('7', '0');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(36) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(36) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '111');
INSERT INTO `user` VALUES ('2', 'root', '222');
INSERT INTO `user` VALUES ('3', 'whui', 'aaa');
