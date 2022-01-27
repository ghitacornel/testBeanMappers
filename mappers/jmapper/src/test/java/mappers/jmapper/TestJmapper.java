package mappers.jmapper;

import common.Utils;
import common.model.simple.SourceModel;
import common.model.simple.TargetModel;
import org.junit.Test;

public class TestJmapper {

    JMapper mapper = new JMapper();

    @Test
    public void testMapping() {
        SourceModel sourceModel = Utils.sourceModel();
        TargetModel targetModel = mapper.map(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
