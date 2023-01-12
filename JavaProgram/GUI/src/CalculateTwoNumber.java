import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;
	private JComboBox chOperator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
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
	public CalculateTwoNumber() {
		setTitle("CalculateTwoNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lalNumber1 = new JLabel("Enter Number 1");
		lalNumber1.setFont(new Font("Sitka Display", Font.PLAIN, 14));
		lalNumber1.setHorizontalAlignment(SwingConstants.CENTER);
		lalNumber1.setBounds(32, 0, 108, 38);
		contentPane.add(lalNumber1);

		txtNumber1 = new JTextField();
		txtNumber1.setBounds(168, 7, 96, 20);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);

		JLabel lblNumber2 = new JLabel("Enter Number 2");
		lblNumber2.setFont(new Font("Sitka Display", Font.PLAIN, 14));
		lblNumber2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumber2.setBounds(32, 40, 108, 20);
		contentPane.add(lblNumber2);

		txtNumber2 = new JTextField();
		txtNumber2.setBounds(168, 38, 96, 20);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);

		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(281, 177, 96, 45);
		contentPane.add(lblResult);

		final JComboBox chOperator = new JComboBox();
		chOperator.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		chOperator.setBounds(168, 69, 96, 23);
		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");
		final JRadioButton OneDigit = new JRadioButton("1 Digit");
		OneDigit.setFont(new Font("Sitka Display", Font.PLAIN, 14));
		OneDigit.setHorizontalAlignment(SwingConstants.LEFT);
		OneDigit.setBounds(168, 102, 109, 23);
		contentPane.add(OneDigit);
		
		final JRadioButton TwoDigit = new JRadioButton("2 Digit");
		TwoDigit.setFont(new Font("Sitka Display", Font.PLAIN, 14));
		TwoDigit.setBounds(168, 128, 109, 20);
		contentPane.add(TwoDigit);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setFont(new Font("Sitka Display", Font.PLAIN, 14));
		lblOperator.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperator.setBounds(10, 61, 114, 38);
		contentPane.add(lblOperator);
		
		JLabel rdbOperator = new JLabel("How to show Digit");
		rdbOperator.setHorizontalAlignment(SwingConstants.CENTER);
		rdbOperator.setFont(new Font("Sitka Display", Font.PLAIN, 14));
		rdbOperator.setBounds(32, 108, 123, 14);
		contentPane.add(rdbOperator);
		
		JLabel lblOptionShow = new JLabel("Option to show");
		lblOptionShow.setFont(new Font("Sitka Display", Font.PLAIN, 14));
		lblOptionShow.setBounds(41, 161, 99, 14);
		contentPane.add(lblOptionShow);
		
		JCheckBox chkDialogbox = new JCheckBox("Show Result at Dialogbox");
		chkDialogbox.setBounds(168, 155, 193, 23);
		contentPane.add(chkDialogbox);
		
		ButtonGroup group = new ButtonGroup();
		group.add(OneDigit);
		group.add(TwoDigit);

		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, sum = 0;
				String operator;
				// JButton
				if (e.getSource() == btnOK) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					// JCombobox
					operator = (String) chOperator.getSelectedItem();
					if (operator.equals("+"))
						sum = num1 + num2;
					if (operator.equals("-"))
						sum = num1 - num2;
					if (operator.equals("*"))
						sum = num1 * num2;
					if (operator.equals("/"))
						sum = num1 / num2;
					
					//JRadioButton
					DecimalFormat frmNumber = null;
					if(OneDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.0");
					}else if(TwoDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");
					}
					
					lblResult.setText(frmNumber.format(sum));
					
					//JCheckBox
					if(chkDialogbox.isSelected()) {
						JOptionPane.showMessageDialog(null,"Result is : "+ sum);
					}
				}
			}
		});

		contentPane.add(chOperator);

		btnOK.setBounds(118, 227, 89, 23);
		contentPane.add(btnOK);

		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(217, 227, 89, 23);
		contentPane.add(btnExit);

		
	}
}
