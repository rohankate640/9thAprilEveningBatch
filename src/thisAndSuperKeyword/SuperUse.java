package thisAndSuperKeyword;

public class SuperUse extends A {
	
	int m=10; //global variable from SuperUse class

	public static void main(String[] args) {
		
		SuperUse su=new SuperUse();
		su.test();

	}
	
	public void test()
	{
		int m=1;
		
		int sum=m+10; //using local value of m
		System.out.println("Using local of m "+sum);
		
		int sum1=this.m+10; //using global value of m from same class
		System.out.println("Using global value of m from same class "+sum1);
		
		int sum3=super.m+10; //using global value of m from super class
		System.out.println("Using global value of m from super class "+sum3);
		
	}

}
