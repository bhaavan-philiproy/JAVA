import java.io.*;
import java.util.*;
class file_1
{
 public static void main(String args[]) throws Exception
 {
  try
  {
   FileInputStream fin=new FileInputStream("file1.txt");
   int i=0,lno=1;
   while((i=fin.read())!=-1)
   {
    if((char)i!=-1)
     System.out.println((lno++)+"- "+((char)i));
   }
   fin.close();
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}
