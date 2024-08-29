public class loopcontrol {
    public static void main(String[]args) {
    int [] numbers = {10,20,30,40,50,60,70,80,90,100};
    for(int x : numbers ){
    if(x==50 ) {
    break;
    }
    System.out.println( x );
    System.out.println("\n"); }
    }
}