
public class Employee 
{
	int eno;
	String ename; 
	float sal;
	
//	public Employee(int i, String string) 
//	{
//		eno = i;
//		ename = string;
//	}

	public Employee() 
	{
		System.out.println("Iam a 'forced Default Constructor....'");
	}

	public Employee(int i) 
	{
		eno = i;
	}

	public Employee(int eno, String ename) 
	{
		this.eno = eno;
		this.ename = ename;
	}
	
	
	// Right click Source --> Generate Constructor with fields
	public Employee(int eno, String ename, float sal) 
	{
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub 
		Employee e1 = new Employee();
		System.out.println(e1.eno);
		System.out.println(e1.ename);
		
		Employee e2 = new Employee(234528);
		System.out.println(e2.eno);
		System.out.println(e2.ename);
		
		Employee e3 = new Employee(234527,"Rekha Neelam");
		System.out.println(e3.eno);
		System.out.println(e3.ename);
		
		Employee e4 = new Employee(1745,"Hemanth",35.5f);
		System.out.println(e4.eno);
		System.out.println(e4.ename);
		System.out.println(e4.sal);
		
		}
	
}
