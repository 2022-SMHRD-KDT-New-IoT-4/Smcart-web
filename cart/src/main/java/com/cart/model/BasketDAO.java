package com.cart.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.cart.db.SqlSessionManager;

public class BasketDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
	
	public List<BasketDTO> SelectBasket(){
		BasketDTO dto = new BasketDTO();
		List<BasketDTO> basket_list = null;

		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			basket_list = session.selectList("com.cart.model.BasketDAO.SelectBasket");
			
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			session.close();
		} 
		return basket_list;
	}
	
	
	public int InsertBasket(String bc_input) {
		
		System.out.println("BasketDAO에 들어간 bc_input : "+bc_input); // 잘 들감
		ProdDTO data = null;
		int row = 0;
		int result = 0;
//		int row = 0;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
//			ProdDTO temp = new ProdDTO();
//			temp.setProd_seq(bc_input);
//			data = session.selectOne("com.cart.model.BasketDAO.SelectBasket");
//			System.out.println("들어오니1???"+data);
			result = session.insert("com.cart.model.BasketDAO.InsertBasket", bc_input);
//			System.out.println("들어오니2???"+basketdto);
			
			// data를 android로 보낼 때 형식?
			if (result > 0 ) {
				row = 1;
			}
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			session.close();
		} 
		return row;
		
	}

}