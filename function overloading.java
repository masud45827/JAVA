package javaapplication24;
class  A{
     int age;
      String name,id;
      void fun1(String name1, String id1){
            name=name1; id=id1;
      }
       void fun1(int age1){
             age=age1;
      }
}
public class JavaApplication24 {
    public static void main(String[] args) {
         A ob=new A();
        ob.fun1("Masud Ali","18CSE027");
        ob.fun1(21);
         System.out.println("Name = "+ob.name);
           System.out.println("age = "+ob.age);
             System.out.println("id = "+ob.id);
         
    }
    
}
