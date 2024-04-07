package com.itheima.pojo;

public class IStudent {
    private int id;
    private String name;
    private int age;
    private int cid;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getOid() {
        return cid;
    }

    public void setOid(int oid) {
        this.cid = oid;
    }

    @Override
    public String toString() {
        return "IStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", oid=" + cid +
                '}';
    }
}
