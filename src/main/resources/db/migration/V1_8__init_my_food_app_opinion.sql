create table opinion
(
    opinion_id    serial                               not null,
    customer_id   int                                  not null,
    restaurant_id int                                  not null,
    stars         INT CHECK (stars IN (1, 2, 3, 4, 5)) not null,
    comment       varchar(160)                         not null,
    primary key (opinion_id),
    constraint fk_opinion_customer
        foreign key (customer_id)
            references customer (customer_id),
    constraint fk_opinion_restaurant
        foreign key (restaurant_id)
            references restaurant (restaurant_id)
);