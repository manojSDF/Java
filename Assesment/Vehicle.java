class vehicle
{
   protected String brand = "Toyota";
   public void horn()
   {
   System.out.println("peep peep!);
   }
 }
 class Car extends Vehicle
 }
   private String modelName = "Aqua";
   public static void main(String[] args)
   {
   Car myCar = new Car();
   myCar.horn();
   System.out.println(myCar.brand + " " + myCar.modelName);
   }
}
