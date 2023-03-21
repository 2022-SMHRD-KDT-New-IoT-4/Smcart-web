package com.cart.model;

import java.sql.Date;

public class BasketDTO {
	 
    private Long sb_seq; // 장바구니 순번 
    private String prod_id;  // 상품 아이디 
    private String user_id; // 회원 아이디 
    private Integer prod_cnt; // 상품 수량 
    private Date sb_time; // 등록 시간 
    private String prod_img; // 상품 이미지
    private int prod_price;
    private String prod_name;
    
    

    
    public Long getsb_seq() {
        return sb_seq;
    }

    public void setsb_seq(Long sb_seq) {
        this.sb_seq = sb_seq;
    }

    public String getprod_id() {
        return prod_id;
    }

    public void setprod_id(String prod_id) {
        this.prod_id = prod_id;
    }

    public String getuser_id() {
        return user_id;
    }

    public void setuser_id(String user_id) {
        this.user_id = user_id;
    }

    public Integer getprod_cnt() {
        return prod_cnt;
    }

    public void setprod_cnt(Integer prod_cnt) {
        this.prod_cnt = prod_cnt;
    }

    public Date getsb_time() {
        return sb_time;
    }

    public void setsb_time(Date sb_time) {
        this.sb_time = sb_time;
    }

	

	public String getProd_img() {
		return prod_img;
	}

	public void setProd_img(String prod_img) {
		this.prod_img = prod_img;
	}

	public int getProd_price() {
		return prod_price;
	}

	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
}
