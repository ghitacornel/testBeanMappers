package common.model.composition;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ContainerTarget {

    private String containerDetail;

    private ItemTarget singleItem;
    private List<ItemTarget> multipleItems;

    /**
     * @return expected mapped value
     */
    public static ContainerTarget expected() {

        ContainerTarget model = new ContainerTarget();
        model.setContainerDetail("container detail");

        {
            ItemTarget itemTarget = new ItemTarget();
            itemTarget.setItemDetail("item detail");
            model.setSingleItem(itemTarget);
        }

        {
            ItemTarget multipleItems1 = new ItemTarget();
            multipleItems1.setItemDetail("item detail 1");
            ItemTarget multipleItems2 = new ItemTarget();
            multipleItems2.setItemDetail("item detail 2");
            ItemTarget multipleItems3 = new ItemTarget();
            multipleItems3.setItemDetail("item detail 3");
            model.setMultipleItems(new ArrayList<>());
            model.getMultipleItems().add(multipleItems1);
            model.getMultipleItems().add(multipleItems2);
            model.getMultipleItems().add(multipleItems3);
        }
        return model;
    }
}
