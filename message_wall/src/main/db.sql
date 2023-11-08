create database if not exists message_wall charset utf8;

use message_wall;

-- 删表目的是为了，防止之前数据库里有一样的表，对咱们的代码产生干扰
drop table if exists message;
create table message (`from` varchar(1024),`to` varchar(1024),message varchar(1024));
