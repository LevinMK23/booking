--liquibase formatted sql

--changeset mikelevin:USERS_SECRETS_create-1
create table if not exists BOOKING.USERS_SECRETS
(
    id       INT(11)      NOT NULL AUTO_INCREMENT,
    user_id  INT(11),
    login    varchar(100) NOT NULL,
    password varchar(100) NOT NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB
  CHARSET = latin1;

--changeset mikelevin:USERS_fk
alter table users_secrets
    add constraint users_secrets_users_id_fk
        foreign key (user_id) references users (id);

--changeset mikelevin:auth
alter table BOOKING.users
    add auth int(2) default 0 null;