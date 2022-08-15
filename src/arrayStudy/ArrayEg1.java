package arrayStudy;

public class ArrayEg1 {

	public static void main(String[] args) {
		
		//I want to store city names
		
		//1.Array declaration
		String city[]=new String[5];
		
		//2.Array initialization
		city[0]="Pune";
		city[1]="Mumbai";
		city[2]="Nashik";
		city[3]="Ahmadnagar";
		city[4]=null;
		//city[5]="kkkkk";
		
		//Array Usage
		System.out.println(city[0]);
		System.out.println(city[4]);
		//System.out.println(city[5]);
		//System.out.println(city[11]);
		
		System.out.println("============================");
		
		//1.Array declaration
		int count[]=new int[3];
		
		//2.Array initialization
		count[0]=10;
		
		//Array Usage
		System.out.println(count[0]);
		System.out.println(count[1]);
		//System.out.println(count[3]);
		
		

	}

}
