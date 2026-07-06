package day11;


class A1 {
    void display(){
        System.out.println("display");
    }
}
class B1 extends A1 {
    void display(){
        System.out.println("hello");
    }
}
public class main2{
    public static void main(String[] args){
        B1 b=new B1();
        b.display();
    }
}

