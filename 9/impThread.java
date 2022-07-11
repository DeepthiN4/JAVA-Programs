import java.util.*;

class Thread1 implements Runnable{
    Thread t;
    String name;
    int time;
    Thread1(String name, int time){
        this.name=name;
        this.time=time;
        t=new Thread(this.name);
        t.start();

    }
    public void run() {
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(name);
                Thread.sleep(time);
            }
        }
        catch(InterruptedException ie){
                System.out.println("Thread " + name + " got interrupted");

            }
        System.out.println("Thread " + name + " quitting");

    }


}
public class impThread{
    public static void main(String args[]){
        Thread1 t1 =new Thread1("BMS College of Engineering", 10000);
        Thread1 t2 =new Thread1("CSE", 2000);
    }
}