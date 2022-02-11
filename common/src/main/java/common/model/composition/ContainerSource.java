package common.model.composition;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ContainerSource {

    private String containerDetail;

    private ItemSource singleItem;
    private List<ItemSource> multipleItems;

    public static ContainerSource input() {

        ContainerSource model = new ContainerSource();
        model.setContainerDetail("container detail");

        {
            ItemSource itemSource = new ItemSource();
            itemSource.setItemDetail("item detail");
            model.setSingleItem(itemSource);
        }

        {
            ItemSource multipleItems1 = new ItemSource();
            multipleItems1.setItemDetail("item detail 1");
            ItemSource multipleItems2 = new ItemSource();
            multipleItems2.setItemDetail("item detail 2");
            ItemSource multipleItems3 = new ItemSource();
            multipleItems3.setItemDetail("item detail 3");
            model.setMultipleItems(new ArrayList<>());
            model.getMultipleItems().add(multipleItems1);
            model.getMultipleItems().add(multipleItems2);
            model.getMultipleItems().add(multipleItems3);
        }

        return model;
    }
}
