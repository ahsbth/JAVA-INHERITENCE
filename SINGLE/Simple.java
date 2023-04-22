import java.util.*;
class First
{
	float p,r;
	Scanner sc=new Scanner(System.in);
	  void get()
	  {
		  System.out.println("Enter principle and rate=");
		  p=sc.nextFloat();
		  r=sc.nextFloat();
	  }
}
class Second extends First
{
	float t;
	void get2()
	{
		System.out.println("Enter time for principle=");
		t=sc.nextFloat();
	}
	void intreast()
	{
		double si=p*r*t/100;
		System.out.println("SimpleItreast="+si);
	}
}
class Simple
{
	public static void main(String args[])
	{
		Second s=new Second();
		s.get();
		s.get2();
		s.intreast();
	}
}

