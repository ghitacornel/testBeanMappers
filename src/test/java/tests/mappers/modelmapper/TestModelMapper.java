package tests.mappers.modelmapper;

import common.model.SourceModel;
import common.model.TargetModel;
import mappers.modelmapper.ModelMapperConverter;
import org.junit.Test;
import tests.common.Utils;

public class TestModelMapper {

    ModelMapperConverter mapper = new ModelMapperConverter();

    @Test
    public void testMapping() {
        SourceModel sourceModel = Utils.sourceModel();
        TargetModel targetModel = mapper.convert(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
