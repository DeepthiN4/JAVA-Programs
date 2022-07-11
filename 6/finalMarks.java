import CIE.*;
import SEE.*;

import java.util.* ;

class finalMarks{
public static void main(String args[]){
    int num;
    Scanner sc =new Scanner(System.in);

    System.out.print("Enter the number of students: ");
    num=sc.nextInt();

    CIE.Internals ob1[]=new CIE.Internals[num];
    SEE.External ob2[]=new SEE.External[num];
    for(int i=0;i<num;i++)
    {
        ob1[i]=new CIE.Internals();
        ob2[i]=new SEE.External();
        ob1[i].get();
        ob1[i].getMarks();
        ob2[i].getseeMarks();
    }
    for(int i=0; i<num; i++){
        ob1[i].show();
        for(int j=0;j<5;j++){
            System.out.println("Final marks in subject"+(j+1)+" : "+(ob1[i].marks[j]+((ob2[i].seeMarks[j])/2.0)));
        }
        System.out.println();
    }
}
}