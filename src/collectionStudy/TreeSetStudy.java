package collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		
		TreeSet<Character> ts=new TreeSet<>();
		
		ts.add('l');
		ts.add('d');
		ts.add('o');
		ts.add('s');
		ts.add('s');
		ts.add('z');
		ts.add('j');
		
		System.out.println(ts);
		
		System.out.println(ts.remove('z'));
		System.out.println(ts);
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
		System.out.println(ts.size());
		
		System.out.println("=============");
		System.out.println("for each loop");
		for(Character h:ts)
		{
			System.out.println(h);
		}
		
		System.out.println("=============");
		System.out.println("Iterator");
		Iterator<Character> it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
