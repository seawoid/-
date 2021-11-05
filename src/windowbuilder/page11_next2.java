package windowbuilder;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicSliderUI;
import javax.swing.Timer;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TimerTask;
import java.awt.SystemColor;
import javax.swing.JCheckBox;

public class page11_next2 {
	static long Time, Time1; //run of time (ms)
	double sum = 0;
	int i = 0,Mp = 0, Mp2 = 0;
	int count =1,count2 = 7,ts_count = 7;
	int n,sec,mark = 0, click = 0,click2 = 0, click3 = 0,click4 = 0, click5 = 0,click6 = 0;
	int click7 = 0,click8 = 0, click9 = 0,click10 = 0, click11 = 0,click12 = 0;
	double[] value = new double[12];
	Timer timer,timer2;
	TimerTask timertaskb2;
	JSlider slider,slider_1;
	String Ans;
	JFrame frame;		
	Clip clip;
	File fileout;
	JButton btnNewButton_4,btnNewButton_3,btnNewButton,btnNewButton1,btnNewButton3,btnNewButton4,btnNewButton5,btnNewButton6,btnNewButton_50,btnNewButton_52,btnNewButton_54,btnNewButton_56,btnNewButton_58,btnNewButton_60;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page11_next2 window = new page11_next2();
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
	public page11_next2() {
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
		}else if(page12.page == 4) {
			lblNewLabel.setIcon(new ImageIcon(".\\.\\img\\F"+count+".jpg"));
		}
		
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
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FileInputStream in;
				if(click < 5 && btnNewButton_4.isEnabled()) {
					btnNewButton1.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton3.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton4.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton5.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton6.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
					try {
						in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/R" + 0 +".wav");
						AudioStream as = new AudioStream(in);
						AudioPlayer.player.start(as);
						sec = as.getLength()/(1411000/8);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					click++;
				}
			}
		});
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
		btnNewButton1 = new JButton("");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileInputStream in;
				if(click2 < 5 && btnNewButton_4.isEnabled()) {
					btnNewButton.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton3.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton4.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton5.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton6.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton1.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
					try {
						in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/R" + 1 +".wav");
						AudioStream as = new AudioStream(in);
						AudioPlayer.player.start(as);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					click2++;
				}
			}
		});
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
		btnNewButton3 = new JButton("");
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileInputStream in;
				if(click3 < 5 && btnNewButton_4.isEnabled()) {
					btnNewButton.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton1.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton4.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton5.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton6.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton3.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
					try {
						in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/R" + 1.5 +".wav");
						AudioStream as = new AudioStream(in);
						AudioPlayer.player.start(as);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					click3++;
				}
			}
		});
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
		btnNewButton4 = new JButton("");
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileInputStream in;
				if(click4 < 5 && btnNewButton_4.isEnabled()) {
					btnNewButton.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton1.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton3.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton5.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton6.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton4.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
					try {
						in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/R" + 2 +".wav");
						AudioStream as = new AudioStream(in);
						AudioPlayer.player.start(as);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					click4++;
				}
			}
		});
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
		btnNewButton5 = new JButton("");
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileInputStream in;
				if(click5 < 5 && btnNewButton_4.isEnabled()) {
					btnNewButton.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton1.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton3.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton4.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton6.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton5.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
					try {
						in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/R" + 2.5 +".wav");
						AudioStream as = new AudioStream(in);
						AudioPlayer.player.start(as);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					click5++;
				}
			}
		});
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
		btnNewButton6 = new JButton("");
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileInputStream in;
				if(click6 < 5 && btnNewButton_4.isEnabled()) {
					btnNewButton.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton1.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton3.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton4.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton5.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton6.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
					try {
						in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/R" + 3 +".wav");
						AudioStream as = new AudioStream(in);
						AudioPlayer.player.start(as);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					click6++;
				}
			}
		});
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
		lblNewLabel_4.setBounds( (screenSize.width/100)*6, (screenSize.height/101)*43, 200, 30);
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
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setFont(new Font("標楷體", Font.PLAIN, 25));
		btnNewButton_1.setBounds(1806, 380, 100, 80);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(btnNewButton_1);
		
		
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
		btnNewButton_50 = new JButton("");
		btnNewButton_50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileInputStream in;
				if(click7 < 5 && btnNewButton_3.isEnabled()) {
					btnNewButton_52.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_54.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_56.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_58.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_60.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_50.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
					try {
						in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/B" + 0 +".wav");
						AudioStream as = new AudioStream(in);
						AudioPlayer.player.start(as);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					click7++;
				}
			}
		});
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
		btnNewButton_52 = new JButton("");
		btnNewButton_52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileInputStream in;
				if(click8 < 5 && btnNewButton_3.isEnabled()) {
					btnNewButton_50.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_54.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_56.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_58.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_60.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_52.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
					try {
						in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/B" + 1 +".wav");
						AudioStream as = new AudioStream(in);
						AudioPlayer.player.start(as);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					click8++;
				}
			}
		});
		btnNewButton_52.setIcon(new ImageIcon(".\\.\\img\\2.png"));
		btnNewButton_52.setBounds((screenSize.width/100)*41+5, (screenSize.height/100)*62, 50, 35);
		btnNewButton_52.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton_52);
		
		JLabel lblNewLabel_53 = new JLabel();
		lblNewLabel_53.setOpaque(true);
		lblNewLabel_53.setBounds((screenSize.width/100)*46, (screenSize.height/100)*59, 2, 90);
		lblNewLabel_53.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_53);
		
		/****************************    按鈕10        ************************************/
		btnNewButton_54 = new JButton("");
		btnNewButton_54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileInputStream in;
				if(click9 < 5 && btnNewButton_3.isEnabled()) {
					btnNewButton_50.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_52.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_56.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_58.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_60.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_54.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
					try {
						in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/B" + 1.5 +".wav");
						AudioStream as = new AudioStream(in);
						AudioPlayer.player.start(as);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					click9++;
				}
			}
		});
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
		btnNewButton_56 = new JButton("");
		btnNewButton_56.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileInputStream in;
				if(click10 < 5 && btnNewButton_3.isEnabled()) {
					btnNewButton_50.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_52.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_54.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_58.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_60.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_56.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
					try {
						in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/B" + 2 +".wav");
						AudioStream as = new AudioStream(in);
						AudioPlayer.player.start(as);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					click10++;
				}
			}
		});
		btnNewButton_56.setIcon(new ImageIcon(".\\.\\img\\2.png"));
		btnNewButton_56.setBounds((screenSize.width/100)*55+5, (screenSize.height/100)*62, 50, 35);
		btnNewButton_56.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton_56);
		
		JLabel lblNewLabel_57 = new JLabel();
		lblNewLabel_57.setOpaque(true);
		lblNewLabel_57.setBounds((screenSize.width/100)*60, (screenSize.height/100)*59, 2, 90);
		lblNewLabel_57.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_57);
		
		/****************************    按鈕12        ************************************/
		btnNewButton_58 = new JButton("");
		btnNewButton_58.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileInputStream in;
				if(click11 < 5 && btnNewButton_3.isEnabled()) {
					btnNewButton_50.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_52.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_54.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_56.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_60.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_58.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
					try {
						in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/B" + 2.5 +".wav");
						AudioStream as = new AudioStream(in);
						AudioPlayer.player.start(as);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					click11++;
				}
			}
		});
		btnNewButton_58.setIcon(new ImageIcon(".\\.\\img\\2.png"));
		btnNewButton_58.setBounds((screenSize.width/100)*62+5, (screenSize.height/100)*62, 50, 35);
		btnNewButton_58.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton_58);
		
		JLabel lblNewLabel_59 = new JLabel();
		lblNewLabel_59.setOpaque(true);
		lblNewLabel_59.setBounds((screenSize.width/100)*67, (screenSize.height/100)*59, 2, 90);
		lblNewLabel_59.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblNewLabel_59);
		
		/****************************    按鈕13        ************************************/
		btnNewButton_60 = new JButton("");
		btnNewButton_60.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileInputStream in;
				if(click12 < 5 && btnNewButton_3.isEnabled()) {
					btnNewButton_50.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_52.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_54.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_56.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_58.setIcon(new ImageIcon(".\\.\\img\\2.png"));
					btnNewButton_60.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
					try {
						in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/B" + 3 +".wav");
						AudioStream as = new AudioStream(in);
						AudioPlayer.player.start(as);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					click12++;
				}
			}
		});
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
		lblNewLabel_22.setBounds( (screenSize.width/100)*6, (screenSize.height/100)*80, 200, 30);
		lblNewLabel_22.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_22);
		

		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		/*btnNewButton_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_13.setBorder(BorderFactory.createLoweredBevelBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_13.setBorder(BorderFactory.createRaisedBevelBorder());
			}
		});*/
		btnNewButton_13.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton_13.setBounds((screenSize.width/100)*20, (screenSize.height/100)*75, 100, 80);
		btnNewButton_13.setHorizontalAlignment(SwingConstants.CENTER);
		//btnNewButton_13.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNewButton_13.setBorderPainted(false);
		btnNewButton_13.setContentAreaFilled(false);
		btnNewButton_13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(btnNewButton_13);
		
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
		
		JButton btnNewButton_63 = new JButton("");
		btnNewButton_63.setIcon(new ImageIcon(".\\.\\img\\1.png"));
		btnNewButton_63.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_63.setFont(new Font("標楷體", Font.PLAIN, 25));
		btnNewButton_63.setBounds(1806, 750, 100, 80);
		btnNewButton_63.setBorderPainted(false);
		btnNewButton_63.setContentAreaFilled(false);
		btnNewButton_63.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(btnNewButton_63);
		
		
		
		/*****************************************************************************************************************/
		//下一題
		ImageIcon icon = new ImageIcon(".\\.\\img\\77.jpg");
		JButton btn = new JButton("下一題",icon);
		btn.setHorizontalAlignment(SwingConstants.CENTER);
		btn.setFont(new Font("標楷體", Font.PLAIN, 30));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mp = 0;
				Mp2 = 0;
				mark = 0;
				count2 = 7;
				ts_count = 7;
				click = 0;
				click2 = 0;
				click3 = 0;
				click4 = 0; 
				click5 = 0;
				click6 = 0;
				click7 = 0;
				click8 = 0;
				click9 = 0;
				click10 = 0;
				click11 = 0;
				click12 = 0;
				if(count < 12) {
					timer.start();
					if(page12.page == 1) {
						fileout = new File(System.getProperty("user.dir") + "/(F組)訓練_" + page1.str + "_" + page1.strN + ".csv");
						try {
							BufferedWriter w = new BufferedWriter(new FileWriter(fileout,true));
							w.write(count + "," + slider.getValue() + "," + slider_1.getValue());
							w.newLine();
							w.flush();
							w.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else if(page12.page == 2) {
						fileout = new File(System.getProperty("user.dir") + "/(F組)訓練_" + page1.str + "_" + page1.strN + ".csv");
						try {
							BufferedWriter w = new BufferedWriter(new FileWriter(fileout,true));
							w.write(count + "," + slider.getValue() + "," + slider_1.getValue());
							w.newLine();
							w.flush();
							w.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else if(page12.page == 3) {
						fileout = new File(System.getProperty("user.dir") + "/(F組)訓練_" + page1.str + "_" + page1.strN + ".csv");
						try {
							BufferedWriter w = new BufferedWriter(new FileWriter(fileout,true));
							w.write(count + "," + slider.getValue() + "," + slider_1.getValue());
							w.newLine();
							w.flush();
							w.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else{
						fileout = new File(System.getProperty("user.dir") + "/(F組)訓練_" + page1.str + "_" + page1.strN + ".csv");
						try {
							BufferedWriter w = new BufferedWriter(new FileWriter(fileout,true));
							w.write(count + "," + slider.getValue() + "," + slider_1.getValue());
							w.newLine();
							w.flush();
							w.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					
					count++;		
					if(page12.page == 1) {
						lblNewLabel.setIcon(new ImageIcon(".\\.\\img\\C"+count+".jpg"));
					}else if(page12.page == 2) {
						lblNewLabel.setIcon(new ImageIcon(".\\.\\img\\D"+count+".jpg"));
					}else if(page12.page == 3) {
						lblNewLabel.setIcon(new ImageIcon(".\\.\\img\\E"+count+".jpg"));
					}else if(page12.page == 4){
						lblNewLabel.setIcon(new ImageIcon(".\\.\\img\\F"+count+".jpg"));
					}
				}else {
					if(page12.page == 1) {
						fileout = new File(System.getProperty("user.dir") + "/(F組)訓練_" + page1.str + "_" + page1.strN + ".csv");
						try {
							BufferedWriter w = new BufferedWriter(new FileWriter(fileout,true));
							w.write(count + "," + slider.getValue() + "," + slider_1.getValue());
							w.newLine();
							w.flush();
							w.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else if(page12.page == 2) {
						fileout = new File(System.getProperty("user.dir") + "/(F組)訓練_" + page1.str + "_" + page1.strN + ".csv");
						try {
							BufferedWriter w = new BufferedWriter(new FileWriter(fileout,true));
							w.write(count + "," + slider.getValue() + "," + slider_1.getValue());
							w.newLine();
							w.flush();
							w.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else if(page12.page == 3) {
						fileout = new File(System.getProperty("user.dir") + "/(F組)訓練_" + page1.str + "_" + page1.strN + ".csv");
						try {
							BufferedWriter w = new BufferedWriter(new FileWriter(fileout,true));
							w.write(count + "," + slider.getValue() + "," + slider_1.getValue());
							w.newLine();
							w.flush();
							w.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(page12.page == 3){
						Time1 = System.currentTimeMillis();
						Time = (Time1 - page10.Time)/1000; //(s)
						fileout = new File(System.getProperty("user.dir") + "/(F組)訓練_" + page1.str + "_" + page1.strN + ".csv");
						try {
							BufferedWriter w = new BufferedWriter(new FileWriter(fileout,true));
							w.write("共花費 " + Time + "秒");
							w.newLine();
							w.flush();
							w.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						page15.main(null);
						frame.setVisible(false);
					}else {
						count = 0;
						page12.main(null);
						frame.setVisible(false);
					}
					
				}
				slider.setValue(0);
				slider_1.setValue(0);
				slider.setEnabled(false);
				slider_1.setEnabled(false);
				slider.setUI(new BasicSliderUI(slider));
				slider_1.setUI(new BasicSliderUI(slider));
				btn.setEnabled(false);
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
		btn.setBounds( (screenSize.width/20)*7, (screenSize.height/100)*90, 550,120);
		btn.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, SystemColor.control));
		frame.getContentPane().add(btn);
		
		
		timer = new Timer(2000,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//音檔播放 Anchor
				FileInputStream in;
				String filename = "",pageNum = "訓練1";
				File find;
				if(page12.page == 1) {
					pageNum = "訓練1";
				}else if(page12.page == 2) {
					pageNum = "訓練2";
				}
				else if(page12.page == 3) {
					pageNum = "訓練3";
				}
				if(count2 >= 0) {
					try {
						if(count2 == 7) {
							btnNewButton.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/R" + 0 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							sec = as.getLength()/(1411000/8);
							
						}
						if(count2 == 6) {
							btnNewButton.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton1.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/R" + 1 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							sec = as.getLength()/(1411000/8);
						}
						if(count2 == 5) {
							btnNewButton1.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton3.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/R" + 1.5 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							sec = as.getLength()/(1411000/8);
						}
						if(count2 == 4) {
							btnNewButton3.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton4.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/R" + 2 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							sec = as.getLength()/(1411000/8);
						}
						if(count2 == 3) {
							btnNewButton4.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton5.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/R" + 2.5 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							sec = as.getLength()/(1411000/8);
						}
						if(count2 == 2) {
							btnNewButton5.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton6.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/R" + 3 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							sec = as.getLength()/(1411000/8);
						}
						if(count2 == 1){
							btnNewButton6.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton_2.setIcon(new ImageIcon(".\\.\\img\\1r.png"));
							find = new File(System.getProperty("user.dir") + "/media/" + pageNum + "/");
							try {
								if(find.isDirectory()) {
									for(String name:find.list()) {
										if(name.substring(name.indexOf("_") + 1, name.length()-4).equals(String.valueOf(count))) {
											filename = name;
											Ans = name;
											break;
										}
									}
								}
								in = new FileInputStream(System.getProperty("user.dir") + "/media/" + pageNum + "/" + filename);
								AudioStream as = new AudioStream(in);
								AudioPlayer.player.start(as);
								sec = as.getLength()/(1411000/8);
							} catch (IOException e1) {
								// TODO 自動產生的 catch 區塊
								e1.printStackTrace();
							}
						}
						if(count2 == 0) {
							if(Mp == ((sec/2)+1) && mark == 0) {
								btnNewButton_2.setIcon(new ImageIcon(".\\.\\img\\1.png"));
								slider.setEnabled(true);
								mark = 1;
								Mp2 = 0;
								btnNewButton_4.setEnabled(true);
							}
							if(Mp2 == ((sec/2)+1) && mark == 1 && !btnNewButton_4.isEnabled()) {
								btnNewButton_1.setIcon(new ImageIcon(".\\.\\img\\1.png"));
								Mp = 0;
								mark = 0;
								timer.stop();
								timer2.start();
							}
							Mp2++;
							Mp++;
						}
					} catch (Exception e1) {
						// TODO 自動產生的 catch 區塊
						e1.printStackTrace();
					}
					if(count2 > 0) {
						count2--;
					}
					
				}
			}
			
		});
		timer.start();
		
		timer2 = new Timer(2000,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//音檔播放 Anchor
				FileInputStream in;
				String filename = "",pageNum = "訓練1";
				File find;
				if(page12.page == 1) {
					pageNum = "訓練1";
				}else if(page12.page == 2) {
					pageNum = "訓練2";
				}
				else if(page12.page == 3) {
					pageNum = "訓練3";
				}
				if(ts_count >= 0) {
					try {
						if(ts_count == 7) {
							btnNewButton_50.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/B" + 0 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							sec = as.getLength()/(1411000/8);
							
						}
						if(ts_count == 6) {
							btnNewButton_50.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton_52.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/B" + 1 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							sec = as.getLength()/(1411000/8);
						}
						if(ts_count == 5) {
							btnNewButton_52.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton_54.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/B" + 1.5 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							sec = as.getLength()/(1411000/8);
						}
						if(ts_count == 4) {
							btnNewButton_54.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton_56.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/B" + 2 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							sec = as.getLength()/(1411000/8);
						}
						if(ts_count == 3) {
							btnNewButton_56.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton_58.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/B" + 2.5 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							sec = as.getLength()/(1411000/8);
						}
						if(ts_count == 2) {
							btnNewButton_58.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton_60.setIcon(new ImageIcon(".\\.\\img\\2r.png"));
							in = new FileInputStream(System.getProperty("user.dir") + "/media/Anchor/B" + 3 +".wav");
							AudioStream as = new AudioStream(in);
							AudioPlayer.player.start(as);
							sec = as.getLength()/(1411000/8);
						}
						if(ts_count == 1){
							btnNewButton_60.setIcon(new ImageIcon(".\\.\\img\\2.png"));
							btnNewButton_13.setIcon(new ImageIcon(".\\.\\img\\1r.png"));
							find = new File(System.getProperty("user.dir") + "/media/" + pageNum + "/");
							try {
								if(find.isDirectory()) {
									for(String name:find.list()) {
										if(name.substring(name.indexOf("_") + 1, name.length()-4).equals(String.valueOf(count))) {
											filename = name;
											Ans = name;
											break;
										}
									}
								}
								in = new FileInputStream(System.getProperty("user.dir") + "/media/" + pageNum + "/" + filename);
								AudioStream as = new AudioStream(in);
								AudioPlayer.player.start(as);
								sec = as.getLength()/(1411000/8);
							} catch (IOException e1) {
								// TODO 自動產生的 catch 區塊
								e1.printStackTrace();
							}
							
						}
						if(ts_count == 0) {
							if(Mp == ((sec/2)+1) && mark == 0) {
								btnNewButton_13.setIcon(new ImageIcon(".\\.\\img\\1.png"));
								slider_1.setEnabled(true);
								mark = 1;
								Mp2 = 0;
								btnNewButton_3.setEnabled(true);
							}
							if(Mp2 == ((sec/2)+1) && mark == 1 && !btnNewButton_3.isEnabled()) {
								if(Mp == (sec/2)+1) {
									btnNewButton_63.setIcon(new ImageIcon(".\\.\\img\\1.png"));
									btn.setEnabled(true);
									timer2.stop();
								}
							}
							Mp2++;
							Mp++;
						}
						
					} catch (Exception e1) {
						// TODO 自動產生的 catch 區塊
						e1.printStackTrace();
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
		slider.setBounds(651, 380, 722, 80);
		frame.getContentPane().add(slider);
		
		
		slider_1 = new JSlider();
		slider_1.setValue(0);
		slider_1.setEnabled(false);
		slider_1.setUI(new javax.swing.plaf.basic.BasicSliderUI(slider));
		slider_1.setBounds(651, 750, 722, 80);
		
		frame.getContentPane().add(slider_1);
		
		btnNewButton_3 = new JButton("確定答案");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mp = 0;
				Mp2 =0;
				final int j;
				FileInputStream in;
				String filename = "",pageNum = "訓練1";
				File find;
				
				btnNewButton_50.setIcon(new ImageIcon(".\\.\\img\\2.png"));
				btnNewButton_52.setIcon(new ImageIcon(".\\.\\img\\2.png"));
				btnNewButton_54.setIcon(new ImageIcon(".\\.\\img\\2.png"));
				btnNewButton_56.setIcon(new ImageIcon(".\\.\\img\\2.png"));
				btnNewButton_58.setIcon(new ImageIcon(".\\.\\img\\2.png"));
				btnNewButton_60.setIcon(new ImageIcon(".\\.\\img\\2.png"));
				
				if(page12.page == 1) {
					pageNum = "訓練1";
				}else if(page12.page == 2) {
					pageNum = "訓練2";
				}else if(page12.page == 3) {
					pageNum = "訓練3";
				}
				
				if(slider_1.getValue() > 0 && page12.page <= 3){
					slider_1.setEnabled(false);
					btnNewButton_3.setEnabled(false);
					btnNewButton_63.setIcon(new ImageIcon(".\\.\\img\\1r.png"));
					find = new File(System.getProperty("user.dir") + "/media/" + pageNum + "/");
					try {
						if(find.isDirectory()) {
							for(String name:find.list()) {
								if(name.substring(name.indexOf("_") + 1, name.length()-4).equals(String.valueOf(count))) {
									filename = name;
									Ans = name;
									break;
								}
							}
						}
						in = new FileInputStream(System.getProperty("user.dir") + "/media/" + pageNum + "/" + filename);
						AudioStream as = new AudioStream(in);
						AudioPlayer.player.start(as);
						sec = as.getLength()/(1411000/8);
					} catch (IOException e1) {
						// TODO 自動產生的 catch 區塊
						e1.printStackTrace();
					}
					if(Ans.contains("L")) {
						for(int i = 0; i < page1.list_L.size(); i++) {
							if(page1.list_L.get(i).toString().split(" ")[0].equals(Ans.substring(1, Ans.indexOf("_")))){
								if(((Integer.parseInt(page1.list_L.get(i).toString().split(" ")[2])+8) >= slider_1.getValue()) && ((Integer.parseInt(page1.list_L.get(i).toString().split(" ")[2])-8) <= slider_1.getValue())) {
									j = Integer.parseInt(page1.list_L.get(i).toString().split(" ")[2]);
									page12.sum2++;
									if(page12.page <3){
										slider_1.setUI(new BasicSliderUI(slider) {
											public void paintThumb(Graphics g) {
												super.paintThumb(g);
												g.setColor(Color.GREEN);
												g.fillRect((750/100)*j, thumbRect.y, thumbRect.width, thumbRect.height);
											}
										});
									}
									break;
								}else {
									j = Integer.parseInt(page1.list_L.get(i).toString().split(" ")[2]);
									if(page12.page < 3) {
										slider_1.setUI(new BasicSliderUI(slider) {
											public void paintThumb(Graphics g) {
												super.paintThumb(g);
												g.setColor(Color.RED);
												g.fillRect((750/100)*j , thumbRect.y, thumbRect.width, thumbRect.height);
											}
										});
									}
									break;
								}
							}
						}
						
					}else if(Ans.contains("P")) {
						for(int i = 0; i < page1.list_P.size(); i++) {
							if(page1.list_P.get(i).toString().split(" ")[0].equals(Ans.substring(1, Ans.indexOf("_")))){
								if(((Integer.parseInt(page1.list_P.get(i).toString().split(" ")[2])+8) >= slider_1.getValue()) && ((Integer.parseInt(page1.list_P.get(i).toString().split(" ")[2])-8) <= slider_1.getValue())) {
									j = Integer.parseInt(page1.list_P.get(i).toString().split(" ")[2]);
									page12.sum2++;
									if(page12.page < 3){
										slider_1.setUI(new BasicSliderUI(slider) {
											public void paintThumb(Graphics g) {
												super.paintThumb(g);
												g.setColor(Color.GREEN);
												g.fillRect((750/100)*j, thumbRect.y, thumbRect.width, thumbRect.height);
											}
										});
									}
									break;
								}else {
									j = Integer.parseInt(page1.list_P.get(i).toString().split(" ")[2]);
									if(page12.page < 3) {
										slider_1.setUI(new BasicSliderUI(slider) {
											public void paintThumb(Graphics g) {
												super.paintThumb(g);
												g.setColor(Color.RED);
												g.fillRect((750/100)*j , thumbRect.y, thumbRect.width, thumbRect.height);
											}
										});
									}
									break;
								}
							}
						}
					}
				}else{
					JOptionPane.showMessageDialog(null, new JLabel("<html><font color='black'; size='8'; face='DFKai-sb'; align='center'>請選擇答案<br><br></font></html>"),"",JOptionPane.PLAIN_MESSAGE);
				}
				
				
				
			}
		});
		btnNewButton_3.setBackground(Color.white);
		btnNewButton_3.setFont(new Font("標楷體", Font.PLAIN, 25));
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.setBounds((screenSize.width/100)*87, (screenSize.height/100)*77, 150, 40);
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("確定答案");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mp = 0;
				Mp2 = 0;
				final int j;
				FileInputStream in;
				String filename = "",pageNum = "訓練1";
				File find;
				
				btnNewButton.setIcon(new ImageIcon(".\\.\\img\\2.png"));
				btnNewButton1.setIcon(new ImageIcon(".\\.\\img\\2.png"));
				btnNewButton3.setIcon(new ImageIcon(".\\.\\img\\2.png"));
				btnNewButton4.setIcon(new ImageIcon(".\\.\\img\\2.png"));
				btnNewButton5.setIcon(new ImageIcon(".\\.\\img\\2.png"));
				btnNewButton6.setIcon(new ImageIcon(".\\.\\img\\2.png"));
				
				if(page12.page == 1) {
					pageNum = "訓練1";
				}else if(page12.page == 2) {
					pageNum = "訓練2";
				}else if(page12.page == 3) {
					pageNum = "訓練3";
				}
				if(slider.getValue() > 0 && page12.page <= 3){
					slider.setEnabled(false);
					btnNewButton_4.setEnabled(false);
					btnNewButton_1.setIcon(new ImageIcon(".\\.\\img\\1r.png"));
					find = new File(System.getProperty("user.dir") + "/media/" + pageNum + "/");
					try {
						if(find.isDirectory()) {
							for(String name:find.list()) {
								if(name.substring(name.indexOf("_") + 1, name.length()-4).equals(String.valueOf(count))) {
									filename = name;
									Ans = name;
									break;
								}
							}
						}
						in = new FileInputStream(System.getProperty("user.dir") + "/media/" + pageNum + "/" + filename);
						AudioStream as = new AudioStream(in);
						AudioPlayer.player.start(as);
						sec = as.getLength()/(1411000/8);
					} catch (IOException e1) {
						// TODO 自動產生的 catch 區塊
						e1.printStackTrace();
					}
					if(Ans.contains("L")) {
						for(int i = 0; i < page1.list_L.size(); i++) {
							if(page1.list_L.get(i).toString().split(" ")[0].equals(Ans.substring(1, Ans.indexOf("_")))){
								if(((Integer.parseInt(page1.list_L.get(i).toString().split(" ")[1])+8) >= slider.getValue()) && ((Integer.parseInt(page1.list_L.get(i).toString().split(" ")[1])-8) <= slider.getValue())) {
									j = Integer.parseInt(page1.list_L.get(i).toString().split(" ")[1]);
									page12.sum1++;
									if(page12.page < 3){
										slider.setUI(new BasicSliderUI(slider) {
											public void paintThumb(Graphics g) {
												super.paintThumb(g);
												g.setColor(Color.GREEN);
												g.fillRect((750/100)*j, thumbRect.y, thumbRect.width, thumbRect.height);
											}
										});
									}
									break;
								}else {
									j = Integer.parseInt(page1.list_L.get(i).toString().split(" ")[1]);
									if(page12.page < 3) {
										slider.setUI(new BasicSliderUI(slider) {
											public void paintThumb(Graphics g) {
												super.paintThumb(g);
												g.setColor(Color.RED);
												g.fillRect((750/100)*j , thumbRect.y, thumbRect.width, thumbRect.height);
											}
										});
									}
									
									break;
								}
							}
						}
						
					}else if(Ans.contains("P")) {
						
						for(int i = 0; i < page1.list_P.size(); i++) {
							if(page1.list_P.get(i).toString().split(" ")[0].equals(Ans.substring(1, Ans.indexOf("_")))){
								
								if(((Integer.parseInt(page1.list_P.get(i).toString().split(" ")[1])+8) >= slider.getValue()) && ((Integer.parseInt(page1.list_P.get(i).toString().split(" ")[1])-8) <= slider.getValue())) {
									j = Integer.parseInt(page1.list_P.get(i).toString().split(" ")[1]);
									page12.sum1++;
									if(page12.page < 3){
										slider.setUI(new BasicSliderUI(slider) {
											public void paintThumb(Graphics g) {
												super.paintThumb(g);
												g.setColor(Color.GREEN);
												g.fillRect((750/100)*j, thumbRect.y, thumbRect.width, thumbRect.height);
											}
										});
									}
									break;
								}else {
									j = Integer.parseInt(page1.list_P.get(i).toString().split(" ")[1]);
									if(page12.page < 3) {
										slider.setUI(new BasicSliderUI(slider) {
											public void paintThumb(Graphics g) {
												super.paintThumb(g);
												g.setColor(Color.RED);
												g.fillRect((750/100)*j , thumbRect.y, thumbRect.width, thumbRect.height);
											}
										});
									}
									break;
								}
							}
						}
					}	
				}else{
					JOptionPane.showMessageDialog(null, new JLabel("<html><font color='black'; size='8'; face='DFKai-sb'; align='center'>請選擇答案<br><br></font></html>"),"",JOptionPane.PLAIN_MESSAGE);
				}
				
				
			}
		});
		btnNewButton_4.setBackground(Color.white);
		btnNewButton_4.setFont(new Font("標楷體", Font.PLAIN, 25));
		btnNewButton_4.setEnabled(false); 
		btnNewButton_4.setBounds((screenSize.width/100)*87, (screenSize.height/100)*40, 150, 40);
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(btnNewButton_4);
		
		

		
	}
} 