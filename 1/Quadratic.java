import java.util.* ;
import static java.lang.Math.*;
class Quadratic{
    static void findRoots(int a, int b, int c) {
        // If a is 0, then equation is not
        // quadratic, but linear

        if (a == 0) {// If a is 0, then equation is not quadratic, but linear
            System.out.println("Invalid");
            return;
        }

        int d = (b * b )- (4 * a * c);
        double sqrt_val = sqrt(abs(d));
        if(d > 0){
            System.out.println("Roots are real and different \n");
            System.out.println((double) (-b + sqrt_val) / (2 * a) + "\n"+ (double) (-b - sqrt_val) / (2 * a));

        }
        else if(d < 0){
            System.out.println("Real roots don't exist. \n");

        }
        else{
            System.out.println("Real roots exist and are equal. \n");
            System.out.println(-(double) b / (2 * a) + "\n"+ -(double) b / (2 * a));
        }



        }

    public static void main(String args[]){
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a :");
        a=sc.nextInt();
        System.out.println("Enter the value of b :");
        b=sc.nextInt();
        System.out.println("Enter the value of c :");
        c=sc.nextInt();

        findRoots(a, b, c);


        
    }
}