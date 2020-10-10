package com.etc.service;

import com.etc.entity.Job;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface JobService {

	public PageInfo<Job> query(Job j, int pageNum, int pageSize);
}
