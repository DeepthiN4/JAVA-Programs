import java.util.* ;

class studentDetails{
    String name;
    String USN;
    int credits[];
    double marks[];
    double sgpa;
    int n;

    studentDetails(){
        name=" ";
        USN=" ";
        for(int k=0; k<n;k++) {
            credits[k] = 0;
            marks[k] = 0.0;
        }
        sgpa=0;
        n=1;

    }
    void accept(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        name= sc.next();
        System.out.println("Enter the USN: ");
        USN= sc.next();
        System.out.println("Enter the number of subjects: ");
        n = sc.nextInt();

        credits= new int[n];
        marks= new double[n];
        System.out.println("Enter the credits in each subject: ");
        for(int k=0; k<n;k++)
        {
            System.out.println("Enter credits of subject:"+(k+1));
            credits[k] = sc.nextInt();
        }
        System.out.println("Enter the marks in each subject: ");
        for(int k=0; k<n;k++)
        {
            System.out.println("Enter score subject:"+(k+1));
            marks[k] = sc.nextInt();
        }


    }
    void display(){
        System.out.println("------------result------------");
        System.out.println("name:\t\t"+name);
        System.out.println("USN:\t\t"+USN);
        System.out.println("marks:\t\t");
        for(int i=0;i<n;i++)
        {
            System.out.print("Subject "+(i+1)+": ");
            System.out.println(marks[i]+" ");
        }
        System.out.println("credits:\t\t");
        for(int i=0;i<n;i++)
        {
            System.out.print("Subject "+(i+1) +": ");
            System.out.println(credits[i]+" ");
        }
        System.out.println();
        System.out.println("SGPA is: \t"+sgpa);
    }

    void calc_sgpa(){
        double sum=0.0;
        int tot_cred=0;
        for(int i=0;i<n;i++){
            sum=sum+(marks[i]*credits[i]);
            tot_cred=tot_cred+credits[i];
        }
        sgpa=sum/tot_cred;


    }

}

class Student{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students :");
        int num = sc.nextInt();
        studentDetails ob[]=new studentDetails[num];
        for(int i=0;i<num;i++)
        {
            ob[i]=new studentDetails();
            ob[i].accept();
            ob[i].calc_sgpa();
            ob[i].display();
        }


    }
}