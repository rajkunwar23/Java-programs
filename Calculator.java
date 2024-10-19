package com.studyopedia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator extends JFrame {
	
	String value=" ";
	int num1,num2;
	float result;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 238, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					value="7";
				}
				else
				{
					value=textField.getText();
					value+="7";
				}
				textField.setText(value);
			}
		});
		btnNewButton.setBounds(10, 42, 57, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					value="8";
				}
				else
				{
					value=textField.getText();
					value+="8";
				}
				textField.setText(value);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1.setBounds(77, 42, 49, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					value="9";
				}
				else
				{
					value=textField.getText();
					value+="9";
				}
				textField.setText(value);
			}
		});
		btnNewButton_2.setBounds(136, 42, 49, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					value="4";
				}
				else
				{
					value=textField.getText();
					value+="4";
				}
				textField.setText(value);
			}
		});
		btnNewButton_3.setBounds(10, 82, 57, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					value="5";
				}
				else
				{
					value=textField.getText();
					value+="5";
				}
				textField.setText(value);
			}
		});
		btnNewButton_4.setBounds(77, 82, 49, 29);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					value="6";
				}
				else
				{
					value=textField.getText();
					value+="6";
				}
				textField.setText(value);
			}
		});
		btnNewButton_5.setBounds(136, 82, 49, 29);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					value="1";
				}
				else
				{
					value=textField.getText();
					value+="1";
				}
				textField.setText(value);
			}
		});
		btnNewButton_6.setBounds(10, 122, 57, 33);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					value="2";
				}
				else
				{
					value=textField.getText();
					value+="2";
				}
				textField.setText(value);
			}
		});
		btnNewButton_7.setBounds(77, 122, 49, 33);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					value="3";
				}
				else
				{
					value=textField.getText();
					value+="3";
				}
				textField.setText(value);
			}
		});
		btnNewButton_8.setBounds(136, 122, 49, 33);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					value="0";
				}
				else
				{
					value=textField.getText();
					value+="0";
				}
				textField.setText(value);
			}
		});
		btnNewButton_9.setBounds(10, 166, 57, 33);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("=");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=textField.getText();
				if(text.contains("+"))
				{
					String val[]=text.split("\\+");
					 num1=Integer.parseInt(val[0]);
						num2=Integer.parseInt(val[1]);
						result=num1+num2;
					textField.setText(String.valueOf(result));
				}
				else if(text.contains("-"))
				{
					String val[]=text.split("\\-");
				 num1=Integer.parseInt(val[0]);
				num2=Integer.parseInt(val[1]);
				result=num1-num2;
					textField.setText(String.valueOf(result));
				}
				else if(text.contains("*"))
				{
					String val[]=text.split("\\*");
				 num1=Integer.parseInt(val[0]);
				num2=Integer.parseInt(val[1]);
				result=num1*num2;
					textField.setText(String.valueOf(result));
				}
				else if(text.contains("/"))
				{
					String val[]=text.split("\\/");
				 num1=Integer.parseInt(val[0]);
				num2=Integer.parseInt(val[1]);
                result=num1/num2;
					textField.setText(String.valueOf(result));
				}
				else if(text.contains("%"))
				{
					String val[]=text.split("\\%");
				 num1=Integer.parseInt(val[0]);
				num2=Integer.parseInt(val[1]);
//					 sum=num1+num2;
					textField.setText(String.valueOf(Integer.parseInt(val[0])%Integer.parseInt(val[1])));
				}
					
				
			}
		});
		btnNewButton_10.setBounds(77, 166, 49, 33);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(textField.getText().isEmpty())
					{
						value="-";
					}
					else
					{
						value=textField.getText();
						value+="-";
					}
					textField.setText(value);
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_11.setBounds(136, 166, 49, 33);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("DEL");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_12.setBounds(191, 207, 57, 29);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("X");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(textField.getText().isEmpty())
				{
					value="*";
				}
				else
				{
					value=textField.getText();
					value+="*";
				}
				textField.setText(value);
			}
		});
		btnNewButton_13.setBounds(191, 82, 44, 29);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("+");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					value="+";
				}
				else
				{
					value=textField.getText();
					value+="+";
				}
				textField.setText(value);
			}
		});
		btnNewButton_14.setBounds(191, 122, 44, 33);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("/");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty())
				{
					value="/";
				}
				else
				{
					value=textField.getText();
					value+="/";
				}
				textField.setText(value);
			
			}
		});
		btnNewButton_15.setBounds(191, 166, 44, 33);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("AC");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
			}
		});
		btnNewButton_16.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_16.setBounds(191, 42, 49, 29);
		contentPane.add(btnNewButton_16);
	}
}