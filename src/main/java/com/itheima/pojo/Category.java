package com.itheima.pojo;

import java.util.List;

public class Category {
    private int id;
    private String typename;
    private List<ExProduct> exProductList;

    public List<ExProduct> getExProductList() {
        return exProductList;
    }

    public void setExProductList(List<ExProduct> exProductList) {
        this.exProductList = exProductList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", typename='" + typename + '\'' +
                ", exProductList=" + exProductList +
                '}';
    }
}
