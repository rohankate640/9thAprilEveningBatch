package globalVariableUse;

public class HR_Portal {

	public static void main(String[] args) {

		Employee Sachin=new Employee(); //created object of employee class
		
		Sachin.emp_name="Sachin Tendulkar";
		Sachin.emp_id="IND10";
		Sachin.emp_sal=1234.123f;
		Sachin.emp_desg="Batsman";
		Sachin.emp_age=41;
		Sachin.emp_gender='M';
		
		Employee Virat=new Employee();
		
		Virat.emp_name="Virat Kohli";
		Virat.emp_id="IND18";
		Virat.emp_sal=14665.65f;
		Virat.emp_desg="AllRounder";
		Virat.emp_age=32;
		Virat.emp_gender='M';
		
		Sachin.emp_info();
		
		Virat.emp_info();
		
		
	}

}
