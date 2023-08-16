package pl.zajavka.myfoodapp.infrastructure.database.repository.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import pl.zajavka.myfoodapp.domain.FoodType;
import pl.zajavka.myfoodapp.infrastructure.database.entity.FoodTypeEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FoodTypeEntityMapper {

    @Mapping(target = "foodType.foodName", ignore = true)
    @Mapping(target = "foodType.restaurant", ignore = true)
    FoodType mapFromEntity(FoodTypeEntity foodTypeEntity);

    FoodTypeEntity mapToEntity(FoodType foodType);
}
