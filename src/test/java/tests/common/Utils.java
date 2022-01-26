package tests.common;

import common.model.SourceModel;
import common.model.TargetModel;
import common.model.conversion.SourceTypeConversion;
import common.model.conversion.TargetTypeConversion;
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

    public static SourceTypeConversion sourceTypeConversion() {
        SourceTypeConversion source = new SourceTypeConversion();
        source.setFieldInt1(1);
        source.setFieldInt2(2);
        source.setFieldInteger1(3);
        source.setFieldInteger2(4);
        return source;
    }

    public static void verify(SourceTypeConversion source, TargetTypeConversion target) {
        Assert.assertEquals(source.getFieldInt1(), target.getFieldInt1().intValue());
        Assert.assertEquals(source.getFieldInt2() + "", target.getFieldInt2());
        Assert.assertEquals(source.getFieldInteger1().intValue(), target.getFieldInteger1());
        Assert.assertEquals(source.getFieldInteger2() + "", target.getFieldInteger2());
    }
}
