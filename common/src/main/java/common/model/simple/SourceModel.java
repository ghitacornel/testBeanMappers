package common.model.simple;

import lombok.Data;

@Data
public class SourceModel {

    private int fieldInt;
    private Integer fieldInteger;
    private String fieldString;

    // field not existing in target and not mapped
    private int doNotExistsInTarget = 1000;

    // field existing in source and target which must not be mapped
    private String doNotMap = "doNotMap source";

    // field with different name
    private String differentNameInSource = "must be mapped to same value";

    public static SourceModel sourceModel() {
        SourceModel model = new SourceModel();
        model.setDoNotMap("doNotMap source");
        model.setDoNotExistsInTarget(1001);
        model.setFieldInt(1);
        model.setFieldInteger(2);
        model.setFieldString("fieldString");
        return model;
    }
}
