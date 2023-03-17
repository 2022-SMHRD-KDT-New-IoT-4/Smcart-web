package com.cart.model;

public class RecyclerDTO {
	
	private String prod_img;
	private String prod_name;
	private int prod_cnt;
	private int prod_price;
	
	public RecyclerDTO(String prod_img, String prod_name, int prod_cnt, int prod_price) {
		super();
		this.prod_img = prod_img;
		this.prod_name = prod_name;
		this.prod_cnt = prod_cnt;
		this.prod_price = prod_price;
	}

	
	public String getProd_img() {
		return prod_img;
	}

	public void setProd_img(String prod_img) {
		this.prod_img = prod_img;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public int getProd_cnt() {
		return prod_cnt;
	}

	public void setProd_cnt(int prod_cnt) {
		this.prod_cnt = prod_cnt;
	}

	public int getProd_price() {
		return prod_price;
	}

	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}

	
	
	
	
	
	
	
	
}
