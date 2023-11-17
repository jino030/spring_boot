package com.yedam.app.user.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.yedam.app.user.service.UserService;
import com.yedam.app.user.service.UserVO;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public UserVO insertUserInfo(UserVO userVO) {
		System.out.print("===== 단건처리 start) ");
		System.out.println(userVO);
		System.out.print("===== 단건처리 end) ");
		return userVO;
	}

	@Override
	public Map<String, Object> insertUserList(List<UserVO> userList) {
		Map<String, Object> map = new HashMap<>();
		int total = 0;
		System.out.print("===== 다건처리 start) ");
		
		for(UserVO user : userList) {
			System.out.println(user);
			total++;
		}
		System.out.print("===== 다건처리 end) ");
		
		map.put("count", total);
		map.put("list", userList);
		
		return map;
	}

}
