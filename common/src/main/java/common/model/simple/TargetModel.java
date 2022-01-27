package common.model.simple;

import lombok.Data;

@Data
public class TargetModel {

    private int fieldInt = -1;
    private Integer fieldInteger = -2;
    private String fieldString = "-3";

    // field not existing in source and not mapped
    private int doNotExistsInSource = -4;

    // field existing in source and target which must not be mapped
    private String doNotMap = "-5";

    // field with different name
    private String differentNameInTarget = "-6";

    /**
     * @return expected mapped value
     */
    public static TargetModel expected() {
        TargetModel model = new TargetModel();
        model.setFieldInt(1);
        model.setFieldInteger(2);
        model.setFieldString("fieldString");
        model.setDoNotExistsInSource(-4);
        model.setDoNotMap("-5");
        model.setDifferentNameInTarget("setDifferentNameInSource");
        return model;
    }
}
