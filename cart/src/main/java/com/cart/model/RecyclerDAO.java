package com.cart.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.cart.db.SqlSessionManager;

public class RecyclerDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
	public List<RecyclerDTO> select() {
		List<RecyclerDTO> list = null;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			list = session.selectList("com.cart.model.RecyclerDAO.SelectRec");
			if(list != null) {
				for (RecyclerDTO i : list) {
					System.out.println(i.getProd_cnt());
					System.out.println(i.getProd_name());
				}
			}
			System.out.println("들어오니???"+list);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
	
	
	
	
	
	


}
