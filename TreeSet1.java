package Collection;
import java.util.*;
public class TreeSet1 {
	   
	 public static void main(String args[]){  
	  //Creating and adding elements  
	  TreeSet<String> ts=new TreeSet<String>();  
	  ts.add("Ankit");  
	  ts.add("Rajan");  
	  ts.add("Anchal");  
	  ts.add("saurabh");  
	  //Traversing elements  
	  Iterator<String> itr=ts.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	 
}
