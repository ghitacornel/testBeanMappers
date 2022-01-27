package mappers.orika;

import common.Utils;
import common.model.simple.SourceModel;
import common.model.simple.TargetModel;
import org.junit.Test;

public class TestOrika {

    OrikaMapper mapper = new OrikaMapper();

    @Test
    public void testMapping() {
        SourceModel sourceModel = SourceModel.sourceModel();
        TargetModel targetModel = mapper.map(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
