package IOStream;
import java.io.*; 
public class BufferedOutStream {
	 
	
	public static void main(String args[])throws Exception{    
	     FileOutputStream fout=new FileOutputStream("F:\\test2.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	     String s="Welcome to java learn with SmartAnkit.";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("success");    
	}    
	}  

