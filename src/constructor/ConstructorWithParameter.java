package constructor;

public class ConstructorWithParameter {
	
	int a,b,c;
	
	public ConstructorWithParameter(int x, int y, int z)
	{
		a=x;
		b=y;
		c=z;
	}

	public static void main(String[] args) {
		
		ConstructorWithParameter s=new ConstructorWithParameter(20, 19, 28);
		
		s.test();
		
		

	}
	
	public void test()
	{
		int sum=a+b+c;
		
		System.out.println("This is Construction with parameter");
		System.out.println("Sum is "+sum);
	}

}
