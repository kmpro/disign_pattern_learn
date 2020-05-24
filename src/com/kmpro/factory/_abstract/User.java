package com.kmpro.factory._abstract;

public class User {

    private long id;

    private String userName;

    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
