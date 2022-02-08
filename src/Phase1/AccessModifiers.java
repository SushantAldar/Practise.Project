package Phase1;

public class AccessModifiers{
	
	// Within same class
	//Using Protected access specifiers
	
	protected void display() {
		System.out.println("You are accessing protected method of this class");
	}
	//Using private access specifiers
	private void test()
	{
		System.out.println("My private method");
	}
	//using public access specifiers
	public void hello()
	{
		System.out.println("Public method");
	}
	//Class is having default access modifier
	void world()
	{
		System.out.println("Default Method");
	}
	public static void main(String args[])
	{
		AccessModifiers obj = new AccessModifiers();
		
		obj.display();
		obj.test();
		obj.hello();
		obj.world();
	}
}