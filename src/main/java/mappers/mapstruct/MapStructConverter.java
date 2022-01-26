package mappers.mapstruct;

import common.converter.Converter;
import common.model.SourceModel;
import common.model.TargetModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapStructConverter extends Converter<SourceModel, TargetModel> {
    MapStructConverter MAPPER = Mappers.getMapper(MapStructConverter.class);
}