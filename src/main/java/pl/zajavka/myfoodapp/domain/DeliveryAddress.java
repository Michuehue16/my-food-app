package pl.zajavka.myfoodapp.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "deliveryAddressId")
@ToString(of = {"deliveryAddressId", "street"})
public class DeliveryAddress {

    Integer deliveryAddressId;
    String street;
    Restaurant restaurant;
}
