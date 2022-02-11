package common.model.composition;

import lombok.Data;

@Data
public class ContainerTarget {

    private String containerDetail;

    private ItemTarget singleItem;

    /**
     * @return expected mapped value
     */
    public static ContainerTarget expected() {

        ItemTarget itemTarget = new ItemTarget();
        itemTarget.setItemDetail("item detail");

        ContainerTarget model = new ContainerTarget();
        model.setContainerDetail("container detail");
        model.setSingleItem(itemTarget);
        return model;
    }
}
