import java.util.*;
import java.io.*;
class First
{
	int a;
	Scanner sc=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter a no=");
		a=sc.nextInt();
	}
	void squareroot()
	{
		System.out.println("Squareroot="+Math.sqrt(a));
	}
}
class Second extends First
{
	int b;
	void get2()
	{
		System.out.println("Enter second no=");
		b=sc.nextInt();
	}
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
class Calculate
{
	public static void main(String args[])
	{
		Second s=new Second();
		s.get();
		s.squareroot();
		s.get2();
		s.find();
	}
}

		
