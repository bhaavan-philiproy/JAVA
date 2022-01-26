
public class Exp4_3
{  
 public void finalize()
 {
  System.out.println("object is garbage collected");
 }  
 public static void main(String args[])
 {  
  Exp4_3 s1=new Exp4_3();  
  Exp4_3 s2=new Exp4_3();  
  s1=null;  
  s2=null;  
  System.gc();  
 }  
}