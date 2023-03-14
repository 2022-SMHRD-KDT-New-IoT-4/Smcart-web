package com.cart.model;

public class ProdDTO {

	private String prod_id;
	private String prod_name;
	private String prod_bardcode;
	private String prod_price;
	private String prod_loc;
	private String prod_img;
	private String prod_stock_yn;
	
	
	
	
	
	
	public ProdDTO(String prod_id, String prod_name, String prod_bardcode, String prod_price, String prod_loc,
			String prod_img, String prod_stock_yn) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_bardcode = prod_bardcode;
		this.prod_price = prod_price;
		this.prod_loc = prod_loc;
		this.prod_img = prod_img;
		this.prod_stock_yn = prod_stock_yn;
	}
	
	
	
	public ProdDTO() {
		super();
	
	}
	
	
	
	
	
	public String getProd_id() {
		return prod_id;
	}
	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getProd_bardcode() {
		return prod_bardcode;
	}
	public void setProd_bardcode(String prod_bardcode) {
		this.prod_bardcode = prod_bardcode;
	}
	public String getProd_price() {
		return prod_price;
	}
	public void setProd_price(String prod_price) {
		this.prod_price = prod_price;
	}
	public String getProd_loc() {
		return prod_loc;
	}
	public void setProd_loc(String prod_loc) {
		this.prod_loc = prod_loc;
	}
	public String getProd_img() {
		return prod_img;
	}
	public void setProd_img(String prod_img) {
		this.prod_img = prod_img;
	}
	public String getProd_stock_yn() {
		return prod_stock_yn;
	}
	public void setProd_stock_yn(String prod_stock_yn) {
		this.prod_stock_yn = prod_stock_yn;
	}
	
	
}
