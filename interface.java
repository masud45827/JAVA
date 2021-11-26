package javaapplication24;
 interface  I{
        int get();
         void display();
 }
  class A implements I{
      int a;
      A(int x){
          a=x;
      }
      @Override
       public int get(){
           return a;
       }
     public  void display(){
           System.out.println("success");
       }
  }   
public class JavaApplication24 {
    public static void main(String[] args) {
        A ob=new A(2);
        System.out.println(ob.get());
        
    }
}
