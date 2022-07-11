package  CIE;
import java.util.Scanner;

public class Student{
    int usn;
    String name;
    int sem;

    Scanner sc = new Scanner(System.in);

    public void get(){
        System.out.print("Enter the USN of the student: ");
        usn =sc.nextInt();
        System.out.println();
        System.out.print("Enter the Name of the student: ");
        name =sc.next();
        System.out.println();
        System.out.print("Enter the Sem: ");
        sem =sc.nextInt();
        System.out.println();

    }

    public void show(){
        System.out.print("USN: "+usn+" ,");
        System.out.print("Name: "+name+" ,");
        System.out.println("Sem: "+sem+" ,");
    }

}