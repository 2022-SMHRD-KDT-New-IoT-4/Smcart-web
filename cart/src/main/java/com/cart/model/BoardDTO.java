package com.cart.model;

import java.sql.Date;

public class BoardDTO {

    
    private Long board_seq; // 글 순번 
    private String board_title; // 글 제목
    private String board_content; // 글 내용 
    private Date board_dt; // 글 작성기간 
    private String user_id; // 회원 아이디 

    public BoardDTO(Long board_seq, String board_title, String board_content, Date board_dt, String user_id) {
		super();
		this.board_seq = board_seq;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_dt = board_dt;
		this.user_id = user_id;
	}
    
    public BoardDTO() {
	}

	public Long getboard_seq() {
        return board_seq;
    }

    public void setboard_seq(Long board_seq) {
        this.board_seq = board_seq;
    }

    public String getboard_title() {
        return board_title;
    }

    public void setboard_title(String board_title) {
        this.board_title = board_title;
    }

    public String getboard_content() {
        return board_content;
    }

    public void setboard_content(String board_content) {
        this.board_content = board_content;
    }

    public Date getboard_dt() {
        return board_dt;
    }


	public void setboard_dt(Date board_dt) {
        this.board_dt = board_dt;
    }

    public String getuser_id() {
        return user_id;
    }

    public void setuser_id(String user_id) {
        this.user_id = user_id;
    }
}
