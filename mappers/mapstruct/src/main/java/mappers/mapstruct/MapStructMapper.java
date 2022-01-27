package mappers.mapstruct;

import common.mapper.Mapper;
import common.model.simple.SourceModel;
import common.model.simple.TargetModel;
import org.mapstruct.factory.Mappers;

@org.mapstruct.Mapper
public interface MapStructMapper extends Mapper<SourceModel, TargetModel> {

    MapStructMapper MAPPER = Mappers.getMapper(MapStructMapper.class);

}