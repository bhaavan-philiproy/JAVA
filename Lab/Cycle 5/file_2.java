import java.io.*;
import java.util.*;
class file_2
{
 public static void main(String args[]) throws Exception
 {
  try
  {
   FileInputStream fin=new FileInputStream("file_2.txt");
   int c=-1,l=0,w=0;
   int ch;
   while((ch=fin.read())!=-1)
   {
    c++;
    if(ch=='\n')
     l++;
    if(ch==' ' || ch=='\n')
     w++;
   }
   System.out.println("No. of characters = "+c);
   System.out.println("No. of words = "+w);
   System.out.println("No. of lines = "+l);
   fin.close();
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}