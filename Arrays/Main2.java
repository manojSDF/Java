import java.util.Scanner;
  public class Main2 {
  public static void main(String[]args) {

       Scanner  myObj = new Scanner(System.in);

       System.out.println("Enter Name: ");
       String name = myObj.nextLine();

       System.out.println("Enter age: ");
       int age = myObj.nextInt();

       System.out.println("Enter Salary: ");
       double salary = myObj.nextDouble();

    System.out.println("Your Name is " + name);
    System.out.println("Your Age is " + age);
    System.out.println("Your Salary is " + salary);
 }
}