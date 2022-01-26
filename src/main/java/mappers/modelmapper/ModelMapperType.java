package mappers.modelmapper;

import common.converter.Converter;
import common.model.conversion.SourceType;
import common.model.conversion.TargetType;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public class ModelMapperType implements Converter<SourceType, TargetType> {

    private final ModelMapper mapper;

    public ModelMapperType() {
        mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        mapper.getConfiguration().setSkipNullEnabled(false);
    }

    @Override
    public TargetType convert(SourceType object) {
        return mapper.map(object, TargetType.class);
    }

}