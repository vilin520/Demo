package com.mono.sys.dao.impl;

import org.springframework.stereotype.Repository;

import com.mono.common.dao.impl.BaseDaoImpl;
import com.mono.sys.dao.UserDao;
import com.mono.sys.model.User;

@Repository("userDaoImpl")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

}
