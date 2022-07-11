import java.awt.*;
import java.awt.event.*;

class DialogBox extends Dialog implements ActionListener{
    user l;
    DialogBox(Frame parent, String title)
    {
        super(parent,title,false);
        l=(user)parent;
        setLayout(new FlowLayout());
        add(new Label(l.msg));
        Button b=new Button("Okay");
        add(b);
        b.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae){
        dispose();

    }

}

public class user extends Frame implements ActionListener{
    TextField num1,num2,res;
    String num3;
    Button div;
    String msg="";
    public user(){
        setLayout(new FlowLayout());
        num1 = new TextField(12);
        num2 = new TextField(10);
        res = new TextField(8);
        Label number1 = new Label("Num1 ", Label.RIGHT);
        Label number2 = new Label("Num2 ", Label.RIGHT);
        Label result = new Label("Result ", Label.RIGHT);
        div=new Button("Divide");
        add(number1);
        add(num1);
        add(number2);
        add(num2);
        add(div);
        add(result);
        add(res);
        num1.addActionListener(this);
        num2.addActionListener(this);
        div.addActionListener(this);
        res.addActionListener(this);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });


    }
    public void actionPerformed(ActionEvent ae){
        String s=ae.getActionCommand();
        if(s.equals("Divide"))
        {
            res.setText(divide());

        }
    }
    String divide() {
        int n;
        int n1, n2;
        try {
            n1 = Integer.parseInt(num1.getText());
            n2 = Integer.parseInt(num2.getText());
            try {
                n = n1 / n2;
                num3 = String.valueOf(n);
                return num3;
            } catch (ArithmeticException e) {
                msg = "Cannot divide num1 by zero!";
                DialogBox d = new DialogBox(this, "Exception message box");
                d.setVisible(true);
                return "";
            }
        } catch (NumberFormatException nf) {
            msg = "The input numbers must be integers!";
            DialogBox d = new DialogBox(this, "Exception message box");
            d.setVisible(true);
            return "";
        }
    }
    public static void main(String args[]){
        user appwin = new user();
        appwin.setSize(new Dimension(400,180));
        appwin.setTitle("Division");
        appwin.setVisible(true);
    }


}