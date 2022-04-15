package com_file.OO;

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
		JFrame f1 = new JFrame("Text Opener and Word Counts");
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setLayout(new FlowLayout());
		
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
		
		
		
		//creating and adding the buttons 
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();
		button6 = new JButton();
		
		//adding the buttons and information 
		panel2.add(button1);
		button1.setText(" First File");
		button1.setToolTipText("Please select a file");
		button1.addActionListener(this);
		
		panel2.add(button2);
		button2.setText("Second File");
		button2.setToolTipText("Please eneter the second file");
		button2.addActionListener(this);
		
		topwords = new JTextField("Please enter the amount of top words desired");
		panel3.add(topwords);
		
		stopwords = new JTextField("Please add a Stop Word");
		panel4.add(stopwords);
		
		
		panel3.add(button3);
		button3.setText("Stop word");
		button3.setToolTipText("enter a stop word");
		button3.addActionListener(this);
		
		panel5.add(button4);
		button4.setText("Start");
		button4.setToolTipText("Save and run");
		button4.addActionListener(this);
		
		
		panel3.add(button5);
		button5.setText("Please enter a word");
		button5.setToolTipText("Amount of Top Words");
		button5.addActionListener(this);
		
		
		panel6.add(button6);
		button6.setText("click to show the top words");
		button6.setToolTipText("Select and see the top words and the number of repetition");
		button6.addActionListener(this);
		
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button1)
		{
			JFileChooser chooseFile = new JFileChooser();
			int open = chooseFile.showOpenDialog(null); //select the file to open and variable to record if file was opened or cancelled action 
			
			if (open == JFileChooser.APPROVE_OPTION)
			{
				File file = new File(chooseFile.getSelectedFile().getAbsolutePath());
				System.out.println(file);//will print out the file location
				
			
			}//END NESTED IF
		}//END IF
		
		else if(e.getSource() == button2)
		{
			JFileChooser chooseFile = new JFileChooser();
			int open = chooseFile.showOpenDialog(null); //select the file to open and variable to record if file was opened or cancelled action 
			
			if (open == JFileChooser.APPROVE_OPTION)
			{
				File file2 = new File(chooseFile.getSelectedFile().getAbsolutePath());
				System.out.println(file2);//will print out the file location
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
			System.out.print(f1);
			
			
			if(input == 0)
			{
				if(num == 1 )
				{
					similarity = correctcounter*100/tempWordlist.size();
					if(counter != 0)
					{
						similarity = similarity-100;
						
					}//end if
					
					if(similarity > 50)
					{
						JOptionPane.showMessageDialog(button4,similarity+"chance of being the same topic");
					}
					
					else
					{
						JOptionPane.showMessageDialog(button4,similarity+"chance of being different topic");
					}//end else
					
					similarity = 0;
					correctcounter = 0;
				}// end of nested if 
				
				startbutton = 0;
			}// end of if 
			
			else
			{
				JOptionPane.showMessageDialog(button4,"Please enter a valid number");
			}//end else
			
			
			if(counter == 0)
			{
				num = 0;
				correctcounter = 0;
				similarity = 0;
				
			}//end if
			
			counter++;
			
			
			
		}//end else if
		
		else if (e.getSource() == button5)
		{
			if(topwords.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(button5,"Please eneter a number");
				
			}
			
			else 
			{
				temp = topwords.getText();
				n = Integer.parseInt(temp);
			}
		}
		
		else if(e.getSource() == button6)
		{
			java.io.File f1 = file.getSelectedFile();
			java.io.File f2 = file2.getSelectedFile();
			
			FileProcessor file1 = new FileProcessor();
			FileProcessor file2 = new FileProcessor();
			
			file2.readwords(f2.getPath(), n);
			file2.readwords(f1.getPath(), n);
			
			System.out.println(f2);
			System.out.print(f1);
			
		
			
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
			correctcounter = 0;
		
		}
		
		
		else 
		{
			System.out.print("Succesfully terminated");
		}
		
	}//END ACTION PERFORMED
}//END CLASS
