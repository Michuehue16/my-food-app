package pl.zajavka.myfoodapp.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "deliveryAddressId")
@ToString(of = {"deliveryAddressId", "street"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "delivery_address")
public class DeliveryAddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_address_id")
    private Integer deliveryAddressId;

    @Column(name = "street")
    private String street;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private RestaurantEntity restaurant;
}
