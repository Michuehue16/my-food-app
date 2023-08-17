package pl.zajavka.myfoodapp.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.zajavka.myfoodapp.business.dao.CustomerDao;
import pl.zajavka.myfoodapp.domain.Customer;
import pl.zajavka.myfoodapp.infrastructure.database.entity.CustomerEntity;
import pl.zajavka.myfoodapp.infrastructure.database.repository.jpa.CustomerJpaRepository;
import pl.zajavka.myfoodapp.infrastructure.database.repository.jpa.OpinionJpaRepository;
import pl.zajavka.myfoodapp.infrastructure.database.repository.jpa.OrdersJpaRepository;
import pl.zajavka.myfoodapp.infrastructure.database.repository.mapper.CustomerEntityMapper;
import pl.zajavka.myfoodapp.infrastructure.database.repository.mapper.OpinionEntityMapper;
import pl.zajavka.myfoodapp.infrastructure.database.repository.mapper.OrdersEntityMapper;

import java.util.Objects;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class CustomerRepository implements CustomerDao {

    private final CustomerJpaRepository customerJpaRepository;
    private final OrdersJpaRepository ordersJpaRepository;

    private final CustomerEntityMapper customerEntityMapper;
    private final OrdersEntityMapper ordersEntityMapper;

    @Override
    public Optional<Customer> findByEmail(String email) {
        return customerJpaRepository.findByEmail(email)
                .map(customerEntityMapper::mapFromEntity);
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        CustomerEntity toSave = customerEntityMapper.mapToEntity(customer);
        CustomerEntity saved = customerJpaRepository.save(toSave);
        return customerEntityMapper.mapFromEntity(saved);
    }

    @Override
    public void makeOrders(Customer customer) {
        CustomerEntity customerToSave = customerEntityMapper.mapToEntity(customer);
        CustomerEntity customerSaved = customerJpaRepository.saveAndFlush(customerToSave);

        customer.getOrders().stream()
                .filter(orders -> Objects.isNull(orders.getOrdersId()))
                .map(ordersEntityMapper::mapToEntity)
                .forEach(ordersEntity -> {
                    ordersEntity.setCustomer(customerSaved);
                    ordersJpaRepository.saveAndFlush(ordersEntity);
                });
    }
}
