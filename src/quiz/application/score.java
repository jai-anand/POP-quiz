package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class score extends JFrame implements ActionListener{
    score(String name,int score){
        
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.GRAY);     //to set frame backgrun color.  
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(350,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,300,250);
        add(image);       
        
        JLabel heading = new JLabel("Thank You " + name + " For playing Aspiring minds.");
        heading.setBounds(350, 40, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(heading);    
        
        JLabel lbl = new JLabel("Your Score is : " + score);
        lbl.setBounds(350, 200, 300, 30);
        lbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(lbl);  
        
        JButton exit = new JButton("Play Again");
        exit.setBounds(580,270,120,30);
        exit.setBackground(Color.BLUE);
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        
        setVisible(true);
    }
     
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
                    
    public static void main(String [] args){
         new score("User", 0);
    }
    
}
