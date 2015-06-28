package com.taojiang.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtils {	
	
	private static Reader in = null;
	private static SqlSessionFactory sqlFactory = null;
	
	@SuppressWarnings("unused")
	public static SqlSession getSqlSession() {
		String localURL = "SqlConfig.xml";
		SqlSession sqls = null;
		try {
			if(sqlFactory == null) {
				in = Resources.getResourceAsReader(localURL);
				sqlFactory = new SqlSessionFactoryBuilder().build(in);
			}
			sqls = sqlFactory.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sqls;
	}
}
