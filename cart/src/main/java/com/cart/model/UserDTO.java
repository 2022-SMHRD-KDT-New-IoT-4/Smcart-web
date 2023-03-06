package com.cart.model;

public class UserDTO {
	 
    private String user_id; // 회원 아이디
    private String user_pw;  // 회원 비밀번호 
    private String user_name;  // 회원 이름 
    private String user_nick; // 회원 닉네임 
    private String user_email; // 회원 이메일 
    private String user_phone; // 회원 휴대폰 
    private String user_type; // 회원 유형 일반회원: 'U', 관리자: 'A'

    public UserDTO(String user_id, String user_pw, String user_name, String user_nick, String user_email, String user_phone,
			String user_type) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.user_nick = user_nick;
		this.user_email = user_email;
		this.user_phone = user_phone;
		this.user_type = user_type;
	}
    
    public UserDTO() {
    	
	}

	public String getuser_id() {
        return user_id;
    }

    public void setuser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getuser_pw() {
        return user_pw;
    }

    public void setuser_pw(String user_pw) {
        this.user_pw = user_pw;
    }

    public String getuser_name() {
        return user_name;
    }

    public void setuser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getuser_nick() {
        return user_nick;
    }

    public void setuser_nick(String user_nick) {
        this.user_nick = user_nick;
    }

    

	public String getuser_email() {
        return user_email;
    }

    public void setuser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getuser_phone() {
        return user_phone;
    }

    public void setuser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getuser_type() {
        return user_type;
    }

    public void setuser_type(String user_type) {
        this.user_type = user_type;
    }

}
