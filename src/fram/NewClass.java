
package fram;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.Border;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NewClass extends JFrame implements ActionListener {
    JButton btn= new JButton() ;
    JButton btEXIT= new JButton();
    JLabel l3,l4;
    JLabel l1 = new JLabel();
   public NewClass(){  
       setLayout(new FlowLayout(20, 30,30));
       setTitle("Team Names");   
       l1.setText("♦This Program is Written By♦");
       l1.setForeground(Color.darkGray);
       add(l1);
       l1.setFont(new Font("bold",Font.BOLD,14) ); 
       add(l1);
       add(new JLabel("1- Mahmoud Osama Mahmoud Bdran"));
       add(new JLabel("2- Mohamed Mohamed Mabrouk Baraka"));
       add(new JLabel("3- Mohamed Hesham Abdelsame3 Dawood"));
       add(new JLabel("4- Mahmoud Mohamed Ebrahim khalil"));
       add(new JLabel("5- Nada Mahmoud AbdelHafez Khalil "));
       setResizable(false);
       setVisible(true);
       setSize(330,400);
       this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.setText("Start Using Calculator..");
       add(btn); 
       btn.addActionListener(this);
     
       btEXIT.setText("EXIT");
       btEXIT.setForeground(Color.red);
       btEXIT.setFont(new Font("bold", Font.BOLD, 13));
       add(btEXIT);
       btEXIT.addActionListener(this);   
   }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if(o.equals(btEXIT)){
            JOptionPane.showMessageDialog(null, "GOOD BYE!!");
            System.exit(0);
        }else if(o.equals(btn)){
            setVisible(false);
               new Frame();       
        }
    }   
}