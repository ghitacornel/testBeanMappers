package mappers.mapstruct.composition;

import common.mapper.Mapper;
import common.model.composition.ContainerSource;
import common.model.composition.ContainerTarget;
import org.mapstruct.factory.Mappers;

@org.mapstruct.Mapper
public interface MapStructContainerMapper extends Mapper<ContainerSource, ContainerTarget> {

    MapStructContainerMapper MAPPER = Mappers.getMapper(MapStructContainerMapper.class);

    ContainerTarget map(ContainerSource entity);

}