package mappers.mapstruct;

import common.converter.Converter;
import common.model.SourceModel;
import common.model.TargetModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapStructMapper extends Converter<SourceModel, TargetModel> {
    MapStructMapper MAPPER = Mappers.getMapper(MapStructMapper.class);
}