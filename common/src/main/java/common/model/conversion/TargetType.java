package common.model.conversion;

import lombok.Data;

@Data
public class TargetType {

    private Integer field1;
    private String field2;
    private int field3;
    private String field4;
    private int field5;
    private Integer field6;
    private Integer field7;
    private int field8;

    public static TargetType expected() {
        TargetType model = new TargetType();
        model.setField1(1);
        model.setField2("2");
        model.setField3(3);
        model.setField4("4");
        model.setField5(5);
        model.setField6(6);
        model.setField7(null);
        model.setField8(0);
        return model;
    }
}
