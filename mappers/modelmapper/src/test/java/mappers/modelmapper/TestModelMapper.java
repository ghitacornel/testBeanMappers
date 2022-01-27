package mappers.modelmapper;

import common.Utils;
import common.model.simple.SourceModel;
import common.model.simple.TargetModel;
import org.junit.Test;

public class TestModelMapper {

    ModelMapper mapper = new ModelMapper();

    @Test
    public void testMapping() {
        SourceModel sourceModel = Utils.sourceModel();
        TargetModel targetModel = mapper.map(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
