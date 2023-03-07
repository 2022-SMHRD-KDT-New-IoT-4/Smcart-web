package com.cart.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.cart.db.SqlSessionManager;

public class VideoDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();

	public List<VideoDTO> selectVideo() {
		List<VideoDTO> list = null;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			list = session.selectList("com.cart.model.VideoDAO.selectVideo");
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			session.close();
		} 
		return list;
	}
	
}
