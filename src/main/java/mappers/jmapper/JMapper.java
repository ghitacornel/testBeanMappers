package mappers.jmapper;

import com.googlecode.jmapper.api.JMapperAPI;
import common.mapper.Mapper;
import common.model.SourceModel;
import common.model.TargetModel;

public class JMapper implements Mapper<SourceModel, TargetModel> {

    com.googlecode.jmapper.JMapper<TargetModel, SourceModel> mapperToTarget;

    public JMapper() {
        JMapperAPI api = new JMapperAPI()
                .add(JMapperAPI.mappedClass(SourceModel.class))
                .add(JMapperAPI.mappedClass(TargetModel.class));
        mapperToTarget = new com.googlecode.jmapper.JMapper<>(TargetModel.class, SourceModel.class, api);
    }

    @Override
    public TargetModel map(SourceModel sourceOrder) {
        return mapperToTarget.getDestination(sourceOrder);
    }

}