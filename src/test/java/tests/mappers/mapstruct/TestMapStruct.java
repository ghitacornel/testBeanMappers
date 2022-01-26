package tests.mappers.mapstruct;

import common.model.SourceModel;
import common.model.TargetModel;
import mappers.mapstruct.MapStructConverter;
import org.junit.Test;
import tests.common.Utils;

public class TestMapStruct {

    MapStructConverter converter = MapStructConverter.MAPPER;

    @Test
    public void testMapping() {
        SourceModel sourceModel = Utils.sourceModel();
        TargetModel targetModel = converter.convert(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
