public class VariableTypes {
	//Global Variables , Static Variables
	int x = 100;
	static String str = "Rekha";
	public void m1() {
		//Local Variable
		int y = 200; 
		int x = 300;	
		System.out.println(y);
		//System.out.println(x);
		System.out.println(this.x);
		System.out.println(str);
	}
	public void m2() {
		System.out.println(x);
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableTypes obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.str);
	}

}
