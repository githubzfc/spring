package com.etc.dao;

import com.etc.entity.Company;

import java.util.List;

public interface CompanyDao {

	public List<Company> query(Company c);
	
}
