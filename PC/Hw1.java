class Hw1
{
 public static void main(String argu[])
 {
  Hw1 obj=new Hw1();
  obj.factorial(5);
  obj.add(10);
  obj.factor(10);
 }
 void factorial(int a)
 {
  int fact=1,i;
  for(i=1;i<=a;i++)
  {
   fact=fact*i;
  }
  System.out.println("Factorial= "+fact);
 }
 void add(int a)
 {
  int i,sum=0;
  for(i=0;i<=a;i++)
  {
   sum=sum+i;
  }
  System.out.println("Sum= "+sum);
 }
 void factor(int a)
 {
  System.out.println("Factors are: ");
  for(int i=1;i<=a;i++)
  {
   if(a%i==0)
   {
    System.out.println(i);
   }
  }
 }
}