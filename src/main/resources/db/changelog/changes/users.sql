--liquibase formatted sql

--changeset mikelevin:USERS_create
create table if not exists booking.users(
id INT(11) NOT NULL AUTO_INCREMENT,
name varchar(100) DEFAULT NULL,
surname varchar(100) DEFAULT NULL,
birth_date date,
PRIMARY KEY(id)
)ENGINE=InnoDB CHARSET=latin1;
