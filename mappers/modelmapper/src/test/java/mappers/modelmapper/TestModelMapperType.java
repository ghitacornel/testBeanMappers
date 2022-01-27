package mappers.modelmapper;

import common.Utils;
import common.model.conversion.SourceType;
import common.model.conversion.TargetType;
import org.junit.Test;

public class TestModelMapperType {

    ModelMapperType mapper = new ModelMapperType();

    @Test
    public void testMapping() {
        SourceType sourceModel = SourceType.sourceType();
        TargetType targetModel = mapper.map(sourceModel);
        Utils.verify(sourceModel, targetModel);
    }

}
