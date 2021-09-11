package com.project.findme.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface JobMapper {
    @SelectProvider(type = JobMapper.class ,method = "selectJobByName")
    @Options(flushCache = Options.FlushCachePolicy.FALSE, timeout = 10000)
    void selectJobByName(@Param(value = "jname") String JobName);

    @SelectProvider(type = JobMapper.class ,method = "selectJobByKind")
    @Options(flushCache = Options.FlushCachePolicy.FALSE, timeout = 10000)
    void selectJobByKind(@Param(value = "jkind") String JKind);

    @SelectProvider(type = JobMapper.class ,method = "selectJobBySalary")
    @Options(flushCache = Options.FlushCachePolicy.FALSE, timeout = 10000)
    void selectJobBySalary(@Param(value = "salary") String Salary);

    @SelectProvider(type = JobMapper.class ,method = "selectJobByArea")
    @Options(flushCache = Options.FlushCachePolicy.FALSE, timeout = 10000)
    void selectJobByArea(@Param(value = "area") String Area);
}
