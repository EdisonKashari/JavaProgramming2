package day_45_Abstraction;

public interface PropertiesOfInterface { // no final bc we have to implement to the subclasses
    //   int a;    only final and static by default
    static int b = 100;



    /*  public PropertiesOfInterface(){ // no constructor in interface
          this.a=a;
      }

      static {   no static block
          b=100;
      }


      public void method1(){
          System.out.println("Instance method");   no instance method
      }

     */
    public static void method2() {
        System.out.println("");
    }

    public abstract void method3();
    //Farangez is a diplomatic
    //Kerem lives in best city in the world
    //Edison lives in village

    public default void  method4(){
        System.out.println("Farangez,Kerem,Edison are student in batch 25");
    }
}
