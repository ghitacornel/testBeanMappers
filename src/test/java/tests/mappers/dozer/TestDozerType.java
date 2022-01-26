package tests.mappers.dozer;

import common.model.conversion.SourceType;
import common.model.conversion.TargetType;
import mappers.dozer.DozerTypeConverter;
import org.junit.Test;
import tests.common.Utils;

public class TestDozerType {

    DozerTypeConverter mapper = new DozerTypeConverter();

    @Test
    public void testMapping() {
        SourceType sourceModel = Utils.sourceTypeConversion();
        TargetType targetModel = mapper.convert(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
