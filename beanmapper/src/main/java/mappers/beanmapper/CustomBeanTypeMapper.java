package mappers.beanmapper;

import common.mapper.Mapper;
import common.model.conversion.SourceType;
import common.model.conversion.TargetType;
import io.beanmapper.BeanMapper;
import io.beanmapper.config.BeanMapperBuilder;

public class CustomBeanTypeMapper implements Mapper<SourceType, TargetType> {

    private final BeanMapper mapper = new BeanMapperBuilder().build();

    @Override
    public TargetType map(SourceType object) {
        return mapper.map(object, TargetType.class);
    }
}
