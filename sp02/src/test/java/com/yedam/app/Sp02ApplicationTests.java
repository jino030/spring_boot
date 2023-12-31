package com.yedam.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yedam.app.config.JasyptConfig;
import com.yedam.app.emp.service.AopService;
import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;

@SpringBootTest
class Sp02ApplicationTests {

	@Autowired
	EmpService empService;
	
	@Autowired
	StringEncryptor jasyptStringEncryptor;
	
	@Autowired
	AopService aopService;
	
	//@Test
	void contextLoads() {
		List<EmpVO> list = empService.getEmpAllList();
		assertTrue(!list.isEmpty());
	}
	
	//@Test
	void encryptor() {
		String[] datas = {
		                  ""
		                  ,""
		                  ,""
		                  ,""
		};
		
		for(String data : datas) {
			String encData = jasyptStringEncryptor.encrypt(data);
			System.out.println(encData);
		}
	}
	
	
	@Test
	void aopTest() {
		// number 타입 안맞음 101만들어감..
		aopService.insert();
	}

}
