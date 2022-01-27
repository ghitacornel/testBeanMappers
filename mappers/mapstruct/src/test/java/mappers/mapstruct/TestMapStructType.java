package mappers.mapstruct;

import common.model.conversion.SourceType;
import common.model.conversion.TargetType;
import org.junit.Assert;
import org.junit.Test;

public class TestMapStructType {

    MapStructTypeMapper mapper = MapStructTypeMapper.MAPPER;

    @Test
    public void testMapping() {
        SourceType sourceModel = SourceType.sourceType();
        TargetType targetModel = mapper.map(sourceModel);
        Assert.assertEquals(TargetType.targetType(), targetModel);
    }
}
