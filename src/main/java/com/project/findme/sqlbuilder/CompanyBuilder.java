package com.project.findme.sqlbuilder;

public class CompanyBuilder {
    //查询所有公司信息
    public String selectCompany(){
        String sql = "select * from  company ";
        return sql;
    }

    //根据公司名字查询公司信息
    public String selectCompanyByName(String CompanyName){
        String sql = "select * FROM company where c_uname = '%"+CompanyName+"%'";
        return sql;
    }

    //根据公司性质查询公司信息
    public String selectByCompanyId(String Scope){
        String sql = "select * FROM company where scope =" + Scope;
        return sql;
    }
}
