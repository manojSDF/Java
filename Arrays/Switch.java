public class Switch {
	public static void main(String[]args){
	char grade = 'B';
	switch(grade) {
	case 'A' :
	System.out.println("Excelent!");
        break;
        case 'B' :
	case 'C' :
        System.out.println("Well done");
	break;
	case 'D' :
	System.out.println("You passed");
	break;
	case 'F' :
	System.out.println("Better try again");
	break;
	default  : 
	System.out.println("Invaild grade"); }
      System.out.println("Your grade is " + grade);
        }
}