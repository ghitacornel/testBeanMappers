package mappers.dozer;

import common.model.conversion.SourceType;
import common.model.conversion.TargetType;
import org.junit.Assert;
import org.junit.Test;

public class TestDozerType {

    DozerTypeMapper mapper = new DozerTypeMapper();

    @Test
    public void testMapping() {
        SourceType sourceModel = SourceType.input();
        TargetType targetModel = mapper.map(sourceModel);
        Assert.assertEquals(TargetType.expected(), targetModel);
    }
}
