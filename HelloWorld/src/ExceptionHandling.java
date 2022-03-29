import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		int nr = 100 , dr = 0 ,result;
		Scanner sc = new Scanner(System.in);
		
		dr = sc.nextInt();
		while (true) {
			System.out.println("Enter the Numerator : ");
			nr = sc.nextInt();
			System.out.println("Enter the Denominator : ");
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			} 
			//try block should have atleast one Catch block and one try block can take any no.of Catch blocks
			catch (ArithmeticException e)
				{
					e.printStackTrace();
				} 
			catch (NullPointerException e) 
				{
					e.printStackTrace();
				}
			//Exception is the Parent of all Exceptions...
			//If we give the Parent Exception in the first,then the remaining catches will get error
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}

	}

}
