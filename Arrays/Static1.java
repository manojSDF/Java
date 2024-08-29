public class Static1 {
  static int x = 5;
  public static void main(String[]args) {
  Static1 myobj1 = new Static1();
  Static1 myobj2 = new Static1();
  myobj2.x = 50;
  Static1 myobj3 = new Static1();
  myobj3.x = 60;
  Static1 myobj4 = new Static1();
  myobj4.x = 1000;
  Static1 myobj5 = new Static1();
  myobj5.x = 2500;
  System.out.println("value of myobj1 is:- "+ myobj1.x);
  System.out.println("value of myobj2 is:- "+ myobj2.x);
  System.out.println("value of myobj3 is:- "+ myobj3.x);
  System.out.println("value of myobj4 is:- "+ myobj4.x);
  System.out.println("value of myobj5 is:- "+ myobj5.x);
  }
}