package common.model.simple;

import lombok.Data;

@Data
public class TargetModel {

    private int fieldInt=-1;
    private Integer fieldInteger=-2;
    private String fieldString="-3";

    // field not existing in source and not mapped
    private int doNotExistsInSource = -4;

    // field existing in source and target which must not be mapped
    private String doNotMap = "-5";

    // field with different name
    private String differentNameInTarget = "-6";

}
