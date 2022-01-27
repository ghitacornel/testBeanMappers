package common.model.conversion;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

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
    private Date field9;

    public static SourceType input() {
        SourceType model = new SourceType();
        model.setField1(1);
        model.setField2(2);
        model.setField3(3);
        model.setField4(4);
        model.setField5("5");
        model.setField6("6");
        model.setField7(null);
        model.setField8(null);

        LocalDateTime localDateTime = LocalDate.of(1981, 10, 5).atStartOfDay();
        model.setField9(Date.from(localDateTime.toInstant(ZoneOffset.UTC)));
        return model;
    }
}
