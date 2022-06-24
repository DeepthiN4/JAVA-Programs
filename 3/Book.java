import java.util.* ;

class book1{
    String name, author;
    double price;
    int num_pages;

    book1(){
        name=" ";
        author=" ";
        price=0.0;
        num_pages=0;
    }
    book1( String name,String author, double price, int num_pages ){
        this.name=name;
        this.author=author;
        this.price=price;
        this.num_pages=num_pages;
    }
    void getDetails(){
        Scanner in = new Scanner(System.in);
        System.out.println("---Enter book Details---");
        System.out.println("Enter the name of the book: ");
        name =in.nextLine();
        System.out.println("Enter the author name: ");
        author =in.nextLine();
        System.out.println("Enter the price of the book: ");
        price =in.nextDouble();
        System.out.println("Enter the number of pages: ");
        num_pages =in.nextInt();

    }
    void displayDetails(){
        System.out.println("---Book Details---");
        System.out.println();
        System.out.println("Name of the book: " + name);
        System.out.println();
        System.out.println("Author name: " + author);
        System.out.println();
        System.out.println("Price of the book: " + price);
        System.out.println();
        System.out.println("Number of pages: " + num_pages);
        System.out.println();
        System.out.println("-----------------");
    }
    @Override
    public String toString() {
        return "The details of the book are: " + this.name + " , " + this.author + " , " + this.price + " , " + this.num_pages;
    }
}

class Book {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of books :");
        int num = sc.nextInt();
        book1 ob[] = new book1[num];
        for (int i = 0; i < num; i++) {
            ob[i] = new book1();
            ob[i].getDetails();

        }
        for (int i = 0; i < num; i++) {
            ob[i].displayDetails();
            System.out.println("--Calling toString function--"); //Print the object but implicitly using toString()
            System.out.println(ob[i].toString());
        }
    }
}