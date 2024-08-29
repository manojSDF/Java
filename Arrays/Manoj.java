import java.util.Scanner;
        public class Manoj {
	public static void main(String[]args) {
 	
	Scanner  myObj = new Scanner(System.in);
            System.out.println("Enter village is: ");
            String village = myObj.nextLine();

      
           System.out.println("Enter age is: ");
           int age  = myObj.nextInt();

           System.out.println("Enter Salary is: ");
           double Salar = myObj.nextDouble();
  

        System.out.println("Your Birthday is:  " + village);
        System.out.println("Your School is:  " + age);
        System.out.println("Your Age is:  " + Salar); 
       
        }
}