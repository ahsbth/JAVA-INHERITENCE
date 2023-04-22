import java.util.*;
class Data
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter two nos=");
		a=sc.nextInt();
		b=sc.nextInt();
	}
}
class Small extends Data
{
	void find()
	{
		if(a<b)
		{
			System.out.println("Smaller="+a);
		}
		else
		{
			System.out.println("Smaller="+b);
		}
	}
}
class Great extends Data
{
	void find2()
	{
		if(a>b)
		{
			System.out.println("Greattest="+a);
		}
		else
		{
			System.out.println("Greattest="+b);
		}
	}
}
class Demo
{
	public static void main(String args[])
	{
		Small s=new Small();
		s.get();
		s.find();
		Great g=new Great();
		g.get();
		g.find2();
	}
}

	
	