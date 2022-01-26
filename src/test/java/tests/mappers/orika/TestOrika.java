package tests.mappers.orika;

import common.model.SourceModel;
import common.model.TargetModel;

import mappers.orika.OrikaConverter;
import org.junit.Ignore;
import org.junit.Test;
import tests.common.Utils;

public class TestOrika {

    OrikaConverter converter = new OrikaConverter();

    @Test
    @Ignore
    public void testMapping() {
        SourceModel sourceModel = Utils.sourceModel();
        TargetModel targetModel = converter.convert(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
