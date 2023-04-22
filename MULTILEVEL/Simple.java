import java.util.*;
class First
{
	float p;
	Scanner sc=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter principle=");
		p=sc.nextFloat();
	}
}
class Second extends First
{
	float r;
	 void get2()
	 {
	System.out.println("Enter rate=");
	r=sc.nextFloat();
	 }
}
class Third extends Second
{
	float t;
	void get3()
	{
		System.out.println("Enter time=");
		t=sc.nextFloat();
	}
	void intreast()
	{
		double si=p*r*t/100;
		System.out.println("Simple_intreast="+si);
	}
}
class Simple
{
	public static void main(String args[])
	{
		Third t=new Third();
		t.get();
		t.get2();
		t.get3();
		t.intreast();
	}
}

	