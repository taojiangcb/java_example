package com.taojiang.test1;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import com.mysql.jdbc.Driver;
import com.taojiang.bean.UserVO;

public class Test_1 {
	
	public static void main(String[] args) {
		String resource = "SqlConfig.xml";
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);
			SqlSessionFactory sqlsf = new SqlSessionFactoryBuilder().build(reader);
			SqlSession session = sqlsf.openSession();
			String statement = "com.taojiang.test1.SqlMapper.getUser";
			UserVO user = session.selectOne(statement,2);
			System.out.println(user);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
