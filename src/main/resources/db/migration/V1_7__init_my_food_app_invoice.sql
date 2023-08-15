create table invoice
(
    invoice_id    serial                   not null,
    serial_number varchar(32)              not null,
    date_time     timestamp with time zone not null,
    food_name_id  int                      not null,
    customer_id   int                      not null,
    restaurant_id int                      not null,
    primary key (invoice_id),
    unique (invoice_number),
    constraint fk_invoice_food_name
        foreign key (food_name_id)
            references food_name (food_name_id),
    constraint fk_invoice_customer
        foreign key (customer_id)
            references customer (customer_id),
    constraint fk_invoice_restaurant
        foreign key (restaurant_id)
            references restaurant (restaurant_id)
);