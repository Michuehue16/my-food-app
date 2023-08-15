package pl.zajavka.myfoodapp.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "ordersId")
@ToString(of = {"ordersId", "ordersNumber", "isDone", "restaurantId", "customerId", "foodNameId"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class OrdersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orders_id")
    private Integer ordersId;

    @Column(name = "orders_number")
    private String ordersNumber;

    @Column(name = "is_done")
    private String isDone;

    @Column(name = "restaurant_id")
    private Integer restaurantId;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "food_name_id")
    private Integer foodNameId;
}
