package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Velocity");
		al.add(199);
		al.add(99.99);
		al.add(null);
		al.add(null);
		al.add("Velocity");
		al.add(true);
		al.add('A');
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(6));
		System.out.println(al.indexOf("Velocity"));
		System.out.println(al.lastIndexOf("Velocity"));
		System.out.println(al.contains(null));
		System.out.println(al.remove(3));
		System.out.println(al);
		System.out.println(al.remove("Velocity"));
		System.out.println(al);
		
		System.out.println("====================");
		//printing element using for loop (static or hard coding)
		for(int i=0;i<=5;i++)
		{
			System.out.println(al.get(i));
	
		}
		
		
		System.out.println("====================");
		//printing element using for loop (dynamic coding)
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("====================");
		//for each loop
		for(Object s:al)
		{
			System.out.println(s);
		}
		

		System.out.println("====================");
		//iterator
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("====================");
		//ListIterator
		ListIterator li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		
	}

}
