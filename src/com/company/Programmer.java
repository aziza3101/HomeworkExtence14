package com.company;

public class Programmer extends Person{
    private String companyName;
    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }
    void coding () {
        System.out.println(getName() + " coding");
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Programmer: " + companyName + super.toString();
    }
}

