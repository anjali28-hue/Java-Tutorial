package day11;

class Ex{
    void display(){
        System.out.println("display the outer class A");
    }
    class a{
        void display(){
            System.out.println("display");
        }
    }
}

public class main4 {
    public static void main(String[] args){
        Ex obj=new Ex();
        Ex.a obj2=obj.new a();
        obj.display();
    }
}
