//constructor overloading

class Con_overl
{
	int id;
	String name;
	int age;
	
    Con_overl (int i,String n)
	{
		id =i;
		name=n;
	}
    Con_overl (int i,String n,int a)
	 {
		 id=i;
		 name=n;
		 age=a;
	 }
	 
	 void display()
	 {
		 System.out.println(id+ ""+name+""+age);
	 }
	 
	 public static void main(String args[])
	 {
		 Con_overl c1=new Con_overl(101  ,"SmartAnkit");
		 Con_overl c2 = new Con_overl(102 ,"Ani",22);
		 c1.display();
		 c2.display();
	 }
}