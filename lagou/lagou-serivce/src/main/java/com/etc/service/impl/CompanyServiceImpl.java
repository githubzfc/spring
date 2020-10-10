package com.etc.service.impl;

import com.etc.dao.CompanyDao;
import com.etc.entity.Company;
import com.etc.service.CompanyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Resource
	private CompanyDao companyDao;
	
	public PageInfo<Company> query(Company c,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		List<Company> list = companyDao.query(c);
		PageInfo<Company> p = new PageInfo<>(list);
		return p;
	}
}
