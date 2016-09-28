----------建表语句开始----------
create table mb_sign
(
   id                   char(32) not null,
   vechicle_num         varchar(20) comment '车牌号(必要的冗余字段)',
   presented_time       datetime comment '到场时间',
   created_time         timestamp comment '创建时间',
   last_udp_time        datetime comment '修改时间',
   driver_name          varchar(48) comment '司机姓名',
   driver_mobile        varchar(128) comment '手机号码',
   warehouse            char(32) comment '签到仓库',
   primary key (id)
);

alter table mb_sign comment '签到表';



create table mb_shopper_info
(
   id                   char(32),
   code                 varchar(32) comment '编号',
   name                 varchar(256) comment '公司名称',
   address              varchar(256) comment '公司地址',
   primary key (ID)
);

alter table mb_shopper_info comment '承运商';


create table mb_driver_info
(
   ID                   char(32) not null,
   name                 varchar(64) comment '姓名',
   mobile               varchar(11) comment '手机号码',
   password             varchar(20) comment '密码',
   vehicle_num          char(32) comment '车牌号',
   vehicle_type         varchar(20) comment '车型',
   company              varchar(128) comment '所属公司',
   created_time         datetime comment '创建时间',
   last_udp_time        datetime comment '修改时间',
   origin_app           varchar(20) comment '数据来源（分为：WEB、IOS、ANDROID）',
   created_by           char(32) comment '创建人',
   last_udp_by          char(32) comment '修改人',
   deleted_flag         int(2) comment '删除标志(1为已删除；0为未删除)',
   primary key (ID)
);

alter table mb_driver_info comment '司机业务信息表';


create table mb_keeper_info
(
   ID                   char(32) not null,
   name                 varchar(64) comment '姓名',
   mobile               varchar(11) comment '手机号码',
   password             varchar(20) comment '密码',
   warehouse            char(32) comment '所属仓库',
   created_time         datetime comment '创建时间',
   last_udp_time        datetime comment '修改时间',
   origin_app           varchar(20) comment '数据来源（分为：WEB、IOS、ANDROID）',
   created_by           char(32) comment '创建人',
   last_udp_by          char(32) comment '修改人',
   deleted_flag         int(2) comment '删除标志(1为已删除；0为未删除)',
   primary key (ID)
);

alter table mb_keeper_info comment '仓管业务信息表';

create table mb_dispatch_service
(
   id                   char(32) not null,
   health_picture_url   varchar(256) comment '车厢卫生情况图片',
   temperature_picture_url varchar(256) comment '车厢温度图片',
   inspection_desc      varchar(512) comment '车辆检查情况描述',
   is_condition_qualified int(2) comment '车况是否合格（1为合格；0为不合格）',
   is_health_qualified  int(2) comment '车辆卫生是否合格（1为合格；0为不合格）',
   start_load_time      datetime comment '开始装车时间',
   end_load_time        datetime comment '结束装车时间',
   goods_display_url    varchar(256) comment '货物摆放情况图片',
   goods_teperature_url varchar(256) comment '车厢温度情况图片',
   is_display_qualified int(2) comment '车内货物是否摆放合格',
   is_temperatrue_qualified int(2) comment '车内温度合格',
   cold_time            decimal(12,2) comment '打冷用时',
   car_condition_desc   varchar(20) comment '车况检查情况',
   is_registration_inspection int(2) comment '仓库是否已登记检查（1为是，0为否）',
   is_seal              int(2) comment '是否铅封（1为是，0为否）',
   seal_picture_url     varchar(256) comment '车铅封图片',
   seal_teperature_url  varchar(256) comment '车内温度图片',
   departure_time       datetime comment '发车时间',
   load_check_time      datetime comment '装车检查时间',
   driver_mobile        char(32) comment '司机号码',
   primary key (id)
);

alter table mb_dispatch_service comment '调度单业务表';


create table mb_dispatch_info
(
   id                   char(32) not null,
   created_time         datetime comment '创建时间',
   last_udp_time        timestamp comment '修改时间',
   created_by           char(32) comment '创建人',
   last_udp_by          char(32) comment '修改人',
   origin_app           varchar(20) comment '数据来源（分为：WEB、IOS、ANDROID、BOKE（订单系统）、或者第三方系统数据（具体待定））',
   dispatch_num         varchar(32) comment '调度单号',
   number               bigint(64) comment '物料数量',
   status               int(5) comment '状态(1为开始到场检查；2为到场检查结束；3为开始装车检查；4为结束装车检查；5为发车检查；6确认发车；7为在途；8卸货到达；9开始卸货；10卸货完成；11签收确认；12回

单上传)',
   vehicle_num          varchar(10) comment '车牌号',
   arrival_time         datetime comment '计划车辆到达时间',
   vehicle_type         varchar(64) comment '车型',
   scheduling_type      varchar(10) comment '调度类型',
   warehouse            char(32) comment '发货仓库',
   primary_driver       varchar(32) comment '主驾驶姓名',
   primary_driver_mobile varchar(32) comment '主驾驶手机号码',
   copilot_mobile       varchar(23) comment '副驾驶手机号码',
   copilot_name         varchar(46) comment '副驾驶姓名',
   departure            varchar(128) comment '始发地',
   destination          varchar(128) comment '目的地',
   dispatch_time        datetime comment '派车时间',
   carrier              varchar(32) comment '承运商',
   primary key (id)
);

