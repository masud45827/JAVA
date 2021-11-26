package javaapplication24;
class  A{
      void display(){
           System.out.println("Class A");
      }
}
class  B extends A{
      @Override
      void display(){
           System.out.println("Class B");
      }
}
class  C{
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
         B ob1=new B();
         ob1.display();
          C ob=new C();
        ob.fun1("Masud Ali","18CSE027");
        ob.fun1(21);
         System.out.println("Name = "+ob.name);
           System.out.println("age = "+ob.age);
             System.out.println("id = "+ob.id);
        
         
    }
    
}
