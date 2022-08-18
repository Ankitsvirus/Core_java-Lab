package Collection;
import java.util.*;  
public class TreeSet2 {
	
	
	 public static void main(String args[]){  
	 TreeSet<String> set=new TreeSet<String>();  
	         set.add("Ankit");  
	         set.add("Rajan");  
	         set.add("Anchal");  
	         System.out.println("Traversing element through Iterator in descending order");  
	         Iterator i=set.descendingIterator();  
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next());  
	         }  
	           
	 }  
	}  

