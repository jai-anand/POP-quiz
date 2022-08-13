package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
     JButton next,exit;        //globally declared line 7,8
     JTextField tfname;

//create constructor
    Login(){ 
        getContentPane().setBackground(Color.LIGHT_GRAY);   //Takes full frame and changes bg color
        setLayout(null);   //for our own layout
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Login.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);                       //to add component over frame
       
       JLabel heading = new JLabel(" POP Minds ");
        heading.setBounds(735,60,700,35);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 40));
        heading.setForeground(new Color(30,144, 254));
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(735,150,700,35);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 40));
        name.setForeground(Color.BLACK);
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        exit = new JButton("Exit");
        exit.setBounds(735,270,120,25);
        exit.setBackground(Color.GRAY);
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        
        next = new JButton("Next");
        next.setBounds(915,270,120,25);
        next.setBackground(Color.GRAY);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        setSize(1200,500); //length,width of frame
        setLocation(200,150);
       setVisible(true);  //for frame visibility  
        
     }
     public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == exit) {
            setVisible(false);
        }
    }
     
  
    public static void main(String [] args){
        new Login(); //created anonyms object
        
    }
    
}
