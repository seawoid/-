package windowbuilder;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import sun.audio.*; // 引 入sun.audio 包
import java.io.*;

import java.util.TimerTask;

import sun.audio.*;

import javax.swing.Timer;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicSliderUI;
import javax.swing.JSlider;

public class music {
	static double[] sum = new double[100];
	static int page = 0;
	static int i = 0;
	static int n; //judge yes(0) or n(1) 
	int count = 7,ts_count = 7,sec;
	JSlider slider,slider_1;
	double[] value = new double[12];
	JButton btn;
	int Mp = 0,Mp2 = 0;
	Timer timer,timer2;
	TimerTask timertaskb2;
	JButton btnNewButton_1,btnNewButton_63;
	
	static JFrame frame;		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					music window = new music();
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
	public music() {
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
		

		/*********************************  第一行  ********************************************/
		JLabel lblNewLabel = new JLabel("練習題");
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 60));
		lblNewLabel.setBounds( (screenSize.width/100)*6, (screenSize.height/100)*7, (screenSize.width/100)*50, 52);
		frame.getContentPane().add(lblNewLabel);
	
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
		btnNewButton.setIcon(new ImageIcon(".\\.\\img\\2.png"));
		btnNewButton.setBounds((screenSize.width/100)*34+5, (screenSize.height/100)*25, 50, 35);
		btnNewButton.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton);		

		JLabel lblNewLabel_26 = new JLabel();
		lblNewLabel_26.setOpaque(true);
		lblNewLabel_26.setBounds((screenSize.width/100)*39, (screenSize.height/100)*22, 2, 90);
		lblNewLabel_26.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_26);
		/****************************    按鈕2         ************************************/
		JButton btnNewButton1 = new JButton("");
		btnNewButton1.setIcon(new ImageIcon(".\\.\\img\\2.png"));
		btnNewButton1.setBounds((screenSize.width/100)*41+5, (screenSize.height/100)*25, 50, 35);
		btnNewButton1.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton1);
		
		JLabel lblNewLabel_27 = new JLabel();
		lblNewLabel_27.setOpaque(true);
		lblNewLabel_27.setBounds((screenSize.width/100)*46, (screenSize.height/100)*22, 2, 90);
		lblNewLabel_27.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_27);
		
		/****************************      按鈕3        ************************************/
		JButton btnNewButton3 = new JButton("");
		btnNewButton3.setIcon(new ImageIcon(".\\.\\img\\2.png"));
		btnNewButton3.setBounds((screenSize.width/100)*48+5, (screenSize.height/100)*25, 50, 35);
		btnNewButton3.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton3);
		
		JLabel lblNewLabel_28 = new JLabel();
		lblNewLabel_28.setOpaque(true);
		lblNewLabel_28.setBounds((screenSize.width/100)*53, (screenSize.height/100)*22, 2, 90);
		lblNewLabel_28.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_28);
		
		/****************************    按鈕4         ************************************/
		JButton btnNewButton4 = new JButton("");
		btnNewButton4.setIcon(new ImageIcon(".\\.\\img\\2.png"));
		btnNewButton4.setBounds((screenSize.width/100)*55+5, (screenSize.height/100)*25, 50, 35);
		btnNewButton4.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton4);
		
		JLabel lblNewLabel_29 = new JLabel();
		lblNewLabel_29.setOpaque(true);
		lblNewLabel_29.setBounds((screenSize.width/100)*60, (screenSize.height/100)*22, 2, 90);
		lblNewLabel_29.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_29);
		
		/****************************    按鈕5         ************************************/
		JButton btnNewButton5 = new JButton("");
		btnNewButton5.setIcon(new ImageIcon(".\\.\\img\\2.png"));
		btnNewButton5.setBounds((screenSize.width/100)*62+5, (screenSize.height/100)*25, 50, 35);
		btnNewButton5.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton5);
		
		JLabel lblNewLabel_30 = new JLabel();
		lblNewLabel_30.setOpaque(true);
		lblNewLabel_30.setBounds((screenSize.width/100)*67, (screenSize.height/100)*22, 2, 90);
		lblNewLabel_30.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_30);
		
		/****************************    按鈕6         ************************************/
		JButton btnNewButton6 = new JButton("");
		btnNewButton6.setIcon(new ImageIcon(".\\.\\img\\2.png"));
		btnNewButton6.setBounds((screenSize.width/100)*69+5, (screenSize.height/100)*25, 50, 35);		
		btnNewButton6.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton6);
		
		/**********************************************************************************************************************************************************************************************************/
		/************************************************************************************************  第二行  ************************************************************************************************/
		/**********************************************************************************************************************************************************************************************************/
		
		JLabel lblNewLabel_3 = new JLabel("測試音檔");
		lblNewLabel_3.setBounds( (screenSize.width/100)*8, (screenSize.height/100)*38, 150, 30);
		lblNewLabel_3.setFont(new Font("標楷體", Font.PLAIN, 25));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Test Stimuli");
		lblNewLabel_4.setBounds( (screenSize.width/100)*6, (screenSize.height/101)*43, 230, 30);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_4);
		
		/****************************    按鈕7        ************************************/
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		/*btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_2.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_2.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});*/
		btnNewButton_2.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton_2.setBounds((screenSize.width/100)*20, (screenSize.height/100)*38, 100, 80);
		//btnNewButton_2.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setContentAreaFilled(false);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_11= new JLabel("正常");
		lblNewLabel_11.setBounds((screenSize.width/100)*24, (screenSize.height/100)*39, (screenSize.width/9), 30);
		lblNewLabel_11.setFont(new Font("標楷體", Font.PLAIN, 25));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Normal");
		lblNewLabel_12.setBounds((screenSize.width/100)*24, (screenSize.height/100)*43, (screenSize.width/9), 30);
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_40= new JLabel("嚴重粗糙聲");
		lblNewLabel_40.setBounds((screenSize.width/100)*75, (screenSize.height/100)*39, (screenSize.width/9), 30);
		lblNewLabel_40.setFont(new Font("標楷體", Font.PLAIN, 25));
		lblNewLabel_40.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_40);
		
		JLabel lblNewLabel_41 = new JLabel("Severe roughness");
		lblNewLabel_41.setBounds((screenSize.width/100)*75, (screenSize.height/100)*43, (screenSize.width/9), 30);
		lblNewLabel_41.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_41.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_41);
		
		btnNewButton_1 = new JButton("確定答案");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, new JLabel("<html><font color='black'; size='8'; face='DFKai-sb'; align='center'>請注意：選擇後不能更改<br><br></font></html>"),"",JOptionPane.PLAIN_MESSAGE);
				if(slider.getValue() > 0){
					slider.setEnabled(false);
					btnNewButton_1.setEnabled(false);
					timer.stop();
					timer2.start();
				}
			}
		});
		btnNewButton_1.setBackground(Color.white);
		btnNewButton_1.setFont(new Font("標楷體", Font.PLAIN, 25));
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds((screenSize.width/100)*87, (screenSize.height/100)*40, 150, 40);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(btnNewButton_1);
		
		
		/********************************************************************  第三行  **************************/
		
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
		JButton btnNewButton_50 = new JButton("");
		btnNewButton_50.setIcon(new ImageIcon(".\\.\\img\\2.png"));
		btnNewButton_50.setBounds((screenSize.width/100)*34+5, (screenSize.height/100)*62, 50, 35);
		btnNewButton_50.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton_50);		

		JLabel lblNewLabel_51 = new JLabel();
		lblNewLabel_51.setOpaque(true);
		lblNewLabel_51.setBounds((screenSize.width/100)*39, (screenSize.height/100)*59, 2, 90);
		lblNewLabel_51.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_51);
		
		/****************************    按鈕9         ************************************/
		JButton btnNewButton_52 = new JButton("");
		btnNewButton_52.setIcon(new ImageIcon(".\\.\\img\\2.png"));
		btnNewButton_52.setBounds((screenSize.width/100)*41+5, (screenSize.height/100)*62, 50, 35);
		btnNewButton_52.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton_52);
		
		JLabel lblNewLabel_53 = new JLabel();
		lblNewLabel_53.setOpaque(true);
		lblNewLabel_53.setBounds((screenSize.width/100)*46, (screenSize.height/100)*59, 2, 90);
		lblNewLabel_53.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_53);
		
		/****************************      按鈕10        ************************************/
		JButton btnNewButton_54 = new JButton("");
		btnNewButton_54.setIcon(new ImageIcon(".\\.\\img\\2.png"));
		btnNewButton_54.setBounds((screenSize.width/100)*48+5, (screenSize.height/100)*62, 50, 35);
		btnNewButton_54.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton_54);
		
		JLabel lblNewLabel_55 = new JLabel();
		lblNewLabel_55.setOpaque(true);
		lblNewLabel_55.setBounds((screenSize.width/100)*53, (screenSize.height/100)*59, 2, 90);
		lblNewLabel_55.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_55);
		
		/****************************    按鈕11         ************************************/
		JButton btnNewButton_56 = new JButton("");
		btnNewButton_56.setIcon(new ImageIcon(".\\.\\img\\2.png"));
		btnNewButton_56.setBounds((screenSize.width/100)*55+5, (screenSize.height/100)*62, 50, 35);
		btnNewButton_56.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton_56);
		
		JLabel lblNewLabel_57 = new JLabel();
		lblNewLabel_57.setOpaque(true);
		lblNewLabel_57.setBounds((screenSize.width/100)*60, (screenSize.height/100)*59, 2, 90);
		lblNewLabel_57.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_57);
		
		/****************************    按鈕12         ************************************/
		JButton btnNewButton_58 = new JButton("");
		btnNewButton_58.setIcon(new ImageIcon(".\\.\\img\\2.png"));
		btnNewButton_58.setBounds((screenSize.width/100)*62+5, (screenSize.height/100)*62, 50, 35);
		btnNewButton_58.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton_58);
		
		JLabel lblNewLabel_59 = new JLabel();
		lblNewLabel_59.setOpaque(true);
		lblNewLabel_59.setBounds((screenSize.width/100)*67, (screenSize.height/100)*59, 2, 90);
		lblNewLabel_59.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_59);
		
		/****************************    按鈕6         ************************************/
		JButton btnNewButton_60 = new JButton("");
		btnNewButton_60.setIcon(new ImageIcon(".\\.\\img\\2.png"));
		btnNewButton_60.setBounds((screenSize.width/100)*69+5, (screenSize.height/100)*62, 50, 35);		
		btnNewButton_60.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton_60);

		/**********************************************************************************************************************************************************************************************************/
		/************************************************************************************************  第四行  ************************************************************************************************/
		/**********************************************************************************************************************************************************************************************************/
		
		JLabel lblNewLabel_21 = new JLabel("測試音檔");
		lblNewLabel_21.setBounds( (screenSize.width/100)*8, (screenSize.height/100)*75, 150, 30);
		lblNewLabel_21.setFont(new Font("標楷體", Font.PLAIN, 25));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Test Stimuli");
		lblNewLabel_22.setBounds( (screenSize.width/100)*6, (screenSize.height/100)*80, 230, 30);
		lblNewLabel_22.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_22);
		
		JButton btnNewButton_20 = new JButton("");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		/*btnNewButton_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_20.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_20.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});*/
		btnNewButton_20.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton_20.setBounds((screenSize.width/100)*20, (screenSize.height/100)*75, 100, 80);
		btnNewButton_20.setBorderPainted(false);
		btnNewButton_20.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_20.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_20.setContentAreaFilled(false);
		frame.getContentPane().add(btnNewButton_20);
		
		JLabel lblNewLabel_20= new JLabel("正常");
		lblNewLabel_20.setBounds((screenSize.width/100)*24, (screenSize.height/100)*76, (screenSize.width/9), 30);
		lblNewLabel_20.setFont(new Font("標楷體", Font.PLAIN, 25));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_20);
		
		JLabel lblNewLabel_60 = new JLabel("Normal");
		lblNewLabel_60.setBounds((screenSize.width/100)*24, (screenSize.height/100)*80, (screenSize.width/9), 30);
		lblNewLabel_60.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_60.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_60);
		
		JLabel lblNewLabel_61= new JLabel("嚴重氣息聲");
		lblNewLabel_61.setBounds((screenSize.width/100)*75, (screenSize.height/100)*76, (screenSize.width/9), 30);
		lblNewLabel_61.setFont(new Font("標楷體", Font.PLAIN, 25));
		lblNewLabel_61.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_61);
		
		JLabel lblNewLabel_62 = new JLabel("Severe breathiness");
		lblNewLabel_62.setBounds((screenSize.width/100)*75, (screenSize.height/100)*80, (screenSize.width/9), 30);
		lblNewLabel_62.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_62.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_62);
		
		btnNewButton_63 = new JButton("確定答案");
		btnNewButton_63.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, new JLabel("<html><font color='black'; size='8'; face='DFKai-sb'; align='center'>請注意：選擇後不能更改<br><br></font></html>"),"",JOptionPane.PLAIN_MESSAGE);
				if(!slider.isEnabled() && slider_1.getValue() > 0){
					btn.setEnabled(true);
					slider_1.setEnabled(false);
					btnNewButton_63.setEnabled(false);
				}
				timer2.stop();
			}
		});
		btnNewButton_63.setBackground(Color.white);
		btnNewButton_63.setFont(new Font("標楷體", Font.PLAIN, 25));
		btnNewButton_63.setEnabled(false);
		btnNewButton_63.setBounds((screenSize.width/100)*87, (screenSize.height/100)*77, 150, 40);
		btnNewButton_63.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(btnNewButton_63);
		

		/*************************************************************************************************************************************************************
		 * 下一頁按鍵 
		 *************************************************************************************************************************************************************/
		ImageIcon icon = new ImageIcon(".\\.\\img\\77.jpg");
		btn = new JButton("<html>如有問題可以舉手詢問研究人員<br>" + 
				"如果沒有問題, 請按按鈕前往正式測試</html>",icon);
		btn.setHorizontalAlignment(SwingConstants.CENTER);
		btn.setFont(new Font("標楷體", Font.PLAIN, 30));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
							page4.main(null);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
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
		btn.setEnabled(false);
		btn.setBounds( 672, 900, 647,120);
		btn.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, SystemColor.control));
		frame.getContentPane().add(btn);
		
		timer = new Timer(2000,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//音檔播放 Anchor
				FileInputStream in;
				String filename = "";
				File find;
				
				if(count >= 0) {
					try {
						if(count == 7) {
							btnNewButton.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/R" + 0 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							
							
						}
						if(count == 6) {
							btnNewButton.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton1.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/R" + 1 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							
						}
						if(count == 5) {
							btnNewButton1.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton3.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/R" + 1.5 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							
						}
						if(count == 4) {
							btnNewButton3.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton4.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/R" + 2 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							
						}
						if(count == 3) {
							btnNewButton4.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton5.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/R" + 2.5 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							
						}
						if(count == 2) {
							btnNewButton5.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton6.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/R" + 3 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							
						}
						if(count == 1){
							btnNewButton6.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton_2.setIcon(new ImageIcon(".\\.\\img\\1r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/L1.wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							sec = as.getLength()/(1411000/8);
							
						}
						if(count == 0) {
							if(Mp == sec/2) {
								btnNewButton_2.setIcon(new ImageIcon(".\\.\\img\\1.png"));
								slider.setEnabled(true);
							}
							
							Mp++;
							
							if(slider.getValue() > 0){
								btnNewButton_1.setEnabled(true);
							}
						}
						
					} catch (Exception e1) {
						// TODO 自動產生的 catch 區塊
						e1.printStackTrace();
					}
					if(count > 0) {
						count--;
					}
					
				}
			}
			
		});
		timer.start();
		
		
		timer2 = new Timer(2000,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				FileInputStream in;
				String filename = "";
				File find;
				if(ts_count >= 0 && count == 0) {
					try {
						if(ts_count == 7) {
							btnNewButton_50.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/B" + 0 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							
						}
						if(ts_count == 6) {
							btnNewButton_50.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton_52.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/B" + 1 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							
						}
						if(ts_count == 5) {
							btnNewButton_52.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton_54.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/B" + 1.5 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							
						}
						if(ts_count == 4) {
							btnNewButton_54.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton_56.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/B" + 2 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							
						}
						if(ts_count == 3) {
							btnNewButton_56.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton_58.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/B" + 2.5 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							
						}
						if(ts_count == 2) {
							btnNewButton_58.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton_60.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/B" + 3 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							
						}
						
						if(ts_count == 1){
							btnNewButton_60.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton_20.setIcon(new ImageIcon(".\\.\\img\\1r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/L1.wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							sec = as.getLength()/(1411000/8);
							
						}
						if(ts_count == 0) {
							if(Mp2 == sec/2) {
								btnNewButton_20.setIcon(new ImageIcon(".\\.\\img\\1.png"));
								slider_1.setEnabled(true);
							}
							Mp2++;
							
							if(slider_1.getValue() > 0){
								btnNewButton_63.setEnabled(true);
							}
						}
					} catch (Exception e) {
						// TODO 自動產生的 catch 區塊
						e.printStackTrace();
					}
					if(ts_count > 0) {
						ts_count--;
					}
				}
			}
			
		});
		
		slider = new JSlider();
		slider.setValue(0);
		slider.setEnabled(false);
		slider.setUI(new javax.swing.plaf.basic.BasicSliderUI(slider));
		slider.setBounds((screenSize.width/100)*33, (screenSize.height/100)*38, (screenSize.width/100)*40, 80);
		frame.getContentPane().add(slider);
		
		
		slider_1 = new JSlider();
		slider_1.setValue(0);
		slider_1.setEnabled(false);
		slider_1.setUI(new javax.swing.plaf.basic.BasicSliderUI(slider));
		slider_1.setBounds((screenSize.width/100)*33, (screenSize.height/100)*75, (screenSize.width/100)*40, 80);
		frame.getContentPane().add(slider_1);
		
		
		
	}
} 