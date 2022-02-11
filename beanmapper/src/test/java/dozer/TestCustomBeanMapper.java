package dozer;

import common.model.simple.SourceModel;
import common.model.simple.TargetModel;
import mappers.beanmapper.CustomBeanMapper;
import org.junit.Assert;
import org.junit.Test;

public class TestCustomBeanMapper {

    CustomBeanMapper mapper = new CustomBeanMapper();

    @Test
    public void testMapping() {
        SourceModel sourceModel = SourceModel.input();
        TargetModel targetModel = mapper.map(sourceModel);
        Assert.assertEquals(TargetModel.expected(), targetModel);
    }
}
