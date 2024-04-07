package com.itheima.pojo;

import java.util.List;

public class IClass {
    private Integer id;
    private String classname;
    private List<IStudent>  iStudentList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public List<IStudent> getiStudents() {
        return iStudentList;
    }

    public void setiStudents(List<IStudent> iStudents) {
        this.iStudentList = iStudents;
    }

    @Override
    public String toString() {
        return "IClass{" +
                "id=" + id +
                ", classname='" + classname + '\'' +
                ", iStudents=" + iStudentList +
                '}';
    }
}
