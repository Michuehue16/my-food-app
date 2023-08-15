create table orders
(
    orders_id     serial      not null,
    orders_number varchar(64) not null,
    is_done       varchar(32) not null,
    restaurant_id int         not null,
    customer_id   int         not null,
    food_name_id  int         not null,
    primary key (orders_id),
    unique (orders_number),
    constraint fk_orders_restaurant
        foreign key (restaurant_id)
            references restaurant (restaurant_id),
    constraint fk_orders_customer
        foreign key (customer_id)
            references customer (customer_id),
    constraint fk_orders_food_name
        foreign key (food_name_id)
            references food_name (food_name_id)
);