package common;

import common.model.simple.SourceModel;
import common.model.simple.TargetModel;
import common.model.conversion.SourceType;
import common.model.conversion.TargetType;
import org.junit.Assert;

public class Utils {

    public static SourceModel sourceModel() {
        SourceModel model = new SourceModel();
        model.setDoNotMap("doNotMap source");
        model.setDoNotExistsInTarget(1001);

        model.setFieldInt(1);
        model.setFieldInteger(2);
        model.setFieldString("fieldString");
        return model;
    }

    public static void verify(SourceModel source, TargetModel target) {
        Assert.assertEquals(-1000, target.getDoNotExistsInSource());
        Assert.assertEquals("doNotMap target", target.getDoNotMap());
        Assert.assertEquals(source.getDifferentNameInSource(), target.getDifferentNameInTarget());

        Assert.assertEquals(source.getFieldInt(), target.getFieldInt());
        Assert.assertSame(source.getFieldInteger(), target.getFieldInteger());
        Assert.assertSame(source.getFieldString(), target.getFieldString());
    }

    public static SourceType sourceTypeConversion() {
        SourceType source = new SourceType();
        source.setFieldInt1(1);
        source.setFieldInt2(2);
        source.setFieldInteger1(3);
        source.setFieldInteger2(4);
        source.setFieldStringInteger1("5");
        source.setFieldStringInteger2("6");
        return source;
    }

    public static void verify(SourceType source, TargetType target) {
        Assert.assertEquals(source.getFieldInt1(), target.getFieldInt1().intValue());
        Assert.assertEquals(source.getFieldInt2() + "", target.getFieldInt2());
        Assert.assertEquals(source.getFieldInteger1().intValue(), target.getFieldInteger1());
        Assert.assertEquals(source.getFieldInteger2() + "", target.getFieldInteger2());
        Assert.assertEquals(source.getFieldStringInteger1(), target.getFieldStringInteger1() + "");
        Assert.assertEquals(source.getFieldStringInteger2(), String.valueOf(target.getFieldStringInteger2()));
        Assert.assertNull(target.getFieldStringIntegerNull());// is set to null
        Assert.assertEquals(-1, target.getFieldStringIntNull());// remains unmodified
    }
}
