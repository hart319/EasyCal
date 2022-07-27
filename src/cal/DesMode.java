package cal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class DesMode {

	public  JFrame frame;
	private JTextField firstNo;
	private JTextField secondNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesMode window = new DesMode();
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
	public DesMode() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 427, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		firstNo = new JTextField();
		firstNo.setToolTipText("Insert a Number ");
		firstNo.setForeground(new Color(0, 102, 102));
		firstNo.setFont(new Font("Arial", Font.BOLD, 20));
		firstNo.setHorizontalAlignment(SwingConstants.CENTER);
		firstNo.setBounds(234, 84, 123, 49);
		frame.getContentPane().add(firstNo);
		firstNo.setColumns(10);
		
		secondNo = new JTextField();
		secondNo.setToolTipText("Insert a Number");
		secondNo.setForeground(new Color(0, 102, 51));
		secondNo.setFont(new Font("Arial", Font.BOLD, 20));
		secondNo.setHorizontalAlignment(SwingConstants.CENTER);
		secondNo.setBounds(234, 179, 123, 49);
		frame.getContentPane().add(secondNo);
		secondNo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter First Number");
		lblNewLabel.setForeground(new Color(51, 51, 102));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 91, 200, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterSecondNumber = new JLabel("Enter Second Number");
		lblEnterSecondNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterSecondNumber.setForeground(new Color(51, 51, 102));
		lblEnterSecondNumber.setFont(new Font("Arial", Font.BOLD, 14));
		lblEnterSecondNumber.setBounds(25, 186, 185, 32);
		frame.getContentPane().add(lblEnterSecondNumber);
		
		JButton btnGen = new JButton("Genarate");
		btnGen.setToolTipText("By Genarating here, You will able to get the Sum, Difference ,Multiplication,Division, Squares, Roots, Logarithms ,Factorials Ect...");
		btnGen.setBackground(new Color(144, 238, 144));
		btnGen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				double num1, num2, total,differ,multi,div1,div2,max,sq1,sq2,sqs,sqr1,sqr2,sqrs,avg,ln1,ln2,fact1,fact2;
				int fac1,fac2;
				
				 try {
					  num1=Double.parseDouble(firstNo.getText());
						num2=Double.parseDouble(secondNo.getText());
						 
					}
					catch(Exception e) {
						 JOptionPane.showMessageDialog(null, "Please Enter Valid Numbers",
							      "Error..!!", JOptionPane.ERROR_MESSAGE);
					 firstNo.setText(null);
					 secondNo.setText(null);
					 
					}
				 
				 
				num1=Double.parseDouble(firstNo.getText());
				num2=Double.parseDouble(secondNo.getText());
				total = num1+num2;
				differ= num1-num2;
				multi = num1*num2;
				
				div1= num1/num2;
				div2= num2/num1;
				
				fac1 =(int)Math.round(num1);
				fac2=(int)Math.round(num2);
				fact1=1;
				fact2=1;
				 
				
						
				
				for(int i=1;i<=fac1;i++)
			  	  {
		 
			    	   fact1=fact1*i;
		 	 	  }
				
				
				for(int i=1;i<=fac2;i++)
			  	  {
		 
			    	   fact2=fact2*i;
		 	 	  }
				
				
			    avg= total/2;
			    
			    sq1=num1*num1;
			    sq2=num2*num2;
			    sqs=sq1-sq2;
				
			    
			    sqr1=Math.sqrt(num1);
			    sqr2=Math.sqrt(num2);
			    
			    ln1=Math.log10(num1);
			    ln2=Math.log10(num2);
				
				
				
				
				frame.dispose();
				DesOutput window=new DesOutput();
				window.txt1.setText(Double.toString(total));
				window.frame.setVisible(true);
				
				window.txt2.setText(Double.toString(Math.abs(differ)));
				window.frame.setVisible(true);
				
				window.txt3.setText(Double.toString(multi));
				window.frame.setVisible(true);
				
				window.txt4.setText(Double.toString(div1));
				window.frame.setVisible(true);
				
				window.txt6.setText(Double.toString(div2));
				window.frame.setVisible(true);
				
				window.txt7.setText(Double.toString(Math.max(num1, num2)));
				window.frame.setVisible(true);
				
				window.txt8.setText(Double.toString(fact1));
				window.frame.setVisible(true);
				
				window.txt9.setText(Double.toString(fact2));
				window.frame.setVisible(true);
				
				window.txt10.setText(Double.toString(avg));
				window.frame.setVisible(true);
				
				window.txt13.setText(Double.toString(Math.abs(sqs)));
				window.frame.setVisible(true);
				
				window.txt11.setText(Double.toString(sq1));
				window.frame.setVisible(true);
				
				window.txt12.setText(Double.toString(sq2));
				window.frame.setVisible(true);
				
				window.txt14.setText(Double.toString(sqr1));
				window.frame.setVisible(true);
				
				window.txt15.setText(Double.toString(sqr2));
				window.frame.setVisible(true);
				
				window.txt16.setText(Double.toString(ln1));
				window.frame.setVisible(true);
				
				window.txt19.setText(Double.toString(ln2));
				window.frame.setVisible(true);
				
				
				
				 
				
				
				
			}
		});
		btnGen.setForeground(new Color(0, 0, 153));
		btnGen.setFont(new Font("Calibri", Font.BOLD, 26));
		btnGen.setBounds(25, 297, 174, 41);
		frame.getContentPane().add(btnGen);
		
		JLabel lblNewLabel_1 = new JLabel("Descriptive Mode");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		lblNewLabel_1.setForeground(new Color(0, 0, 153));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 391, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.setToolTipText("Back to Home");
		btnBack.setBackground(new Color(144, 238, 144));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int reply = JOptionPane.showConfirmDialog(frame,
	                    "Do You Want To Back To Home?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
	            if (reply == JOptionPane.YES_OPTION)
				
				{frame.dispose();
				Home window=new Home();
				window.frame.setVisible(true);}
				
			}
		});
		btnBack.setForeground(new Color(255, 0, 0));
		btnBack.setFont(new Font("Calibri", Font.BOLD, 26));
		btnBack.setBounds(227, 297, 174, 41);
		frame.getContentPane().add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBounds(0, 0, 421, 374);
		frame.getContentPane().add(panel);
	}
}
