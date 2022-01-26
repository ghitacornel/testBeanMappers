package mappers.orika;

import common.converter.Converter;
import common.model.SourceModel;
import common.model.TargetModel;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class OrikaMapper implements Converter<SourceModel, TargetModel> {

    final private MapperFacade mapper;

    public OrikaMapper() {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(TargetModel.class, SourceModel.class).byDefault().register();
        mapper = mapperFactory.getMapperFacade();
    }

    @Override
    public TargetModel convert(SourceModel sourceOrder) {
        return mapper.map(sourceOrder, TargetModel.class);
    }

}