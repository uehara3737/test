
drop database if exists testdb;
create database testdb;
use testdb;

create table users(
userid int primary key auto_increment,
username varchar(255),
password varchar(255));

insert into users values(1,"taro","123");
insert into users values(2,"jiro","456");
insert into users values(3,"hanako","789");


create table inquiry(
name varchar(255),
qtype varchar(255),
body varchar(255));

