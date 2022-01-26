package mappers.modelmapper;

import common.converter.Converter;
import common.model.conversion.SourceType;
import common.model.conversion.TargetType;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public class ModelMapperTypeConverter implements Converter<SourceType, TargetType> {

    private final ModelMapper modelMapper;

    public ModelMapperTypeConverter() {
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        modelMapper.getConfiguration().setSkipNullEnabled(false);
    }

    @Override
    public TargetType convert(SourceType object) {
        return modelMapper.map(object, TargetType.class);
    }

}