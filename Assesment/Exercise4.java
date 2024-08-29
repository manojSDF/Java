import java.until.Scanner;
public class Exercise4 {
  public static void main(String args[]) {
	  
  Scanner multiplication=new Scanner(System.in);
  
  System.out.println("enter the Number:");
  int No =multiplication.nextint();
  
  for(int x =1;x<=10;x++){
  System.out.println(x="*"+No+"="+x*No);
  }
   }
}