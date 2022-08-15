package constructor;

public class Subtraction {
	
	int a;
	int b;
	int c;
	
	public Subtraction()
	{
		a=400;
		b=280;
		c=110;
	}

	public static void main(String[] args) {
		
		Subtraction s=new Subtraction();
		s.sub();
		

	}
	
	public void sub()
	{
		int sub=a-b-c;
		System.out.println("Subtraction is "+sub);
	}

}
