/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author User
 */

import javax.swing.*;
import java.awt.event.*;

public abstract class JavaApplication3 implements ActionListener {

    /**
     * @param args the command line arguments
     */
    private static void createAndShowGUI () {
        // TODO code application logic here
  JFrame frame = new JFrame("I am a JFrame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setBounds (20,30,300,100);
  frame.getContentPane ().setLayout(null);
  //make a button
  
  JButton butt=new JButton("Click me");
  frame.getContentPane().add(butt);
  butt.setBounds(20, 20, 300, 20);
  
  //instantiate an application object
  JavaApplication3 app = new JavaApplication3() {} ;
      // make label
  app.label = new JLabel ("nama tidak terdeteksi");
  app.label.setBounds(20,40,200,20);
  frame.getContentPane ().add(app.label);
  
  butt.addActionListener(app);
  frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        label.setText("nama saya Lidya Yunike");
    }
    
    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable (){
            public void run () {
               createAndShowGUI();
  
      }
  });
    }
    JLabel label;
}