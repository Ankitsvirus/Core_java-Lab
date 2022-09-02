package Association;

/*public class TestTwice extends Thread{  
	 public void run(){  
	   System.out.println("running...");  
	 }  
	 public static void main(String args[]){  
	  TestTwice t1=new TestTwice(); 
	  TestTwice t2=new TestTwice();
	  t1.start();  
	  t1.start();  
	 }  
	}  */

class TestTwice extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
	    System.out.println(i);  
	  }  
	 }  
	 public static void main(String args[]){  
		 TestTwice t1=new TestTwice();  
		 TestTwice t2=new TestTwice();  
	   
	  t1.run();  
	  t2.run();  
	 }  
	}  