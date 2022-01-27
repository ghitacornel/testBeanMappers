package mappers.mapstruct;

import common.mapper.Mapper;
import common.model.conversion.SourceType;
import common.model.conversion.TargetType;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@org.mapstruct.Mapper
public interface MapStructTypeMapper extends Mapper<SourceType, TargetType> {

    MapStructTypeMapper MAPPER = Mappers.getMapper(MapStructTypeMapper.class);

    @Mapping(target = "field9", dateFormat = "yyyy-MM-dd")
    TargetType map(SourceType entity);

}