import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator implements ActionListener {        
    
    JTextField t;
    JLabel l1;
    JFrame f;
    JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn_add,btn_sub,btn_mul,btn_div,btn_eql,btn_dec,btn_del,btn_clr;
    static double a=0, b=0, result=0;
    static int operator=0;
    Calculator(){

        f=new JFrame("Calculator");
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

        t=new JTextField();
        t.setBounds(50, 50, 230, 50);
        t.setBackground(Color.GRAY);
        f.add(t);

        btn0 =new JButton("0");
        f.add(btn0);
        btn0.setBounds(110,290,50,50);
        btn0.addActionListener(this);
        
        btn1 =new JButton("1");
        f.add(btn1);
        btn1.setBounds(50,110,50,50);
        btn1.addActionListener(this);             

        btn2 =new JButton("2");
        f.add(btn2);
        btn2.setBounds(110,110,50,50);
        btn2.addActionListener(this);

        btn3 =new JButton("3");
        f.add(btn3);
        btn3.setBounds(170,110,50,50);
        btn3.addActionListener(this);

        btn4 =new JButton("4");
        f.add(btn4);
        btn4.setBounds(50,170,50,50);
        btn4.addActionListener(this);

        btn5 =new JButton("5");
        f.add(btn5);
        btn5.setBounds(110,170,50,50);
        btn5.addActionListener(this);

        btn6 =new JButton("6");
        f.add(btn6);
        btn6.setBounds(170,170,50,50);
        btn6.addActionListener(this);

        btn7 =new JButton("7");
        f.add(btn7);
        btn7.setBounds(50,230,50,50);
        btn7.addActionListener(this);

        btn8 =new JButton("8");
        f.add(btn8);
        btn8.setBounds(110,230,50,50);
        btn8.addActionListener(this);

        btn9 =new JButton("9");
        f.add(btn9);
        btn9.setBounds(170,230,50,50);
        btn9.addActionListener(this);

        btn_add =new JButton("+");
        f.add(btn_add);
        btn_add.setBounds(230,110,50,50);
        btn_add.addActionListener(this);

        btn_sub =new JButton("-");
        f.add(btn_sub);
        btn_sub.setBounds(230,170,50,50);
        btn_sub.addActionListener(this);

        btn_mul =new JButton("*");
        f.add(btn_mul);
        btn_mul.setBounds(230,230,50,50);
        btn_mul.addActionListener(this);

        btn_div =new JButton("/");
        f.add(btn_div);
        btn_div.setBounds(230,290,50,50);
        btn_div.addActionListener(this);

        btn_eql =new JButton("=");
        f.add(btn_eql);
        btn_eql.setBounds(50,350,230,50);
        btn_eql.addActionListener(this);

        l1 =new JLabel("Normal Calculator");
        l1.setBounds(50,5,150,50);
        f.add(l1);

        
    }

    public void actionPerformed(ActionEvent ae) {      

        if(ae.getSource()==btn1)
        {
            t.setText(t.getText().concat("1"));
        }
        if(ae.getSource()==btn2)
        {
            t.setText(t.getText().concat("2"));
        }
        if(ae.getSource()==btn3)
        {
            t.setText(t.getText().concat("3"));
        }
        if(ae.getSource()==btn4)
        {
            t.setText(t.getText().concat("4"));
        }
        if(ae.getSource()==btn5)
        {
            t.setText(t.getText().concat("5"));
        }
        if(ae.getSource()==btn6)
        {
            t.setText(t.getText().concat("6"));
        }
        if(ae.getSource()==btn7)
        {
            t.setText(t.getText().concat("7"));
        }
        if(ae.getSource()==btn8)
        {
            t.setText(t.getText().concat("8"));
        }
        if(ae.getSource()==btn9)
        {
            t.setText(t.getText().concat("9"));
        }
        if(ae.getSource()==btn0)
        {
            t.setText(t.getText().concat("0"));
        }


        if(ae.getSource()==btn_add)
        {
            a=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
        }
        if(ae.getSource()==btn_sub)
        {
            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }
        if(ae.getSource()==btn_mul)
        {
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }
        if(ae.getSource()==btn_div)
        {
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
        }
        if(ae.getSource()==btn_eql)
        {
            b=Double.parseDouble(t.getText());
           switch (operator) {
            case 1: 
                result=a+b;
                break;
            case 2: 
                result=a-b;
                break;
            case 3: 
                result=a*b;
                break;
            case 4: 
                result=a/b;
                break;
            default:
                break;
           }
           t.setText(""+result);
        }
        if(ae.getSource()==btn_dec)
        {
            t.setText(t.getText().concat("."));
        }
        //  if(ae.getSource()==btn_del)
        // {
        //     String s=t.getText();
        //         t.setText("");
        //         for(int i=0;i<s.length()-1;i++)
        //             t.setText(t.getText()+s,charAt(i));
        // }
         if(ae.getSource()==btn_clr)
        {
            t.setText(t.getText().concat(""));
        } 
        
    }

    public static void main(String[] args) {
        
        new Calculator();
    }
}

