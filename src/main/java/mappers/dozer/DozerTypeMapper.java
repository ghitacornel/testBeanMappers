package mappers.dozer;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import common.mapper.Mapper;
import common.model.conversion.SourceType;
import common.model.conversion.TargetType;

public class DozerTypeMapper implements Mapper<SourceType, TargetType> {

    private final com.github.dozermapper.core.Mapper mapper;

    public DozerTypeMapper() {
        this.mapper = DozerBeanMapperBuilder.create()
                .withMappingFiles("dozer-mapping.xml")
                .build();
    }

    @Override
    public TargetType map(SourceType object) {
        return mapper.map(object, TargetType.class);
    }

}
