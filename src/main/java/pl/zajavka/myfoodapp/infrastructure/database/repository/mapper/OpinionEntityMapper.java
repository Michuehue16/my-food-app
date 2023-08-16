package pl.zajavka.myfoodapp.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import pl.zajavka.myfoodapp.domain.Opinion;
import pl.zajavka.myfoodapp.infrastructure.database.entity.OpinionEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OpinionEntityMapper {

    @Mapping(target = "opinion.customer", ignore = true)
    @Mapping(target = "opinion.restaurant", ignore = true)
    Opinion mapFromEntity(OpinionEntity opinionEntity);

    OpinionEntity mapToEntity(Opinion opinion);
}
