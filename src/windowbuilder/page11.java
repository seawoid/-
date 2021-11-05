package windowbuilder;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.JCheckBox;

public class page11 {
	int i = 0;
	int count = 1;
	int turn=0;
	int n;
	static int first = 0;
	static int page = 0;
	double[] value = new double[12];
	JFrame frame;		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page11 window = new page11();
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
	public page11() {
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
		
		JLabel lblNewLabel_25 = new JLabel();
		lblNewLabel_25.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel lblNewLabel33 = new JLabel();
		lblNewLabel33.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel33.setHorizontalAlignment(SwingConstants.CENTER);
		
		/*********************************  第一行  ********************************************/
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(".\\.\\img\\C"+count+".jpg"));
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 60));
		lblNewLabel.setBounds( (screenSize.width/100)*6, (screenSize.height/100)*7, (screenSize.width/100)*50, 55);
		frame.getContentPane().add(lblNewLabel);
		/******************************/
		if(page12.page == 1) {
			lblNewLabel.setIcon(new ImageIcon(".\\.\\img\\C"+count+".jpg"));
		}else if(page12.page == 2) {
			lblNewLabel.setIcon(new ImageIcon(".\\.\\img\\D"+count+".jpg"));
		}else if(page12.page == 3) {
			lblNewLabel.setIcon(new ImageIcon(".\\.\\img\\E"+count+".jpg"));
		}
		/****************************/
		 
		JLabel lblNewLabel_1 = new JLabel("粗糙聲聽覺錨");
		lblNewLabel_1.setFont(new Font("標楷體", Font.PLAIN, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds( (screenSize.width/100)*8, (screenSize.height/100)*23, 150, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Roughness Anchor");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds( (screenSize.width/100)*6, (screenSize.height/100)*28, 220, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		/****************************    按鈕1         ************************************/
		JButton btnNewButton = new JButton("");
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});
		btnNewButton.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton.setBounds((screenSize.width/100)*26, (screenSize.height/100)*23, 85, 60);
		btnNewButton.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setContentAreaFilled(false); 
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("0");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel_5.setBounds((screenSize.width/100)*26, (screenSize.height/100)*32, 85, 26);
		frame.getContentPane().add(lblNewLabel_5);
		

		JLabel lblNewLabel_26 = new JLabel();
		lblNewLabel_26.setOpaque(true);
		lblNewLabel_26.setBounds((screenSize.width/100)*35, (screenSize.height/100)*23, 2, 90);
		lblNewLabel_26.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_26);
		/****************************    按鈕2         ************************************/
		JButton btnNewButton1 = new JButton("");
		btnNewButton1.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton1.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton1.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});
		btnNewButton1.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton1.setBounds((screenSize.width/100)*39, (screenSize.height/100)*23, 85, 60);
		btnNewButton1.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNewButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton1.setContentAreaFilled(false); 
		frame.getContentPane().add(btnNewButton1);
		
		JLabel lblNewLabel_6 = new JLabel("1");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel_6.setBounds((screenSize.width/100)*39, (screenSize.height/100)*32, 85, 26);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_27 = new JLabel();
		lblNewLabel_27.setOpaque(true);
		lblNewLabel_27.setBounds((screenSize.width/100)*48, (screenSize.height/100)*23, 2, 90);
		lblNewLabel_27.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_27);
		
		/****************************      按鈕3        ************************************/
		JButton btnNewButton3 = new JButton("");
		btnNewButton3.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton3.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton3.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});
		btnNewButton3.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton3.setBounds((screenSize.width/100)*52, (screenSize.height/100)*23, 85, 60);
		btnNewButton3.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNewButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton3.setContentAreaFilled(false); 
		frame.getContentPane().add(btnNewButton3);
		
		JLabel lblNewLabel_7 = new JLabel("1.5");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel_7.setBounds((screenSize.width/100)*52, (screenSize.height/100)*32, 85, 26);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_28 = new JLabel();
		lblNewLabel_28.setOpaque(true);
		lblNewLabel_28.setBounds((screenSize.width/100)*61, (screenSize.height/100)*23, 2, 90);
		lblNewLabel_28.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_28);
		
		/****************************    按鈕4         ************************************/
		JButton btnNewButton4 = new JButton("");
		btnNewButton4.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton4.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton4.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});
		btnNewButton4.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton4.setBounds((screenSize.width/100)*65, (screenSize.height/100)*23, 85, 60);
		btnNewButton4.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNewButton4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton4.setContentAreaFilled(false); 
		frame.getContentPane().add(btnNewButton4);
		
		JLabel lblNewLabel_8 = new JLabel("2");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel_8.setBounds((screenSize.width/100)*65, (screenSize.height/100)*32, 85, 26);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_29 = new JLabel();
		lblNewLabel_29.setOpaque(true);
		lblNewLabel_29.setBounds((screenSize.width/100)*74, (screenSize.height/100)*23, 2, 90);
		lblNewLabel_29.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_29);
		
		/****************************    按鈕5         ************************************/
		JButton btnNewButton5 = new JButton("");
		btnNewButton5.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton5.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton5.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});
		btnNewButton5.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton5.setBounds((screenSize.width/100)*78, (screenSize.height/100)*23, 85, 60);
		btnNewButton5.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNewButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton5.setContentAreaFilled(false); 
		frame.getContentPane().add(btnNewButton5);
		
		JLabel lblNewLabel_9 = new JLabel("2.5");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel_9.setBounds((screenSize.width/100)*78, (screenSize.height/100)*32, 85, 26);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_30 = new JLabel();
		lblNewLabel_30.setOpaque(true);
		lblNewLabel_30.setBounds((screenSize.width/100)*87, (screenSize.height/100)*23, 2, 90);
		lblNewLabel_30.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_30);
		
		/****************************    按鈕6         ************************************/
		JButton btnNewButton6 = new JButton("");
		btnNewButton6.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton6.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton6.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});
		btnNewButton6.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton6.setBounds((screenSize.width/100)*91, (screenSize.height/100)*23, 85, 60);
		btnNewButton6.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNewButton6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton6.setContentAreaFilled(false); 
		frame.getContentPane().add(btnNewButton6);

		JLabel lblNewLabel_10 = new JLabel("3");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel_10.setBounds((screenSize.width/100)*91, (screenSize.height/100)*32, 85, 26);
		frame.getContentPane().add(lblNewLabel_10);
		
		/**********************************************************************************************************************************************************************************************************/
		/************************************************************************************************  第二行  ************************************************************************************************/
		/**********************************************************************************************************************************************************************************************************/
		
		JLabel lblNewLabel_3 = new JLabel("測試音檔");
		lblNewLabel_3.setBounds( (screenSize.width/100)*8, (screenSize.height/100)*38, 150, 30);
		lblNewLabel_3.setFont(new Font("標楷體", Font.PLAIN, 25));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Test Stimuli");
		lblNewLabel_4.setBounds( (screenSize.width/100)*6, (screenSize.height/101)*43, 200, 30);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_4);
		
		/****************************    按鈕7        ************************************/
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_2.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_2.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton_2.setBounds((screenSize.width/100)*25+10, (screenSize.height/100)*38, 100, 80);
		btnNewButton_2.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNewButton_2.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setContentAreaFilled(false);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_11= new JLabel("粗糙聲評分");
		lblNewLabel_11.setBounds((screenSize.width/100)*34, (screenSize.height/100)*39, (screenSize.width/9), 30);
		lblNewLabel_11.setFont(new Font("標楷體", Font.PLAIN, 25));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Roughness");
		lblNewLabel_12.setBounds((screenSize.width/100)*34, (screenSize.height/100)*44, (screenSize.width/9), 30);
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_12);
		/*****************************************************/

		
		
		/*******************************************************************************************************/
		
		
		lblNewLabel_25.setBounds((screenSize.width/100)*82, (screenSize.height/100)*39, 90, 40);
		lblNewLabel_25.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
		frame.getContentPane().add(lblNewLabel_25);
			
		
		JButton btnNewButton23 = new JButton("");
		btnNewButton23.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton23.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton23.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});
		btnNewButton23.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton23.setBounds((screenSize.width/100)*91, (screenSize.height/100)*38, 80, 60);
		btnNewButton23.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNewButton23.setContentAreaFilled(false); 
		btnNewButton23.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(btnNewButton23);
		
		/*****************************************************************************************************************/
		/******************  第三行  **************************/
		
		JLabel lblNewLabel_13 = new JLabel("\u6C23\u606F\u8072\u807D\u89BA\u9328");
		lblNewLabel_13.setFont(new Font("標楷體", Font.PLAIN, 25));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBounds( (screenSize.width/100)*8, (screenSize.height/100)*60, 150, 30);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Breathiness Anchor");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setBounds( (screenSize.width/100)*6, (screenSize.height/100)*65, 220, 30);
		frame.getContentPane().add(lblNewLabel_14);
		
		
		/****************************    按鈕8         ************************************/
		JButton btnNewButton7 = new JButton("");
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton7.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton7.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton7.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});
		btnNewButton7.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton7.setBounds((screenSize.width/100)*26, (screenSize.height/100)*60, 85, 60);
		btnNewButton7.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNewButton7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton7.setContentAreaFilled(false); 
		frame.getContentPane().add(btnNewButton7);
		
		JLabel lblNewLabel_15 = new JLabel("0");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel_15.setBounds((screenSize.width/100)*26, (screenSize.height/100)*69, 85, 26);
		frame.getContentPane().add(lblNewLabel_15);
		
		JLabel lblNewLabel_32 = new JLabel();
		lblNewLabel_32.setOpaque(true);
		lblNewLabel_32.setBounds((screenSize.width/100)*35, (screenSize.height/100)*60, 2, 90);
		lblNewLabel_32.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_32);
		
		/****************************    按鈕9         ************************************/
		JButton btnNewButton8 = new JButton("");
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton8.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton8.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton8.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});
		btnNewButton8.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton8.setBounds((screenSize.width/100)*39, (screenSize.height/100)*60, 85, 60);
		btnNewButton8.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNewButton8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton8.setContentAreaFilled(false); 
		frame.getContentPane().add(btnNewButton8);
		
		JLabel lblNewLabel_16 = new JLabel("1");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel_16.setBounds((screenSize.width/100)*39, (screenSize.height/100)*69, 85, 26);
		frame.getContentPane().add(lblNewLabel_16);

		JLabel lblNewLabel_33 = new JLabel();
		lblNewLabel_33.setOpaque(true);
		lblNewLabel_33.setBounds((screenSize.width/100)*48, (screenSize.height/100)*60, 2, 90);
		lblNewLabel_33.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_33);
		
		/****************************    按鈕10        ************************************/
		JButton btnNewButton9 = new JButton("");
		btnNewButton9.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton9.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton9.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});
		btnNewButton9.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton9.setBounds((screenSize.width/100)*52, (screenSize.height/100)*60, 85, 60);
		btnNewButton9.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNewButton9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton9.setContentAreaFilled(false); 
		frame.getContentPane().add(btnNewButton9);
		
		JLabel lblNewLabel_17 = new JLabel("1.5");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel_17.setBounds((screenSize.width/100)*52, (screenSize.height/100)*69, 85, 26);
		frame.getContentPane().add(lblNewLabel_17);

		JLabel lblNewLabel_34 = new JLabel();
		lblNewLabel_34.setOpaque(true);
		lblNewLabel_34.setBounds((screenSize.width/100)*61, (screenSize.height/100)*60, 2, 90);
		lblNewLabel_34.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_34);
		
		/****************************    按鈕11         ************************************/
		JButton btnNewButton10 = new JButton("");
		btnNewButton10.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton10.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton10.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});
		btnNewButton10.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton10.setBounds((screenSize.width/100)*65, (screenSize.height/100)*60, 85, 60);
		btnNewButton10.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNewButton10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton10.setContentAreaFilled(false); 
		frame.getContentPane().add(btnNewButton10);
		
		JLabel lblNewLabel_18 = new JLabel("2");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel_18.setBounds((screenSize.width/100)*65, (screenSize.height/100)*69, 85, 26);
		frame.getContentPane().add(lblNewLabel_18);

		JLabel lblNewLabel_35 = new JLabel();
		lblNewLabel_35.setOpaque(true);
		lblNewLabel_35.setBounds((screenSize.width/100)*74, (screenSize.height/100)*60, 2, 90);
		lblNewLabel_35.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_35);
		
		/****************************    按鈕12        ************************************/
		JButton btnNewButton11 = new JButton("");
		btnNewButton11.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton11.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton11.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});
		btnNewButton11.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton11.setBounds((screenSize.width/100)*78, (screenSize.height/100)*60, 85, 60);
		btnNewButton11.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNewButton11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton11.setContentAreaFilled(false); 
		frame.getContentPane().add(btnNewButton11);
		
		JLabel lblNewLabel_19 = new JLabel("2.5");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel_19.setBounds((screenSize.width/100)*78, (screenSize.height/100)*69, 85, 26);
		frame.getContentPane().add(lblNewLabel_19);

		JLabel lblNewLabel_36 = new JLabel();
		lblNewLabel_36.setOpaque(true);
		lblNewLabel_36.setBounds((screenSize.width/100)*87, (screenSize.height/100)*60, 2, 90);
		lblNewLabel_36.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_36);
		
		/****************************    按鈕13        ************************************/
		JButton btnNewButton12 = new JButton("");
		btnNewButton12.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton12.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton12.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});
		btnNewButton12.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton12.setBounds((screenSize.width/100)*91, (screenSize.height/100)*60, 85, 60);
		btnNewButton12.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNewButton12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton12.setContentAreaFilled(false); 
		frame.getContentPane().add(btnNewButton12);

		JLabel lblNewLabel_20 = new JLabel("3");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel_20.setBounds((screenSize.width/100)*91, (screenSize.height/100)*69, 85, 26);
		frame.getContentPane().add(lblNewLabel_20);

		/**********************************************************************************************************************************************************************************************************/
		/************************************************************************************************  第四行  ************************************************************************************************/
		/**********************************************************************************************************************************************************************************************************/
		
		JLabel lblNewLabel_21 = new JLabel("測試音檔");
		lblNewLabel_21.setBounds( (screenSize.width/100)*8, (screenSize.height/100)*75, 150, 30);
		lblNewLabel_21.setFont(new Font("標楷體", Font.PLAIN, 25));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Test Stimuli");
		lblNewLabel_22.setBounds( (screenSize.width/100)*6, (screenSize.height/100)*80, 200, 30);
		lblNewLabel_22.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_22);
		

		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_13.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_13.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});
		btnNewButton_13.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton_13.setBounds((screenSize.width/100)*25+10, (screenSize.height/100)*75, 100, 80);
		btnNewButton_13.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_13.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNewButton_13.setContentAreaFilled(false);
		btnNewButton_13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(btnNewButton_13);
		
		JLabel lblNewLabel_23= new JLabel("\u6C23\u606F\u8072\u8A55\u5206");
		lblNewLabel_23.setBounds((screenSize.width/100)*34, (screenSize.height/100)*76, (screenSize.width/9), 30);
		lblNewLabel_23.setFont(new Font("標楷體", Font.PLAIN, 25));
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Breathiness");
		lblNewLabel_24.setBounds((screenSize.width/100)*34, (screenSize.height/100)*81, (screenSize.width/9), 30);
		lblNewLabel_24.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_24);
		

		/*****************************************************/
		/*****************************************************/
		
		
		/******************************************************************************************************/

		/*******************************************************************************************************/
		
		lblNewLabel33.setBounds((screenSize.width/100)*82, (screenSize.height/100)*76, 90, 40);
		lblNewLabel33.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
		frame.getContentPane().add(lblNewLabel33);
		
		JLabel lblNewLabel22 = new JLabel("\u5EFA\u8B70\u7B54\u6848");
		lblNewLabel22.setFont(new Font("標楷體", Font.BOLD, 23));
		lblNewLabel22.setBounds((screenSize.width/100)*82, (screenSize.height/100)*46, 120, 30);
		lblNewLabel22.setOpaque(true);
		lblNewLabel22.setBackground(SystemColor.control);
		frame.getContentPane().add(lblNewLabel22);
		
		
		JButton btnNewButton24 = new JButton("");
		btnNewButton24.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton24.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton24.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});
		btnNewButton24.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton24.setBounds((screenSize.width/100)*91, (screenSize.height/100)*75, 80, 60);
		btnNewButton24.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNewButton24.setContentAreaFilled(false); 
		btnNewButton24.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(btnNewButton24);
		
		/*****************************************************************************************************************/
		ImageIcon icon = new ImageIcon(".\\.\\img\\77.jpg");
		JButton btn = new JButton("",icon);
		btn.setHorizontalAlignment(SwingConstants.CENTER);
		btn.setFont(new Font("標楷體", Font.PLAIN, 30));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					if(count < 12) {
						count++;
						lblNewLabel.setIcon(new ImageIcon(".\\.\\img\\C"+count+".jpg"));
					}else {
						page12.main(null);
						first++;
						frame.setVisible(false);
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
		btn.setBounds( (screenSize.width/20)*7, (screenSize.height/100)*90, 550,120);
		btn.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, SystemColor.control));
		frame.getContentPane().add(btn);
		
		JLabel lblNewLabel_31 = new JLabel("\u5EFA\u8B70\u7B54\u6848");
		lblNewLabel_31.setFont(new Font("標楷體", Font.BOLD, 23));
		lblNewLabel_31.setBounds((screenSize.width/100)*82, (screenSize.height/100)*46, 120, 30);
		lblNewLabel_31.setOpaque(true);
		lblNewLabel_31.setBackground(SystemColor.control);
		frame.getContentPane().add(lblNewLabel_31);

		
	}
} 