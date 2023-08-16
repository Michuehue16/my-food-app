package pl.zajavka.myfoodapp.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import pl.zajavka.myfoodapp.domain.Orders;
import pl.zajavka.myfoodapp.infrastructure.database.entity.OrdersEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrdersEntityMapper {

    @Mapping(target = "orders.restaurant", ignore = true)
    @Mapping(target = "orders.customer", ignore = true)
    @Mapping(target = "orders.foodName", ignore = true)
    @Mapping(target = "orders.deliveryAddress", ignore = true)
    Orders mapFromEntity(OrdersEntity ordersEntity);

    OrdersEntity mapToEntity(Orders orders);
}
