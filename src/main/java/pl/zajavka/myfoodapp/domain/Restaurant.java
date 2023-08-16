package pl.zajavka.myfoodapp.domain;

import lombok.*;
import pl.zajavka.myfoodapp.infrastructure.database.entity.FoodTypeEntity;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "restaurantId")
@ToString(exclude = {"address", "foodType"})
public class Restaurant {

    Integer restaurantId;
    String name;
    Address address;
    Set<FoodTypeEntity> foodType;
}
