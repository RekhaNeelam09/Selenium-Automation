import java.util.Scanner;

public class Calculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b, res;
		char choice;
		Scanner scan = new Scanner(System.in); 
	do 
	{
		System.out.println("1 . Addition");
		System.out.println("2 . Subtraction");
		System.out.println("3 . Multiplication");
		System.out.println("4 . Division");
		System.out.println("5 . Exit");
		System.out.print("Enter your choice : ");
		choice = scan.next().charAt(0);
		switch(choice) {
		case '1' : System.out.println("Enter Two Numbers : ");
		a = scan.nextFloat();
		b = scan.nextFloat();
		res = a + b;
		System.out.println("Result is : "+res);
		break;
		case '2' : System.out.print("Enter Two Numbers : ");
		a = scan.nextFloat();
		b = scan.nextFloat();
		res = a - b;
		System.out.println("Result is : "+res);
		break;
		case '3' : System.out.print("Enter Two Numbers : ");
		a = scan.nextFloat();
		b = scan.nextFloat();
		res = a * b;
		System.out.println("Result is : "+res);
		break;
		case '4' : System.out.print("Enter Two Numbers : ");
		a = scan.nextFloat();
		b = scan.nextFloat();
		res = a / b;
		System.out.println("Result is : "+res);
		break;
		case '5' : System.exit(0);
		default: System.out.print("Wrong Choice !!!");
		}
		System.out.println("\n-------------------------\n");
	}while(choice != 5);

	}
}