alter table mb_dispatch_info comment '调度单';


create table mb_order_info
(
   id                   char(32),
   order_num            varchar(128) comment '订单编号',
   seout_address        varchar(256) comment '出发地详细地址',
   setout_city          varchar(128) comment '出发城市',
   arrive_city          varchar(128) comment '到达城市',
   arrive_address       varchar(256) comment '到达地详细地址',
   receiver_name        varchar(256) comment '收货人姓名',
   receiver_mobile      varchar(256) comment '收货人手机号码',
   order_type           varchar(128) comment '订单类型',
   owner_name           varchar(256) comment '货主',
   warehouse            char(32) comment '发货仓库',
   total_num            bigint(15) comment '总件数',
   total_volume         decimal(20,5) comment '总体积',
   receiving_unit       varchar(256) comment '收货单位',
   origin_app           varchar(20) comment '数据来源（分为：WEB、IOS、ANDROID、BOKE（订单系统）、或者第三方系统数据（具体待定））',
   earliest_delivery_time datetime comment '最早发货时间',
   late_delivery_time   datetime comment '最晚发货时间',
   earliest_arrival_time datetime comment '最早到货时间',
   late_arrival_time    datetime comment '最晚到货时间',
   created_time         datetime comment '创建时间',
   created_by           char(32) comment '创建人',
   primary key (id)
);

alter table mb_order_info comment '订单信息';


create table mb_task_info
(
   id                   char(32) not null,
   mb__id               char(32),
   created_time         datetime comment '创建时间',
   last_udp_time        datetime comment '修改时间',
   created_by           char(32) comment '创建人',
   last_udp_by          char(32) comment '修改人',
   origin_app           varchar(20) comment '数据来源（分为：WEB、IOS、ANDROID、BOKE（订单系统）、或者第三方系统数据（具体待定））',
   order_num            varchar(128) comment '订单编号',
   dispatch_id          char(32) comment '调度单ID',
   customer_name        varchar(128) comment '客户名称',
   vehicle_num          varchar(10) comment '车牌号',
   customer_mobile      varchar(15) comment '客户手机号码',
   status               int(5) comment '状态(0为初始状态；5为发车检查；6确认发车；8卸货到达；9开始卸货；10卸货完成；11签收确认；12回单上传）',
   seout_address        varchar(256) comment '出发地详细地址',
   setout_city          varchar(128) comment '出发城市',
   arrive_city          varchar(128) comment '到达城市',
   arrive_address       varchar(256) comment '到达地详细地址',
   receiver_name        varchar(256) comment '收货人姓名',
   receiver_mobile      varchar(256) comment '收货人手机号码',
   total_num            bigint(15) comment '总件数',
   total_volume         decimal(20,5) comment '总体积',
   primary key (id)
);

alter table mb_task_info comment '作业单';


create table mb_task_service
(
   id                   char(32) not null,
   arrivaling_remind_num bigint(20) comment '即将到货提醒次数',
   arrivaling_remind_time datetime comment '最后一次即将到货提醒时间',
   start_unloading_time datetime comment '开始卸货时间',
   end_unloading_time   datetime comment '结束卸货时间',
   loading_time         datetime comment '装车时间',
   arrivaled_remind_num bigint(20) comment '到货提醒次数',
   arrivaled_remind_time datetime comment '最后一次到货提醒时',
   is_less_goods        int(2) comment '是否货物少货(1为是，0为否)',
   is_damaged           int(2) comment '是否货物缺损(1为是，0为否)',
   is_rejection         int(2) comment '货物是否拒收(1为是，0为否)',
   is_receipt           int(2) comment '是否取得回单(1为是，0为否)',
   without_receipt_reson varchar(512) comment '未取得回单原因',
   receipt              varchar(512) comment '回单图片',
   sign_time            datetime comment '签收时间',
   upload_receipt_time  datetime comment '上传回单时间',
   primary key (id)
);

alter table mb_task_service comment '作业单业务信息表';

