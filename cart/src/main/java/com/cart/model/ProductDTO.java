package com.cart.model;

public class ProductDTO {
	 
    private String prod_seq; // 상품 아이디 
    private String prod_name; // 상품 명 
    private String prod_bardcode;  // 상품 바코드 
    private Integer prod_price; // 상품 가격 
    private String prod_loc;  // 상품 위치 
    private String prod_img;  // 상품 이미지 
    private String prod_stockyn; // 재고 여부 

    public String getprod_seq() {
        return prod_seq;
    }

    public void setprod_seq(String prod_seq) {
        this.prod_seq = prod_seq;
    }

    public String getprod_name() {
        return prod_name;
    }

    public void setprod_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public String getprod_bardcode() {
        return prod_bardcode;
    }

    public void setprod_bardcode(String prod_bardcode) {
        this.prod_bardcode = prod_bardcode;
    }

    public Integer getprod_price() {
        return prod_price;
    }

    public void setprod_price(Integer prod_price) {
        this.prod_price = prod_price;
    }

    public String getprod_loc() {
        return prod_loc;
    }

    public void setprod_loc(String prod_loc) {
        this.prod_loc = prod_loc;
    }

    public String getprod_img() {
        return prod_img;
    }

    public void setprod_img(String prod_img) {
        this.prod_img = prod_img;
    }

    public String getprod_stockyn() {
        return prod_stockyn;
    }

    public void setprod_stockyn(String prod_stockyn) {
        this.prod_stockyn = prod_stockyn;
    }
}
