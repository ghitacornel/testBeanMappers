package mappers.modelmapper;

import common.converter.Converter;
import common.model.SourceModel;
import common.model.TargetModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public class ModelMapperConverter implements Converter<SourceModel,TargetModel> {

    private final ModelMapper modelMapper;

    public ModelMapperConverter() {
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        modelMapper.typeMap(SourceModel.class, TargetModel.class).addMappings(e -> e.skip(TargetModel::setDoNotMap));
        modelMapper.typeMap(SourceModel.class, TargetModel.class).addMappings(e -> e.map(SourceModel::getDifferentNameInSource, TargetModel::setDifferentNameInTarget));
    }

    @Override
    public TargetModel convert(SourceModel object) {
        return modelMapper.map(object, TargetModel.class);
    }

}