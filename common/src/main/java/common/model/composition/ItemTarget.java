package common.model.composition;

import lombok.Data;

@Data
public class ItemTarget {

    private String itemDetail;

    /**
     * @return expected mapped value
     */
    public static ItemTarget expected() {
        ItemTarget model = new ItemTarget();
        model.setItemDetail("item detail");
        return model;
    }
}
