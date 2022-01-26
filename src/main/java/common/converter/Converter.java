package common.converter;

public interface Converter<Source, Target> {

    Target convert(Source object);

}