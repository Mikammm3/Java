create database if not exists chat_room charset utf8;

use chat_room;

drop table if exists user;
create table user(
    userId int primary key auto_increment,
    user_name varchar(20) unique,
    password varchar(50)
);

insert into user(user_name,password) values("mika","123");
insert into user(user_name,password) values("zhangsan","123");
insert into user(user_name,password) values("lisi","123");