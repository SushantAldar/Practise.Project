package Phase1;

public class AccessModifiers2 {

	public static void main(String[] args) {
		//Default accessible in same package
		AccessModifiers def= new AccessModifiers();
		def.world();
		
		//Access private variable to another class - Not Accessible
		//AccessModifiers obj = new AccessModifiers();
		//obj.test();
		
		//Access protected class in same package
		AccessModifiers obj2 = new AccessModifiers();
		obj2.display();
	}

}
