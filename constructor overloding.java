package javaapplication24;
class  A{
     int age;
      String name,id;
      A(String name1,String id1){
          name=name1;id=id1;
      }
      A(int age1){
          age=age1;
      }
}
public class JavaApplication24 {
    public static void main(String[] args) {
         A ob=new A("Masud Ali","18CSE027");
         A ob1=new A(21);
         System.out.println("Name = "+ob.name);
           System.out.println("age = "+ob1.age);
             System.out.println("id = "+ob.id);
         
    }
    
}
