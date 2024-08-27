package com.example.domain;

import assignment3.Manager;

public class Director extends Manager {


    private double budget;

    public double getBudget() {
        return budget;
    }

    public Director(int empId, String name, String ssn, double salary, String departmentName, double budget) {
        super(empId, name, ssn, salary, departmentName);



    }
}
