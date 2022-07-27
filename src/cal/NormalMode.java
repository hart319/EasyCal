package cal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class NormalMode {

	JFrame frame;
	private JTextField fNo;
	private JTextField sNo;
	public JLabel label1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NormalMode window = new NormalMode();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public NormalMode() {
		initialize();
	}
	
	
		
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 415, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("Insert Value 1");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 33, 150, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblInsertValue = new JLabel("Insert Value 2");
		lblInsertValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsertValue.setForeground(Color.RED);
		lblInsertValue.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblInsertValue.setBounds(10, 86, 150, 26);
		frame.getContentPane().add(lblInsertValue);
		
		fNo = new JTextField();
		fNo.setToolTipText("Input a Number Value");
		fNo.setFont(new Font("Arial", Font.BOLD, 17));
		fNo.setForeground(new Color(0, 0, 102));
		fNo.setHorizontalAlignment(SwingConstants.CENTER);
		fNo.setBounds(222, 33, 141, 26);
		frame.getContentPane().add(fNo);
		fNo.setColumns(10);
		
		sNo = new JTextField();
		sNo.setToolTipText("Input a Number Value");
		sNo.setFont(new Font("Arial", Font.BOLD, 17));
		sNo.setHorizontalAlignment(SwingConstants.CENTER);
		sNo.setColumns(10);
		sNo.setBounds(222, 86, 141, 26);
		frame.getContentPane().add(sNo);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setToolTipText("Add");
		btnNewButton.setBackground(new Color(255, 140, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				
				double n1,n2, sum; 
			 
					 try {
						  n1=Double.parseDouble(fNo.getText());
							n2=Double.parseDouble(sNo.getText());
							sum= n1+n2;
							label1.setText(Double.toString(sum));
							frame.setVisible(true);
						}
						catch(Exception e) {
							 JOptionPane.showMessageDialog(null, "Please Enter Valid Numbers",
								      "Error..!!", JOptionPane.ERROR_MESSAGE);
						 fNo.setText(null);
						 sNo.setText(null);
						 
						}
				
				 
			}
		});
		btnNewButton.setForeground(new Color(0, 102, 51));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		btnNewButton.setBounds(47, 159, 52, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setToolTipText("Substract");
		btnNewButton_1.setBackground(new Color(255, 140, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				
				double n1,n2, dif;
				 
				 try {
					  n1=Double.parseDouble(fNo.getText());
						n2=Double.parseDouble(sNo.getText());
						dif= n1-n2;
						label1.setText(Double.toString(dif));
						frame.setVisible(true);
					}
					catch(Exception e) {
						 JOptionPane.showMessageDialog(null, "Please Enter Valid Numbers",
							      "Error..!!", JOptionPane.ERROR_MESSAGE);
					 fNo.setText(null);
					 sNo.setText(null);
					 
					}
			}
		});
		btnNewButton_1.setForeground(new Color(0, 102, 51));
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		btnNewButton_1.setBounds(134, 159, 52, 38);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnX = new JButton("X");
		btnX.setToolTipText("Multiply");
		btnX.setBackground(new Color(255, 140, 0));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				double n1,n2, mul;
				 
				 try {
					  n1=Double.parseDouble(fNo.getText());
						n2=Double.parseDouble(sNo.getText());
						mul= n1*n2;
						label1.setText(Double.toString(mul));
						frame.setVisible(true);
					}
					catch(Exception e) {
						 JOptionPane.showMessageDialog(null, "Please Enter Valid Numbers",
							      "Error..!!", JOptionPane.ERROR_MESSAGE);
					 fNo.setText(null);
					 sNo.setText(null);
					 
					}
				
			}
		});
		btnX.setForeground(new Color(0, 102, 51));
		btnX.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnX.setBounds(222, 159, 52, 38);
		frame.getContentPane().add(btnX);
		
		JButton btnNewButton_3 = new JButton("\u00F7");
		btnNewButton_3.setToolTipText("Devide");
		btnNewButton_3.setBackground(new Color(255, 140, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				double n1,n2, div;
				 
				  
				 try {
					  n1=Double.parseDouble(fNo.getText());
						n2=Double.parseDouble(sNo.getText());
						div= n1/n2;
						label1.setText(Double.toString(div));
						frame.setVisible(true);
					}
					catch(Exception e) {
						 JOptionPane.showMessageDialog(null, "Please Enter Valid Numbers",
							      "Error..!!", JOptionPane.ERROR_MESSAGE);
					 fNo.setText(null);
					 sNo.setText(null);
					 
					}
				
				
			}
		});
		
		
		btnNewButton_3.setForeground(new Color(0, 102, 51));
		btnNewButton_3.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		btnNewButton_3.setBounds(311, 159, 52, 38);
		frame.getContentPane().add(btnNewButton_3);
		
	    label1 = new JLabel(" ");
		label1.setForeground(new Color(0, 0, 102));
		label1.setFont(new Font("Arial", Font.BOLD, 20));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(10, 239, 379, 42);
		frame.getContentPane().add(label1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setToolTipText("Back to Home");
		btnNewButton_2.setBackground(new Color(144, 238, 144));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int reply = JOptionPane.showConfirmDialog(frame,
	                    "Do You Want To Back To Home?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
	            if (reply == JOptionPane.YES_OPTION)
				{frame.dispose();
				Home window=new Home();
				window.frame.setVisible(true);}
			}
		});
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton_2.setForeground(new Color(255, 0, 0));
		btnNewButton_2.setBounds(47, 304, 131, 32);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Reset");
		btnNewButton_2_1.setToolTipText("Clear Your Inputs");
		btnNewButton_2_1.setBackground(new Color(144, 238, 144));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fNo.setText(null);
				sNo.setText(null);
				label1.setText(null);
			}
		});
		btnNewButton_2_1.setForeground(new Color(0, 102, 51));
		btnNewButton_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton_2_1.setBounds(232, 304, 131, 32);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBounds(0, 0, 409, 357);
		frame.getContentPane().add(panel);
	}
	
	
	}
