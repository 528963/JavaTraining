package com.project.findme.sqlbuilder;

public class ResumeBuilder {
    //根据投简人的编号查询投简人的基本信息
    public String selectResumeByresID(int ResID){
        String sql = "select * from  resume where resid = " + ResID;
        return sql;
    }
}
