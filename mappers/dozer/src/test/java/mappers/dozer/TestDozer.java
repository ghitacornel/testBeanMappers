package mappers.dozer;

import common.Utils;
import common.model.simple.SourceModel;
import common.model.simple.TargetModel;
import org.junit.Test;

public class TestDozer {

    DozerMapper mapper = new DozerMapper();

    @Test
    public void testMapping() {
        SourceModel sourceModel = Utils.sourceModel();
        TargetModel targetModel = mapper.map(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
