package mappers.modelmapper;

import common.converter.Converter;
import common.model.SourceModel;
import common.model.TargetModel;
import org.modelmapper.convention.MatchingStrategies;

public class ModelMapper implements Converter<SourceModel,TargetModel> {

    private final org.modelmapper.ModelMapper mapper;

    public ModelMapper() {
        mapper = new org.modelmapper.ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        mapper.typeMap(SourceModel.class, TargetModel.class).addMappings(e -> e.skip(TargetModel::setDoNotMap));
        mapper.typeMap(SourceModel.class, TargetModel.class).addMappings(e -> e.map(SourceModel::getDifferentNameInSource, TargetModel::setDifferentNameInTarget));
    }

    @Override
    public TargetModel convert(SourceModel object) {
        return mapper.map(object, TargetModel.class);
    }

}