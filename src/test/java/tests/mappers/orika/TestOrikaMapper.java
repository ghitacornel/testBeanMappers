package tests.mappers.orika;

import common.model.SourceModel;
import common.model.TargetModel;

import mappers.orika.OrikaMapper;
import org.junit.Ignore;
import org.junit.Test;
import tests.common.Utils;

public class TestOrikaMapper {

    OrikaMapper mapper = new OrikaMapper();

    @Test
    @Ignore
    public void testMapping() {
        SourceModel sourceModel = Utils.sourceModel();
        TargetModel targetModel = mapper.map(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
