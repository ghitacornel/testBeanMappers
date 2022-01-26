package tests.mappers.dozer;

import common.model.SourceModel;
import common.model.TargetModel;
import mappers.dozer.DozerMapper;
import org.junit.Test;
import tests.common.Utils;

public class TestDozer {

    DozerMapper mapper = new DozerMapper();

    @Test
    public void testMapping() {
        SourceModel sourceModel = Utils.sourceModel();
        TargetModel targetModel = mapper.map(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
