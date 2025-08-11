package system;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;

public class Result {

    JFrame frame;
    int score;

     Result(int score) {

        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(0, 128, 255));
        frame.setBounds(100, 100, 1345, 641);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        this.score = score;

        JLabel lblNewLabel = new JLabel("RESULT ");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 50));
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setBounds(213, 64, 442, 375);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Your Correct Answer is = " + score);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
        lblNewLabel_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_1.setBounds(205, 150, 593, 375);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel label1 = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("/resultimg2.jpg")).getImage();
        label1.setIcon(new ImageIcon(img));
        label1.setBounds(0, 0, 1352, 641);
        frame.getContentPane().add(label1);
            
        frame.setLocation( 100, 40);
        frame.setVisible(true);


    }
    public static void main(String[] args) {
        new Result(0);
    }

}