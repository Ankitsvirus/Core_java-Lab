package Association;
class MultiNaming extends Thread{  
	  public void run(){  
	   System.out.println(" Ankit thread is running...");  
	  }  
	 public static void main(String args[]){  
		 MultiNaming t1=new MultiNaming();  
		 MultiNaming t2=new MultiNaming ();  
	  System.out.println("Name of t1:"+t1.getName());  
	  System.out.println("Name of t2:"+t2.getName());  
	   
	  t1.start();  
	  t2.start();  
	  
	  t1.setName(" Ankit Shukla");  
	  System.out.println("After changing name of t1:"+t1.getName());  
	 }  
	}  