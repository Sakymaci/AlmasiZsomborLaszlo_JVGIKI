/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task4;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import jdk.jfr.Percentage;

/**
 *
 * @author Saky
 */
public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("IdoAtalakito");
        frame.setLayout(new GridLayout(4, 1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel(new GridBagLayout());
        JPanel panel2 = new JPanel(new GridBagLayout());
        JPanel panel3 = new JPanel(new GridBagLayout());
        JLabel jl1 = new JLabel(" nap ");
        JLabel jl2 = new JLabel(" ora ");
        JLabel jl3 = new JLabel(" perc ");
        JLabel jl4 = new JLabel(" masodperc ");
        JLabel jl5 = new JLabel(" nap ");
        JLabel jl6 = new JLabel(" ora ");
        JLabel jl7 = new JLabel(" perc ");
        JLabel jl8 = new JLabel(" masodperc ");
        JLabel jl9 = new JLabel(" nap ");
        JLabel jl10 = new JLabel(" ora ");
        JLabel jl11 = new JLabel(" perc ");
        JLabel jl12 = new JLabel(" masodperc ");
        JTextField tf1 = new JTextField(4);
        JTextField tf2 = new JTextField(4);
        JTextField tf3 = new JTextField(4);
        JTextField tf4 = new JTextField(4);
        JTextField tf5 = new JTextField(4);
        JTextField tf6 = new JTextField(4);
        JTextField tf7 = new JTextField(4);
        JTextField tf8 = new JTextField(4);
        JTextField tf9 = new JTextField(4);
        JTextField tf10 = new JTextField(4);
        JTextField tf11 = new JTextField(4);
        JTextField tf12 = new JTextField(4);
        JButton jb = new JButton("Szamol");
        panel1.add(tf1);
        panel1.add(jl1);
        panel1.add(tf2);
        panel1.add(jl2);
        panel1.add(tf3);
        panel1.add(jl3);
        panel1.add(tf4);
        panel1.add(jl4);
        frame.add(panel1);
        panel2.add(tf5);
        panel2.add(jl5);
        panel2.add(tf6);
        panel2.add(jl6);
        panel2.add(tf7);
        panel2.add(jl7);
        panel2.add(tf8);
        panel2.add(jl8);
        frame.add(panel2);
        panel3.add(tf9);
        panel3.add(jl9);
        panel3.add(tf10);
        panel3.add(jl10);
        panel3.add(tf11);
        panel3.add(jl11);
        panel3.add(tf12);
        panel3.add(jl12);
        frame.add(jb);
        frame.add(panel3);
        frame.pack();
        frame.setVisible(true);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int mptmp=0, ptmp=0, otmp=0, ntmp=0;
                ntmp += Integer.parseInt(tf1.getText());
                ntmp += Integer.parseInt(tf5.getText());
                otmp += Integer.parseInt(tf2.getText());
                otmp += Integer.parseInt(tf6.getText());
                ptmp += Integer.parseInt(tf3.getText());
                ptmp += Integer.parseInt(tf7.getText());
                mptmp += Integer.parseInt(tf4.getText());
                mptmp += Integer.parseInt(tf8.getText());
                
                while(mptmp>60){
                    ptmp++;
                    mptmp -= 60;
                }
                while(ptmp>60){
                    otmp++;
                    ptmp -= 60;
                }
                while(otmp>24){
                    ntmp++;
                    otmp -=24;
                }
                tf9.setText(String.valueOf(ntmp));
                tf10.setText(String.valueOf(otmp));
                tf11.setText(String.valueOf(ptmp));
                tf12.setText(String.valueOf(mptmp));
            }
        });
    }
    
}
