package com.taojiang.crudTest;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.taojiang.bean.UserVO;
import com.taojiang.utils.SqlSessionUtils;

public class Test_2 {
	
	@SuppressWarnings("unused")
	public void testInster() {
		UserVO addUsers = new UserVO();
		addUsers.setNAME("taojiang");
		addUsers.setAge((int)Math.random() * 30);
		
		SqlSession sqls = SqlSessionUtils.getSqlSession();
		String statment = "com.taojiang.crudTest.SqlMapper.addUsers";
		sqls.insert(statment, addUsers);
		sqls.commit();
		sqls.close();
	}
	
	
	public void testUpdate() {
		UserVO user = new UserVO();
		user.setNAME("taojiang");
		user.setAge(30);
		user.setId(6);
		
		SqlSession sqls = SqlSessionUtils.getSqlSession();
		String statement = "com.taojiang.crudTest.SqlMapper.updateUsers";
		sqls.update(statement, user);
		sqls.commit();
		sqls.close();
	}
	
	public void testDel() {
		SqlSession sqls = SqlSessionUtils.getSqlSession();
		String statement = "com.taojiang.crudTest.SqlMapper.delUser";
		sqls.delete(statement,4);
		sqls.commit();
		sqls.close();	
	}
	
	@Test
	public void getAllUsrs() {
		List<UserVO> allUsers;
		String statement = "com.taojiang.crudTest.SqlMapper.getAllUsers";
		SqlSession sqls = SqlSessionUtils.getSqlSession();
		allUsers = sqls.selectList(statement);
		System.out.println(allUsers);
		sqls.close();
	}
	
}
