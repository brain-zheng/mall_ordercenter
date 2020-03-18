-- 账号表
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
	`id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户id',
	`username` varchar(30) NOT NULL DEFAULT '' COMMENT '用户名',
	`password` varchar(32) NOT NULL DEFAULT '' COMMENT '密码',
	`email` varchar(30) NOT NULL DEFAULT '' COMMENT '邮箱',
  `phone` varchar(15) NOT NULL DEFAULT '' COMMENT '手机号',
	`status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '状态 1:enable, 0:disable, -1:deleted',
	`feature` varchar(2048) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '扩展字段',
	`create_time` datetime NOT NULL COMMENT '创建时间',
	`update_time` datetime NOT NULL COMMENT '更新时间',
	PRIMARY KEY (`id`),
	KEY `idx_username` (`username`),
	KEY `idx_email` (`email`),
	KEY `idx_phone` (`phone`)
)ENGINE=INNODB CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT '账户表,注册登录信息';

-- 用户信息表
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
	`id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增id',
	`uid` bigint(20) UNSIGNED NOT NULL COMMENT '用户id',
	`nickname` varchar(30) NOT NULL DEFAULT '' COMMENT '用户昵称',
	`head` varchar(255) NOT NULL DEFAULT '' COMMENT '头像',
	`gender` varchar(10) NOT NULL DEFAULT 'unknown' COMMENT '性别',
	`role` TINYINT(1) UNSIGNED NOT NULL DEFAULT '0' COMMENT '角色 0:普通用户 1:vip',
	`birthday` date DEFAULT NULL COMMENT '生日',
	`signature` varchar(200) NOT NULL DEFAULT '' COMMENT '签名',
	`feature` varchar(2048) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '扩展字段',
	`create_time` datetime NOT NULL COMMENT '创建时间',
	`update_time` datetime NOT NULL COMMENT '更新时间',
	PRIMARY KEY (`id`),
	KEY `idx_uid` (`uid`)
)ENGINE=INNODB CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT '用户信息表';

-- 收货地址表
DROP TABLE IF EXISTS `receive_address`;
CREATE TABLE `receive_address` (
	`id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增id',
	`uid` BIGINT(20) UNSIGNED NOT NULL COMMENT '用户id',
	`name` varchar(10) NOT NULL COMMENT '收货姓名',
	`phone` varchar(20) NOT NULL  COMMENT '联系电话',
	`province` varchar(20) NOT NULL COMMENT '所在省份',
	`city` varchar(20) NOT NULL COMMENT '所在城市',
	`region` varchar(20) NOT NULL COMMENT '所在地区',
	`detail_address` varchar(100) NOT NULL COMMENT '详细地址',
	`feature` varchar(2048) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '扩展字段',
	`create_time` datetime NOT NULL COMMENT '创建时间',
	`update_time` datetime NOT NULL COMMENT '更新时间',
	PRIMARY KEY (`id`),
	KEY `idx_uid` (`uid`)
)ENGINE=INNODB CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT '收货地址表';