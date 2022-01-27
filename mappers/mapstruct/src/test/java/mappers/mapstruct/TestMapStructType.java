package mappers.mapstruct;

import common.model.conversion.SourceType;
import common.model.conversion.TargetType;
import org.junit.Assert;
import org.junit.Test;

public class TestMapStructType {

    MapStructTypeMapper mapper = MapStructTypeMapper.MAPPER;

    @Test
    public void testMapping() {
        SourceType sourceModel = SourceType.input();
        TargetType targetModel = mapper.map(sourceModel);

        TargetType expected = TargetType.expected();
        expected.setField9("1981-10-05");
        Assert.assertEquals(expected, targetModel);
    }
}
