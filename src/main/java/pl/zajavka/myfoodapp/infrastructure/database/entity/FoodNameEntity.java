package pl.zajavka.myfoodapp.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(of = "foodNameId")
@ToString(of = {"foodNameId", "name", "price", "description"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "food_name")
public class FoodNameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "food_name_id")
    private Integer foodNameId;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_type_id")
    private FoodTypeEntity foodType;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "orders_id")
    private List<OrdersEntity> orders;
}
