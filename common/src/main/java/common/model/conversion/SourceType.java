package common.model.conversion;

import lombok.Data;

@Data
public class SourceType {

    private int fieldInt1;
    private int fieldInt2;
    private Integer fieldInteger1;
    private Integer fieldInteger2;
    private String fieldStringInteger1;
    private String fieldStringInteger2;
    private String fieldStringIntegerNull;
    private String fieldStringIntNull;

    public static SourceType sourceType() {
        SourceType source = new SourceType();
        source.setFieldInt1(1);
        source.setFieldInt2(2);
        source.setFieldInteger1(3);
        source.setFieldInteger2(4);
        source.setFieldStringInteger1("5");
        source.setFieldStringInteger2("6");
        return source;
    }
}
