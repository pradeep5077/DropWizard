package com.auxo.pradeep.model;

public class Employee {
    private int id;

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

    public int getDptid() {
        return dptid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", dob='" + dob + '\'' +
                ", dptid=" + dptid +
                '}';
    }

    public void setDptid(int dptid) {
        this.dptid = dptid;
    }

    public Employee(int id, String name, String phone, String dob, int dptid) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.dob = dob;
        this.dptid = dptid;
    }

    private String name;
    private String phone;
    private String dob;
    private int dptid;

}
