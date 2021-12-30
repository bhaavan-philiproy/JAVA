class Multilevelinherit
   {
    public static void main(String args[])
     {
     testclass2 objectname= new testclass2();
     objectname.methodname();
     objectname.methodname1();
     objectname.methodname2();
     }
   }
 class testclass //final class
{
 int a=5;
 void methodname() 
   {
    System.out.println("hello1"+a);
    }
}
class testclass1 extends testclass
{
int b=10;
 void methodname1() 
   {
    System.out.println("hello2"+b);
    }
}

class testclass2 extends testclass1
{
int c=20;
 void methodname2() 
   {
    System.out.println("hello3"+b);
    }
}
