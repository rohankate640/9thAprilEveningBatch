package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add(8);
		v.add("Velocity");
		v.add(46.2);
		v.add("Rohan");
		v.add(46.2);
		v.add(null);
		v.add('k');
		v.add(null);
		
		System.out.println(v);
		v.add(6, null);
		System.out.println(v);
		v.remove(4);
		System.out.println(v);
		System.out.println(v.contains("rk"));
		System.out.println(v.get(3));
		System.out.println(v.size());
		System.out.println(v.indexOf(46.2));
		
		System.out.println("===============");
		System.out.println("for loop");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("===============");
		System.out.println("for each loop");
		for(Object f:v)
		{
			System.out.println(f);
		}
		
		System.out.println("===============");
		System.out.println("Iterator");
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("===============");
		System.out.println("ListIterator");
		ListIterator li = v.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("===============");
		System.out.println("Enumeration");
		Enumeration en = v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		
		
		
		
		
		
		

	}

}
