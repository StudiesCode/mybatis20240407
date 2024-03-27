package com.itheima.pojo;

import java.util.List;

public class ExProduct {
    private int id;
    private String goodsname;
    private double price;
    private int typedid;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTypedid() {
        return typedid;
    }

    public void setTypedid(int typedid) {
        this.typedid = typedid;
    }

    @Override
    public String toString() {
        return "ExProduct{" +
                "id=" + id +
                ", goodsname='" + goodsname + '\'' +
                ", price=" + price +
                ", typedid=" + typedid +
                '}';
    }
}
