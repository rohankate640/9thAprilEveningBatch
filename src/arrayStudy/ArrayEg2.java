package arrayStudy;

public class ArrayEg2 {

	public static void main(String[] args) {
		
		//int rollNum[]=new int[3];
		
		//1 & 2 declaration + initialization
		
		int rollNum1[]= {1,2,3,4,5,6};
	//	char grade[]= {'A','B','C','D'};
		
		//usage
		
	//	System.out.println(rollNum1[3]);
		
		for(int i=0;i<=rollNum1.length-1;i++)
		{
			System.out.println(rollNum1[i]);
		}
		
		System.out.println("=========================");
		
		for(int i=rollNum1.length-1;i>=0;i--)
				{
					System.out.println(rollNum1[i]);
				}
		
		
				
	}

}
