package common.model.composition;

import lombok.Data;

@Data
public class ContainerSource {

    private String containerDetail;

    private ItemSource singleItem;

    public static ContainerSource input() {

        ItemSource itemSource = new ItemSource();
        itemSource.setItemDetail("item detail");

        ContainerSource model = new ContainerSource();
        model.setContainerDetail("container detail");
        model.setSingleItem(itemSource);
        return model;
    }
}
