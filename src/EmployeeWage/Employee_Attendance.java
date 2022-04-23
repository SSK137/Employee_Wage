package EmployeeWage;

import java.util.Random;

public class Employee_Attendance {
    public static void main(String[] args) {
        int absent;
        Random rdm = new Random();
        int ab = rdm.nextInt();
        absent=ab%2;
        if(absent == 0){
            System.out.println("Employee is Absent");
        }else {
            System.out.println("Employee is Present");
        }
    }
}
