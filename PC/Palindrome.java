class Palindrome
{
 public static void main(String argu[])
 {
  int n=12321,d,rev=0,x;
  x=n;
  while(n!=0)
  {
   d=n%10;
   rev=rev*10+d;
   n=n/10;
  }
  if(rev==x)
  {
   System.out.println("The number is palindrome");
  }
  else
  {
   System.out.println("The number is not palindrome");
  }
 }
}

