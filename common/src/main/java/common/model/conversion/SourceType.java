package common.model.conversion;

import lombok.Data;

@Data
public class SourceType {

    private int field1;
    private int field2;
    private Integer field3;
    private Integer field4;
    private String field5;
    private String field6;
    private String field7;
    private String field8;

    public static SourceType sourceType() {
        SourceType model = new SourceType();
        model.setField1(1);
        model.setField2(2);
        model.setField3(3);
        model.setField4(4);
        model.setField5("5");
        model.setField6("6");
        model.setField7(null);
        model.setField8(null);
        return model;
    }
}
