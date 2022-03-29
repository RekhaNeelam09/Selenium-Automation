
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10 , n2 = 20 , n3 = 35 , max;
		max = (n1 > n2 && n1 > n3) ? n1 : (n2> n3?n2:n3);

		System.out.println("Largest Number is : "+ max);
	}

}
