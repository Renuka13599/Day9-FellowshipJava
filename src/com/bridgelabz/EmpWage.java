package com.bridgelabz;

public class EmpWage {
    public static final double IS_FULL_TIME = 8;
    public static final double IS_PART_TIME = 4;
    public static final double EMP_WAGE_PER_HR = 20;

    public static void main(String[] args) {
        double Empcheck = (double) Math.floor(Math.random() * 10) % 3;
        double calcDailyWage = 0;
        if (Empcheck == 2) {
            System.out.println("Employee is present");
            calcDailyWage = IS_FULL_TIME * EMP_WAGE_PER_HR;
            System.out.printf("Calculate daily wage:" +calcDailyWage);

        } else if (Empcheck == 1) {
            calcDailyWage = IS_PART_TIME * EMP_WAGE_PER_HR;
            System.out.println("Part time wage is:");
            System.out.println("Calculate daily wage:" + calcDailyWage);
        } else {
            System.out.println("Employee is absent");

            System.out.println("Calculate daily wage:" + calcDailyWage);
        }
    }
}





