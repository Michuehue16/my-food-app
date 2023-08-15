create table delivery_address
(
    delivery_address_id serial      not null,
    city                varhcar(32) not null,
    postal_code         varhcar(10) not null,
    street              varchar(64) not null,
    primary key (delivery_address_id)
);