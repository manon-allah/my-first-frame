package javaapplication15;

import java.awt.Color;
import javax.swing. * ;

public class try1 extends JFrame {
    JTextField t1 =new JTextField ();
    JPasswordField p2 =new JPasswordField ();
    JLabel l1 = new JLabel ("  Full_name  ");
    JLabel l2 = new JLabel ("  Password  ");
    JLabel l3 = new JLabel ("  Gendre :  ");
    JLabel l4 = new JLabel ("  Status : ");
    JLabel l5 = new JLabel ("  place : ");
    JButton b1 = new JButton ("  save  ");
    JButton b2 = new JButton ("  show  ");
    JButton b11 = new JButton ("  1  ");
    JButton b12 = new JButton ("  2  ");
    JButton b13 = new JButton ("  3  ");
    JButton b14 = new JButton ("  4  ");
    JButton b15 = new JButton ("  5  ");
    JButton b16 = new JButton ("  6  ");
    JButton b17 = new JButton ("  7  ");
    JButton b18 = new JButton ("  8  ");
    JButton b19 = new JButton ("   9   ");
    JButton b20 = new JButton ("  10  ");
    JButton b21 = new JButton ("  11  ");
    JButton b22 = new JButton ("  12  ");
    JRadioButton r1 = new JRadioButton ("  Male  ");
    JRadioButton r2 = new JRadioButton ("  Femal  ");
    JRadioButton r3 = new JRadioButton ("  Single  ");
    JRadioButton r4 = new JRadioButton ("  Married  ");
    JCheckBox c1 = new JCheckBox ("  Egypt  ");
    JCheckBox c2 = new JCheckBox ("  Caire  ");
    JCheckBox c3 = new JCheckBox ("  Tanta  ");
    JCheckBox c4 = new JCheckBox ("  Alex  ");
    ButtonGroup g1 = new ButtonGroup();
    ButtonGroup g2 = new ButtonGroup();
    JMenu m1 = new JMenu("  File  ");
    JMenu m2 = new JMenu("  Edit ");
    JMenu m3 = new JMenu("  Help  ");
    JMenuBar mb = new JMenuBar();
    public try1 (){   
        this.setTitle(" form ") ;
        this.setVisible(true);
        this.setSize(500, 700);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(100, 100);
        this.setLayout(null);
        l1.setBounds(50, 70,200, 80);
        l2.setBounds(50,110 , 200, 80);
        this.add(l1) ;
        this.add(l2) ;
        b1.setBounds(80, 190, 150, 30);
        b2.setBounds(250,190 , 150, 30);
        this.add(b1) ;
        this.add(b2) ;
        t1.setBounds(200, 100, 200, 25);
        p2.setBounds(200, 140, 200, 25);
        this.add(t1) ;
        this.add(p2) ;
        l3.setBounds(50, 250, 200, 80);
        l4.setBounds(50, 300, 200, 80);
        this.add(l3) ;
        this.add(l4) ;
        r1.setBounds(180, 270, 100, 50);
        r2.setBounds(320, 270, 100, 50);
        g1.add(r1);
        g1.add(r2);
        this.add(r1) ;
        this.add(r2) ;    
        r3.setBounds(180, 320, 100, 50);
        r4.setBounds(320, 320, 100, 50);
        g2.add(r3);
        g2.add(r4);
        this.add(r3) ;
        this.add(r4) ;
        l5.setBounds(10, 400, 90, 80);
        this.add(l5);
        c1.setBounds(100, 425, 80, 30);
        this.add(c1);
        c2.setBounds(190, 425, 80, 30);
        this.add(c2);
        c3.setBounds(280, 425, 80, 30);
        this.add(c3);
        c4.setBounds(370, 425, 80, 30);
        this.add(c4);
        b11.setBackground(Color.BLACK);
        b11.setForeground(Color.WHITE);
        b12.setBackground(Color.BLACK);
        b12.setForeground(Color.WHITE);
        b13.setBackground(Color.BLACK);
        b13.setForeground(Color.WHITE);
        b14.setBackground(Color.BLACK);
        b14.setForeground(Color.WHITE);
        b15.setBackground(Color.BLACK);
        b15.setForeground(Color.WHITE);
        b16.setBackground(Color.BLACK);
        b16.setForeground(Color.WHITE);
        b17.setBackground(Color.BLACK);
        b17.setForeground(Color.WHITE);
        b18.setBackground(Color.BLACK);
        b18.setForeground(Color.WHITE);
        b19.setBackground(Color.BLACK);
        b19.setForeground(Color.WHITE);
        b20.setBackground(Color.BLACK);
        b20.setForeground(Color.WHITE);
        b21.setBackground(Color.BLACK);
        b21.setForeground(Color.WHITE);
        b22.setBackground(Color.BLACK);
        b22.setForeground(Color.WHITE);
        m1.add(b11);
        m1.add(b12);
        m1.add(b13);
        m1.add(b14);
        m2.add(b15);
        m2.add(b16);
        m2.add(b17);
        m2.add(b18);
        m3.add(b19);
        m3.add(b20);
        m3.add(b21);
        m3.add(b22);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.setBounds(0, 0, 500, 30);
        this.add(mb);
    }  
}
