package pl.zajavka.myfoodapp.business;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.zajavka.myfoodapp.business.dao.CustomerDao;
import pl.zajavka.myfoodapp.domain.Customer;
import pl.zajavka.myfoodapp.domain.Orders;
import pl.zajavka.myfoodapp.domain.exception.NotFoundException;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerDao customerDao;

    @Transactional
    public Customer findCustomer(String email) {
        Optional<Customer> customer = customerDao.findByEmail(email);
        if (customer.isEmpty()) {
            throw new NotFoundException("Could not find customer by email: %s".formatted(email));
        }
        return customer.get();
    }

    @Transactional
    public Customer saveCustomer(Customer customer) {
        return customerDao.saveCustomer(customer);
    }

    // TODO finish customer service class and do the same with others

    @Transactional
    public void makeOrders(Customer customer) {
        customerDao.makeOrders(customer);
    }
}
