//Date method

import java.util.*;

public class DateMethod
{
	public static void main(String args[])
	{
	Date d1= new Date();
	Date d2 = new Date(2022,7,20);
	Date d3 = new Date(2022,6,20);
	boolean a= d3.after(d2);    									 
	System.out.println("date d3 comes after date d2"+a);
	
	boolean b= d3.before(d2);   								
	System.out.println("date d3 comes after date d2"+b);
	
	int c= d2.compareTo(d3);									
	
																	
	
	
	System.out.println("current date"+d1);
	
	Scanner s= new Scanner("hello , world \n hello world");
	s.useDelimiter(",|\n|");   										 
	while (s.hasNext())
	{
		System.out.println(s.next());
	}
	 s.close();
	 
	}
}
	