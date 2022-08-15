package globalVariableUse;

public class Employee {
	
	//emp_name, emp_id, emp_sal, emp_desg, emp_age, emp_gender
	
	//global variable
	
	String emp_name;
	String emp_id;
	float emp_sal;
	String emp_desg;
	int emp_age;
	char emp_gender;
	
	public void emp_info()
	{
		System.out.println("======================================");
		System.out.println("Employee Name is "+emp_name);
		System.out.println("Employee ID is "+emp_id);
		System.out.println("Employee Salary is "+emp_sal);
		System.out.println("Employee Designation is "+emp_desg);
		System.out.println("Employee Age is "+emp_age);
		System.out.println("Employee Gender is "+emp_gender);
	}
	
	

}
