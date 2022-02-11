package mappers.jmapper;

import common.model.simple.SourceModel;
import common.model.simple.TargetModel;
import org.junit.Assert;
import org.junit.Test;

public class TestJmapper {

    JMapper mapper = new JMapper();

    @Test
    public void testMapping() {
        SourceModel sourceModel = SourceModel.input();
        TargetModel targetModel = mapper.map(sourceModel);
        Assert.assertEquals(TargetModel.expected(), targetModel);
    }
}
