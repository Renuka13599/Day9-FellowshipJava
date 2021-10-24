package com.bridgelabz;

public class EmpWage {
    public static final double IS_FULL_TIME=8;
    public static final double EMP_WAGE_PER_HR=20;
    public static void main(String[] args)
    {
        double Empcheck = (Math.random() * 10) %2 ;
        if(Empcheck == IS_FULL_TIME)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
        double calcDailyWage=0;
        calcDailyWage=IS_FULL_TIME*EMP_WAGE_PER_HR;
        System.out.println("Calculate daily wage:" +calcDailyWage);

    }
}

