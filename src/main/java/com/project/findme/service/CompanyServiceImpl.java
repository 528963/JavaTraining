package com.project.findme.service;

import com.project.findme.mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class CompanyServiceImpl implements CompanyService{
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public void selectCompanyByName(String CompanyName) {
        companyMapper.selectCompanyByName(CompanyName);
    }

    @Override
    public void selectByCompanyId(String Scope) {
        companyMapper.selectByCompanyId(Scope);
    }
}
