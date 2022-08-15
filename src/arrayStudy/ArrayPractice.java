package arrayStudy;

public class ArrayPractice {

	public static void main(String[] args) {
		
		int table2[]= {2,4,6,8,10,12,14,16,18,20};
		
		for(int i=0;i<=table2.length-1;i++)
		{
			System.out.println(table2[i]);
		}
		
		System.out.println("==============");
		
		for(int i=table2.length-1;i>=0;i--)
		{
			System.out.println(table2[i]);
		}

	}

}
