package common.model;

import lombok.Data;

@Data
public class TargetModel {

    private int fieldInt;
    private Integer fieldInteger;
    private String fieldString;

    // field not existing in source and not mapped
    private int doNotExistsInSource = -1000;

    // field existing in source and target which must not be mapped
    private String doNotMap = "doNotMap target";

    // field with different name
    private String differentNameInTarget = "differentNameTarget";

}
