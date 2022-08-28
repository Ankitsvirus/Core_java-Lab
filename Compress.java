package IOStream;
import java.io.*;  
import java.util.zip.*; 
public class Compress {
	 
	
	public static void main(String args[]){  
	try{  
	FileInputStream fin=new FileInputStream("C:\\Users\\SmartAnkit\\eclipse-workspace\\Lab program\\src\\IOStream\\Def.java");  
	FileOutputStream fout=new FileOutputStream("F:\\def.txt");  
	DeflaterOutputStream out=new DeflaterOutputStream(fout);  
	  
	int i;  
	while((i=fin.read())!=-1){  
	out.write((byte)i);  
	out.flush();  
	}  
	fin.close();  
	out.close();  
	}catch(Exception e){System.out.println(e);}  
	System.out.println("rest of the code");  
	}  
	}  

