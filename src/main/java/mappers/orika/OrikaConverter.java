package mappers.orika;

import common.converter.Converter;
import common.model.SourceModel;
import common.model.TargetModel;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class OrikaConverter implements Converter {

    final private MapperFacade mapperFacade;

    public OrikaConverter() {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(TargetModel.class, SourceModel.class).byDefault().register();
        mapperFacade = mapperFactory.getMapperFacade();
    }

    @Override
    public TargetModel convert(SourceModel sourceOrder) {
        return mapperFacade.map(sourceOrder, TargetModel.class);
    }

    @Override
    public SourceModel convert(TargetModel sourceCode) {
        return mapperFacade.map(sourceCode, SourceModel.class);
    }
}