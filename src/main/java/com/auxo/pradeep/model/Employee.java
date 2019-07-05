package com.auxo.pradeep.model;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String place;
    private String dob;
    private String phone;
    private int dptid;

    public Employee(int id, String name, int age, String place, String dob, String phone, int dptid) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.place = place;
        this.dob = dob;
        this.phone = phone;
        this.dptid = dptid;

    }

    @Override

    public String toString() {

        return "Employee{" +

                "id=" + id +

                ", name='" + name + '\'' +

                ", age=" + age +

                ", place='" + place + '\'' +

                ", dob='" + dob + '\'' +

                ", phone='" + phone + '\'' +
                ", dptid=" + dptid +
                '}';

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getDptid() {
        return dptid;
    }

    public void setDptid(int dptid) {
        this.dptid = dptid;
    }
}
