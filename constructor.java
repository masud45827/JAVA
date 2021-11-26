package javaapplication24;
class  A{
     int age;
      String name,id;
      A(String name1,String id1,int age1){
          name=name1; age=age1; id=id1;
      }
}
public class JavaApplication24 {
    public static void main(String[] args) {
         A ob=new A("Masud Ali","18CSE027",21);
         System.out.println("Name = "+ob.name);
           System.out.println("age = "+ob.age);
             System.out.println("id = "+ob.id);
         
    }
    
}
