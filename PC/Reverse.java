class Reverse
{
 public static void main(String argy[])
 {
  int n=123,d,rev=0;
  while(n!=0)
  {
   d=n%10;
   rev=rev*10+d;
   n=n/10;
  }
  System.out.println(""+rev);
 }
}