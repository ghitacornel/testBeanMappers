package tests.mappers.modelmapper;

import common.model.conversion.SourceType;
import common.model.conversion.TargetType;
import mappers.modelmapper.ModelMapperTypeConverter;
import org.junit.Test;
import tests.common.Utils;

public class TestModelMapperTypeConverter  {

    ModelMapperTypeConverter mapper = new ModelMapperTypeConverter();

    @Test
    public void testMapping() {
        SourceType sourceModel = Utils.sourceTypeConversion();
        TargetType targetModel = mapper.convert(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }

}
