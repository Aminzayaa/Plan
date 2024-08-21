package com.example.plan.entity;
public class User {
    private Integer user_id;
    private String login_id;
    private String name;
    private String password;


    public User() {
    }

    public User(Integer user_id, String login_id, String name, String password) {
        System.out.println(name);
        this.user_id = user_id;
        this.login_id = login_id;
        this.name = name;
        this.password = password;
        
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

    public String getPasword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getUser() {
        return "User [id=" + user_id + ", name=" + name + ", login_id=" + login_id + "]";
    }
}
