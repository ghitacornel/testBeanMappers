package mappers.dozer;

import common.Utils;
import common.model.conversion.SourceType;
import common.model.conversion.TargetType;
import org.junit.Test;

public class TestDozerType {

    DozerTypeMapper mapper = new DozerTypeMapper();

    @Test
    public void testMapping() {
        SourceType sourceModel = SourceType.sourceType();
        TargetType targetModel = mapper.map(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }
}
