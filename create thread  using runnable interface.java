package javaapplication23;
class Myclass  implements Runnable{
   @Override
   public void run(){
       for(int i=1;i<=20;i++) System.out.println(+i);
   }
}
public class JavaApplication23 {
    public static void main(String[] args) {
         Myclass ob=new Myclass();
         Thread t1=new Thread(ob);
          t1.start();
    } 
}
