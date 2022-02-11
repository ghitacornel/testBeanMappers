package dozer;

import common.model.conversion.SourceType;
import common.model.conversion.TargetType;
import mappers.beanmapper.CustomBeanTypeMapper;
import org.junit.Assert;
import org.junit.Test;

public class TestCustomBeanTypeMapper {

    CustomBeanTypeMapper mapper = new CustomBeanTypeMapper();

    @Test
    public void testMapping() {
        SourceType sourceModel = SourceType.input();
        TargetType targetModel = mapper.map(sourceModel);
        Assert.assertEquals(TargetType.expected(), targetModel);
    }
}
