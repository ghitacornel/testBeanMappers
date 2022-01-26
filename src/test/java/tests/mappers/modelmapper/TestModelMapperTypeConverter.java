package tests.mappers.modelmapper;

import common.model.conversion.SourceTypeConversion;
import common.model.conversion.TargetTypeConversion;
import mappers.modelmapper.ModelMapperTypeConverter;
import org.junit.Test;
import tests.common.Utils;

public class TestModelMapperTypeConverter  {

    ModelMapperTypeConverter mapper = new ModelMapperTypeConverter();

    @Test
    public void testMapping() {
        SourceTypeConversion sourceModel = Utils.sourceTypeConversion();
        TargetTypeConversion targetModel = mapper.convert(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }

}
