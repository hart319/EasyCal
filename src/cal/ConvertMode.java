package cal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class ConvertMode {

	JFrame frame;
	private JTextField inputText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConvertMode window = new ConvertMode();
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
	public ConvertMode() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 479, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("Converting Number System");
		lblNewLabel.setForeground(new Color(0, 0, 139));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 443, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insert an Integer");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 79, 192, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		JLabel output = new JLabel(" ");
		output.setForeground(new Color(0, 100, 0));
		output.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		output.setHorizontalAlignment(SwingConstants.CENTER);
		output.setBounds(10, 214, 443, 39);
		frame.getContentPane().add(output);
		
		inputText = new JTextField();
		inputText.setToolTipText("Insert an Integer to Convert Number Format");
		inputText.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		inputText.setHorizontalAlignment(SwingConstants.CENTER);
		inputText.setBounds(240, 82, 213, 36);
		frame.getContentPane().add(inputText);
		inputText.setColumns(10);
		
		JButton btnNewButton = new JButton("Binary");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				String num1,num3;
				int num2;
				
				try {
					 num1=inputText.getText();
					 num2=Integer.parseInt(num1);
					 num3=Integer.toBinaryString(num2);
					 output.setText(num3);
					}
					catch(Exception e) {
						 JOptionPane.showMessageDialog(null, "Please Enter an Integer Number",
							      "Error..!!", JOptionPane.ERROR_MESSAGE);
					 inputText.setText(null);
					 
					 
					}
				 
				
				
			}
			
		});
		btnNewButton.setBackground(new Color(144, 238, 144));
		btnNewButton.setToolTipText("Covert the Integer To a Binary Number");
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 18));
		btnNewButton.setBounds(51, 153, 118, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnOctal = new JButton("Octal");
		btnOctal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				
				String num1,num3;
				int num2;
				 
				
				try {
					 num1=inputText.getText();
					 num2=Integer.parseInt(num1);
					 num3=Integer.toOctalString(num2);
					 output.setText(num3);
					}
					catch(Exception e) {
						 JOptionPane.showMessageDialog(null, "Please Enter an Integer Number",
							      "Error..!!", JOptionPane.ERROR_MESSAGE);
					 inputText.setText(null);
					 
					 
					}			}
		});
		btnOctal.setToolTipText("Covert the Integer To a Octal Number");
		btnOctal.setForeground(new Color(0, 0, 128));
		btnOctal.setFont(new Font("Calibri", Font.BOLD, 18));
		btnOctal.setBackground(new Color(144, 238, 144));
		btnOctal.setBounds(179, 153, 124, 39);
		frame.getContentPane().add(btnOctal);
		
		JButton btnHexadecimal = new JButton("HexaDecimal");
		btnHexadecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				
				String num1,num3;
				int num2;
				 
				
				try {
					num1=inputText.getText();
					 num2=Integer.parseInt(num1);
					 num3=Integer.toHexString(num2);
					 output.setText(num3);
					}
					catch(Exception e) {
						 JOptionPane.showMessageDialog(null, "Please Enter an Integer Number",
							      "Error..!!", JOptionPane.ERROR_MESSAGE);
					 inputText.setText(null);
					 
					 
					}
			}
		});
		btnHexadecimal.setToolTipText("Covert the Integer To a HexaDecimal Number");
		btnHexadecimal.setForeground(new Color(0, 0, 128));
		btnHexadecimal.setFont(new Font("Calibri", Font.BOLD, 15));
		btnHexadecimal.setBackground(new Color(144, 238, 144));
		btnHexadecimal.setBounds(313, 153, 124, 39);
		frame.getContentPane().add(btnHexadecimal);
		
		
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int reply = JOptionPane.showConfirmDialog(frame,
	                    "Do You Want To Back To Home?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
	            if (reply == JOptionPane.YES_OPTION)
				{frame.dispose();
				Home window=new Home();
				window.frame.setVisible(true);}
			}
		});
		btnNewButton_1.setToolTipText("Back To Home");
		btnNewButton_1.setBackground(new Color(144, 238, 144));
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 18));
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(171, 277, 118, 34);
		frame.getContentPane().add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBounds(0, 0, 473, 332);
		frame.getContentPane().add(panel);
	}
}
