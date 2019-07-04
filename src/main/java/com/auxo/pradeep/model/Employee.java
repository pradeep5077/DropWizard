package com.auxo.pradeep.model;

public class Employee {
    private int id;
    private String name;
    private String phone;
    private String dob;
    private int deptid;

    public Employee(int id, String name, String phone, String dob, int deptid) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.dob = dob;
        this.deptid = deptid;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int dptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", dob='" + dob + '\'' +
                ", deptid=" + deptid +
                '}';
    }

}
