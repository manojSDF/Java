import java.uti.Scanner;
public class qcriket201701{
	public static void main(String[]args){
		Scanner cricket = new Scanner(System.in);
		
		int total ;
		double averange ;
		
		
		System.out.println("Enter Cricketer Name:  ");
		String name = cricket.nextLine();
		
		System.out.println("Enter The Number Inning Batted:  ");
		int batted = cricket.nextInt();
		
		System.out.println("Enter The Run Scored:  ");
		int run1 = cricket.nextInt();
		
		System.out.println("Enter The Run Scored:  ");
		int run2 = cricket.nextInt();
		
		System.out.println("Enter The Run Scored:  ");
		int run3 = cricket.nextInt();
		
		total = run1+run2+run3 ;
		averange = total/batted;
		
	}
}