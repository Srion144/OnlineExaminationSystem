package system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuestionPaper extends JFrame implements ActionListener{

    JFrame frame;
	JLabel l ;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;  
	ButtonGroup bg;  
	
	int count=0,current=0,x=1,y=1,now=0;  
	int m[]=new int[10];
	
	 public QuestionPaper() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 1347, 763);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		l = new JLabel();
		l.setFont(new Font("Tahoma", Font.BOLD, 18));
		l.setBounds(92, 65, 1068, 45);
		frame.getContentPane().add(l);
		
		bg=new ButtonGroup();  
        for(int i=0;i<5;i++) 
        {  
            jb[i]=new JRadioButton(); 
            frame.getContentPane().add(jb[i]);
            bg.add(jb[i]);  
        }

		
		jb[0].setFont(new Font("Tahoma", Font.BOLD, 18));
		jb[0].setBounds(237, 205, 244, 38);
		
		
		jb[1].setFont(new Font("Tahoma", Font.BOLD, 18));
		jb[1].setBounds(237, 270, 244, 38);
		
		
		jb[2].setFont(new Font("Tahoma", Font.BOLD, 18));
		jb[2].setBounds(237, 335, 244, 38);
		
		
		jb[3].setFont(new Font("Tahoma", Font.BOLD, 18));
		jb[3].setBounds(237, 400, 244, 38);
	
		
		b1 = new JButton("NEXT");
		b1.setBackground(new Color(0, 255, 128));
		b1.setFont(new Font("Tahoma", Font.BOLD, 20));
		b1.setBounds(192, 547, 216, 45);
		b1.addActionListener(this);
		frame.getContentPane().add(b1);
		
		b2 = new JButton("MARKED");
		b2.setBackground(new Color(128, 128, 255));
		b2.setFont(new Font("Tahoma", Font.BOLD, 20));
		b2.setBounds(667, 547, 216, 45);
		b2.addActionListener(this);
		frame.getContentPane().add(b2);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/quesImg.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		//label1.setBounds(100, 100, 1347, 763);
		lblNewLabel.setBounds(0, 0, 1323, 716);
		frame.getContentPane().add(lblNewLabel);
		
		
		set();
		
		
		
		frame.setVisible(true);
		
		
    }

		
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
				count=count+1;
			current++;
			set();
			if(current==9)
			{
				b1.setEnabled(false);
				b2.setText("Submit");
			}
		}
		if(e.getActionCommand().equals("MARKED"))
		{
			JButton bK = new JButton("MARKED"+x);
			bK.setFont(new Font("Tahoma", Font.BOLD, 20));
			bK.setBackground(new Color(255, 179, 179));
			bK.setBounds(1047, 116+45*x , 216, 45);
			frame.getContentPane().add(bK);
			bK.addActionListener(this);
			
			m[x]=current;
			x++;
			current++;
			set();
			if(current==9)
				b2.setText("Submit");
			setVisible(false);
			setVisible(true);
           
			
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
			if(e.getActionCommand().equals("MARKED"+y))
			{
				if(check())
					count=count+1;
				now=current;
				current=m[y];
				
				set();
				((JButton)e.getSource()).setEnabled(false);
				
				current=now;
			}
		}
		
		if(e.getActionCommand().equals("Submit"))
		{
			if(check())
				count=count+1;
			current++;
			int score = count;
			
			setVisible(false);
            new Result(score);
			
			
			
			
			
		}
		
	}
	void set()
	{
		jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Ques1: Who invented java Programming?");
			jb[0].setText("Guido van Rossum");jb[1].setText("James Gosling");jb[2].setText("Dennis Ritchie");jb[3].setText("Bjarne Stroustrup");
			
		}
		if(current==1)  
        {  
            l.setText("Que2: Which statement is true about java?");  
            jb[0].setText("Code Dependent");jb[1].setText("Platform-Dependent");jb[2].setText("Platform-Independent");jb[3].setText("Sequence-Dependent");  
        }  
        if(current==2)  
        {  
            l.setText("Que3: Which component is used to compile, debug and execute the java programs?");  
            jb[0].setText("JVM");jb[1].setText("JRE");jb[2].setText("JIT");jb[3].setText("JDK");  
        }  
        if(current==3)  
        {  
            l.setText("Que4:Which one of the following is not a java feature?");  
            jb[0].setText("Use of pointers");jb[1].setText("Object-Oriented");jb[2].setText("Portable");jb[3].setText("Dynamic & Extensible");  
        }  
        if(current==4)  
        {  
            l.setText("Que5: Which of these cannot be used for a variable name in java?");  
            jb[0].setText("identifier & keyword");jb[1].setText("identifier");jb[2].setText("keyword");jb[3].setText("none");  
        }  
        if(current==5)  
        {  
            l.setText("Que6: What is the extension of java code files?");  
            jb[0].setText(".js");jb[1].setText(".txt");jb[2].setText(".java");jb[3].setText(".class");  
        }  
        if(current==6)  
        {  
            l.setText("Que7:Which one among these is not a class? ");  
            jb[0].setText("Swing");jb[1].setText("Actionperformed");jb[2].setText("ActionEvent");jb[3].setText("Button");

        }  
        if(current==7)  
        {  
            l.setText("Que8: which one of the sfollowing is not an acces modifier?");  
            jb[0].setText("Protected");jb[1].setText("Public");jb[2].setText("Private");  
                        jb[3].setText("Void");         
        }  
        if(current==8)  
        {  
            l.setText("Que9: Which of these are selection statements in Java?");  
            jb[0].setText("for()");jb[1].setText("if()");jb[2].setText("break");jb[3].setText("continue");  
        }  
        if(current==9)  
        {  
            l.setText("Que10: Which one among these is not a valid component?");  
            jb[0].setText("JButton");jb[1].setText("JList");jb[2].setText("JButtonGroup");jb[3].setText("JTextArea");
        } 
        l.setBounds(92, 65, 1068, 45);
        for(int i=0,j=0;i<=195;i+=65,j++)  
            jb[j].setBounds(237,205+i,244,38);
	}
	boolean check()  
    {  
        if(current==0)  
            return(jb[1].isSelected());  
        if(current==1)  
            return(jb[2].isSelected());  
        if(current==2)  
            return(jb[3].isSelected());  
        if(current==3)  
            return(jb[0].isSelected());  
        if(current==4)  
            return(jb[2].isSelected());  
        if(current==5)  
            return(jb[2].isSelected());  
        if(current==6)  
            return(jb[1].isSelected());  
        if(current==7)  
            return(jb[3].isSelected());  
        if(current==8)  
            return(jb[1].isSelected());  
        if(current==9)  
            return(jb[2].isSelected());  
        return false;  
    }  

	
	
	public static void main(String args[]) {
		new QuestionPaper();
		}
}
