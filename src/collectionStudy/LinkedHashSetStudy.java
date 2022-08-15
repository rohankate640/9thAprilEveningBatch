package collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) {
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add(null);
		lhs.add('A');
		lhs.add(123.12);
		lhs.add('B');
		lhs.add("Pune");
		lhs.add(null);
		lhs.add(123.12);
		lhs.add(true);
		lhs.add("Pune");
		
		System.out.println(lhs);
		System.out.println(lhs.remove('B'));
		System.out.println(lhs);
		
		System.out.println(lhs.size());
		System.out.println(lhs.contains(true));
		System.out.println(lhs.isEmpty());
		
		System.out.println("=================");
		System.out.println("for each loop");
		for(Object k:lhs)
		{
			System.out.println(k);
		}
		
		System.out.println("=================");
		System.out.println("Iterator");
		Iterator it = lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
