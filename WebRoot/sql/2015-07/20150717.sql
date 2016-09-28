----------------------陈秋实脚本开始--------------------------------
DROP TABLE IF EXISTS sys_dispatch_msg ;
CREATE TABLE `sys_dispatch_msg` (
  `id` VARCHAR(36) NOT NULL COMMENT '主键',
  `type` INT(11) NOT NULL COMMENT '类型',
  `code` VARCHAR(255) NOT NULL COMMENT '编码',
  `msg` LONGTEXT COMMENT '处理或者响应内容',
  `exeNum` INT(11) NOT NULL COMMENT '可执行次数',
  `status` INT(11) NOT NULL COMMENT '状态',
  `lastUdpTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `createdTime` DATETIME DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='处理后响应信息';

DROP TABLE IF EXISTS sys_receive_msg ;
CREATE TABLE `sys_receive_msg` (
  `id` VARCHAR(36) NOT NULL COMMENT '主键',
  `type` INT(11) NOT NULL COMMENT '类型',
  `code` VARCHAR(255) NOT NULL COMMENT '编码',
  `msg` LONGTEXT COMMENT '接受信息内容',
  `exeNum` INT(11) NOT NULL COMMENT '可执行次数',
  `status` INT(11) NOT NULL COMMENT '状态',
  `lastUdpTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `createdTime` DATETIME DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='处理前接受信息'
----------------------陈秋实脚本结束--------------------------------

