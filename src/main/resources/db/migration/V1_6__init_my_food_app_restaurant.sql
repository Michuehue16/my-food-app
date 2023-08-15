create table restaurant
(
    restaurant_id       serial      not null,
    name                varchar(32) not null,
    address_id          int         not null,
    food_type_id        int         not null,
    delivery_address_id int         not null,
    primary key (restaurant_id),
    unique (name),
    constraint k_restaurant_address
        foreign key (address_id)
            references address (address_id),
    constraint fk_restaurant_food_type
        foreign key (food_type_id)
            references food_type (food_type_id),
    constraint fk_restaurant_delivery_address
        foreign key (delivery_address_id)
            references delivery_address (delivery_address_id)

);