package com.example.demo.entity;

public class Returns {
    private int id;
    private int uid;
    private int bid;
    private String backtime;

    public Returns() {
    }

    public Returns(int id, int uid, int bid, String backtime) {
        this.id = id;
        this.uid = uid;
        this.bid = bid;
        this.backtime = backtime;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBacktime() {
        return backtime;
    }

    public void setBacktime(String backtime) {
        this.backtime = backtime;
    }

    @Override
    public String toString() {
        return "Returns{" +
                "id=" + id +
                ", uid=" + uid +
                ", bid=" + bid +
                ", backtime='" + backtime + '\'' +
                '}';
    }
}
