package tests.mappers.modelmapper;

import common.model.conversion.SourceType;
import common.model.conversion.TargetType;
import mappers.modelmapper.ModelMapperType;
import org.junit.Test;
import tests.common.Utils;

public class TestModelMapperType {

    ModelMapperType mapper = new ModelMapperType();

    @Test
    public void testMapping() {
        SourceType sourceModel = Utils.sourceTypeConversion();
        TargetType targetModel = mapper.convert(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }

}
