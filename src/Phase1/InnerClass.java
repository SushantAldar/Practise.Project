package Phase1;

public class InnerClass {
	private String msg = "Welcome to java";
	
	class inner{
		void hello()
		{
			System.out.println(msg +", Let us start learning inner classes");
		}
	}

	public static void main(String[] args) {
	
		InnerClass obj =new InnerClass();
		InnerClass.inner in =obj.new inner();
		in.hello();

	}

}
public class InnerClass1{
	private String msg ="Inner Classes";
	void display() {
		class inner{
			void msg()
			{
				System.out.println(msg);
			}
		}
		inner I = new inner();
		I.msg();
	}
	public static void main(String[]args) {
	
}