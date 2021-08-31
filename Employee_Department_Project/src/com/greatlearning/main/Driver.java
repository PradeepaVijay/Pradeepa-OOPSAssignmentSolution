package com.greatlearning.main;
import com.greatlearning.service.adminDepartment;
import com.greatlearning.service.hrDepartment;
import com.greatlearning.service.superDepartment;
import com.greatlearning.service.techDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superDepartment sd = new superDepartment();
		System.out.println(sd.getDepartmentName());
		System.out.println(sd.getTodaysWork());
		System.out.println(sd.getWorkDeadline());
		System.out.println(sd.getTodayAholiday());
		System.out.println();
		adminDepartment ad = new adminDepartment();
		System.out.println(ad.getDepartmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.getTodayAholiday());
		System.out.println();
		hrDepartment hd = new hrDepartment();
		System.out.println(hd.getDepartmentName());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodayAholiday());
		System.out.println();
		techDepartment td = new techDepartment();
		System.out.println(td.getDepartmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.getTodayAholiday());

	}

}
