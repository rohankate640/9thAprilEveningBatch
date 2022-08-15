package constructor;

public class Test 
{
	
	//    public Test()
	//    {
	//     default constructor-->compiler will create at time of compilation
	//
	//    }
	 
	public Test() // user defined constructor --> without parameter/with zero parameter
	{
	System.out.println("This is user defined constructor");
	}
	

	public static void main(String[] args) {
		
		Test c=new Test();
		c.msg();
		

	}
	
	public void msg()
	{
		System.out.println("this is non static method");
	}

}
