package tests.mappers.dozer;

import common.model.SourceModel;
import common.model.TargetModel;
import mappers.dozer.DozerConverter;
import org.junit.Test;
import tests.common.Utils;

public class TestDozer {

    DozerConverter converter = new DozerConverter();

    @Test
    public void testMapping() {
        SourceModel sourceModel = Utils.sourceModel();
        TargetModel targetModel = converter.convert(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
