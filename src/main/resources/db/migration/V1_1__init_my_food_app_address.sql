create table address
(
    address_id  serial      not null,
    country     varchar(32) not null,
    city        varchar(40) not null,
    postal_code varchar(10) not null,
    street      varchar(64) not null,
    primary key (address_id)
);