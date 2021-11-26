package javaapplication24;
  class A{
       int a,b,c;
        int display(){
             return a*b*c;
        }
  }   
class B extends A{
   B(int x,int y,int z){
             a=x; b=y; c=z;
        }  
}
public class JavaApplication24 {
    public static void main(String[] args) {
        B ob=new B(2,3,4);
        System.out.println(ob.display());
        
    }
}
