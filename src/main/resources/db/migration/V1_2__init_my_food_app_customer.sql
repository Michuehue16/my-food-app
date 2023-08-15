create table customer
(
    customer_id serial      not null,
    name        varchar(32) not null,
    surname     varchar(32) not null,
    email       varchar(40) not null,
    phone       varchar(32) not null,
    is_adult    boolean     not null,
    address_id  int         not null,
    primary key (customer_id),
    unique (email),
    constraint fk_customer_address
        foreign key (address_id)
            references address (address_id)
);