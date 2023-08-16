package pl.zajavka.myfoodapp.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "opinionId")
@ToString(exclude = {"customer", "restaurant"})
public class Opinion {

    Integer opinionId;
    Byte stars;
    String comment;
    Customer customer;
    Restaurant restaurant;
}
