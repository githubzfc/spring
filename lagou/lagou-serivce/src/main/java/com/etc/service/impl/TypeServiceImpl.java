package com.etc.service.impl;

import com.etc.dao.OneTypeDao;
import com.etc.entity.OneType;
import com.etc.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//����ҵ��
@Service
public class TypeServiceImpl implements TypeService {

	@Resource
	private OneTypeDao oneTypeDao;
	
	public List<OneType> query(){
		return oneTypeDao.query();
	}
	
}
