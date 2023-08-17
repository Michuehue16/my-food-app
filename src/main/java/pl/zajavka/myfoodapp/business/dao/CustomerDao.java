package pl.zajavka.myfoodapp.business.dao;

import pl.zajavka.myfoodapp.domain.Customer;

import java.util.Optional;

public interface CustomerDao {
    Optional<Customer> findByEmail(String email);

    Customer saveCustomer(Customer customer);

    void makeOrders(Customer customer);

}
