package com.project.findme.mapper;

import com.project.findme.sqlbuilder.ResumeBuilder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface ResumeMapper {
    @SelectProvider(type = ResumeBuilder.class ,method = "selectResumeByresID")
    @Options(flushCache = Options.FlushCachePolicy.FALSE, timeout = 10000)
    void selectResumeByresID(@Param(value = "resID") String ResID);

}
