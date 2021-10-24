package com.bridgelabz;

public class EmpWage {
    public static   int Full_Time_Hrs = 8;
    public static  int PartTime_Hrs = 4;
    double dailywage = 0;
    double monthlywage = 0;

    int workingDays ;
    int wagePerHour;

    public  void setVariables(int x, int y) {
        this.workingDays=x;
        this.wagePerHour=y;
    }

    public  void wageForMultiplecmy(){
        Random random = new Random();
        int empCheck = random.nextInt(3);


        for (int i =0; i< workingDays; i++){

            switch (empCheck){
                case 1:
                    dailywage = wagePerHour * Full_Time_Hrs * i;
                    break;
                case 2:
                    dailywage = wagePerHour * (Full_Time_Hrs + PartTime_Hrs) * i;
                    break;
                case 0:
                    break;

            }
            monthlywage = monthlywage + dailywage;
        }
        System.out.println( monthlywage);
    }



    public static void main(String[] args) {



        EmpWage Tcs = new EmpWage();
        System.out.println("Monthley wage for Tcs company is ");
        Tcs.setVariables(20, 50);
        Tcs.wageForMultiplecmy();



        EmpWage Infosys = new EmpWage();
        System.out.println("Monthley wage for Infosys company is ");
        Infosys.setVariables(25, 55);
        Infosys.wageForMultiplecmy();

        EmpWage Capgemini = new EmpWage();
        System.out.println("Monthley wage for Capgemini company is ");
        Capgemini.setVariables(30, 60);
        Capgemini.wageForMultiplecmy();

    }
}


