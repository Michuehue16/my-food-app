package pl.zajavka.myfoodapp.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.control.NoComplexMapping;
import pl.zajavka.myfoodapp.domain.Customer;
import pl.zajavka.myfoodapp.domain.Orders;
import pl.zajavka.myfoodapp.infrastructure.database.entity.CustomerEntity;
import pl.zajavka.myfoodapp.infrastructure.database.entity.OpinionEntity;
import pl.zajavka.myfoodapp.infrastructure.database.entity.OrdersEntity;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerEntityMapper {

    @Mapping(target = "customer.address", ignore = true)
    @Mapping(target = "customer.orders", ignore = true)
    @Mapping(target ="customer.opinions", ignore = true)
    Customer mapFromEntity(CustomerEntity entity);

    CustomerEntity mapToEntity(Customer customer);



}
