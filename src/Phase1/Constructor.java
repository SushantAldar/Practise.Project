package Phase1;

class Empinfo{
	int id;
	String name;
	
	void display() {
		System.out.println(id + "" +name);
	}
}

 class Constructor1 {
	public static void main(String []args) {
		Empinfo emp1 = new Empinfo();
		Empinfo emp2 = new Empinfo();
		
		emp1.display();
		emp2.display();
	}

}

//PARAMETERIZED CONSTRUCTOR
class Std{
	int id;
	String name;
	
	Std(int i, String n)
	{
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id + "" + name);
	}
}

public class Constructor{
	public static void main (String args[]) {
		Std std1 = new Std(2,"Sanjay");
		Std std2 = new Std(10,"Vikram");
		
		std1.display();
		std2.display();
	}
}
