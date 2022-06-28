package com.gl.driver;

import com.gl.departmentservice.AdminDepartment;
import com.gl.departmentservice.HRDepartment;
import com.gl.departmentservice.TechDepartment;

public class DriverClass {

	//private static final String String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment admin = new AdminDepartment ();
		HRDepartment Hr = new HRDepartment();
		TechDepartment Tech =  new TechDepartment ();

		System.out.println(" Welcome to " + admin.departmentName());
		System.out.println (admin.getTodaysWork());
		System.out.println (admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println('\n');
		
		System.out.println(" Welcome to " + Hr.departmentName());
		System.out.println (Hr.doActivity());
		System.out.println (Hr.getTodaysWork());
		System.out.println (Hr.getWorkDeadline());
		System.out.println(Hr.isTodayAHoliday());
		System.out.println('\n');
		
		System.out.println(" Welcome to " + Tech.departmentName());
		System.out.println (Tech.getTodaysWork());
		System.out.println (Tech.getWorkDeadline());
		System.out.println(Tech.getTechStackInformation());
		System.out.println(Tech.isTodayAHoliday());




	}

}
