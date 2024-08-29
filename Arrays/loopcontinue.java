public class loopcontinue {
    public static void main(String[]args) {
    int [] numbers = {10,20,40,50,60,70,};
    for(int x : numbers ){
    if(x==50 ) {
    continue;
    }
    System.out.println( x );
    System.out.println("\n"); 
    }
    }
}