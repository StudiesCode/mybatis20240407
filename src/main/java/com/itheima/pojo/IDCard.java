package com.itheima.pojo;

public class IDCard {
    private Integer id;
    private String code;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
