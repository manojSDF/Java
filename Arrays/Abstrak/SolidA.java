import java.util.Scanner;
abstract class Solid{
                 Scanner cub = new Scanner(System.in);
                 public abstract void area();
                 int area;
                 public abstract void volume();
                 int volume;
}
class Cuboid extends Solid{
                 int h= cub.nextInt();
                 int l=cub.nextInt();
                 int w=cub.nextInt();
                 public void area(){
                 area=6*l*l;
                 System.out.println("The Cuboid area is:"+area);
                 }
                 public void volume(){
                 volume=l*h*w;
                 System.out.println("The Cuboid area is:"+volume);
                 }
}
class Sphere extends Solid{
                 int r = cub.nextInt();
                 int l=cub.nextInt();
                 public void area(){
                 area =4*(22/7)*l*l;
                 System.out.println("The Sphere are is"+area);
                 }
                 public void volume(){
                 volume=4/3*(22/7)*r*r*r;
                 System.out.println("The Sphere volume is"+ volume);
                 }
}
class Cone extends Solid{
                 int r = cub.nextInt();
                 int l=cub.nextInt();
                 public void area(){
                 area =(22/7)*r*r+(22/7)*r*l;
                 System.out.println("The Cone area is"+ area);
                 }
                 public void volume(){
                 volume=1/3*(22/7)*r*r*l;
                 System.out.println("The Cone volume is:"+volume);
                  }
}
class SolidA{
      public static void main(String args[]){
                 // System.out.println("Enter heigtht:"+"\n");       
                 // System.out.println("Enter length:"+"\n");
                  //System.out.println("Enter width:"+"\n");
                  Cuboid C=new Cuboid();
                  C.area();
                  C.volume();
                  
                   Sphere S=new Sphere();
                   S.area();
                   S.volume();

                   Cone CN=new Cone();
                   CN.area();
                   CN.volume();
         }
}    