package mappers.dozer;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import common.mapper.Mapper;
import common.model.SourceModel;
import common.model.TargetModel;

public class DozerMapper implements Mapper<SourceModel,TargetModel> {

    private final com.github.dozermapper.core.Mapper mapper;

    public DozerMapper() {
        this.mapper = DozerBeanMapperBuilder.create()
                .withMappingFiles("dozer-mapping.xml")
                .build();
    }

    @Override
    public TargetModel map(SourceModel object) {
        return mapper.map(object, TargetModel.class);
    }

}
