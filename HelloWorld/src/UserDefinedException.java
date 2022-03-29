import java.util.Scanner;
//For every User Defined Class we need to extend the Exception Class
public class UserDefinedException extends Exception
{
	//Here we need to give this Constructor mentioning String ,else we will get an error stating 
	//"The mentioned constructor is undefined"
	
	public UserDefinedException(String string)
	{
		super(string);
	}

	public static void main(String[] args)
	{
		String str ;
		Scanner sc = new Scanner(System.in);
		
		while (true) 
		{
			System.out.println("Enter the 10 digit Character String : ");
			str = sc.next();
			try 
			{
				if (str.length() != 10) 
				{
					throw new UserDefinedException("Enter a valid 10 Character String");
				} 
				else 
				{
					System.out.print(str);
					break;
				}
				
			} 
			catch (UserDefinedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}

}
