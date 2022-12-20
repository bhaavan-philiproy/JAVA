import java.util.*;
class Example
{
 public static void main(String args[])
 {
  int a,b;
  Scanner c=new Scanner(System.in);
  a=c.nextInt();
  b=c.nextInt();
  testclass t=new testclass();
  t.sum(a,b);
  System.out.println("s = "+t.s);
 }
}
class testclass
{
 int s=5;
 void sum(int a,int b)
 {
  int sum;
  sum=a+b;
  System.out.println("Sum = "+sum);
 }
}

