package mappers.dozer;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import common.converter.Converter;
import common.model.conversion.SourceType;
import common.model.conversion.TargetType;

public class DozerTypeMapper implements Converter<SourceType, TargetType> {

    private final Mapper mapper;

    public DozerTypeMapper() {
        this.mapper = DozerBeanMapperBuilder.create()
                .withMappingFiles("dozer-mapping.xml")
                .build();
    }

    @Override
    public TargetType convert(SourceType object) {
        return mapper.map(object, TargetType.class);
    }

}
