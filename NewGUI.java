package com_file.OO;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewGUI extends FileProcessor implements ActionListener
{	
	//attributes for the code
	JLabel label1;
	JButton button1, button2, button3, button4, button5, button6;
	JPanel panel1, panel2, panel3, panel4, panel5, panel6;
	JTextField topwords, stopwords;
	JFileChooser file = new JFileChooser();
	JFileChooser file2 = new JFileChooser();
	
	private int n;
	private String temp;
	static int counter = 0;
	static int input =1; 
	static int startbutton =1;
	
	
	
	public NewGUI(String Title)
	{
		JLabel label1 = new JLabel();
		JFrame f1 = new JFrame("Text Opener and Word Counts");
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setLayout(new FlowLayout());
		f1.setBackground(Color.black);
		//adding the panels within the frame
		panel1 = new JPanel();
		f1.add(panel1);
		
		panel2 = new JPanel();
		f1.add(panel2);
		
		panel3 = new JPanel();
		f1.add(panel3);
		
		panel4 = new JPanel();
		f1.add(panel4);
		
		panel5 = new JPanel();
		f1.add(panel5);
		
		panel6 = new JPanel();
		f1.add(panel6);
		
		label1 = new JLabel();
		f1.add(label1);
		label1.setBackground(Color.blue);
		
		//creating and adding the buttons 
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();
		button6 = new JButton();
		
		//	Setting thr backgroung color for every button 
		button1.setBackground(Color.CYAN);
		button2.setBackground(Color.GREEN);
		button3.setBackground(Color.MAGENTA);
		button4.setBackground(Color.ORANGE);
		button5.setBackground(Color.RED);
		button6.setBackground(Color.yellow);
		
		
		//adding the buttons and information 
		panel2.add(button1);
		button1.setText(" First File");
		button1.setToolTipText("Please select a file");
		button1.addActionListener(this);
		panel2.setBackground(Color.BLACK);
		
		panel2.add(button2);
		button2.setText("Second File");
		button2.setToolTipText("Please eneter the second file");
		button2.addActionListener(this);
		
		topwords = new JTextField("Please enter the amount of top words desired");
		panel3.add(topwords);
		panel3.setBackground(Color.BLUE);//set the color for the panel
		
		panel3.add(button3);
		button3.setText("Top words");
		button3.setToolTipText("Stop Enter");
		button3.addActionListener(this);
		
		
		stopwords = new JTextField("Please enter a Stop Word");
		panel4.add(stopwords);
		panel4.setBackground(Color.GRAY);//set the color for the panel
		
		

		
		panel5.add(button4);
		button4.setText("Start");
		button4.setToolTipText("Save and run");
		button4.addActionListener(this);
		panel5.setBackground(Color.ORANGE);//set the color for the panel
		
		panel3.add(button5);
		button5.setText("Stop Word Enter");
		button5.setToolTipText("Amount of Top Words");
		button5.addActionListener(this);
		
		
		panel6.add(button6);
		button6.setText(" Show the top words");
		button6.setToolTipText("Select and see the top words and the number of repetition");
		button6.addActionListener(this);
		panel6.setBackground(Color.YELLOW);//set the color for the panel
		
		
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button1)
		{ 
			if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
			{
				java.io.File f2 = file.getSelectedFile();
				System.out.println(f2.getPath());//will print out the file location
				
			
			}//END NESTED IF
		}//END IF
		
		else if(e.getSource() == button2)
		{
			
			if (file2.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
			{
				java.io.File f1 = file2.getSelectedFile();
				System.out.println(f1);//will print out the file location
			}//end nested if
		}//end else if
	
		else if(e.getSource() == button3)
		{
			StopWords_2.add(stopwords.getText());
			
		}//end else if
		
		else if(e.getSource()==button4)
		{
			java.io.File f1 = file.getSelectedFile();
			java.io.File f2 = file2.getSelectedFile();
			
			FileProcessor fc1 = new FileProcessor();
			FileProcessor fc2 = new FileProcessor();
			
			fc1.readwords(f2.getPath(), n);
			fc2.readwords(f1.getPath(), n);
			
			//System.out.println(f2);
			//System.out.print(f1);
			
			
			if(input == 0)
			{
				if(num == 1 )
				{
					similarity = wordcounter*100/tempAllWords.size();
					if(counter != 0)
					{
						similarity = similarity-100;
						
					}//end if
					
					if(similarity > 45)
					{
						JOptionPane.showMessageDialog(button4,similarity+"chance of being the same topic");
					}
					
					else
					{
						JOptionPane.showMessageDialog(button4,similarity+"chance of being different topic");
					}//end else
					
					similarity = 0;
					wordcounter = 0;
				}// end of nested if 
				
				startbutton = 0;
			}// end of if 
			
			else
			{
				JOptionPane.showMessageDialog(button4,"Please enter a valid number!");
			}//end else
			
			
			if(counter == 0)
			{
				num = 0;
				wordcounter = 0;
				similarity = 0;
				
			}//end if
			
			counter++;
			
			
			
		}//end else if
		
		else if (e.getSource() == button5)
		{
			if(topwords.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(button5,"Please enter a number");
				
			}
			
			else 
			{
				temp = topwords.getText();
				n = Integer.parseInt(temp);
				input = 0;
			}
		}
		
		else if(e.getSource() == button6)
		{
			java.io.File f1 = file.getSelectedFile();
			java.io.File f2 = file2.getSelectedFile();
			
			FileProcessor file1 = new FileProcessor();
			FileProcessor file2 = new FileProcessor();
			
			file1.readwords(f1.getPath(), n);
			file2.readwords(f2.getPath(), n);
			
		//	System.out.println(f2);
		//	System.out.print(f1);
			
		
			
			if(startbutton == 0)
			{
				file1.hashmap(n);
				file2.hashmap(n);
				
			}//end if
			
			else
			{
				JOptionPane.showMessageDialog(button4, "Please follow all instructions and input the righ data");
			}
			
			similarity = 0;
			wordcounter = 0;
		
		}
		
		
	}//END ACTION PERFORMED
}//END CLASS
