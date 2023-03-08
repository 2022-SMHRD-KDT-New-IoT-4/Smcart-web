package com.cart.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import com.cart.db.SqlSessionManager;

public class BoardDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	public BoardDTO select(BoardDTO dto) {
		BoardDTO board = null;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			board = session.selectOne("com.cart.model.BoardDAO.boardselect", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return board;
	}
	
	public List<BoardDTO> boardselectall() {
		List<BoardDTO> list = null;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			list = session.selectList("com.cart.model.BoardDAO.boardselectall");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
	
	public int boardDelete(BoardDTO dto) {
		SqlSession session = sqlSessionFactory.openSession(true);
		int row = 0;
		try {
			row = session.delete("com.cart.model.BoardDAO.boarddelete", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return row;
	}
	
}
