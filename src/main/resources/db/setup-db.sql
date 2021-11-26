create database ewearsdb;

create user 'wearuser'@'localhost'identified by 'user10';
grant all privileges on ewearsdb.* to 'wearuser'@'localhost';
flush privileges;