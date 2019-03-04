package com.example.demo.entity;

import java.time.LocalDate;

public class Borrow {
    private int id;
    private int uid;
    private int bid;
    private LocalDate outtime;
    private LocalDate endtime;
    private LocalDate backtime;
    private boolean isexpired;
    private double money;

    public Borrow() {
    }

    public Borrow(int id, int uid, int bid, LocalDate outtime, LocalDate endtime, LocalDate backtime, boolean isexpired, double money) {
        this.id = id;
        this.uid = uid;
        this.bid = bid;
        this.outtime = outtime;
        this.endtime = endtime;
        this.backtime = backtime;
        this.isexpired = isexpired;
        this.money = money;
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

    public LocalDate getOuttime() {
        return outtime;
    }

    public void setOuttime(LocalDate outtime) {
        this.outtime = outtime;
    }

    public LocalDate getEndtime() {
        return endtime;
    }

    public void setEndtime(LocalDate endtime) {
        this.endtime = endtime;
    }

    public LocalDate getBacktime() {
        return backtime;
    }

    public void setBacktime(LocalDate backtime) {
        this.backtime = backtime;
    }

    public boolean isIsexpired() {
        return isexpired;
    }

    public void setIsexpired(boolean isexpired) {
        this.isexpired = isexpired;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "id=" + id +
                ", uid=" + uid +
                ", bid=" + bid +
                ", outtime=" + outtime +
                ", endtime=" + endtime +
                ", backtime=" + backtime +
                ", isexpired=" + isexpired +
                ", money=" + money +
                '}';
    }
}
