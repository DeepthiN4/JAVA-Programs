package SEE;
import CIE.*;

import java.util.Scanner;

public class External extends CIE.Student{
    public double[] seeMarks= new double[5];
    Scanner sc = new Scanner(System.in);

   public void getseeMarks(){
        System.out.println("Enter SEE marks for the 5 subjects: ");
        for(int i=0;i<5;i++){
            System.out.print("Enter marks for subject "+(i+1)+": ");
            seeMarks[i]=sc.nextDouble();
            System.out.println();
        }
    }



}