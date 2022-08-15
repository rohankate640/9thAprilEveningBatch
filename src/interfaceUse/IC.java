package interfaceUse;

public class IC implements MyInterface {

	public static void main(String[] args) {
		
		IC ic=new IC();
		ic.test1();
		ic.test2();
		ic.test3();
		
		

	}

	@Override
	public void test1() {
		System.out.println("test1 method completed in Implementation class");
		
	}

	@Override
	public void test2() {
		System.out.println("test2 method completed in Implementation class");
		
	}
	
	public void test3()
	{
		System.out.println("test3 is own method Implementation class");
	}

}
