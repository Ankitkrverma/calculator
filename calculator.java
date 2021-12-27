package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class myframe extends JFrame implements ActionListener {
    private Container c;
    private JButton add, sub, mul, div;
    private JLabel l1,l2,l3;
    private JTextField t1,t2,r1;
    myframe(){
        Color color = new Color(135,206,235);
        Font font = new Font("Arial",Font.BOLD,15 );
        setTitle("Simple Calculator");
        setSize(300,400);
        setLocation(1000,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c = getContentPane();
        c.setBackground(Color.lightGray);
        c.setLayout(null);
        l1 = new JLabel("first number");
        l1.setBounds(20,20,100,20);
        l1.setBackground(color);
        l1.setFont(font);
        c.add(l1);
        l2 = new JLabel("second number");
        l2.setBounds(20,70,100,20);
        l2.setBackground(color);
        l2.setFont(font);
        c.add(l2);
        t1 = new JTextField();
        t1.setBounds(130,20,100,20);
        t1.setBackground(color);
        c.add(t1);
        t2 = new JTextField();
        t2.setBounds(130,70,100,20);
        t2.setBackground(color);
        c.add(t2);
        l3 = new JLabel("result");
        l3.setBounds(30,120,100,20);
        l3.setBackground(color);
        l3.setFont(font);
        c.add(l3);
        r1 = new JTextField();
        r1.setEditable(false);
        r1.setBounds(130,120,100,20);
        r1.setBackground(color);
        r1.setFont(font);
        c.add(r1);

        add = new JButton("+");
        add.setBounds(20,180,50,30);
        add.setBackground(Color.orange);
        c.add(add);
        sub = new JButton("-");
        sub.setBounds(80,180,50,30);
        sub.setBackground(Color.orange);
        c.add(sub);
        mul = new JButton("*");
        mul.setBounds(140,180,50,30);
        mul.setBackground(Color.orange);
        c.add(mul);
        div = new JButton("/");
        div.setBounds(200,180,50,30);
        div.setBackground(Color.orange);
        c.add(div);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        t1.setFont(font);
        t2.setFont(font);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

        try {
            if (ae.getSource() == add) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                double c = a + b;
                r1.setText("" + c);
            }
            if (ae.getSource() == sub) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                double c = a - b;
                r1.setText("" + c);
            }
            if (ae.getSource() == mul) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                double c = a * b;
                r1.setText("" + c);
            }
            if (ae.getSource() == div) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                double c = a / b;
                r1.setText("" + c);
            }
        }catch(NumberFormatException e){
            r1.setText("please enter an valid number");
        }catch (ArithmeticException e){
            r1.setText("number cannot be divide by 0");
        }

    }
}

public class calculator {
    public static void main(String[] args) {
        myframe frame = new myframe();

    }
}
