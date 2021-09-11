package com.project.findme.sqlbuilder;

public class JobBuilder {
    //查询工作信息
    public String selectJobName(){
        String sql = "select * from  job ";
        return sql;
    }

    //根据工作名称查询
    public String selectJobByName(String JobName){
        String sql = "select * FROM job where jname like '%"+JobName+"%'";
        return sql;
    }

    //根据工作类型查找
    public String selectJobByKind(String JKind){
        String sql = "select * FROM job where jkind like '%" +JKind+"%'";
        return sql;
    }

    //根据公司薪水查找
    public String selectJobBySalary(int Salary) {
        String sql = "select * from job where salary =" +Salary;
        return sql;
    }

    //根据公司地点查找
    public String selectJobByArea(String Area) {
        String sql = "select * from job where area like '%" +Area +"%'";
        return sql;
    }
}
