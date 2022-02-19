import java.io.*;
import java.util.*;
class file_3
{
 public static void main(String args[]) throws Exception
 { 
  try
  {
   Scanner o=new Scanner(System.in);
   Scanner o1=new Scanner(System.in);
   FileWriter fw=new FileWriter("file_3.txt");
   System.out.println("\nName : ");
   String name=o.nextLine();
   System.out.println("\nAddress : ");
   String address=o1.nextLine();
   fw.write(name+"\n");
   fw.write(address);
   fw.close();
   FileReader fr=new FileReader("file_3.txt");
   int ch=0;
   while((ch=fr.read())!=-1)
    System.out.println((char)ch);
   System.out.println("\n");
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}