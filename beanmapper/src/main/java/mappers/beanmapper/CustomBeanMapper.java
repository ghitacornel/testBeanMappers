package mappers.beanmapper;

import common.mapper.Mapper;
import common.model.simple.SourceModel;
import common.model.simple.TargetModel;
import io.beanmapper.BeanMapper;
import io.beanmapper.config.BeanMapperBuilder;

public class CustomBeanMapper implements Mapper<SourceModel, TargetModel> {

    private final BeanMapper mapper = new BeanMapperBuilder().build();

    @Override
    public TargetModel map(SourceModel object) {
        return mapper.map(object, TargetModel.class);
    }
}
