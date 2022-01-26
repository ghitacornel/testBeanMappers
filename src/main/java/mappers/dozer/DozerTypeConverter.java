package mappers.dozer;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import common.converter.Converter;
import common.model.conversion.SourceTypeConversion;
import common.model.conversion.TargetTypeConversion;

public class DozerTypeConverter implements Converter<SourceTypeConversion, TargetTypeConversion> {

    private final Mapper mapper;

    public DozerTypeConverter() {
        this.mapper = DozerBeanMapperBuilder.create()
                .withMappingFiles("dozer-mapping.xml")
                .build();
    }

    @Override
    public TargetTypeConversion convert(SourceTypeConversion object) {
        return mapper.map(object, TargetTypeConversion.class);
    }

}
