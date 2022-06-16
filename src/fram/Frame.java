 /*
    this Code is written by
    1- محمود اسامه محمود بدران
    2- محمد محمد مبروك بركة
    3- محمد هشام عبدالسميع داود
    4- محمود محمد 
    5- ندا خليل
    */
package fram;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Frame extends JFrame implements ActionListener {
JButton bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,
        btsin,btcos,bttan,btmult,btadd,btdiv,btmod,
        btsqrt,btpow,btclean,btsub,btexit,btDot,btRes;
JTextField text;
char operation;
double num1,num2,res;
    public Frame() {
        setTitle("Calculator"); 
        setSize(330, 400); 
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); 
        setLayout(new FlowLayout(20, 20, 22));
       
        text = new JTextField("", 27);
        add(text);
     
        text.setBackground(Color.WHITE); 

        
        btsin = new JButton(" Sin ");
       
        btsin.addActionListener(this); 
        add(btsin);
        btcos = new JButton(" Cos ");
        btcos.addActionListener(this);
        add(btcos);
        bttan = new JButton(" Tan ");
        bttan.addActionListener(this);
        add(bttan);
         btclean = new JButton("  C  ");
        btclean.addActionListener(this);
        add(btclean);
        btmod = new JButton("   %  ");
        btmod.addActionListener(this);
        add(btmod);
        btsqrt = new JButton("  √   ");
        btsqrt.addActionListener(this);
        add(btsqrt);
        btpow = new JButton("   ^   ");
        btpow.addActionListener(this);
        add(btpow);
        btadd = new JButton("  +   ");
        btadd.addActionListener(this);
        add(btadd);
        bt7 = new JButton("   7   ");
        bt7.addActionListener(this);
        add(bt7);
        bt8 = new JButton("   8   ");
        bt8.addActionListener(this);
        add(bt8);
        bt9 = new JButton("   9    ");
        bt9.addActionListener(this);
        add(bt9);
        btdiv = new JButton("   /   ");
        btdiv.addActionListener(this);
        add(btdiv);
        bt4 = new JButton("  4    ");
        bt4.addActionListener(this);
        add(bt4);
        bt5 = new JButton("  5    ");
        bt5.addActionListener(this);
        add(bt5);
        bt6 = new JButton("   6    ");
        bt6.addActionListener(this);
        add(bt6);
        btmult = new JButton("   *   ");
        btmult.addActionListener(this);
        add(btmult);
        bt1 = new JButton("   1   ");
        bt1.addActionListener(this);
        add(bt1);
        bt2 = new JButton("   2   ");
        bt2.addActionListener(this);
        add(bt2);
        bt3 = new JButton("   3    ");
        bt3.addActionListener(this);
        add(bt3);
        btsub = new JButton("   -   ");
        btsub.addActionListener(this);
        add(btsub);
        btexit = new JButton("EXIT");
        btexit.setForeground(Color.red); 
        btexit.setFont(new Font(null,Font.BOLD,14) ); 
        btexit.addActionListener(this);
        add(btexit);
        bt0 = new JButton("   0   ");
        bt0.addActionListener(this);
        add(bt0);
        btDot = new JButton("    .    ");
        btDot.addActionListener(this);
        add(btDot);
        btRes = new JButton("   = ");
        btRes.addActionListener(this);
        

        add(btRes);
    }
    private void SetOperation(char operation) 
            {
                num1=Double.parseDouble(text.getText());
                text.setText("");
                this.operation=operation;
            }
    @Override
   public void actionPerformed(ActionEvent ae) { 
        Object ob=ae.getSource();
        if(ob.equals(bt0))
        {
            String All=text.getText()+"0";
            text.setText(All); 
        }else if(ob.equals(bt1)) 
        {
            String All=text.getText()+"1";
            text.setText(All);
        }else if(ob.equals(bt2))
        {
            String All=text.getText()+"2";
            text.setText(All);
        }else if(ob.equals(bt3))
        {
            String All=text.getText()+"3";
            text.setText(All);
        }else if(ob.equals(bt4))
        {
            String All=text.getText()+"4";
            text.setText(All);
        }else if(ob.equals(bt5))
        {
            String All=text.getText()+"5";
            text.setText(All);
        }else if(ob.equals(bt6))
        {
            String All=text.getText()+"6";
            text.setText(All);
        }else if(ob.equals(bt7))
        {
            String All=text.getText()+"7";
            text.setText(All);
        }else if(ob.equals(bt8))
        {
            String All=text.getText()+"8";
            text.setText(All);
        }else if(ob.equals(bt9))
        {
            String All=text.getText()+"9";
            text.setText(All);
        }else if(ob.equals(btDot))
        {
            String All=text.getText()+".";
            text.setText(All);
        }else if(ob.equals(btmod)) 
        {
            SetOperation('%');
        }else if(ob.equals(btsub))
        {
            SetOperation('-');
        }else if(ob.equals(btmult))
        {
            SetOperation('*');
        }else if(ob.equals(btpow)){
            SetOperation('^');

        }else if(ob.equals(btdiv))
        {
            SetOperation('/');
        }else if(ob.equals(btadd))
        {
            SetOperation('+');
        }else if(ob.equals(btRes))
        {
            num2=Double.parseDouble(text.getText());
            switch(operation) 
            {
                case '+': 
                    res=num1+num2; 
                    break; 
                    case '-':
                    res=num1-num2;
                    break;
                    case '^' :
                     res=Math.pow(num1, num2);
                    break;
                    case '*':
                    res=num1*num2;
                    break;
                    case '/':
                    res=num1/num2;
                    break;
                    case '%':
                    res=num1%num2;
                    break;
            }
            text.setText(String.valueOf(res)); 
        }else if(ob.equals(btsin))
        {
            num1=Double.parseDouble(text.getText()); 
            res=Math.sin(Math.toRadians(num1)); 
            text.setText(String.valueOf(res));
        }else if(ob.equals(btcos))
        {
            num1=Double.parseDouble(text.getText());
            res=Math.cos(Math.toRadians(num1));
            text.setText(String.valueOf(res));
        }else if(ob.equals(bttan))
        {
            num1=Double.parseDouble(text.getText());
            res=Math.tan(Math.toRadians(num1));
            text.setText(String.valueOf(res));
        }else if(ob.equals(btpow))
        {
            num1=Double.parseDouble(text.getText());
            text.setText("");
            num2=Double.parseDouble(text.getText());
            res=Math.pow(num1, num2);
            text.setText(String.valueOf(res));
        }else if(ob.equals(btexit)) 
        {
          
            JOptionPane.showMessageDialog(null,"Thanks for using our program..\n               GOOD BYE!!");
            System.exit(0); 
        }else if(ob.equals(btsqrt)) 
        {
          num1=Double.parseDouble(text.getText());
          res=Math.sqrt(num1);
          text.setText(String.valueOf(res));
        }else if(ob.equals(btclean))
        {
            text.setText("");
        }
    }
    public static void main(String[] args) {
       NewClass s = new NewClass();
        
       // Frame fr = new Frame();
    }


}