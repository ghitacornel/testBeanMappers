package tests.mappers.jmapper;

import common.model.SourceModel;
import common.model.TargetModel;
import mappers.jmapper.JMapper;
import org.junit.Ignore;
import org.junit.Test;
import tests.common.Utils;

public class TestJmapper {

    JMapper mapper = new JMapper();

    @Test
    @Ignore
    public void testMapping() {
        SourceModel sourceModel = Utils.sourceModel();
        TargetModel targetModel = mapper.map(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
