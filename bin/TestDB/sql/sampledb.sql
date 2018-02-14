drop database if exists sampledb;
create database sampledb;
use sampledb;

create table test_table(
user_id int,
user_name varchar(255),
password varchar(255)
);

insert into test_table values(1,"taro","123");
insert into test_table values(2,"jiro","456");
insert into test_table values(3,"hanako","789");