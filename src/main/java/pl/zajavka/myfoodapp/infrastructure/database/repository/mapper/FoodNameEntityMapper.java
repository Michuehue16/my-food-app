package pl.zajavka.myfoodapp.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import pl.zajavka.myfoodapp.domain.FoodName;
import pl.zajavka.myfoodapp.infrastructure.database.entity.FoodNameEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FoodNameEntityMapper {

    @Mapping(target = "foodName.foodType",ignore = true)
    @Mapping(target = "foodName.orders",ignore = true)
    FoodName mapFromEntity(FoodNameEntity foodNameEntity);

    FoodNameEntity mapToEntity(FoodName foodName);

}
