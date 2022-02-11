package common.model.composition;

import lombok.Data;

@Data
public class ItemSource {

    private String itemDetail;

    public static ItemSource input() {
        ItemSource model = new ItemSource();
        model.setItemDetail("item detail");
        return model;
    }
}
