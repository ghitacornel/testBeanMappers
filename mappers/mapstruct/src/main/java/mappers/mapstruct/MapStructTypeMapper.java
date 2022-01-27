package mappers.mapstruct;

import common.mapper.Mapper;
import common.model.conversion.SourceType;
import common.model.conversion.TargetType;
import org.mapstruct.factory.Mappers;

@org.mapstruct.Mapper
public interface MapStructTypeMapper extends Mapper<SourceType, TargetType> {

    MapStructTypeMapper MAPPER = Mappers.getMapper(MapStructTypeMapper.class);

}