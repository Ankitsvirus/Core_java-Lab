package IOStream;
import java.io.*; 
public class ByteArrayInput {
	 
	 
	  public static void main(String[] args) throws IOException {  
	    byte[] buf = { 45, 46, 47, 48 };  
	    // Create the new byte array input stream  
	    ByteArrayInputStream byt = new ByteArrayInputStream(buf);  
	    int k = 0;  
	    while ((k = byt.read()) != -1) {  
	      //Conversion of a byte into character  
	      char ch = (char) k;  
	      System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
	    }  
	  }  
	  
}
