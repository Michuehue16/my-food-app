package pl.zajavka.myfoodapp.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(of = "foodTypeId")
@ToString(of = {"name"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "food_type")
public class FoodTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "food_type_id")
    private Integer foodTypeId;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_name_id")
    private List<FoodNameEntity> foodName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private RestaurantEntity restaurant;
}
