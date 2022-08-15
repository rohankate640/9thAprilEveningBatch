package thisAndSuperKeyword;

public class ThisUse {
	
	int a=100; //non-static global variable
	int b=500;

	public static void main(String[] args) {
		
		ThisUse t=new ThisUse();
		t.test();
	}
	
	public void test()
	{
		int a=20; //local variable
		int sum=a+150; //a value is local value
		System.out.println(sum);
		
		int sum1=this.a+150;
		System.out.println(sum1);
		
		System.out.println("Local value of a is "+a);
		System.out.println("Global value of a is "+this.a);
		System.out.println(b);
	}

}
