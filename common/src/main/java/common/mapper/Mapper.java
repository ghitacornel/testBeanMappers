package common.mapper;

public interface Mapper<Source, Target> {

    Target map(Source object);

}