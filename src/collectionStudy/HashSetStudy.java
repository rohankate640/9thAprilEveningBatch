package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		
		hs.add("Pune");
		hs.add(123);
		hs.add(true);
		hs.add(null);
		hs.add(123.12);
		hs.add(null);
		hs.add('A');
		hs.add("Pune");
		
		System.out.println(hs);
		hs.add('B');
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
	
		System.out.println(hs.size());
		
		System.out.println("====================");
		System.out.println("for each loop");
		for(Object n:hs)
		{
			System.out.println(n);
		}
		
		System.out.println("====================");
		System.out.println("iterator");
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
