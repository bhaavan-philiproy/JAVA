
class Armstrong
{
 public static void main(String argu[])
 {
  int n=370,d,x,sum=0;
  x=n;
  while(n!=0)
  {
   d=n%10;
   sum=sum + (d*d*d);
   n=n/10;
  }
  if(sum==x)
  {
   System.out.println("The number is Armstrong");
  }
  else
  {
   System.out.println("The number is not Armstrong");
  }
 }
}

