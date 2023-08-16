package pl.zajavka.myfoodapp.infrastructure.database.repository.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import pl.zajavka.myfoodapp.domain.Restaurant;
import pl.zajavka.myfoodapp.infrastructure.database.entity.RestaurantEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RestaurantEntityMapper {

    @Mapping(target = "restaurant.address", ignore = true)
    @Mapping(target = "restaurant.foodType", ignore = true)
    Restaurant mapFromEntity(RestaurantEntity restaurantEntity);

    RestaurantEntity mapToEntity(Restaurant restaurant);
}
