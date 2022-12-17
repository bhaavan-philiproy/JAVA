class Hw2
{
 public static void main(String argu[])
 {
  Hw2 obj=new Hw2();
  obj.prime(5);
  obj.even(6);
  obj.armstrong(370);
 }
 void prime(int a)
 {
  int i,flag=1;
  for(i=2;i<a;i++)
  {
   if(a%i==0)
   {
    flag=0;
   }
  }
  if(flag==1)
  System.out.println("The number is prime");
  else
  System.out.println("The number is not prime");
 }
 void even(int a)
 {
  if(a%2==0)
  System.out.println("The number is even");
  else
  System.out.println("The number is odd");
 }
 void armstrong(int a)
 {
  int sum=0,d,x;
  x=a;
  while(a!=0)
  {
   d=a%10;
   sum=sum+(d*d*d);
   a=a/10;
  }
  if(sum==x)
  {
   System.out.println("The number is armstrong");
  }
  else
   System.out.println("The number is not armstrong");
 }
}
