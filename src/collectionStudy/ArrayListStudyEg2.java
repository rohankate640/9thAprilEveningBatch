package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudyEg2 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(6);
		al.add(8);
		al.add(1);
		al.add(8);
		al.add(2);
		al.add(9);
		al.add(7);
		
		System.out.println(al);
		
		System.out.println("==================");
		System.out.println("for loop");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("==================");
		System.out.println("for each loop");
		for(Integer m:al)
		{
			System.out.println(m);
		}

		System.out.println("==================");
		System.out.println("Iterator");
		Iterator<Integer> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("==================");
		System.out.println("ListIterator");
		ListIterator<Integer> li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		
		
		
	}

}
