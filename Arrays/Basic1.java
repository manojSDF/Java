public class Basic1 {
  int x = 5;
  public static void main(String[]args) {
  Basic1 myobj1 = new Basic1();
  Basic1 myobj2 = new Basic1();
  myobj2.x = 50;
  Basic1 myobj3 = new Basic1();
  myobj3.x = 60;
  Basic1 myobj4 = new Basic1();
  myobj4.x = 1000;
  Basic1 myobj5 = new Basic1();
  myobj5.x = 2500;
  System.out.println("value of myobj1 is:- "+ myobj1.x);
  System.out.println("value of myobj2 is:- "+ myobj2.x);
  System.out.println("value of myobj3 is:- "+ myobj3.x);
  System.out.println("value of myobj4 is:- "+ myobj4.x);
  System.out.println("value of myobj5 is:- "+ myobj5.x);
  }
}