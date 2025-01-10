package com.staticblock;


public class MainEmployee {
	public static void main(String[] args) {
		System.out.println("Employee Id:"+Employee.getEmpId());
		
		Employee emp1=new Employee("Aishwarya",20000.54);
		System.out.println("Employee Id:"+Employee.getEmpId());
		System.out.println("Employee Name:"+emp1.getEmpName());
		System.out.println("Employee sal:"+emp1.getEmpSal());
		System.out.println("Employee PfPercentage:"+Employee.getPfPercentage());
		
		System.out.println("------------------------------------------------------------");
		
		Employee emp2=new Employee("Gauri",21);
		System.out.println("Employee Id:"+Employee.getEmpId());
		System.out.println("Employee Name:"+emp2.getEmpName());
		System.out.println("Employee sal:"+emp2.getEmpSal());
		System.out.println("Employee PfPercentage:"+Employee.getPfPercentage());
		
		System.out.println("------------------------------------------------------------");
		
		Employee emp3=new Employee("Nikita",21);
		System.out.println("Employee Id:"+Employee.getEmpId());
		System.out.println("Employee Name:"+emp3.getEmpName());
		System.out.println("Employee sal:"+emp3.getEmpSal());
		System.out.println("Employee PfPercentage:"+Employee.getPfPercentage());
		
		System.out.println("------------------------------------------------------------");
		
		Employee emp4=new Employee("Shweta",21);
		System.out.println("Employee Id:"+Employee.getEmpId());
		System.out.println("Employee Name:"+emp4.getEmpName());
		System.out.println("Employee sal:"+emp4.getEmpSal());
		System.out.println("Employee PfPercentage:"+Employee.getPfPercentage());
		
		System.out.println("------------------------------------------------------------");
		
		
	}

}
