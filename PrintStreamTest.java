package IOStream;
import java.io.*;
public class PrintStreamTest {
	public static void main(String args[])throws Exception{  
		   FileOutputStream fout=new FileOutputStream("F:\\ani2.txt");  
		   PrintStream pout=new PrintStream(fout);  
		   pout.println(1900);  
		   pout.println("Hello Java");  
		   pout.println("Welcome to Cyberhub");  
		   pout.close();  
		   fout.close();  
		 }  
}
