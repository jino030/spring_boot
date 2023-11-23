package com.yedam.app.emp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yedam.app.emp.mapper.AopMapper;
import com.yedam.app.emp.service.AopService;

@Service
public class AopServiceImpl implements AopService {
	
	@Autowired
	AopMapper aopMapper;

	@Transactional // 클래스 전체에 대해서도 걸수 있다.
	@Override
	public void insert() {
		aopMapper.insertNumber("101");
		aopMapper.insertNumber("a101");
	}

}
