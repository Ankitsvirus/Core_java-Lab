import java.io.Console;  
class ConsolePasswordExample{    
public static void main(String args[]){    
Console c=System.console();    
System.out.println("Enter password: ");    
char[] ch=c.ConsolePassword();    
String pass=String.valueOf(ch);//converting char array into string    
System.out.println("Password is: "+pass);    
}    
}  