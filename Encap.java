public class Encap {
	private int age;
	String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age =age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Encap eobj=new Encap();
		eobj.setAge(22);
		System.out.println("age of a person is"+" "+eobj.getAge());
		eobj.setName("SmartAnkit");
		System.out.println("name of aperson is"+" "+eobj.getName());

	}

}

