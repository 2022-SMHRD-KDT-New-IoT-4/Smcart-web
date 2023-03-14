package com.cart.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.cart.db.SqlSessionManager;

public class VideoRunDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();

	public int isRun() {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			result = session.selectOne("com.cart.model.VideoRunDAO.isRun");
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			session.close();
		} 
		return result;
	}
	
}
