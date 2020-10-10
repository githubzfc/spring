package com.etc.service.impl;

import com.etc.entity.Job;
import com.etc.dao.JobDao;
import com.etc.service.JobService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Resource
    private JobDao jobDao;

	public PageInfo<Job> query(Job j,int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Job> list = jobDao.query(j);
        PageInfo<Job> p = new PageInfo<>(list);
        return p;
    }
}
