package javaapplication23;
class Th1 extends Thread{
   public void run(){
       for(int i=0;i<100;i++) System.out.println(+i);
   }
}
public class JavaApplication23 {
    public static void main(String[] args) {
         Th1 ob=new Th1();
          ob.start();
    }
    
}
