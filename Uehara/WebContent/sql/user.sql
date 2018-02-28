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
insert_date date,
insert_time datetime);


create table user_toiawase(
user_text varchar(255));


create table anime_info(
anime_id int,
anime_price int,
anime_kikan int,
anime_title varchar(20),
anime_type varchar(20),
anime_setumei varchar(255),
anime_like varchar(10),
anime_photo varchar(1000),
anime_date date,
anime_update date);

create table anime_rireki(
id int primary key auto_increment,
rireki_id int,
total_price int,
total_kikan int,
pay varchar(30),
rireki_date date,
rireki_update date);






insert into user_info (user_id,user_name,user_password,insert_date)value("UEHARA","sanae","1234","2017-02-26");
insert into user_info(user_id,user_name,user_password,insert_date)value("須藤","yuka","1234","2018-01-26");
insert into user_info(user_id,user_name,user_password,insert_date)value("田中","koji","1234","2016-04-26");


insert into anime_info(anime_id,anime_title,anime_type,anime_setumei,anime_price,anime_date)value(1,"ONEPIECE","冒険アクション、友情","時は大海賊時代！！","150","2018-01-05");
insert into anime_info(anime_id,anime_title,anime_type,anime_setumei,anime_price,anime_date)value(2,"キューティーハニー","セクシー、アクション","こっちをむいてよハニー","200","2017-05-28");
insert into anime_info(anime_id,anime_title,anime_type,anime_setumei,anime_price,anime_date)value(3,"タッチ","スポーツ、競技","あだち充作の野球漫画","100","2017-10-05");
insert into anime_info(anime_id,anime_title,anime_type,anime_setumei,anime_price,anime_date)value(4,"名探偵コナン","推理、恋愛","真実はいつもひとつ","250","2017-12-25");
insert into anime_info(anime_id,anime_title,anime_type,anime_setumei,anime_price,anime_date)value(5,"おそ松さん","コメディ、青春","9人兄弟","50","2017-01-21");
insert into anime_info(anime_id,anime_title,anime_type,anime_setumei,anime_price,anime_date)value(6,"牛島君","サスペンス、推理","闇金のはなし","500","2018-02-06");
insert into anime_info(anime_id,anime_title,anime_type,anime_setumei,anime_price,anime_date)value(7,"ラブライブ","アイドル、萌え","学校存続のためにアイドルになった少女のはなし","200","2018-01-14");
insert into anime_info(anime_id,anime_title,anime_type,anime_setumei,anime_price,anime_date)value(8,"CRAYMORE","冒険、絆","なける","350","2017-03-07");
insert into anime_info(anime_id,anime_title,anime_type,anime_setumei,anime_price,anime_date)value(9,"起動戦士ガンダム","ロボット、アクション","ロボットとアニメといえばこれ","100","2017-06-30");
insert into anime_info(anime_id,anime_title,anime_type,anime_setumei,anime_price,anime_date)value(10,"キングダム","歴史、戦記","下克上","300","2017-05-09");


update anime_info set anime_photo = "https://animeanime.jp/imgs/list_ml/47687.jpg"
where anime_title ="ONEPIECE";

