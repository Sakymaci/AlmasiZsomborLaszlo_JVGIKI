/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task5;

import java.awt.AWTEventMulticaster;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Saky
 */


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Szamologep");
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pl1 = new JPanel();
        JPanel pl2 = new JPanel(new GridLayout(1,4));
        JPanel pl3 = new JPanel(new GridLayout(4,6));
        JTextField tf = new JTextField(40);
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        pl1.add(tf);
        frame.add(pl1, c);
        JButton bt1 = new JButton();
        JButton bt2 = new JButton("Backspace");
        JButton bt3 = new JButton("CE");
        JButton bt4 = new JButton("C");
        pl2.add(bt1);
        pl2.add(bt2);
        pl2.add(bt3);
        pl2.add(bt4);
        c.gridy = 1;
        frame.add(pl2, c);
        JButton bt5 = new JButton("MC");
        JButton bt6 = new JButton("7");
        bt6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tf.setText(tf.getText() + "7");
            }
        });
        JButton bt7 = new JButton("8");
        bt7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "8");
            }
        });
        JButton bt8 = new JButton("9");
        bt8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "9");
            }
        });
        JButton bt9 = new JButton("/");
        JButton bt10 = new JButton("sqrt");
        JButton bt11 = new JButton("MR");
        JButton bt12 = new JButton("4");
        bt12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "4");
            }
        });
        JButton bt13 = new JButton("5");
        bt13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "5");
            }
        });
        JButton bt14 = new JButton("6");
        bt14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "6");
            }
        });
        JButton bt15 = new JButton("/");
        JButton bt16 = new JButton("%");
        JButton bt17 = new JButton("MS");
        JButton bt18 = new JButton("1");
        bt18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "1");
            }
        });
        JButton bt19 = new JButton("2");
        bt19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "2");
            }
        });
        JButton bt20 = new JButton("3");
        bt20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "3");
            }
        });
        JButton bt21 = new JButton("-");
        JButton bt22 = new JButton("1/x");
        JButton bt23 = new JButton("M+");
        JButton bt24 = new JButton("0");
        JButton bt25 = new JButton("+/-");
        JButton bt26 = new JButton(".");
        JButton bt27 = new JButton("+");
        bt27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tf.setText(tf.getText() + "+");
            }
        });
        JButton bt28 = new JButton("=");
        bt28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String str = tf.getText();
                String[] tmp = str.split("\\+");
                int ret = 0;
                for (String string : tmp) {
                    ret += Integer.parseInt(string);
                }
                tf.setText(String.valueOf(ret));
            }
        });
        pl3.add(bt5);
        pl3.add(bt6);
        pl3.add(bt7);
        pl3.add(bt8);
        pl3.add(bt9);
        pl3.add(bt10);
        pl3.add(bt11);
        pl3.add(bt12);
        pl3.add(bt13);
        pl3.add(bt14);
        pl3.add(bt15);
        pl3.add(bt16);
        pl3.add(bt17);
        pl3.add(bt18);
        pl3.add(bt19);
        pl3.add(bt20);
        pl3.add(bt21);
        pl3.add(bt22);
        pl3.add(bt23);
        pl3.add(bt24);
        pl3.add(bt25);
        pl3.add(bt26);
        pl3.add(bt27);
        pl3.add(bt28);
        c.gridy = 2;
        frame.add(pl3, c);
        frame.setVisible(true);
        frame.pack();
    }
}
