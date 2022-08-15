package constructor;

public class MathOperation {
	
	int a;
	int b;
	
	
	public MathOperation()
	{
		a=50;
		b=80;
	}

	public static void main(String[] args) {
		
		MathOperation add=new MathOperation();
		
		add.add();
		

	}
	
	public void add()
	{
		int add;
		add=a+b;
		System.out.println("Addition is "+add);
	}

}
