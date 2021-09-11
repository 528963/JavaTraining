package com.project.findme.service;

import com.project.findme.mapper.JobMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class JobServiceImpl implements JobService{

    @Autowired
    private JobMapper jobMapper;

    @Override
    public void selectJobByName(String jobName) {
        jobMapper.selectJobByName(jobName);
    }

    @Override
    public void selectJobByKind(String JKind) {
        jobMapper.selectJobByKind(JKind);
    }

    @Override
    public void selectJobByArea(String Area) {
        jobMapper.selectJobByArea(Area);
    }
}
