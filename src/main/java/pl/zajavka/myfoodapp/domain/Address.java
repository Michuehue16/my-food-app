package pl.zajavka.myfoodapp.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "addressId")
@ToString(of = {"addressId", "country", "city", "postalCode", "street"})
public class Address {

    Integer addressId;
    String country;
    String city;
    String postalCode;
    String street;
    Customer customer;
    Restaurant restaurant;
}
