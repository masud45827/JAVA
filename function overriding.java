package javaapplication24;
class  A{
      void display(){
           System.out.println("Class A");
      }
}
class  B extends A{
      @Override
      void display(){
           System.out.println("Class B");
      }
}
public class JavaApplication24 {
    public static void main(String[] args) {
         B ob=new B();
         ob.display();
        
         
    }
    
}
