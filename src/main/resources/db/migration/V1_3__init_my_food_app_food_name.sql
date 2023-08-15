create table food_name
(
    food_name_id serial        not null,
    name         varchar(32)   not null,
    price        numeric(5, 2) not null,
    description  varchar(100)  not null,
    primary key (food_name_id)
);