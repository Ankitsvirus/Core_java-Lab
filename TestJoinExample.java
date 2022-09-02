package Association;

class TestJoin  extends Thread  
{  
 
public void run()  
{  
for (int j = 0; j < 2; j++)  
{  
try  
{  
Thread.sleep(300);  
System.out.println("The current thread name is: " + Thread.currentThread().getName());  
}  

catch(Exception e)  
{  
System.out.println("The exception has been caught: " + e);  
}  
System.out.println( j );  
}  
}  
}  
public class TestJoinExample
{   
public static void main (String argvs[])  
{  
	TestJoin  th1 = new TestJoin ();  
	TestJoin  th2 = new TestJoin ();  
	TestJoin  th3 = new TestJoin ();  
th1.start();  
try  
{  
System.out.println("The current thread name is: "+ Thread.currentThread().getName());   
th1.join();  
}  
catch(Exception e)  
{  
System.out.println("The exception has been caught " + e);  
}   
th2.start();  
try  
{  
System.out.println("The current thread name is: " + Thread.currentThread().getName());  
th2.join();  
}  
catch(Exception e)  
{  
System.out.println("The exception has been caught " + e);  
}   
th3.start();  
}  
}  
