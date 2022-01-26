package mappers.modelmapper;

import common.mapper.Mapper;
import common.model.conversion.SourceType;
import common.model.conversion.TargetType;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public class ModelMapperType implements Mapper<SourceType, TargetType> {

    private final ModelMapper mapper;

    public ModelMapperType() {
        mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        mapper.getConfiguration().setSkipNullEnabled(false);
    }

    @Override
    public TargetType map(SourceType object) {
        return mapper.map(object, TargetType.class);
    }

}