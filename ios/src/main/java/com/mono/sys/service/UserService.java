package com.mono.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mono.common.dao.BaseDao;
import com.mono.common.service.BaseService;
import com.mono.sys.dao.UserDao;
import com.mono.sys.model.User;


@Service("userService")
public class UserService extends BaseService<User> {

	@Autowired
	private UserDao userDaoImpl;
	
	@Override
	public BaseDao<User> getBaseDao() {
		return userDaoImpl;
	}
	
}
