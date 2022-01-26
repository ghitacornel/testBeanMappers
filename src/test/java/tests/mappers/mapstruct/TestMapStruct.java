package tests.mappers.mapstruct;

import common.model.SourceModel;
import common.model.TargetModel;
import mappers.mapstruct.MapStructConverter;
import org.junit.Ignore;
import org.junit.Test;
import tests.common.Utils;

public class TestMapStruct {

    MapStructConverter mapper = MapStructConverter.MAPPER;

    @Test
    @Ignore
    public void testMapping() {
        SourceModel sourceModel = Utils.sourceModel();
        TargetModel targetModel = mapper.convert(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
