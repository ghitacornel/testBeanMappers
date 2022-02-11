package mappers.mapstruct.composition;

import common.mapper.Mapper;
import common.model.composition.ItemSource;
import common.model.composition.ItemTarget;
import org.mapstruct.factory.Mappers;

@org.mapstruct.Mapper
public interface MapStructItemMapper extends Mapper<ItemSource, ItemTarget> {

    MapStructItemMapper MAPPER = Mappers.getMapper(MapStructItemMapper.class);

    ItemTarget map(ItemSource entity);

}