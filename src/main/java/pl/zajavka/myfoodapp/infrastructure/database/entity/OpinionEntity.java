package pl.zajavka.myfoodapp.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "opinionId")
@ToString(of = {"opinionId", "customerId", "restaurantId", "stars", "comment"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "opinion")
public class OpinionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "opinion_id")
    private Integer opinionId;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "restaurant_id")
    private Integer restaurantId;

    @Column(name = "stars")
    private Byte stars;

    @Column(name = "comment")
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private CustomerEntity restaurant;
}
