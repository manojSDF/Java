public class Assigment{
  public static void main (String[]args){
     int a = 104;
     int b = 1000;
     int c = 0;

     b -= a;    
     System.out.println("b gen a adukarala b ta age denawa:= " + b);

     
     a += b;
     System.out.println("a ta b ekathukarala a ta age denawa:= " + a);
 
    
     b *= a;
     System.out.println("b gen a gunakarala b ta age denawa:= " + b);
     
     
     System.out.println("b gen a bedala b ta age denawa:= "+ (b %= a));
  }
}     
 