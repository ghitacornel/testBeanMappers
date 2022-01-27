package orika;

import common.Utils;
import common.model.SourceModel;
import common.model.TargetModel;
import mappers.orika.OrikaMapper;
import org.junit.Test;

public class TestOrika {

    OrikaMapper mapper = new OrikaMapper();

    @Test
    public void testMapping() {
        SourceModel sourceModel = Utils.sourceModel();
        TargetModel targetModel = mapper.map(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
