//Copy Constructor

class CopyContructor
{
	int id;
	String name;
	
	CopyContructor(int i,String n)
	{
		id=i;
		name=n;
	}
	CopyContructor(CopyContructor s)
	{
		id = s.id;
		name=s.name;
	}
	
	void display()
	{
		System.out.println(id+""+name);
	}
	
	public static void main(String args[])
	{
		CopyContructor s1= new CopyContructor(111,"SmartAnkit");
		CopyContructor s2= new CopyContructor(s1);
		s1.display();
		s2.display();
	}
}		