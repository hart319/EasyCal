package cal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class Home {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("EasyCAL");
		lblNewLabel.setForeground(new Color(0, 0, 102));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 23, 434, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select the Mode");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(0, 95, 434, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Normal Mode");
		btnNewButton.setToolTipText("Here You can Do Your Simple Calculations Such As Addition,Substraction,Division and Multiplication");
		btnNewButton.setBackground(new Color(255, 165, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				NormalMode window=new NormalMode();
				window.frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(0, 102, 51));
		btnNewButton.setBounds(60, 147, 139, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDescriptivemode = new JButton("Descriptive Mode");
		btnDescriptivemode.setToolTipText("Here You can Get a Descriptive Calculation results over Your Inputs");
		btnDescriptivemode.setBackground(new Color(255, 165, 0));
		btnDescriptivemode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				DesMode window=new DesMode();
				window.frame.setVisible(true);
			}
		});
		btnDescriptivemode.setForeground(new Color(0, 102, 51));
		btnDescriptivemode.setFont(new Font("Calibri", Font.BOLD, 15));
		btnDescriptivemode.setBounds(241, 147, 149, 38);
		frame.getContentPane().add(btnDescriptivemode);
		
		JButton btnNumberConverter = new JButton("Number Converter");
		btnNumberConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				ConvertMode window=new ConvertMode();
				window.frame.setVisible(true);
			}
		});
		btnNumberConverter.setToolTipText(" Here You Will  able to Change  Integer Format to Binary, Octal,, HexaDecimal");
		btnNumberConverter.setForeground(new Color(0, 102, 51));
		btnNumberConverter.setFont(new Font("Calibri", Font.BOLD, 15));
		btnNumberConverter.setBackground(new Color(255, 165, 0));
		btnNumberConverter.setBounds(136, 196, 162, 38);
		frame.getContentPane().add(btnNumberConverter);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBounds(0, 0, 444, 271);
		frame.getContentPane().add(panel);
	}
}
