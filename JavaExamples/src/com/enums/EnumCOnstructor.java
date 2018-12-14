package com.enums;

public class EnumCOnstructor {

	enum Departments{
		ACCOUNT(10), MANAGEMNET(5), MEDICAL(67),HR(50),SECURITY(15);
		
		private int deptId;
		private Departments(int departmentID) {
			deptId = departmentID;
		}
		
		public int getIds() {
			
			return deptId;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Departments dep = Departments.ACCOUNT;
		System.out.println("Name : " + dep.name() + " and Department ID : "+dep.getIds());
		
	}
	
	
}
