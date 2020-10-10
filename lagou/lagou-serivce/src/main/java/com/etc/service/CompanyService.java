package com.etc.service;

import com.etc.entity.Company;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CompanyService {

	public PageInfo<Company> query(Company c, int pageNum, int pageSize);
}
