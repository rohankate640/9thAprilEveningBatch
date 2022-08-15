package stringStudy;

public class StringTypes {

	public static void main(String[] args) {
		
		//String s="Hello"; //String without new keyword
		String s1=new String("Welcome"); //String using new keyword
		
		//length()
		
		System.out.println(s1.length());
		int l=s1.length();
		System.out.println(l);
		
		//String s3=null;
		//System.out.println(s3.length());
		
		System.out.println("==============");
		
		//toUpperCase()
		
		System.out.println(s1.toUpperCase());
		String uc=s1.toUpperCase();	
		System.out.println(uc);
		
		System.out.println("==============");
		
		//toLowerCase()
		
		System.out.println(s1.toLowerCase());
		String lc = s1.toLowerCase();
		System.out.println(lc);
		
		System.out.println("==============");
		
		//use of equals() method
		
		String v0="velocity";
		String v1="velocity";
		String v2=new String("velocity");
		String v3=new String("velocity");
		String v4=new String("Velocity");
		
		System.out.println(v0==v1);
		System.out.println(v1==v2);
		System.out.println(v2==v3);
		System.out.println(v3==v4);
		
		System.out.println("==============");
		
		System.out.println(v0.equals(v1));
		System.out.println(v1.equals(v2));
		System.out.println(v3.equals(v4));
		
		System.out.println("==============");
		
		//equalsIgnoreCase
		
		System.out.println(v0.equalsIgnoreCase(v1));
		System.out.println(v1.equalsIgnoreCase(v4));
		
		System.out.println("==============");
		
		//contains()
		
		String d="Velocity";
		System.out.println(d.contains("Vel"));
		System.out.println(d.contains("city"));
		System.out.println(d.contains("VELO"));
		
		System.out.println("==============");
		
		//isEmpty
		
		String e0="Pune";
		String e1=" ";
		String e2=null;
		String e3="";
		
		System.out.println(e0.isEmpty());
		System.out.println(e1.isEmpty());
		//System.out.println(e2.isEmpty());
		System.out.println(e3.isEmpty());
		
		System.out.println("==============");
		
		//isBlank()
		
		System.out.println(e0.isBlank());
		System.out.println(e1.isBlank());
		System.out.println(e3.isBlank());
		
		System.out.println("==============");
		
		//charAt()
		
		String w="Maharashtra";
		System.out.println(w.charAt(6));
		//System.out.println(w.charAt(-1));
		
		char ans= w.charAt(4);
		System.out.println(ans);
		
		System.out.println("==============");
		
		//endsWith()
		
		String h="abcd";
		System.out.println(h.endsWith("d"));
		System.out.println(h.endsWith("bcd"));
		System.out.println(h.endsWith("abcd"));
		
		System.out.println("==============");
		
		//startsWith()
		
		String f="India";
		System.out.println(f.startsWith("Ind"));
		System.out.println(f.startsWith("n", 1));
		
		System.out.println("==============");
		
		
		
		
		
		
		
		
		
		

	}

}
