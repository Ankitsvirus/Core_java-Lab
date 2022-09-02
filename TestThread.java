package Association;


/*public	class TestThread extends Thread{  
		public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
		TestThread t=new TestThread();  
		t.start();
		System.out.println("current thread name is "+Thread.currentThread().getName());
		 }  
		}*/
/*public class TestThread implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
	TestThread m=new TestThread();  
Thread t1 =new Thread(m);   // Using the constructor Thread(Runnable r)  
t1.start();  
 }  
}  */


/*public class TestThread  {    
public static void main(String argvs[])  
{  
Thread t= new Thread("My first thread");   
t.start();  
String str = t.getName();  
System.out.println(str);  
}  
}  */


public class TestThread implements Runnable  
{    
public void run()  
{    
System.out.println("Now the thread is running ...");    
}    
public static void main(String argvs[])  
{     
Runnable r1 = new TestThread();    
Thread th1 = new Thread(r1, "My new thread");    
th1.start();   
String str = th1.getName();  
System.out.println(str);  
}    
}    
	

