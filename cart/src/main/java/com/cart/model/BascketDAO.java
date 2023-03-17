package com.cart.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.cart.db.SqlSessionManager;

public class BascketDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();

	public int InsertBasket(String bc_input) {
		
		System.out.println(bc_input);
		ProdDTO data = null;
		int basketdto = 0;

		int row = 0;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			ProdDTO temp = new ProdDTO();
			temp.setProd_seq(bc_input);
			data = session.selectOne("com.cart.model.BasketDAO.SelectProd", temp);
			System.out.println("들어오니1???"+data);
			basketdto = session.insert("com.cart.model.BasketDAO.InsertBasket", data);
			System.out.println("들어오니2???"+basketdto);
			
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