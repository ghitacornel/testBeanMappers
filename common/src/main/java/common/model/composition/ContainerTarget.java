package common.model.composition;

import lombok.Data;

@Data
public class ContainerTarget {

    private String containerDetail;

    /**
     * @return expected mapped value
     */
    public static ContainerTarget expected() {
        ContainerTarget model = new ContainerTarget();
        model.setContainerDetail("container detail");
        return model;
    }
}
