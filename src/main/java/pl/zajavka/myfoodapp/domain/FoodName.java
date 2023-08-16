package pl.zajavka.myfoodapp.domain;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@With
@Value
@Builder
@EqualsAndHashCode(of = "foodNameId")
@ToString(exclude = {"foodType", "orders"})
public class FoodName {

    Integer foodNameId;
    String name;
    BigDecimal price;
    String description;
    FoodType foodType;
    List<Orders> orders;
}
