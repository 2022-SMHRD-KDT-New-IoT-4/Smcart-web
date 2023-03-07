package com.cart.model;

import java.sql.Date;

public class VideoDTO {

    
    private String video_id; // 영상 아이디 
    private String module_id; // 모듈 아이디
    private String user_id; // 회원 아이디 
    private String video_path; // 영상 경로
    private Date video_exp; // 만료 기간 

    public VideoDTO(String video_id, String module_id, String user_id, String video_path, Date video_exp) {
		super();
		this.video_id = video_id;
		this.module_id = module_id;
		this.user_id = user_id;
		this.video_path = video_path;
		this.video_exp = video_exp;
	}
    
    public String getvideo_id() {
        return video_id;
    }

    public void setvideo_id(String video_id) {
        this.video_id = video_id;
    }

    public String getmodule_id() {
        return module_id;
    }

    

	public void setmodule_id(String module_id) {
        this.module_id = module_id;
    }

    public String getuser_id() {
        return user_id;
    }

    public void setuser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getvideo_path() {
        return video_path;
    }

    public void setvideo_path(String video_path) {
        this.video_path = video_path;
    }

    public Date getvideo_exp() {
        return video_exp;
    }

    public void setvideo_exp(Date video_exp) {
        this.video_exp = video_exp;
    }

}
