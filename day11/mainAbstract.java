package day11;
abstract class ch{
    abstract void run();
    abstract void display();
    void display2() {
        System.out.println("heeee");
    }
}
class anu extends ch{
    void run(){
        System.out.println("hello world");
    }
    void display(){
        System.out.println("helo world");
    }
}

public class mainAbstract {
    public static void main(String[] args){
        anu a=new anu();
        a.run();
        a.display();

    }
}
