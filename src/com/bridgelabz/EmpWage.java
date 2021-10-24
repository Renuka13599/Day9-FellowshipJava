package com.bridgelabz;

public class EmpWage {
    public static final double IS_FULL_TIME = 1;

    public static void main(String[] args) {
        double IS_FULL_TIME = 1;
        double Empcheck = (Math.random() * 10) % 2;
        if (Empcheck == IS_FULL_TIME)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }

}
