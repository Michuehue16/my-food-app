package pl.zajavka.myfoodapp.domain;

import lombok.*;

import java.util.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "customerId")
@ToString(of = {"customerId", "name", "surname", "email", "phone"})
public class Customer {

    Integer customerId;
    String name;
    String surname;
    String email;
    String phone;
    Boolean isAdult;
    Address address;
    Set<Orders> orders;
    List<Opinion> opinions;

    public Set<Orders> getOrders() {
        return Objects.isNull(orders) ? new HashSet<>() : orders;
    }

    public List<Opinion> getOpinions() {
        return Objects.isNull(opinions) ? new ArrayList<>() : opinions;
    }
}
