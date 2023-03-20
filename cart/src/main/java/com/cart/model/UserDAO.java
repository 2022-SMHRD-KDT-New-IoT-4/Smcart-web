package com.cart.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.cart.db.SqlSessionManager;

public class UserDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();

	public int join(UserDTO dto) {
		int row = 0;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			row = session.insert("com.cart.model.UserDAO.join", dto);
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			session.close();
		} 
		return row;
	}
	
	// 안드로이드 조인
	public int AndJoin(UserDTO dto) {
		int row = 0;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			row = session.insert("com.cart.model.UserDAO.AndJoin", dto);
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			session.close();
		} 
		return row;
	}

	public UserDTO login(UserDTO dto) {
		UserDTO user = null;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			user = session.selectOne("com.cart.model.UserDAO.login", dto);
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			session.close();
		} 
		return user;
	}
	
}
