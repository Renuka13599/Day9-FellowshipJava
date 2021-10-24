package com.bridgelabz;

public class EmpWage {
    public static void empWageStatus(int num) {
        public static final int part_time = 1;
        public static final int full_time = 2;
        public static final int wage_per_hour = 20;
        public static final int number_of_working_days = 20;


        public static void main (String[]args){
            int working_hours = 0;
            int salary = 0;
            int totalsalary = 0;
            for (int day = 0; day < number_of_working_days; day++) {
                int empcheck = (int) Math.floor(Math.random() * 10) % 3;

                switch (empcheck) {
                    case part_time:
                        working_hours = 4;
                        break;
                    case full_time:
                        working_hours = 8;
                        break;
                    default:
                        working_hours = 0;
                }
                salary = working_hours * wage_per_hour;
                totalsalary += salary;
                System.out.println(" Employee wage is: " + salary);
            }
            System.out.println(" Employee totalsalary is: " + totalsalary);
        }
    }

}