create table food_type
(
    food_type_id serial      not null,
    name         varchar(32) not null,
    food_name_id int         not null,
    primary key (food_type_id),
    unique (name),
    constraint fk_food_type_food_name
        foreign key (food_name_id)
            references food_name (food_name_id)
);