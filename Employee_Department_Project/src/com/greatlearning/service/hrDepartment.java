package com.greatlearning.service;

public class hrDepartment extends superDepartment {

	public String getDepartmentName() {
		return "Welcome to HR Deparment";
	}

	public String doActivity() {
		return "Team Lunch";
	}

	public String getTodaysWork() {
		return "Fill today's worksheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
