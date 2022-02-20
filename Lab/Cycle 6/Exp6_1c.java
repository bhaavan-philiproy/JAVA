import java.io.*;
class Exp6_1c
{
 public static void main(String args[]) throws Exception
 {
  try
  {
   FileInputStream fin=new FileInputStream("abc.txt");
   int i;
   while((i=fin.read())!=-1)
    System.out.println((char)i);
   fin.close();
  }
  catch(FileNotFoundException e)
  {
   System.out.println(e);
  }
 }
}