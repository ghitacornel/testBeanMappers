package mappers.orika;

import common.model.simple.SourceModel;
import common.model.simple.TargetModel;
import org.junit.Assert;
import org.junit.Test;

public class TestOrika {

    OrikaMapper mapper = new OrikaMapper();

    @Test
    public void testMapping() {
        SourceModel sourceModel = SourceModel.sourceModel();
        TargetModel targetModel = mapper.map(sourceModel);
        Assert.assertEquals(TargetModel.targetModel(), targetModel);
    }
}
