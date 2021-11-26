package exam1;
class Thread2 extends Thread{
    public void run(){
          for(int i=105;i<=110;i++) System.out.println(+i);
    }
}
class Thread1 extends Thread2{
    public void run(){
        for(int i=1;i<=101;i++){
            if(i<=100)
            {
                System.out.println(+i);
            }
            else { 
                Thread2 b1=new Thread2();  
                b1.start();
                 stop();
            }
        }
    }
}
public class Exam1 {
    public static void main(String[] args) {
      Thread1 ob=new Thread1();
      try{
           ob.start();
      }catch(Exception e){
          e.printStackTrace();
      }
      
    }
    
}
