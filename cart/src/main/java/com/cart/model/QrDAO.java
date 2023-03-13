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
			}
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			session.close();
			///1 12312312
		} 
		return row;
	}
}