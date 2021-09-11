package com.project.findme.mapper;

import com.project.findme.sqlbuilder.CompanyBuilder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CompanyMapper {
    @SelectProvider(type = CompanyBuilder.class ,method = "selectCompanyByName")
    @Options(flushCache = Options.FlushCachePolicy.FALSE, timeout = 10000)
    void selectCompanyByName(@Param(value = "c_uname") String CompanyName);

    @SelectProvider(type = CompanyBuilder.class ,method = "selectByCompanyId")
    @Options(flushCache = Options.FlushCachePolicy.FALSE, timeout = 10000)
    void selectByCompanyId(@Param(value = "scope") String Scope);

}
