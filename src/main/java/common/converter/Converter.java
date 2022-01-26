package common.converter;

import common.model.SourceModel;
import common.model.TargetModel;

public interface Converter {

    TargetModel convert(SourceModel object);

    SourceModel convert(TargetModel object);

}