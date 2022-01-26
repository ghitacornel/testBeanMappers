package tests.mappers.jmapper;

import common.model.SourceModel;
import common.model.TargetModel;
import mappers.jmapper.JMapperConverter;
import org.junit.Ignore;
import org.junit.Test;
import tests.common.Utils;

public class TestJmapper {

    JMapperConverter converter = new JMapperConverter();

    @Test
    @Ignore
    public void testMapping() {
        SourceModel sourceModel = Utils.sourceModel();
        TargetModel targetModel = converter.convert(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
