package mappers.dozer;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import common.converter.Converter;
import common.model.SourceModel;
import common.model.TargetModel;

public class DozerConverter implements Converter<SourceModel,TargetModel> {

    private final Mapper mapper;

    public DozerConverter() {
        this.mapper = DozerBeanMapperBuilder.create()
                .withMappingFiles("dozer-mapping.xml")
                .build();
    }

    @Override
    public TargetModel convert(SourceModel object) {
        return mapper.map(object, TargetModel.class);
    }

}
