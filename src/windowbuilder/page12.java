package windowbuilder;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.text.DecimalFormat;  

public class page12 {
	static int page = 1;
	private JFrame frame;
	static double sum1 = 0;
	static double sum2 = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page12 window = new page12();
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
	public page12() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.control);
		frame.setUndecorated(true); //無標題欄
		frame.setBounds(0, 0, screenSize.width, screenSize.height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("第" + page + "組準確率");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 60));
		lblNewLabel.setBounds( 0, (screenSize.height/100)*7, (screenSize.width), 52);
		frame.getContentPane().add(lblNewLabel);
		
		/***************************************************/
		
		JLabel lblNewLabel_1 = new JLabel("\u7C97\u7CD9\u8072\u8A55\u5206");
		lblNewLabel_1.setFont(new Font("標楷體", Font.PLAIN, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds( (screenSize.width/100)*29, (screenSize.height/100)*28, 150, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Roughness");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds( (screenSize.width/100)*27, (screenSize.height/100)*33, 220, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds((screenSize.width/100)*65, (screenSize.height/100)*31, 50, 30);
		lblNewLabel_5.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
		sum1 = ((sum1/12))*100;
		lblNewLabel_5.setText(""+Math.round(sum1));
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("%");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_6.setBounds((screenSize.width/100)*69, (screenSize.height/100)*31, 50, 30);
		frame.getContentPane().add(lblNewLabel_6);
		
		/***************************************************/
		
		JLabel lblNewLabel_3 = new JLabel("\u6C23\u606F\u8072\u8A55\u5206");
		lblNewLabel_3.setFont(new Font("標楷體", Font.PLAIN, 25));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds( (screenSize.width/100)*29, (screenSize.height/100)*53, 150, 30);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Breathiness");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds( (screenSize.width/100)*27, (screenSize.height/100)*58, 220, 30);
		frame.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds((screenSize.width/100)*65, (screenSize.height/100)*56, 50, 30);
		lblNewLabel_7.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
		sum2 = ((sum2/12))*100;
		lblNewLabel_7.setText(""+Math.round(sum2));
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("%");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_8.setBounds((screenSize.width/100)*69, (screenSize.height/100)*56, 50, 30);
		frame.getContentPane().add(lblNewLabel_8);
		
		ImageIcon icon = new ImageIcon(".\\.\\img\\tit2.jpg");
		JButton btn = new JButton("",icon);
		btn.setHorizontalAlignment(SwingConstants.CENTER);
		btn.setFont(new Font("標楷體", Font.PLAIN, 30));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File fileout;
				if(page1.next == 3) {
					if(page<3) {
						page++;
						fileout = new File(System.getProperty("user.dir") + "/(NF組)訓練_" + page1.str + "_" + page1.strN + ".csv");
						try {
							BufferedWriter w = new BufferedWriter(new FileWriter(fileout,true));
							w.write("訓練" + String.valueOf((page - 1)) + "準確率");
							w.newLine();
							w.write("粗糙聲評分 Roughness：" + String.valueOf(sum1) + "%" + "；氣息聲評分 Breathiness" + String.valueOf(sum2) + "%");
							w.newLine();
							w.write("訓練" + String.valueOf(page));
							w.newLine();
							w.flush();
							w.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						sum1 = sum2 = 0;
						page14.main(null);
						frame.setVisible(false);
					}else {
						page++;
						sum1 = sum2 = 0;
						page15.main(null);
						frame.setVisible(false);
					}	
				}else if(page1.next == 2) {
					if(page<3) {
						page++;
						fileout = new File(System.getProperty("user.dir") + "/(F組)訓練_" + page1.str + "_" + page1.strN + ".csv");
						try {
							BufferedWriter w = new BufferedWriter(new FileWriter(fileout,true));
							w.write("訓練" + String.valueOf((page - 1)) + "準確率");
							w.newLine();
							w.write("粗糙聲評分 Roughness：" + String.valueOf(sum1) + "%" + "；氣息聲評分 Breathiness" + String.valueOf(sum2) + "%");
							w.newLine();
							w.write("訓練" + String.valueOf(page));
							w.newLine();
							w.flush();
							w.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						sum1 = sum2 = 0;
						page11_next2.main(null);
						frame.setVisible(false);
					}else {
						page++;
						sum1 = sum2 = 0;
						page15.main(null);
						frame.setVisible(false);
						
					}
				}	
					
			}
		});
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				UIManager.put("Button.select", SystemColor.CONTROL);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btn.setBorderPainted(true);
				btn.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, SystemColor.activeCaption));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn.setBorderPainted(false);
			}
		});
		btn.setOpaque(true);
		btn.setBackground(SystemColor.control);
		btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn.setFocusPainted(false);
		btn.setBounds( (screenSize.width/20)*8, (screenSize.height/100)*80, 300,120);
		btn.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, SystemColor.control));
		frame.getContentPane().add(btn);
		
		/***************************************************/
		
		
	}

}
