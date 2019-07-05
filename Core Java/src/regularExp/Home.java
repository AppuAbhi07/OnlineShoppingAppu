package regularExp;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Home {
	
	public static void main(String [] args) {
		System.out.println("ss");
		/*
		 * Pattern p = Pattern.compile("\\w"); Matcher m = p.matcher("a3b@c4z#");
		 * 
		 * while(m.find()) { System.out.println( "First " + m.start()+"Group" +
		 * m.group()); }
		 */
		
		/*
		 * Pattern p = Pattern.compile("a?"); Matcher m =
		 * p.matcher("aaabababaabbbababa");
		 * 
		 * while(m.find()) { System.out.println( "First " + m.start()+"Group" +
		 * m.group()); }
		 */
          
		/*
		 * Pattern p = Pattern.compile("\\s"); String[] m =
		 * p.split("Helllo Abhishek How Are u?"); for(String m1 :m) {
		 * System.out.println(m1); }
		 */
		/*
		 * Pattern p = Pattern.compile("\\."); String[] m = p.split("www.abhishek.com");
		 * for(String m1 :m) { System.out.println(m1); }
		 */
	    
	    
		/*
		 * StringTokenizer st = new StringTokenizer("Abhishek at Morgon stanley");
		 * while(st.hasMoreTokens()) { System.out.println(st.nextToken()); }
		 */
		/*
		 * StringTokenizer st = new StringTokenizer("100,0,000,00",",");
		 * while(st.hasMoreTokens()) { System.out.println(st.nextToken()); }
		 */
	    
	    
		/*
		 * Pattern p = Pattern.compile("[7-9]\\d{9}"); Matcher m =
		 * p.matcher("155454515454"); System.out.println(m.find());
		 */
	    
	     Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9]*@[a-zA-Z0-9]+(([.][a-zA-Z])+)+");  
	     Matcher m = p.matcher("appu@gn6565aul.com");
	     System.out.println(m.find());
	    
		
		
		
	}

}
