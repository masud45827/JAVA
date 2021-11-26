package javaapplication24;
  class A{
       private int a,b;
       void set(int x,int y){
           a=x; b=y;
       }
        int geta(){
           return a;
       }
         int getb(){
           return b;
       }
  }   
public class JavaApplication24 {
    public static void main(String[] args) {
        A ob=new A();
         ob.set(2,3);
         int a=ob.geta();
         int b=ob.getb();
         System.out.println(a+" "+b);
    }
}
