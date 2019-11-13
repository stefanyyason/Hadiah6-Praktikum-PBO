/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor1;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import java.awt.event.*;

public abstract class nomor1 implements ActionListener{

    /**
     * @param args the command line arguments
     */
     private static void createAndShowGUI() {
         
        // TODO code application logic here
    JFrame frame = new JFrame ("Tugas Praktikum 1"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(20,30,300,100);
    frame.getContentPane().setLayout(null);
    
        //make a button
        JButton butt=new JButton("Click me");
        frame.getContentPane().add(butt);
        butt.setBounds(20, 20, 200,20);
    
    nomor1 app = new nomor1() {};
    app.label = new JLabel ("3 Clicks");
    app.label.setBounds(20, 40, 200,20);
    frame.getContentPane().add(app.label);
    
    butt.addActionListener(app);
    frame.setVisible(true); 
    }
    
    public void actionPerformed(ActionEvent e)
    {
        clickCount--;
        label.setText("Click ="+clickCount);
    }
    
    public static void main (String[] args){
        SwingUtilities.invokeLater(new Runnable () {
 
            public void run () {
            createAndShowGUI();
    }
    
    });
    }
      int clickCount=3;
    JLabel label;
}

