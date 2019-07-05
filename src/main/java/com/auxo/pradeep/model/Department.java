package com.auxo.pradeep.model;

public class Department {


    private int dptid;

    private String dptname;
    @Override

    public String toString() {

        return "Department{" +

                "dptid=" + dptid +

                ", dptname='" + dptname + '\'' +

                '}';
    }

    public int getDptid() {
        return dptid;
    }

    public void setDptid(int dptid) {
        this.dptid = dptid;
    }

    public String getDptname() {
        return dptname;
    }

    public void setDptname(String dptname) {
        this.dptname = dptname;
    }

    public Department(int dptid, String dptname) {

        this.dptid = dptid;

        this.dptname = dptname;

    }



}
