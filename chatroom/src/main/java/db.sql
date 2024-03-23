create database if not exists chat_room charset utf8;

use chat_room;

drop table if exists user;
create table user(
    user_id int primary key auto_increment,
    user_name varchar(20) unique,
    password varchar(50)
);

insert into user(user_name,password) values("mika","123");
insert into user(user_name,password) values("zhangsan","123");
insert into user(user_name,password) values("lisi","123");
insert into user(user_name,password) values("wangwu","123");



-- 创建好友表
drop table if exists friend;
create table friend (
    user_id int,
    friend_id int
);

insert into friend values(1, 2);
insert into friend values(2, 1);
insert into friend values(1, 3);
insert into friend values(3, 1);
insert into friend values(1, 4);
insert into friend values(4, 1);



-- 创建会话表
drop table if exists message_session;
create table message_session(
    session_id int primary key auto_increment,
    last_time datetime DEFAULT now()
);
insert into message_session values(1, '2000-05-01 00:00:00');
insert into message_session values(2, '2000-06-01 00:00:00');

-- 创建会话和用户的关联表
drop table if exists message_session_user;
create table message_session_user(
    session_id int ,
    user_id int
);

-- 1 号会话里有张三和 mika
insert into message_session_user values(1, 1), (1, 2);
-- 2 号会话里有李四和 mika
insert into message_session_user values(2, 1), (2, 3);