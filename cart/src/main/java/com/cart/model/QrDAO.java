package com.cart.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.cart.db.SqlSessionManager;

public class QrDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();

	public int SelectQr(String module_qr) {
		String data = null;
		int row = 0;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			data = session.selectOne("com.cart.model.QrDAO.SelectQr", module_qr);
			if (data != null) {
				row = 1;
				// 큐알 연동 성공시 tb_video_run 값을 1로 update한다.
				// (값을 가져다 모듈 연동 여부에 사용할 수 있도록)
				session.update("com.cart.model.QrDAO.UpdateRun",0);
			}
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			session.close();
		} 
		return row;
	}
}