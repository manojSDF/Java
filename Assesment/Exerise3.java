import java.util.Scanner;
public class Exerise3 {
  public static void main(String args[]){
  Scanner cylinder=new Scanner(System.in);
  System.out.println("Enter the Radius:");
   double r =cylinder.nextDouble();
  System.out.println("Enter the Height:");
   double h =cylinder.nextDouble();
 
   double pi =3.1428571429;
   double volume;
   double area;

   volume =pi*r*r*h;
   System.out.println("Cylinder Volume is="+volume);
   area=2*pi*r*h;
   System.out.println("Cylinder Area is ="+area);
   }
}