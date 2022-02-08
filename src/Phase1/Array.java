package Phase1;

public class Array {

	public static void main(String[] args) {
		
		//Single Dimensionl Array
		int a[]= { 10,20,30,40,50};
		for(int i=0;i<5;i++)
		{
			System.out.println("Elements of array a :"+a[i]);
		}

		//Multi dimensional array
		int[][]b= {{4,8,12,16},{5,10,15}};
		
	System.out.println("\n Length of row 1: "+ b[0].length);
	}

}
