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

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class page6 {

	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page6 window = new page6();
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
	public page6() {
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
		
		JLabel lblNewLabel = new JLabel("\u807D\u89BA\u8A13\u7DF4");
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 60));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds( (screenSize.width/100)*6, (screenSize.height/100)*7, (screenSize.width/100)*50, 55);
		frame.getContentPane().add(lblNewLabel);
		
		Style style=new StyleContext().new NamedStyle();
        StyleConstants.setLineSpacing(style, 0.5f);
        StyleConstants.setFontFamily(style, "微軟正黑體");
        StyleConstants.setFontSize(style, 30);
        
		JTextPane txtpnroughnessbreathiness = new JTextPane();
		txtpnroughnessbreathiness.setEditable(false);
		txtpnroughnessbreathiness.setBackground(SystemColor.control);
		//txtpnroughnessbreathiness.setFont(new Font("新細明體", Font.PLAIN, 30));
		txtpnroughnessbreathiness.setText("\u4F60\u6703\u807D\u52306\u500B\u807D\u89BA\u9328(Anchors)\uFF0C\u5C0D\u61C9\u4E0D\u540C\u7684\u55D3\u97F3\u7C97\u7CD9\u8072\u7684\u7A0B\u5EA6\u3002");
		txtpnroughnessbreathiness.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*3, (frame.getWidth()/23)*20, 40);
		txtpnroughnessbreathiness.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness.setLogicalStyle(style);
		frame.getContentPane().add(txtpnroughnessbreathiness);
		
		JLabel lblNewLabel_1 = new JLabel("1)");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*3, 25, 47);
		frame.getContentPane().add(lblNewLabel_1);
		/******************************************************/
		JTextPane txtpnroughnessbreathiness1 = new JTextPane();
		txtpnroughnessbreathiness1.setEditable(false);
		txtpnroughnessbreathiness1.setBackground(SystemColor.control);
		txtpnroughnessbreathiness1.setText("\u4F60\u6703\u807D\u5230\u4E00\u500B\u97F3\u6A94\u5169\u6B21\uFF0C\u4F60\u4E0D\u5FC5\u8A55\u5206\u3002");
		txtpnroughnessbreathiness1.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*5, (frame.getWidth()/23)*20, 40);
		txtpnroughnessbreathiness1.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness1.setLogicalStyle(style);
        txtpnroughnessbreathiness1.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness1);
		
		JLabel lblNewLabel_2 = new JLabel("2)");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*5, 25, 47);
		frame.getContentPane().add(lblNewLabel_2);
		/*****************************************************/
		JTextPane txtpnroughnessbreathiness3 = new JTextPane();
		txtpnroughnessbreathiness3.setEditable(false);
		txtpnroughnessbreathiness3.setBackground(SystemColor.control);
		txtpnroughnessbreathiness3.setText("你可以按圖示重覆聆聽聽覺錨，每個最多五次，之後請按「聽第二次」按鈕以再次聆聽音檔並繼續訓練。");
		txtpnroughnessbreathiness3.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*7, (frame.getWidth()/23)*20, 40);
        txtpnroughnessbreathiness3.setLogicalStyle(style);
		txtpnroughnessbreathiness3.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness3.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness3);
		
		JLabel lblNewLabel_3 = new JLabel("3)");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*7, 25, 47);
		frame.getContentPane().add(lblNewLabel_3);
		/*****************************************************/
		JTextPane txtpnroughnessbreathiness4 = new JTextPane();
		txtpnroughnessbreathiness4.setEditable(false);
		txtpnroughnessbreathiness4.setBackground(SystemColor.control);
		txtpnroughnessbreathiness4.setText("你會聽到6個聽覺錨(Anchors)，對應不同的嗓音氣息聲程度。");
		txtpnroughnessbreathiness4.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*9, (frame.getWidth()/23)*20, 40);
		txtpnroughnessbreathiness4.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness4.setLogicalStyle(style);
        txtpnroughnessbreathiness4.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness4);
		
		JLabel lblNewLabel_4 = new JLabel("4)");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*9, 25, 47);
		frame.getContentPane().add(lblNewLabel_4);
		/*****************************************************/
		JTextPane txtpnroughnessbreathiness5 = new JTextPane();
		txtpnroughnessbreathiness5.setEditable(false);
		txtpnroughnessbreathiness5.setBackground(SystemColor.control);
		txtpnroughnessbreathiness5.setText("你會聽到一個音檔一次，你不必評分。");
		txtpnroughnessbreathiness5.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*11, (frame.getWidth()/23)*20, 40);
        txtpnroughnessbreathiness5.setLogicalStyle(style);
		txtpnroughnessbreathiness5.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness5.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness5);
		
		JLabel lblNewLabel_5 = new JLabel("5)");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*11, 25, 48);
		frame.getContentPane().add(lblNewLabel_5);
		/*****************************************************/
		JTextPane txtpnroughnessbreathiness6 = new JTextPane();
		txtpnroughnessbreathiness6.setEditable(false);
		txtpnroughnessbreathiness6.setBackground(SystemColor.control);
		txtpnroughnessbreathiness6.setText("你可以按圖示重覆聆聽聽覺錨，每個最多五次，之後請按「聽第二次」按鈕以再次聆聽音檔並繼續訓練。");
		txtpnroughnessbreathiness6.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*13, (frame.getWidth()/23)*20, 40);
        txtpnroughnessbreathiness6.setLogicalStyle(style);
		txtpnroughnessbreathiness6.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness6.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness6);
		
		JLabel lblNewLabel_6 = new JLabel("6)");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*13, 25, 48);
		frame.getContentPane().add(lblNewLabel_6);
		/*****************************************************/
		JTextPane txtpnroughnessbreathiness7 = new JTextPane();
		txtpnroughnessbreathiness7.setEditable(false);
		txtpnroughnessbreathiness7.setBackground(SystemColor.control);
		txtpnroughnessbreathiness7.setText("一共有3組訓練；1組12題");
		txtpnroughnessbreathiness7.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*15, (frame.getWidth()/23)*20, 40);
        txtpnroughnessbreathiness7.setLogicalStyle(style);
		txtpnroughnessbreathiness7.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness7.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness7);
		
		JLabel lblNewLabel_7 = new JLabel("7)");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*15, 25, 48);
		frame.getContentPane().add(lblNewLabel_7);
		/*****************************************************/

		ImageIcon icon = new ImageIcon(".\\.\\img\\77.jpg");
		JButton btn = new JButton("  \u958B\u59CB\u8A13\u7DF4",icon);
		btn.setFont(new Font("標楷體", Font.PLAIN, 30));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				page7.main(null);
				frame.setVisible(false);
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
		btn.setBounds( (frame.getWidth()/100)*43, (frame.getHeight()/20)*17, 250,84);
		btn.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, SystemColor.control));
		frame.getContentPane().add(btn);
				
		
	}
	 
	  
}