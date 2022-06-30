package mypack;
public class Account{
    public static int min =500;
    String name;
    int Acc_num;
    public float o_bal;
    Scanner sc = new Scanner(System.in);
    void getInfo () {
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Account number: ");
        Acc_num = sc.nextInt();
        System.out.println("Enter Opening balance : ");
        o_bal = sc.nextFloat();
        if(o_bal<500)
            System.out.println("opening balance must be greater then 500!");
    }
    public void show(){
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+Acc_num);
        System.out.println("Amount: "+o_bal);
    }
}


public class Cur_acct extends Account{
    float deposit, withdraw,penalty;
    public void deposit(){
        System.out.println("Enter the amount to deposit");
        deposit = sc.nextFloat();

        o_bal=o_bal + deposit;
        System.out.println("Total Amount is " + o_bal);
        System,out.println("-----------");
        show();
    }
    public void check_Bal(){
        if(o_bal<min)
        {
            System.out.println("Amount must be greater then 500!");
            o_bal=o_bal-150;
            System.out.println("You have been debited amount 150 from your account,\n Account Balance is "+o_bal);

        }
    }
    public void withdrawal(){
        System.out.println("Enter the amount to be withdrawn");
        withdraw=sc.nextFloat();
        show();
        if(withdraw<o_bal)
        {
            o_bal=o_bal-withdraw;
            System.out.println("Afte withdrawal, Balance is "+o_bal);

        }
        else
        {
            System.out.println("Insufficient Balance! Cannot be less than 500.");
        }
        check_Bal();
    }
}

public lass Sav_acct extends Account{
    float deposit, withdraw, intr;
    public void deposit(){
        System.out.println("Enter the amount to deposit");
        deposit = sc.nextFloat();
        show();
        o_bal=o_bal + deposit;
        System.out.println("Total Amount is " + o_bal);
    }
    public void check_intr(){
        intr = (o_bal*2)/100;
        o_bal=o_bal+intr;
        System.out.println("Toatl amount with interest is :"+o_bal);
    }
    public void withdrawal() {
        System.out.println("Enter the amount to be withdrawn");
        withdraw = sc.nextFloat();
        show();
        if (withdraw < o_bal) {
            o_bal = o_bal - withdraw;
            System.out.println("Afte withdrawal, Balance is " + o_bal);

        } else {
            System.out.println("Insufficient Balance!");
        }
    }


}