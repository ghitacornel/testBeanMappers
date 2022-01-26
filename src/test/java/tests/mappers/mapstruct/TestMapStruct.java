package tests.mappers.mapstruct;

import common.model.SourceModel;
import common.model.TargetModel;
import mappers.mapstruct.MapStructMapper;
import org.junit.Ignore;
import org.junit.Test;
import tests.common.Utils;

public class TestMapStruct {

    MapStructMapper mapper = MapStructMapper.MAPPER;

    @Test
    @Ignore
    public void testMapping() {
        SourceModel sourceModel = Utils.sourceModel();
        TargetModel targetModel = mapper.convert(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
