package Association;
import java.util.*;   
	 class Mobile {    
	    private String mobile_no;  
	    
	    public String getMobileNo() {  
	        return mobile_no;  
	    }  
	    public void setMobileNo(String mobile_no) {  
        this.mobile_no = mobile_no;  
	    }
		public String getMobile_no() {
			// TODO Auto-generated method stub
			return null;
		}  
	}  
	class Person {       
		private String name;  
    List<Mobile> numbers;  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
	        this.name = name;  
	    }  
	    public List<Mobile> getNumbers() {  
	        return numbers;  
    }  
    public void setNumbers(List<Mobile> numbers) {  
        this.numbers = numbers;  
    }  
	}  
	public class TestAssociation {  
	      public static void main(String[] args) {  
	            Person person = new Person();  
            person.setName("Ankit Shukla");  
	             
	           Mobile num1 = new Mobile();  
            num1.setMobileNo("7991430269");  
            Mobile num2 = new Mobile();  
	            num2.setMobileNo("8858270360");  
	      
	            List<Mobile> numberList = new ArrayList<Mobile>();  
	            numberList.add(num1);  
	            numberList.add(num2);  
            person.setNumbers(numberList);  
            System.out.println("the person name is = "+   person.getName());
            System.out.println("mobile numbers are = "+  person.getNumbers()); 
           // System.out.println("the person name is = "+ num1.getMobileNo());
           // System.out.println("mobile numbers are = "+ num2.getMobileNo());  
        }  
        }  
        
   

