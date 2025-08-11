package system;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inst extends JFrame implements ActionListener {
    
	JFrame frame;
	JTextField TopHeading;
	JButton start, back;

	 Inst() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1358, 776);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(182, 222, 186));
		desktopPane.setBounds(27, 29, 1293, 685);
		frame.getContentPane().add(desktopPane);
		
		TopHeading = new JTextField();
		TopHeading.setBackground(new Color(134, 194, 255));
		TopHeading.setHorizontalAlignment(SwingConstants.CENTER);
		TopHeading.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		TopHeading.setText("INSTRUCTION FOR ONLINE  EXAMINATION");
		TopHeading.setBounds(10, 10, 1273, 71);
		desktopPane.add(TopHeading);
		TopHeading.setColumns(10);
		
		JLabel heading = new JLabel("  Please read the instruction carefully before start the examination .");
		heading.setForeground(new Color(255, 0, 0));
		heading.setFont(new Font("Tahoma", Font.PLAIN, 20));
		heading.setBounds(10, 106, 910, 32);
		desktopPane.add(heading);
		
		JLabel rules = new JLabel("");
		rules.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rules.setBounds(94, 155, 927, 373);
		rules.setText(
	            "<html>"+ 
	                "1. There are 10 Questions and each question allotted 1(one) mark for correct response. " + "<br><br>" +
	                "2. Out of the four options given for each questions, only one option is the correct answer" + "<br><br>" +
	                "3. By clicking on the 'MARKED' button , you can marked the question for review later." + "<br><br>" +
	                "4. By clicking on the 'NEXT' button , the next question will appear on your screen. " + "<br><br>" +
	                "5. Attempting all the questions are complusory" + "<br><br>" +
	                "6. There is NO NEGATIVE MARKING ." + "<br><br>" +
	                "7. After reading all points of Instruction click on 'START' button." + "<br><br>" +
	                "8. GOOD LUCK!!!" + "<br><br>" +
	            "<html>"
	        );
		
		
		desktopPane.add(rules);
		
		back = new JButton("BACK");
		back.setForeground(new Color(255, 255, 255));
		back.setBackground(new Color(0, 0, 0));
		back.setFont(new Font("Tahoma", Font.PLAIN, 22));
		back.setBounds(193, 571, 216, 46);
		back.addActionListener(this);
		desktopPane.add(back);
		
		start = new JButton("START");
		start.setForeground(new Color(255, 255, 255));
		start.setBackground(new Color(0, 0, 0));
		start.setFont(new Font("Tahoma", Font.PLAIN, 22));
		start.setBounds(642, 571, 216, 46);
		start.addActionListener(this);
		desktopPane.add(start);
		
		
		frame.setLocation( 100, 40);			
		frame.setVisible(true);
				
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource() == start)
		 {
	            setVisible(false);
	            new QuestionPaper();
	      } 
		 
		 else 
		 {
	            setVisible(false);
	            new Login();
	       
		 }

	
		
	}

	public static void main(String[] args) {
		new Inst();
	}

}



