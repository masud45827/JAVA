package exam;
class Invalid extends Exception{
     Invalid(String s){
          super(s);
     }
}
class Trww{
       void  fun( int n) throws Invalid{
           for(int i=1;i<=n;i++){
               if(i>500) throw new Invalid("Error");
               else System.out.println(+i);
           }
       }
}
public class Exam {
    public static void main(String[] args) throws Invalid {
       Trww ob=new Trww();
        try{
            ob.fun(501);
        }catch(Invalid e){
            System.out.println(e);
        }
         
  }
  }
    


