
public class UpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to Automation";
		int lower = 0 ;
		int upper = 0;
		for(int i = 0; i<s.length();i++) 
		{
			char ch = s.charAt(i);
			if(ch>=65 && ch<= 90)
			{
				upper++;
			}
			else { 
				lower++;
			}
		}
		System.out.println("Upper : "+upper);
		System.out.println("Lower :" +lower);
	}

}
