package tests.common;

import common.model.SourceModel;
import common.model.TargetModel;
import org.junit.Assert;

public class Utils {

    public static SourceModel sourceModel() {
        SourceModel sourceModel = new SourceModel();
        sourceModel.setDoNotMap("doNotMap source");
        sourceModel.setDoNotExistsInTarget(1001);

        sourceModel.setFieldInt(1);
        sourceModel.setFieldInteger(2);
        sourceModel.setFieldString("fieldString");
        return sourceModel;
    }

    public static void verify(SourceModel sourceModel, TargetModel targetModel) {
        Assert.assertEquals(-1000, targetModel.getDoNotExistsInSource());
        Assert.assertEquals("doNotMap target", targetModel.getDoNotMap());
        Assert.assertEquals(sourceModel.getDifferentNameInSource(), targetModel.getDifferentNameInTarget());

        Assert.assertEquals(sourceModel.getFieldInt(), targetModel.getFieldInt());
        Assert.assertSame(sourceModel.getFieldInteger(), targetModel.getFieldInteger());
        Assert.assertSame(sourceModel.getFieldString(), targetModel.getFieldString());
    }
}
