package javaapplication24;
class  A{
   synchronized void print(int l,int r){
             for(int i=l;i<=r;i++) System.out.println(+i);
     }
}
 class Th1 extends Thread{
        A ob1;
        Th1(A e){
            ob1=e;
        }
         public void run(){
             ob1.print(200,300);
        }
         
 } 
class Th2 extends Thread{
        A ob2;
        Th2(A e){
            ob2=e;
        }
        public void run(){
             ob2.print(0,100);
        }
         
 } 
public class JavaApplication24 {
    public static void main(String[] args) {
       A ob=new A();
       Th1 t1=new Th1(ob);
       Th2 t2=new Th2(ob);
       t1.start();
       t2.start();
       
    }
}
