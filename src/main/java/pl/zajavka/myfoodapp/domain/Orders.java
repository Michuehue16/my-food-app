package pl.zajavka.myfoodapp.domain;

import lombok.*;
import pl.zajavka.myfoodapp.infrastructure.database.entity.FoodNameEntity;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "ordersId")
@ToString(exclude = {"restaurant", "customer", "foodName", "deliveryAddress"})
public class Orders {

    Integer ordersId;
    String ordersNumber;
    String isDone;
    Restaurant restaurant;
    Customer customer;
    Set<FoodNameEntity> foodName;
    DeliveryAddress deliveryAddress;
}
