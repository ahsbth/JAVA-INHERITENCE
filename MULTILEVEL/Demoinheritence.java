
class Addition
{
    int x=10;
    int y=12;
    void add()
    {
       int  result=x+y;
       System.out.println("Addition="+result);
    }
}
class Substract extends Addition{
    int z=15;
    void sub()
    {
        int results=x-z;
        System.out.println("Substract="+results); 
    }
}

public class Demoinheritence {
    public static void main(String []args)
    {

        Substract s=new Substract();
        s.add();
        s.sub();
    }
    
}

