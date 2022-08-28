package IOStream;
import java.io.*;
public class DataOutput {
	 public static void main(String[] args) throws IOException {  
	        FileOutputStream file = new FileOutputStream("F:\\ani1.txt");  
	        DataOutputStream data = new DataOutputStream(file);  
	        data.writeInt(65);  
	        data.flush();  
	        data.close();  
	        System.out.println("Succcess...");  
	    }  
	}   

