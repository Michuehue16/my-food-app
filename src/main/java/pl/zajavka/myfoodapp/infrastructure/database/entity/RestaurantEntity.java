package pl.zajavka.myfoodapp.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "restaurantId")
@ToString(of = {"restaurantId", "name", "addressId", "foodTypeId", "deliveryAddressId"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "restaurant")
public class RestaurantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    private Integer restaurantId;

    @Column(name = "name")
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private AddressEntity addressId;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_type_id")
    private Set<FoodTypeEntity> foodTypeId;
}
