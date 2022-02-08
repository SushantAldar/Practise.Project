package Phase1;

public class MyThread extends Thread{
	public void run()
	{
		System.out.println("Concurrent thread starts Running..");
	}
	public static void main(String args[]) {
		MyThread mt = new MyThread();
		mt.start();
	}

}
