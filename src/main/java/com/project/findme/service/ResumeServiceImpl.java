package com.project.findme.service;

import com.project.findme.mapper.ResumeMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ResumeServiceImpl implements ResumeService{

    @Autowired
    private ResumeMapper resumeMapper;

    @Override
    public void selectResumeByresID(String resID) {
        resumeMapper.selectResumeByresID(resID);
    }
}
