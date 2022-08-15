package assignment1;

public class Form {

	public static void main(String[] args) {
		
		top();
		
		String name;
		name=" Rohan Balasaheb Kate";
		System.out.println("NAME           : "+name);
		
		String mob;
		mob=" 9673373858";
		System.out.println("MOBILE NO.     : "+mob);
		
		int age;
		age=27;
		System.out.println("AGE            :  "+age);
		
		char gender;
		gender='M';
		System.out.println("GENDER         :  "+gender);
		
		String dob;
		dob="28/06/1995";
		System.out.println("DOB            :  "+dob);
				
		
		Form y=new Form();
		y.year();

	}
	
	public static void top()
	{
		System.out.println("                 ADMISSION FORM              ");
		
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
	}
	
	public void year()
	{
		int passyear;
		passyear=2017;
		System.out.println("YEAR OF PASSING: "+passyear);
		
	}

}
