package common.model.composition;

import lombok.Data;

@Data
public class ContainerSource {

    private String containerDetail;

    public static ContainerSource input() {
        ContainerSource model = new ContainerSource();
        model.setContainerDetail("container detail");
        return model;
    }
}
