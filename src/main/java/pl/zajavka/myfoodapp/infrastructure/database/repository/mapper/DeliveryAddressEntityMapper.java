package pl.zajavka.myfoodapp.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import pl.zajavka.myfoodapp.domain.DeliveryAddress;
import pl.zajavka.myfoodapp.infrastructure.database.entity.DeliveryAddressEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeliveryAddressEntityMapper {

    @Mapping(target = "deliveryAddress.restaurant", ignore = true)
    DeliveryAddress mapFromEntity(DeliveryAddressEntity deliveryAddressEntity);

    DeliveryAddressEntity mapToEntity(DeliveryAddress deliveryAddress);

}
