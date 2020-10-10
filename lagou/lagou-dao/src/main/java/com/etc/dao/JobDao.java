package com.etc.dao;

import com.etc.entity.Job;

import java.util.List;

public interface JobDao {

	public List<Job> query(Job job);
	
}
