package mappers.dozer;

import common.model.simple.SourceModel;
import common.model.simple.TargetModel;
import org.junit.Assert;
import org.junit.Test;

public class TestDozer {

    DozerMapper mapper = new DozerMapper();

    @Test
    public void testMapping() {
        SourceModel sourceModel = SourceModel.input();
        TargetModel targetModel = mapper.map(sourceModel);
        Assert.assertEquals(TargetModel.expected(), targetModel);
    }
}
