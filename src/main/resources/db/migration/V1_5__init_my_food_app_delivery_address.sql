create table delivery_address
(
    delivery_address_id serial      not null,
    street              varchar(64) not null,
    primary key (delivery_address_id)
);