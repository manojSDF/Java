import java.util.Scanner;
public class Exercise2 {
  public static void main(String args[]){
  Scanner circle=new Scanner(System.in);
  System.out.println("Enter the Radius:");
  double r =circle.nextDouble();
  double pie=3.1428571429;
  double perimeter;
  double area;

  perimeter=2*pie*r;
  System.out.println("circle perimeter is:"+ perimeter);
  area=pie*r*r;
  System.out.println("circle area is:"+ area);
  }
}