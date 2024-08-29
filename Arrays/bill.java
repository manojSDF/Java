import java.util.Scanner;
  public class bill {
    public static void main(String args[]){

    Scanner bill=new Scanner (System.in);

    System.out.println("last meter Reading");
    double LMR=bill.nextDouble();

    System.out.println("current meter Reading");
    double CMR=bill.nextDouble();

    double units=CMR-LMR;

    System.out.println("Number of units used="+units);

    //System.out.println("unit is");
    //double units=bill.nextInt();

    double cost=0.0;

    if(units<=50){
    System.out.println(cost=units*3.50);
    }

    else if(units<=150){
    System.out.println(cost=(50*3.50)+(units-50)*4);
    }

    else if(units<=250){
    System.out.println(cost=(50*3.50)+(100*4)+(units-150)*5.20);
    }

    else{
    System.out.println(cost=(50*3.50)+(100*4)+(100*5.20)+(units-250)*6.50);
    }
  }
}