package com.example.plan.entity;
public class User {
    private Integer user_id;
    private String login_id;
    private String name;
    private String password;
    private String email;
    private Integer phone_number;
    


    public User() {
    }

<<<<<<< HEAD
    public User(Integer user_id, String login_id, String name, String password, String email, Integer phone_number) {
=======
    public User(Integer user_id, String login_id, String name, String password) {
>>>>>>> 406cf891ccfa8792b0a7612a3c8d8d84d11180df
        System.out.println(name);
        this.user_id = user_id;
        this.login_id = login_id;
        this.name = name;
        this.password = password;
        this.email= email;
        this.phone_number= phone_number;
        
    }

    public Integer getUserId() {
        return user_id;
    }

    public void setUserId(Integer user_id) {
        this.user_id = user_id;
    }

    public String getLoginId() {
        return login_id;
    }

    public void setLoginId(String login_id) {
        this.login_id = login_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getUser() {
        return "User [id=" + user_id + ", name=" + name + ", login_id=" + login_id + ", email=" + email + ", phone_number=" + phone_number + ",]";
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(Integer phone_number) {
		this.phone_number = phone_number;
	}


	}

