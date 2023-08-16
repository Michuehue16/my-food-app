package pl.zajavka.myfoodapp.domain;

import lombok.*;

import java.util.List;

@With
@Value
@Builder
@EqualsAndHashCode(of = "foodTypeId")
@ToString(exclude = {"foodName", "restaurant"})
public class FoodType {

    Integer foodTypeId;
    String name;
    List<FoodName> foodName;
    Restaurant restaurant;

}
