package common.model.simple;

import lombok.Data;

@Data
public class SourceModel {

    private int fieldInt;
    private Integer fieldInteger;
    private String fieldString;

    // field not existing in target and not mapped
    private int doNotExistsInTarget;

    // field existing in source and target which must not be mapped
    private String doNotMap;

    // field with different name
    private String differentNameInSource;

    public static SourceModel input() {
        SourceModel model = new SourceModel();
        model.setFieldInt(1);
        model.setFieldInteger(2);
        model.setFieldString("fieldString");
        model.setDoNotExistsInTarget(1001);
        model.setDoNotMap("doNotMap source");
        model.setDifferentNameInSource("setDifferentNameInSource");
        return model;
    }
}
