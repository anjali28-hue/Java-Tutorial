
abstract class computer{
    abstract void display();
}
class laptop extends computer{
    void display(){
        System.out.println("Laptop");
    }
}
class desktop extends computer{
    void display(){
        System.out.println("Desktop");
    }
}
public class main5 {
    public static void main(String[] args){
        computer laptop1=new laptop();
        laptop1.display();
        computer laptop2=new desktop();
        laptop2.display();
    }
}
