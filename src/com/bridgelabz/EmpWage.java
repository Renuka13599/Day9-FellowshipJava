package com.bridgelabz;

public class EmpWage {
    public static void empWageForMonth(int num){
        int Wage_Per_Hr = 20;
        int Day_Hrs = 8;
        int Part_Time_Hrs = 4;
        int Days = 20;
        int Max_Hrs_Per_Month = 100;

        int totalEmpHrs = 0;
        int empHrs = 0;
        int totalWorkingDays = 0;
        double monthlywage = 0;

        while (totalEmpHrs <= Max_Hrs_Per_Month && totalWorkingDays < Days){
            totalWorkingDays++;
            switch (num){
                case 1:
                    empHrs = Day_Hrs;

                    break;
                case 2:
                    empHrs = Part_Time_Hrs;
                    break;
                case 0:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
        }
        monthlywage = totalEmpHrs * Wage_Per_Hr;
        System.out.println("Monthly Wage : " + monthlywage);


    }

    public static void main(String[] args) {

        Random random = new Random();
        int a = random.nextInt(3);
        empWageForMonth(a);

    }
}
