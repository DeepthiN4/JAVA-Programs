package CIE;

import java.util.Scanner;

public class Internals extends Student{
        public double[] marks= new double[5];
        Scanner sc = new Scanner(System.in);

        public void getMarks(){
            System.out.println("Enter CIE marks for the 5 subjects: ");
            for(int i=0;i<5;i++){
                System.out.print("Enter marks for subject "+(i+1)+": ");
                marks[i]=sc.nextDouble();
                System.out.println();
            }
        }


}