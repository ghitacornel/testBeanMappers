package mappers.modelmapper;

import common.mapper.Mapper;
import common.model.simple.SourceModel;
import common.model.simple.TargetModel;
import org.modelmapper.convention.MatchingStrategies;

public class ModelMapper implements Mapper<SourceModel,TargetModel> {

    private final org.modelmapper.ModelMapper mapper;

    public ModelMapper() {
        mapper = new org.modelmapper.ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        mapper.typeMap(SourceModel.class, TargetModel.class).addMappings(e -> e.skip(TargetModel::setDoNotMap));
        mapper.typeMap(SourceModel.class, TargetModel.class).addMappings(e -> e.skip(TargetModel::setDoNotExistsInSource));
        mapper.typeMap(SourceModel.class, TargetModel.class).addMappings(e -> e.map(SourceModel::getDifferentNameInSource, TargetModel::setDifferentNameInTarget));

        // auto validation !!! really nice
        mapper.validate();
    }

    @Override
    public TargetModel map(SourceModel object) {
        return mapper.map(object, TargetModel.class);
    }

}