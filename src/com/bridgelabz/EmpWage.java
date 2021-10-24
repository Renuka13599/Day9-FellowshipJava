package com.bridgelabz;
import java.util.random;

public class EmpWage {
    public static void empWageStatus(int num){
        int Wage_Per_Hr= 20;
        int Day_Hrs = 8;
        int PartTime_Hrs = 8;

        switch (num){
            case 1:
                System.out.println("Employee Present");
                System.out.println("DailyWage = " + Wage_Per_Hr * Day_Hrs);
                break;
            case 2:
                System.out.println("Employee Present");
                System.out.println("DailyWage with Part Time = " + Wage_Per_Hr * (Day_Hrs + PartTime_Hrs));
                break;
            case 0:
                System.out.println("Employee Absent");
                System.out.println("DailyWage = "+0);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation Program");

        Random random = new Random();
        int r = random.nextInt(3);
        empWageStatus(r);
    }

}




