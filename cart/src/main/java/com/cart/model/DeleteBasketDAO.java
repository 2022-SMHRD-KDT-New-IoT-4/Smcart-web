package com.cart.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.cart.db.SqlSessionManager;

public class DeleteBasketDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();

	public int DeleteBasket(String prod_seq) {
		
		System.out.println(prod_seq);
		BasketDTO data = null;

		int row = 0;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			ProdDTO temp = new ProdDTO();
			temp.setProd_seq(prod_seq);
			data = session.selectOne("com.cart.model.DeleteBasketDAO.DeleteBasket", temp);
		
			
			// data를 android로 보낼 때 형식?
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
