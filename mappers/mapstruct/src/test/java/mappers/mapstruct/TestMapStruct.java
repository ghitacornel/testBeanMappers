package mappers.mapstruct;

import common.Utils;
import common.model.simple.SourceModel;
import common.model.simple.TargetModel;
import org.junit.Test;

public class TestMapStruct {

    MapStructMapper mapper = MapStructMapper.MAPPER;

    @Test
    public void testMapping() {
        SourceModel sourceModel = SourceModel.sourceModel();
        TargetModel targetModel = mapper.map(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
