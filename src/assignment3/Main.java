package assignment3;

import assignment3.Employee;
import assignment3.Manager;
import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Engineer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee engineer = new Engineer
                (101, "Jane Smith", "012-34", 120000.00);
        Employee manager = new Manager
                (207, "Barbara Johnson", "44-55454", 155545.54, "Us Marketing");
        Employee admin = new Admin
                (304, "bill munroe", "151515-5445", 545.515);
        Employee director = new Director
                (12, "Susan Wheeler", "009-545", 64556.00, "global marketing", 450000.00);
        System.out.println("engineer data:");
        engineer.printEmployee();
        System.out.println("---------------------------------------------------------");
        System.out.println("manager data:");
        manager.printEmployee();
        System.out.println("---------------------------------------------------------");

        System.out.println("admin data:");
        admin.printEmployee();
        System.out.println("---------------------------------------------------------");

        System.out.println("director data:");
        director.printEmployee();
        System.out.println("---------------------------------------------------------");


        System.out.println("checking the raise salary and setName method ........");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of salary to be increased");
        double increase = scanner.nextDouble();
        engineer.raiseSalary(increase);
        engineer.setName("Hari Dhakal");
        System.out.println("after changing the values of engineer");
        engineer.printEmployee();


    }
}