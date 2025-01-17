package Java;

public class ClassObject {
	int a=10;
	public void classss()
	{
		System.out.println("This is class block");
	}

	public static void main(String[] args) {
	ClassObject co=new ClassObject();
	co.classss();
	System.out.println("This is object creating block");
	System.out.println(co.a);
	
	}

}
