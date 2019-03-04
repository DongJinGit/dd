package com.example.demo.entity;

public class Book {
    private int id;
    private String name;
    private String zhuangtai;

    public Book() {
    }

    public Book(int id, String name, String zhuangtai) {
        this.id = id;
        this.name = name;
        this.zhuangtai = zhuangtai;
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

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", zhuangtai='" + zhuangtai + '\'' +
                '}';
    }
}
