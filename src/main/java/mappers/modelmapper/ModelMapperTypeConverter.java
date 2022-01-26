package mappers.modelmapper;

import common.converter.Converter;
import common.model.conversion.SourceTypeConversion;
import common.model.conversion.TargetTypeConversion;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public class ModelMapperTypeConverter implements Converter<SourceTypeConversion, TargetTypeConversion> {

    private final ModelMapper modelMapper;

    public ModelMapperTypeConverter() {
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        modelMapper.getConfiguration().setSkipNullEnabled(false);
    }

    @Override
    public TargetTypeConversion convert(SourceTypeConversion object) {
        return modelMapper.map(object, TargetTypeConversion.class);
    }

}