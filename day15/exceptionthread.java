package day15;


class c extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
class d extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
public class exceptionthread {
    public static void main(String[] args){
        c A=new c();
        d B=new d();
        A.start();
        B.start();
    }
}
