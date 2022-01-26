package mappers.jmapper;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.JMapperAPI;
import common.converter.Converter;
import common.model.SourceModel;
import common.model.TargetModel;

public class JMapperConverter implements Converter {

    JMapper<TargetModel, SourceModel> mapperToTarget;
    JMapper<SourceModel, TargetModel> mapperToSource;

    public JMapperConverter() {
        JMapperAPI api = new JMapperAPI()
                .add(JMapperAPI.mappedClass(SourceModel.class))
                .add(JMapperAPI.mappedClass(TargetModel.class));
        mapperToTarget = new JMapper<>(TargetModel.class, SourceModel.class, api);
        mapperToSource = new JMapper<>(SourceModel.class, TargetModel.class, api);
    }

    @Override
    public TargetModel convert(SourceModel sourceOrder) {
        return mapperToTarget.getDestination(sourceOrder);
    }

    @Override
    public SourceModel convert(TargetModel sourceCode) {
        return mapperToSource.getDestination(sourceCode);
    }
}