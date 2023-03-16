package com.cart.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.cart.db.SqlSessionManager;

public class ProductDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	public List<ProductDTO> select(ProductDTO dto) {
		List<ProductDTO> list = null;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			list = session.selectList("com.cart.model.Product.selectProd", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
}
