package tests.mappers.dozer;

import common.model.conversion.SourceTypeConversion;
import common.model.conversion.TargetTypeConversion;
import mappers.dozer.DozerTypeConverter;
import org.junit.Test;
import tests.common.Utils;

public class TestDozerType {

    DozerTypeConverter converter = new DozerTypeConverter();

    @Test
    public void testMapping() {
        SourceTypeConversion sourceModel = Utils.sourceTypeConversion();
        TargetTypeConversion targetModel = converter.convert(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
