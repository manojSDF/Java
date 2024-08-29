public class bitwe{
    public static void main(String args[]){
       int x = 10;  /*10=0000 1010*/
       int y = 15;  /*15=0000 1111*/
       int z = 0;
    

        z = x & y;   /*10=0000 1010*/

        System.out.println("x & y = " + z);
         
        z = x | y;   /*15=0000 1111*/

        System.out.println("x | y = " + z);

        System.out.println("Complement'(~x)'of The x is: " + ( ~x));

                     /*1111 0101*/

        System.out.println("Left Shift'(x<<2)'of The x is: " + (x<<2));
 
                     /*0000 1010*/

        System.out.println("Right Shift'(y>>2)'of The y is: " + (y>>2));
           
        
    }   
}                                                              