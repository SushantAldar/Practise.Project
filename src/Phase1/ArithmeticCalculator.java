package Phase1;
import java.util.*;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		int a,b, choice;
		float result=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		a = sc.nextInt();
		
		System.out.println("Enter second number: ");
		b = sc.nextInt();
		
		System.out.println("\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Remainder");
		
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		
		switch (choice)
		{
		case 1:
			result=(a+b);
			break;
		case 2:
			result=(a-b);
			break;
		case 3:
			result=(a*b);
			break;
		case 4:
			result=(a/b);
			break;
		case 5:
			result=(a%b);
			break;
	    default:
	    	System.out.println("Invalid Choice");
	
		
		}
		if (choice>=1 && choice<=5)
			System.out.println("Result is: "+ result);

	}

}

