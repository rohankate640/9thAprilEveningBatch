package abstractClass;

public class ConcreteClass extends AbstractStudy {

	public static void main(String[] args) {
		ConcreteClass cc=new ConcreteClass(); //created object of concrete class
		
		cc.demo1();
		cc.demo2();
		
		cc.demo3();
		cc.demo4();
		cc.demo5();
		
		cc.sample();

	}

	@Override
	public void demo3() {
		
		System.out.println("demo3 method completed in Concrete class ");
	}

	@Override
	public void demo4() {
		
		System.out.println("demo4 method completed in Concrete class ");
		
	}

	@Override
	public void demo5() {
		
		System.out.println("demo5 method completed in Concrete class ");
	}
	
	public void sample()
	{
		System.out.println("Sample method is own method of concrete class");
	}

}
