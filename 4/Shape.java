import java.util.* ;

abstract class shape1{
    int dim1;
    int dim2;

    shape1(){
        dim1=-1;
        dim2=-2;
    }
    shape1(int a, int b){
        dim1=a;
        dim2=b;
    }
    abstract void area();
}

class Rectangle extends shape1{
    Rectangle(int a, int b){
        super(a,b);
    }
    void area(){
        System.out.println("Inside of rectangle class");
       System.out.println("Area of rectangle is: " +(this.dim1*this.dim2));
    }
}
class Triangle extends shape1{
    Triangle(int a, int b){
        super(a,b);
    }
    void area(){
        System.out.println("Inside of triangle class");
        System.out.println("Area of triangle is: " +(0.5*this.dim1*this.dim2));
    }

}
class Circle extends shape1{
    Circle(int a, int b){
        super(a,b);
    }
    void area(){
        System.out.println("Inside of Circle class");
        System.out.println("Area of circle is: " + (3.14*this.dim1*this.dim1));
    }

}


class Shape{
    public static void main(String args[]){
        shape1 s;
        Rectangle r = new Rectangle(5,8);
        s=r;
        s.area();
        Triangle t = new Triangle(6,10);
        s=t;
        s.area();
        Circle c = new Circle(5,5);
       s= c;
       s.area();
    }
}