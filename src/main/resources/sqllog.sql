CREATE
DATABASE IF NOT EXISTS thing_for_design_pattern DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
drop table if exists coupon;
create table coupon
(
    uuid              varchar(32) primary key not null comment '优惠券的uuid',
    create_time       datetime                not null comment '创建时间',
    update_time       datetime                not null comment '修改时间',
    publish_time      datetime default null comment '发布时间',
    publish_begin_num int                     not null comment '最大领取数量',
    publish_left_num  int                     not null comment '剩余数量',
    start_time        datetime                not null comment '优惠券开始时间',
    end_time          datetime                not null comment '优惠券失效时间'
) comment '优惠券母券';

drop table if exists coupon_detail;
create table coupon_detail
(
    uuid          varchar(32) primary key not null comment '优惠券子券uuid',
    parent_uuid   varchar(32)             not null comment '优惠券母券uuid',
    create_time   datetime                not null comment '创建时间',
    update_time   datetime                not null comment '修改时间',
    receiver_uuid varchar(32)             not null comment '领取用户uuid',
    receiver_time datetime                not null comment '领取时间',
    use_state     tinyint                 not null default 0 comment '使用状态 0:未使用 1:已使用'
) comment '优惠券子券';
