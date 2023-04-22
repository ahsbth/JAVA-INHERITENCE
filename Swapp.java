
import java.util.*;
class First
{
	Scanner sc=new Scanner(System.in);
	 public int x;
	  void get()
	{
		System.out.println("Enter first=");
		x=sc.nextInt();
	}
}
class Second extends First
{
	int y;
	 void get2()
	{
		System.out.println("Enter second no=");
		y=sc.nextInt();
	}
  void swappvalue()
	 {
		 System.out.println("Before swappimg first value="+x+"\tSecond value="+y);
		 int z=x;
		 x=y;
		 y=z;
		 System.out.println("after swapping first value="+x+"\tSecond value="+y);
	 }
}
class Swapp
{
	public static void main(String args[])
	{
		Second s=new Second();
		s.get();
		s.get2();
		s.swappvalue();
	}
}


		