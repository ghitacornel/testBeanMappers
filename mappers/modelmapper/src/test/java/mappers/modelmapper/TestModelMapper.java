package mappers.modelmapper;

import common.model.simple.SourceModel;
import common.model.simple.TargetModel;
import org.junit.Assert;
import org.junit.Test;

public class TestModelMapper {

    ModelMapper mapper = new ModelMapper();

    @Test
    public void testMapping() {
        SourceModel sourceModel = SourceModel.sourceModel();
        TargetModel targetModel = mapper.map(sourceModel);
        Assert.assertEquals(TargetModel.targetModel(), targetModel);
    }
}
