abstract class Car {

   public abstract void drive();
   public abstract void fly();

   public void playMusic() {
      System.out.println("play music");
   }
}

class WagonR extends Car {

   public void drive() {
      System.out.println("driving the WagonR");
   }
   public void fly(){
      System.out.println("flying");
   }
}

public class Demo {

   public static void main(String a[]) {
      Car obj = new WagonR();
      obj.playMusic();

   }
}