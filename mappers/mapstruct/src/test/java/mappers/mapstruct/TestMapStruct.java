package mappers.mapstruct;

import common.model.simple.SourceModel;
import common.model.simple.TargetModel;
import org.junit.Assert;
import org.junit.Test;

public class TestMapStruct {

    MapStructMapper mapper = MapStructMapper.MAPPER;

    @Test
    public void testMapping() {
        SourceModel sourceModel = SourceModel.input();
        TargetModel targetModel = mapper.map(sourceModel);
        Assert.assertEquals(TargetModel.expected(), targetModel);
    }
}
