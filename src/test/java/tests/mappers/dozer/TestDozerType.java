package tests.mappers.dozer;

import common.model.conversion.SourceTypeConversion;
import common.model.conversion.TargetTypeConversion;
import mappers.dozer.DozerTypeConverter;
import org.junit.Test;
import tests.common.Utils;

public class TestDozerType {

    DozerTypeConverter mapper = new DozerTypeConverter();

    @Test
    public void testMapping() {
        SourceTypeConversion sourceModel = Utils.sourceTypeConversion();
        TargetTypeConversion targetModel = mapper.convert(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
