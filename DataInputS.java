package IOStream;
import java.io.*; 
public class DataInputS {
	   
 
	public static void main(String[] args) throws IOException {  
	    FileInputStream input = new FileInputStream("F:\\f3.txt");  
	    DataInputStream inst = new DataInputStream(input);  
	    int count = input.available();  
	    byte[] ary = new byte[count];  
	    inst.read(ary);  
	    for (byte bt : ary) {  
	      char k = (char) bt;  
	      System.out.print(k+"-");  
	    }  
	  }  
	}  