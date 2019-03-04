package com.example.demo.entity;

public class User {
    private int id;
    private String name;
    private String password;
    private String zhuangtai;
    private String yajin;


    public User() {
    }

    public User(int id, String name, String password, String zhuangtai, String yajin) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.zhuangtai = zhuangtai;
        this.yajin = yajin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    public String getYajin() {
        return yajin;
    }

    public void setYajin(String yajin) {
        this.yajin = yajin;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", zhuangtai='" + zhuangtai + '\'' +
                ", yajin='" + yajin + '\'' +
                '}';
    }
}