create table mb_order_detail
(
   id                   char(32) not null,
   order_num            varchar(128) comment '订单编号',
   material_name        varchar(256) comment '物料名称',
   quantity             bigint(32) comment '物料数量',
   material_code        varchar(128) comment '物料代码',
   origin_app           varchar(20) comment '数据来源（分为：WEB、IOS、ANDROID、BOKE（订单系统）、或者第三方系统数据（具体待定））',
   created_time         datetime comment '创建时间',
   created_by           char(32) comment '创建人',
   primary key (id)
);

alter table mb_order_detail comment '订单明细';

create table mb_task_detail
(
   id                   char(32) not null,
   task_id              varchar(128) comment '作业单ID',
   material_name        varchar(256) comment '物料名称',
   quantity             bigint(32) comment '物料数量',
   material_code        varchar(128) comment '物料代码',
   origin_app           varchar(20) comment '数据来源（分为：WEB、IOS、ANDROID、BOKE（订单系统）、或者第三方系统数据（具体待定））',
   created_time         datetime comment '创建时间',
   created_by           char(32) comment '创建人',
   primary key (id)
);

alter table mb_task_detail comment '作业单明细';
----------建表语句结束----------

--查询调度单SQL语句---

select di.DH_DISPATCH_NO 调度单号,list.name 车牌号, di.DH_DISPATCH_DATETIME 汽车时间, di.yjcldcsj 预计车辆到达时间, truck.name 车型, ark.name 始发地, 
ard.name 目的地, bu.name 承运商 from TM_DISPATCH_H di
left join CP_TruckType truck on di.CX = truck.id
left join LS_TruckList list on list.id = di.DH_TRUCK_ID
left join CP_LogisticsNodes ark  on di.DH_START_AREA_ID = ark.id
left join CP_LogisticsNodes ard on di.Dh_End_Area_Id = ard.id
left join CP_BusinessEnterprise bu on di.DH_CARRIER_ID = bu.id
where di.dh_truck_id != -1 and di.Status != 10
--查询作业单SQL语句---

select bu.name 客户名称, tm.Clh_Consigner_No 订单号,tm.Clh_Load_Address 出发地详细地址, tm. CLH_UNLOAD_ADDRESS 到达地详细地址,
 tm.CLH_UNLOAD_CONTACT 收货人姓名, tm.Clh_Unload_Tel 收货人手机号码, tm.CLH_TOTAL_PACKS 总件数, tm.Clh_Total_Cubage 总体积
 ,ark.name 出发城市, ard.name 到达城市 from 	TM_CARGO_LOAD_H tm 
left join CP_LogisticsNodes ark  on tm.CLH_LOAD_AREA_ID = ark.id
left join CP_LogisticsNodes ard on tm.Clh_Unload_Area_Id = ard.id
left join CP_BusinessEnterprise bu on tm.CLH_CONSIGNER_ID = bu.id

---查询作业单物料明细SQL语句---
select  CLL_MATERIAL_CODE 物料代码, CLL_MATERIAL_NAME 物料名称, CLL_CONSIGN_QTY 物料数量 from 	TM_CARGO_LOAD_L

---查询订单SQL语句-------
select h.LOH_OWNER_NO 订单号, tms.name 配送方式,ark.name 出发城市, ard.name 到达城市 ,
h.LOH_UNLOAD_ADDRESS 收获地址, h.LOH_UNLOAD_CONTACT, h.LOH_UNLOAD_TEL 电话号码, 
h.LOH_LOAD_ADDRESS 出发地址, h.zongzhengjianshu 总件数, h.LOH_TOTAL_CUBAGE 总体积, h.LOH_EXPECT_UNLOAD_DATETIME 最早应发货日期时间
,h.LOH_EXPECT_LOAD_DATETIME_U 最晚应发货日期时间, h.LOH_EXPECT_UNLOAD_DATETIME 最早应到货日期时间,
h.LOH_EXPECT_UNLOAD_DATETIME_U 最晚应到货日期时间, bu.name 货主 from 	OM_LOGISTICS_ORDER_H h
left join CP_TMS_DeliveryMode tms on tms.id = h.LOH_DeliveryModeID
left join CP_LogisticsNodes ark  on h.LOH_LOAD_AREA_ID = ark.id
left join CP_LogisticsNodes ard on h.LOH_UNLOAD_AREA_ID = ard.id
left join CP_BusinessEnterprise bu on h.LOH_OWNER_ID = bu.id

---查询订单物料明细SQL语句 ---
 select LOL_MATERIAL_CODE 物料代码, LOL_MATERIAL_NAME 物料名称, LOL_EXPECT_QTY 计划数量 from OM_LOGISTICS_ORDER_L  where LOL_MATERIAL_CODE is not null;


