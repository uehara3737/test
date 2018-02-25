set names utf8;
set foreign_key_checks=0;

drop database if exists userdb;
create database userdb;
use userdb;

create table user_info(
id int primary key auto_increment,
user_id varchar(10),
user_id1 varchar(10),
user_name varchar(20),
user_password varchar(11),
user_mail varchar(60),
user_yubin varchar(10),
user_yubin1 varchar(10),
user_jusyo varchar(30),
user_tel varchar(12),
user_year varchar(5),
user_month varchar(5),
user_day varchar(5),
insert_date date);

create table user_toiawase(
user_text varchar(255));


insert into user_info (user_id,user_name,user_password)value("上原","sanae","1234");
insert into user_info(user_id,user_name,user_password)value("須藤","yuka","1234");
insert into user_info(user_id,user_name,user_password)value("田中","koji","1234");