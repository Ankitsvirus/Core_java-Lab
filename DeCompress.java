package IOStream;
import java.io.*;  
import java.util.zip.*; 
public class DeCompress {
	 
	 
	public static void main(String args[]){  
	try{  
	FileInputStream fin=new FileInputStream("F:\\def.txt");  
	InflaterInputStream in=new InflaterInputStream(fin);  
	FileOutputStream fout=new FileOutputStream("C:\\Core_Java\\D.java");  
	  
	int i;  
	while((i=in.read())!=-1){  
	fout.write((byte)i);  
	fout.flush();  
	}  
	fin.close();  
	fout.close();  
	in.close();  
	}catch(Exception e){System.out.println(e);}  
	System.out.println("rest of the code");  
	}  
	}  

