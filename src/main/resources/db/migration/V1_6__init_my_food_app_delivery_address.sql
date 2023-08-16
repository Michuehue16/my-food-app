create table delivery_address
(
    delivery_address_id serial      not null,
    street              varchar(64) not null,
    restaurant_id       int         not null,
    primary key (delivery_address_id),
    constraint fk_delivery_address_restaurant
        foreign key (restaurant_id)
            references restaurant (restaurant_id)
);