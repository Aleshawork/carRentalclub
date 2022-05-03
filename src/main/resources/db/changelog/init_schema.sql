create sequence if not exists hibernate_sequence start 1 increment 1;

create table if not exists leaser (
    id int4 not null,
    driving_rate int4,
    email varchar(255),
    full_name varchar(255),
    telephone varchar(255),
    username varchar(255),
    password varchar(255),
    primary key (id)
    );

create table if not exists car (
    id int4 not null,
    color varchar(255),
    mark varchar(255),
    number varchar(255),
    price float8,
    type_of_car varchar(255),
    year int4,
    primary key (id)
    );

create table  if not exists feed_back (
    id int4 not null,
    answer varchar(255),
    data_open timestamp,
    question varchar(255),
    car_id int4,
    user_id int4,
    primary key (id)
    );
alter table if exists feed_back add constraint car_id_feed_fk foreign key (car_id) references car;
alter table if exists feed_back add constraint user_id_feed_fk foreign key (user_id) references leaser;

create table if not exists general (
    question varchar(255) not null,
    data_open timestamp,
    type varchar(255),
    primary key (question)
    );


create table if not exists rent (
    id int4 not null,
    data_end timestamp,
    data_start timestamp,
    number_document int4,
    car_id int4,
    user_id int4,
    primary key (id)
    );
alter table if exists rent add constraint car_id_rent_fk foreign key (car_id) references car;
alter table if exists rent add constraint user_id_rent_fk foreign key (user_id) references leaser;

create table if not exists top_of_cars (
    id int4 not null,
    data_of_like timestamp,
    car_id int4, user_id int4,
    primary key (id)
    );
alter table if exists top_of_cars add constraint car_id_top_fk foreign key (car_id) references car;
alter table if exists top_of_cars add constraint user_id_Top_fk foreign key (user_id) references leaser;

create table user_role (
    user_id int8 not null,
    roles varchar(255)
    );

alter table if exists user_role add constraint user_role_user_fk foreign key (user_id) references leaser;