abstract class animal{
    abstract void eat();
}
class dog extends animal{
    void eat(){
        System.out.println("dog id eating");
    }
}
interface pet{
    void eat();
}
class cow extends animal implements pet{
    public void eat(){
        System.out.println("cow is eating");
    }
}
interface pets{
    void eat();
}
public class main6{
    public static void main(String[] args){
        animal a=new dog();
        a.eat();
        animal b=new cow();
        b.eat();
    }
}