package common.model.conversion;

import lombok.Data;

@Data
public class TargetTypeConversion {

    private Integer fieldInt1;
    private String fieldInt2;
    private int fieldInteger1;
    private String fieldInteger2;
    private int fieldStringInteger1;
    private Integer fieldStringInteger2;
    private Integer fieldStringIntegerNull = -1;
    private int fieldStringIntNull = -1;

}
