package com.project.findme.service;

public interface JobService {
    void selectJobByName(String JobName);
    void selectJobByKind(String JKind);
    void selectJobByArea(String Area);
}
