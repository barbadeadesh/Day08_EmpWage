package com.employeewageusingoop;

public class Uc4_EmployeeWageUsingSwitchUsingOop {
	
	//static & final variable
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
		public static final int IS_ABSENT = 0;
		public static final int WAGE_PER_HOUR = 20;

		public void partTimeEmployeeWage() {
			//local variable
			int workHrs = 0;
			int empCheck = (int)(Math.random()*10)%3;

			//computation to check daily wage
			switch(empCheck) {
			case IS_FULL_TIME : workHrs = 16;
			System.out.println("Employee is full time present & working hours = "+workHrs);
			break;

			case IS_PART_TIME : workHrs = 8;
			System.out.println("Employee is part time present & working hours = "+workHrs);
			break;

			case IS_ABSENT : workHrs = 0;
			System.out.println("Employee is absent & working hours = "+workHrs);
			break;

			default:System.out.println("Invalid Input");
			}
			System.out.println("Employee daily wage = "+(workHrs*WAGE_PER_HOUR));
		}

		public static void main(String[] args) {
			Uc4_EmployeeWageUsingSwitchUsingOop obj1 = new Uc4_EmployeeWageUsingSwitchUsingOop();	
			obj1.partTimeEmployeeWage();
		}

}
