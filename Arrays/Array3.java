import java.util.Scanner;
     public class Array3{
        public static void main (String[] args) {
	
    int values [] = new int [5];

    Scanner readobj = new Scanner (System.in);

    System.out.print("Enter Cricketer Name :  ");
    String name = readobj.nextLine();

    System.out.print("Enter Number Of Innings Batter :  ");
    int innings = readobj.nextInt();

    int Values[] = new int[innings];
	
 for (int i = 0; i < values.length; i++) {

    System.out.print("Enter Run Scored :  ");
    values [i] = readobj.nextInt();
}
    int total = 0;
	  
 for (int i = 0; i < values.length; i++) {
     total = total+values[i];

}   System.out.println("Total Score  : " + total);

    int average ;

    average = total/innings;

    System.out.println("Average Scored : " + average);
   }
}




