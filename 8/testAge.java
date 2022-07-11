import java.util.*;

class WrongAge extends Exception{
    public String toString(){
        return " Please enter the proper Age!";
    }
}
class Father{
    int fAge;
    Father(int a){
        fAge=a;
        System.out.println("Father age: "+fAge);
    }

}

class Son extends Father{
    int sAge;
    Son(int f, int s){
        super(f);
        sAge=s;
        System.out.println(" Son age: "+sAge);
    }
    void checkAge() throws WrongAge{
        if(fAge<=sAge){
            throw new WrongAge();
        }
    }
}

class testAge{
    public static void main(String args[]) throws WrongAge{
        Son s1 =new Son(40,10);

        try{
            s1.checkAge();
            System.out.println("Ages are correct .");
        }catch(WrongAge w){
            System.out.println("Caught Exception!"+w);
        }
        Son s2=new Son(30,35);
        try{
            s2.checkAge();
            System.out.println("Ages are correct.");
        }catch(WrongAge w){
            System.out.println("Caught Exception!"+w);
        }


    }

}