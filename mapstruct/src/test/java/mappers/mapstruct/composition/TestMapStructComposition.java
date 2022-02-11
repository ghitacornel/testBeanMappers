package mappers.mapstruct.composition;

import common.model.composition.ContainerSource;
import common.model.composition.ContainerTarget;
import common.model.composition.ItemSource;
import common.model.composition.ItemTarget;
import org.junit.Assert;
import org.junit.Test;

public class TestMapStructComposition {

    @Test
    public void testMapping() {

        {
            ItemSource sourceModel = ItemSource.input();
            ItemTarget targetModel = MapStructItemMapper.MAPPER.map(sourceModel);
            Assert.assertEquals(ItemTarget.expected(), targetModel);
        }

        {
            ContainerSource sourceModel = ContainerSource.input();
            ContainerTarget targetModel = MapStructContainerMapper.MAPPER.map(sourceModel);
            Assert.assertEquals(ContainerTarget.expected(), targetModel);
        }

    }
}
