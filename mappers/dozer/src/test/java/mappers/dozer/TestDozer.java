package mappers.dozer;

import common.Utils;
import common.model.SourceModel;
import common.model.TargetModel;
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
