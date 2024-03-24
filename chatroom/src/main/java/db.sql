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


-- 创建消息表
drop table if exists message;
create table message(
    message_id int primary key auto_increment,
    from_id int not null, -- 消息是哪个用户发的
    session_id int not null, -- 消息发给哪个会话
    content varchar(5000), -- 消息的内容
    post_time datetime default now() -- 消息的发送时间
);

-- mika 和 zhangsan 的对话
insert into message values(1,1,1,"星露谷联机?","2024-03-21 17:00:00");
insert into message values(2,2,1,"来来来!","2024-03-21 17:00:03");
insert into message values(3,1,1,"正好 1.6 更新了!!!","2024-03-21 17:00:07");
insert into message values(4,1,1,"我还没开始玩 1.6 呢","2024-03-21 17:00:12");
insert into message values(5,2,1,"行，那接电话，开麦玩","2024-03-21 17:00:16");
insert into message values(6,1,1,"OK","2024-03-21 17:00:20");


-- mika 和 lisi 的对话
insert into message values(7,1,2,"葬送的芙莉莲完结了，快去看！！！","2024-03-23 18:01:00");
insert into message values(8,3,2,"最近在忙，要学习没空","2024-03-23 18:02:00");
insert into message values(9,1,2,"那就吃饭的时候看呗","2024-03-23 18:02:15");
insert into message values(10,3,2,"忙，没空","2024-03-23 18:03:15");



