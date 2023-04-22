 import java.util.*;
 class First
 {
	 int x;
	 Scanner sc=new Scanner(System.in);
	 void get()
	 {
		 System.out.println("Enter a no=");
	 x=sc.nextInt();
	 }
 }
 class Second extends First
 {
	 int y;
	 void get2()
	 {
		 System.out.println("Enter  second no=");
		 y=sc.nextInt();
	 }
 }
 class Third extends Second
 {
	 int z;
	 void swapp()
	 {
		 System.out.println("Before swapping first no="+x+"\n second no="+y);
		 int z=x;
		 x=y;
		 y=x;
		 System.out.println("After swapping first no="+x+"\n Second no="+y);
	 }
 }
 class Swapp
 {
	 public static void main(String args[])
	 {
		 Third t=new Third();
		 t.get();
		 t.get2();
		 t.swapp();
	 }
 }
 