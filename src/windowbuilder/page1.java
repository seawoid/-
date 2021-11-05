package windowbuilder;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Cursor;

public class page1 {

	static int next;
	static String str,strN;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	String a,d;
	String[] ran;
	static List list_L = new ArrayList();
	static List list_P = new ArrayList();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page1 window = new page1();
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
	public page1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.control);
		frame.setBounds( 0, 0, screenSize.width, screenSize.height);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8A13\u7DF4\u8207\u9328\u5C0D\u8A9E\u8A00\u6CBB\u7642\u5B78\u751F\u807D\u77E5\u89BA\u8A55\u4F30\u4FE1\u5EA6\u8207\u4E00\u81F4\u6027\u7684\u5F71\u97FF");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 30));
		lblNewLabel.setBounds( 0, (frame.getHeight()/20)*2, (frame.getWidth()-20), 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("The effect of training and anchors on the reliability and");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, (frame.getHeight()/20)*3+20, (frame.getWidth()-20), 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("agreement of auditory-perceptual voice analysis for speech ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(0, (frame.getHeight()/20)*4+30, (frame.getWidth()-20), 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("pathologist students");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(0, (frame.getHeight()/20)*5+30, (frame.getWidth()-20), 35);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u53D7\u8A66\u8005\u59D3\u540D\uFF1A");
		lblNewLabel_4.setFont(new Font("標楷體", Font.PLAIN, 20));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds( (frame.getWidth()/20)*4,  (frame.getHeight()/20)*10, 129, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds( (frame.getWidth()/20)*6, (frame.getHeight()/20)*10-5, 100, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\u53D7\u8A66\u8005\u7DE8\u865F\uFF1A");
		lblNewLabel_5.setFont(new Font("標楷體", Font.PLAIN, 20));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds( (frame.getWidth()/20)*11, (frame.getHeight()/20)*10, 129, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds( (frame.getWidth()/20)*13, (frame.getHeight()/20)*10-5, 100, 25);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("前測");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_1.setBackground(SystemColor.control);
		btnNewButton_1.setFont(new Font("標楷體", Font.PLAIN, 30));
		btnNewButton_1.setBounds(417, 756, 96, 60);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str = textField_1.getText();
				strN = textField.getText();
				int s = 0;
				if(!str.equals("")) {
					s = Integer.parseInt(str);
					if((s < 16) || (s == 48) || (s == 51)) {  //對照組
						next = 1;
						page2.main(null);
						frame.setVisible(false);
					}else if((s >= 16 && s < 32) || (s == 49) || (s == 52)) {  //有回饋組
						next = 2;
						page2.main(null);
						frame.setVisible(false);
					}else if((s >= 32 && s < 48) || (s == 50) || (s == 53)) {  //無回饋組
						next = 3;
						page2.main(null);
						frame.setVisible(false);
					}
				}else {
					JOptionPane.showMessageDialog(null,"請輸入編號與姓名","警告",JOptionPane.WARNING_MESSAGE);
				}
				
				File fileout = new File(System.getProperty("user.dir") + "/前測_" + str + "_" + strN + ".csv");
				try {
					BufferedWriter w = new BufferedWriter(new FileWriter(fileout,true));
					w.write("受試者編號," + "受試者姓名,");
					w.newLine();
					w.write(textField_1.getText() + "," + textField.getText() + ",");
					w.newLine();
					w.newLine();
					w.write("題號," + "R," + "B,");
					w.newLine();
					w.flush();
					w.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u6AA2\u8996");
		btnNewButton_2.setBackground(SystemColor.control);
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_2.setFont(new Font("標楷體", Font.PLAIN, 30));
		btnNewButton_2.setBounds(970, 756, 96, 60);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str = textField_1.getText();
				strN = textField.getText();
				File fileout = new File(System.getProperty("user.dir") + "/檢視_" + str + "_" + strN + ".csv");
				try {
					BufferedWriter w = new BufferedWriter(new FileWriter(fileout,true));
					w.write("受試者編號," + "受試者姓名,");
					w.newLine();
					w.write(textField_1.getText() + "," + textField.getText() + ",");
					w.newLine();
					w.newLine();
					w.write("題號," + "R," + "B,");
					w.newLine();
					w.flush();
					w.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				next = 4;
				page18.main(null);
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("追蹤");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str = textField_1.getText();
				strN = textField.getText();
				File fileout = new File(System.getProperty("user.dir") + "/追蹤_" + str + "_" + strN + ".csv");
				try {
					BufferedWriter w = new BufferedWriter(new FileWriter(fileout,true));
					w.write("受試者編號," + "受試者姓名,");
					w.newLine();
					w.write(textField_1.getText() + "," + textField.getText() + ",");
					w.newLine();
					w.newLine();
					w.write("題號," + "R," + "B,");
					w.newLine();
					w.flush();
					w.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				next = 5;
				page20.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton_4.setBackground(SystemColor.control);
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_4.setBounds(1252, 756, 96, 60);
		btnNewButton_4.setFont(new Font("標楷體", Font.PLAIN, 30));
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("後測");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				page15.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBackground(SystemColor.control);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton.setBounds(700, 756, 96, 60);
		btnNewButton.setFont(new Font("標楷體", Font.PLAIN, 30));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("訓練");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*str = textField_1.getText();
				strN = textField.getText();
				int s = 0;
				if(!str.equals("")) {
					s = Integer.parseInt(str);
					if((s < 16) || (s == 48) || (s == 51)) {  //對照組
						next = 1;
						page6.main(null);
						frame.setVisible(false);
					}else if((s >= 16 && s < 32) || (s == 49) || (s == 52)) {  //有回饋組
						next = 2;
						page10.main(null);
						frame.setVisible(false);
					}else if((s >= 32 && s < 48) || (s == 50) || (s == 53)) {  //無回饋組
						next = 3;
						page6.main(null);
						frame.setVisible(false);
					}
				}else {
					JOptionPane.showMessageDialog(null,"請輸入編號與姓名","警告",JOptionPane.WARNING_MESSAGE);
				}*/
				page7_2.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton_3.setBackground(SystemColor.control);
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_3.setFont(new Font("標楷體", Font.PLAIN, 30));
		btnNewButton_3.setBounds(1497, 756, 96, 60);
		frame.getContentPane().add(btnNewButton_3);

		BufferedReader rL = null,rP = null;
		try {
			rL = new BufferedReader(new InputStreamReader(new FileInputStream(System.getProperty("user.dir") + "/L解答.txt")));
			while((a = rL.readLine()) != null) {
				d = a;
				ran = d.split("\n");
				for(int i = 0 ; i < ran.length;i++) {
					list_L.add(ran[i]);
				}
			}
			rP = new BufferedReader(new InputStreamReader(new FileInputStream(System.getProperty("user.dir") + "/P解答.txt")));
			while((a = rP.readLine()) != null) {
				d = a;
				ran = d.split("\n");
				for(int i = 0 ; i < ran.length;i++) {
					list_P.add(ran[i]);
				}
			}
			rL.close();
			rP.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
