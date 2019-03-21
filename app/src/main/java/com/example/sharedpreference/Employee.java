package com.example.sharedpreference;

public class Employee {

    private String employeeName;
    private String employeeDesignation;
    private int employeePhoone;

    public Employee(String employeeName, String employeeDesignation, int employeePhoone) {
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
        this.employeePhoone = employeePhoone;
    }


    public int getEmployeePhoone() {
        return employeePhoone;
    }

    public void setEmployeePhoone(int employeePhoone) {
        this.employeePhoone = employeePhoone;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
