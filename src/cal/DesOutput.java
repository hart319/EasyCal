package cal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Scrollbar;

import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class DesOutput {

	public JFrame frame;
	public static JLabel txt1;
	public JLabel txt2;
	public JLabel txt3;
	public JLabel txt4;
	public JLabel txt6;
	public JLabel txt7;
	public JLabel txt8;
	public JLabel txt9;
	public JLabel txt10;
	public JLabel txt11;
	public JLabel txt12;
	public JLabel txt13;
	public JLabel txt14;
	public JLabel txt15;
	public JLabel txt16;
	public JLabel txt19;
	private JLabel lblNewLabel_1_8_1_2_4;
	private JButton btnNewButton;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	Panel panel;
	public static String abc;
	
	     
	     
	public static void main(String[] args) {
		  
    
	

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesOutput window = new DesOutput();
					window.frame.setVisible(true);
//					new Scrollbar();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		    
			
		});
		
		try {
			abc=txt1.getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(txt1);
		

		
		
	}
	
	 
	/**
	 * Create the application.
	 */
	public DesOutput() {
		initialize();
		
	
//		panel = new Panel();
//		Scrollbar scrollBar = new Scrollbar(Scrollbar.VERTICAL, 10, 60, 0, 100);
//
// 
//		
//
//		frame.setSize(800,900);
//		frame.setVisible(true);
	}
	 
	
	 
	

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(175, 238, 238));
		frame.setBounds(100, 100, 600, 800);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.setVisible(true);
		

		 
		frame.getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Sum");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1);
		
		txt1 = new JLabel("a");
		txt1.setForeground(Color.BLACK);
		txt1.setBackground(new Color(255, 0, 0));
		txt1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(txt1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Difference");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1_1);
		
		txt2 = new JLabel("a");
		txt2.setHorizontalAlignment(SwingConstants.CENTER);
		txt2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt2.setBackground(Color.RED);
		frame.getContentPane().add(txt2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Multiplication");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Calibri", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1_2);
		
		txt3 = new JLabel("a");
		txt3.setHorizontalAlignment(SwingConstants.CENTER);
		txt3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt3.setBackground(Color.RED);
		frame.getContentPane().add(txt3);
	    
	    JLabel lblNewLabel_1_3 = new JLabel("1st No/2nd No");
	    lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_1_3.setFont(new Font("Calibri", Font.BOLD, 20));
	    frame.getContentPane().add(lblNewLabel_1_3);
		
	    txt4 = new JLabel("a");
		txt4.setHorizontalAlignment(SwingConstants.CENTER);
		txt4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt4.setBackground(Color.RED);
		frame.getContentPane().add(txt4);
	    
	    JLabel lblNewLabel_1_4 = new JLabel("2nd no/1st No");
	    lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_1_4.setFont(new Font("Calibri", Font.BOLD, 20));
	    frame.getContentPane().add(lblNewLabel_1_4);
		
	    txt6 = new JLabel("a");
		txt6.setHorizontalAlignment(SwingConstants.CENTER);
		txt6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt6.setBackground(Color.RED);
		frame.getContentPane().add(txt6);
		
		JLabel lblNewLabel_1_5 = new JLabel("Max Number");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("Calibri", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1_5);
		
		txt7 = new JLabel("a");
		txt7.setHorizontalAlignment(SwingConstants.CENTER);
		txt7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt7.setBackground(Color.RED);
		frame.getContentPane().add(txt7);
        
        JLabel lblNewLabel_1_6 = new JLabel("Factorial No 1(No1 !)");
        lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_6.setFont(new Font("Calibri", Font.BOLD, 20));
        frame.getContentPane().add(lblNewLabel_1_6);
		
        txt8 = new JLabel("a");
		txt8.setHorizontalAlignment(SwingConstants.CENTER);
		txt8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt8.setBackground(Color.RED);
		frame.getContentPane().add(txt8);
		
		JLabel lblNewLabel_1_7 = new JLabel("Factorial No 2(No2 !)");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_7.setFont(new Font("Calibri", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1_7);
		
		txt9 = new JLabel("a");
		txt9.setHorizontalAlignment(SwingConstants.CENTER);
		txt9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt9.setBackground(Color.RED);
		frame.getContentPane().add(txt9);
		
		JLabel lblNewLabel_1_8 = new JLabel(" Average  (No1 & No2)");
		lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_8.setFont(new Font("Calibri", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1_8);
		
		txt10 = new JLabel("a");
		txt10.setHorizontalAlignment(SwingConstants.CENTER);
		txt10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt10.setBackground(Color.RED);
		frame.getContentPane().add(txt10);
		
		JLabel lblNewLabel_1_8_1 = new JLabel("Square (No1\u00B2)");
		lblNewLabel_1_8_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_8_1.setFont(new Font("Calibri", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1_8_1);
		
		txt11 = new JLabel("a");
		txt11.setHorizontalAlignment(SwingConstants.CENTER);
		txt11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt11.setBackground(Color.RED);
		frame.getContentPane().add(txt11);
		
		JLabel lblNewLabel_1_8_1_1 = new JLabel("Square (No2\u00B2)");
		lblNewLabel_1_8_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_8_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1_8_1_1);
		
		txt12 = new JLabel("a");
		txt12.setHorizontalAlignment(SwingConstants.CENTER);
		txt12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt12.setBackground(Color.RED);
		frame.getContentPane().add(txt12);
		
		JLabel lblNewLabel_1_8_1_2 = new JLabel("Difference of two Squares");
		lblNewLabel_1_8_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_8_1_2.setFont(new Font("Calibri", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1_8_1_2);
		
		txt13 = new JLabel("a");
		txt13.setHorizontalAlignment(SwingConstants.CENTER);
		txt13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt13.setBackground(Color.RED);
		frame.getContentPane().add(txt13);
		
		JLabel lblNewLabel_1_8_1_2_1 = new JLabel("Square Root (\u221ANo 1)");
		lblNewLabel_1_8_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_8_1_2_1.setFont(new Font("Calibri", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1_8_1_2_1);
		
	    txt14 = new JLabel("a");
		txt14.setHorizontalAlignment(SwingConstants.CENTER);
		txt14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt14.setBackground(Color.RED);
		frame.getContentPane().add(txt14);
	    
	    JLabel lblNewLabel_1_8_1_2_2 = new JLabel("Square Root (\u221ANo2)");
	    lblNewLabel_1_8_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_1_8_1_2_2.setFont(new Font("Calibri", Font.BOLD, 20));
	    frame.getContentPane().add(lblNewLabel_1_8_1_2_2);
		
	    txt15 = new JLabel("a");
		txt15.setHorizontalAlignment(SwingConstants.CENTER);
		txt15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt15.setBackground(Color.RED);
		frame.getContentPane().add(txt15);
		
		JLabel lblNewLabel_1_8_1_2_3 = new JLabel("ln(No 1)");
		lblNewLabel_1_8_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_8_1_2_3.setFont(new Font("Calibri", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1_8_1_2_3);
		
		txt16 = new JLabel("a");
		txt16.setHorizontalAlignment(SwingConstants.CENTER);
		txt16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt16.setBackground(Color.RED);
		frame.getContentPane().add(txt16);
		
		lblNewLabel_1_8_1_2_4 = new JLabel("ln(No 2)");
		lblNewLabel_1_8_1_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_8_1_2_4.setFont(new Font("Calibri", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1_8_1_2_4);
		
		txt19 = new JLabel("a");
		txt19.setHorizontalAlignment(SwingConstants.CENTER);
		txt19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt19.setBackground(Color.RED);
		frame.getContentPane().add(txt19);
		
		lblNewLabel = new JLabel(" ");
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton = new JButton("Back");
		btnNewButton.setToolTipText("Back to Change Inputs");
		btnNewButton.setBackground(new Color(144, 238, 144));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int reply = JOptionPane.showConfirmDialog(frame,
	                    "Do You Want Exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
	            if (reply == JOptionPane.YES_OPTION)
				
				{frame.dispose();
				DesMode window=new DesMode();
				window.frame.setVisible(true);}
			}
			
			
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_2 = new JLabel(" ");
		frame.getContentPane().add(lblNewLabel_2);
	}
}
