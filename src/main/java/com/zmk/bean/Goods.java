package com.zmk.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Goods implements Serializable {
    private int gid;
    private String gname;
    private BigDecimal price;
    private double bfb;

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public double getBfb() {
        return bfb;
    }

    public void setBfb(double bfb) {
        this.bfb = bfb;
    }

    public Goods(int gid, String gname, BigDecimal price, double bfb) {
        this.gid = gid;
        this.gname = gname;
        this.price = price;
        this.bfb = bfb;
    }

    public Goods() {
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", price=" + price +
                ", bfb=" + bfb +
                '}';
    }
}
