package com.su.demo.model;

public class User {
    private Integer uuid;

    private String name;

    private String password;

    private String sex;

    public User() {
    }

    public User(String name, String password, String sex) {
        this.name = name;
        this.password = password;
        this.sex = sex;
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
}