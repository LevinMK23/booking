--liquibase formatted sql

--changeset mikelevin:USER-INFO-create
create table if not exists user_info
(
    user_id serial,
    name varchar not null,
    surname varchar not null,
    birth_date varchar not null,
    login varchar,
    password varchar
);

create unique index user_info_user_id_uindex
    on user_info (user_id);

alter table user_info
    add constraint user_info_pk
        primary key (user_id);

comment on table user_info is 'Таблица пользователей';
comment on column user_info.user_id is 'id пользователя';
comment on column user_info.name is 'имя пользователя';
comment on column user_info.surname is 'Фамилия';
comment on column user_info.birth_date is 'дата рождения';
