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
import javax.swing.text.StyleContext.NamedStyle;
import javax.swing.JTextArea;

public class page13 {
	static long Time;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page13 window = new page13();
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
	public page13() {
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
		
		JLabel lblNewLabel = new JLabel("\u807D\u89BA\u8A13\u7DF4 ");
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 60));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds( (screenSize.width/100)*6, (screenSize.height/100)*7, (screenSize.width/100)*50, 70);
		frame.getContentPane().add(lblNewLabel);
		
		Style style=new StyleContext().new NamedStyle();
        StyleConstants.setLineSpacing(style, 0.5f);
        StyleConstants.setFontFamily(style, "微軟正黑體");
        StyleConstants.setFontSize(style, 28);    
        
		JTextPane txtpnroughnessbreathiness = new JTextPane();
		txtpnroughnessbreathiness.setEditable(false);
		txtpnroughnessbreathiness.setSelectionColor(SystemColor.control);
		txtpnroughnessbreathiness.setBackground(SystemColor.control);
		txtpnroughnessbreathiness.setText("你會聽到6個聽覺錨(Anchors)，對應不同的嗓音粗糙聲程度。");
		txtpnroughnessbreathiness.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*4-5, (frame.getWidth()/23)*20, 40);
        txtpnroughnessbreathiness.setLogicalStyle(style);
		frame.getContentPane().add(txtpnroughnessbreathiness);
		
		JLabel lblNewLabel_1 = new JLabel("1)");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*4-6, 25, 47);
		frame.getContentPane().add(lblNewLabel_1);
		/******************************************************/
		JTextPane txtpnroughnessbreathiness1 = new JTextPane();
		txtpnroughnessbreathiness1.setEditable(false);
		txtpnroughnessbreathiness1.setBackground(SystemColor.control);
		txtpnroughnessbreathiness1.setText("你會聽到一個音檔，請你以100mm長視覺類比量表評估音檔的粗糙聲的程度；最左邊代表正常, 最右邊代表嚴重粗糙，請拉動標示至適當位置，你可以按圖示重覆聆聽聽覺錨，每個最多五次。完成後請按確定答案按鈕，之後音檔會再播放一次。");
		txtpnroughnessbreathiness1.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*5+15, (frame.getWidth()/23)*20, 100);
		txtpnroughnessbreathiness1.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness1.setLogicalStyle(style);
        txtpnroughnessbreathiness1.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness1);
		
		JLabel lblNewLabel_2 = new JLabel("2)");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*5+14, 25, 47);
		frame.getContentPane().add(lblNewLabel_2);
		/*****************************************************/
		JTextPane txtpnroughnessbreathiness3 = new JTextPane();
		txtpnroughnessbreathiness3.setEditable(false);
		txtpnroughnessbreathiness3.setBackground(SystemColor.control);
		txtpnroughnessbreathiness3.setText("你會聽到6個聽覺錨(Anchors)，對應不同的嗓音氣息聲的程度。");
		txtpnroughnessbreathiness3.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*6+80, (frame.getWidth()/23)*20, 40);
		txtpnroughnessbreathiness3.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness3.setLogicalStyle(style);
        txtpnroughnessbreathiness3.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness3);
		
		JLabel lblNewLabel_3 = new JLabel("3)");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*6+80, 25, 47);
		frame.getContentPane().add(lblNewLabel_3);
		/*****************************************************/
		JTextPane txtpnroughnessbreathiness4 = new JTextPane();
		txtpnroughnessbreathiness4.setEditable(false);
		txtpnroughnessbreathiness4.setSelectionColor(SystemColor.control);
		txtpnroughnessbreathiness4.setBackground(SystemColor.control);
		txtpnroughnessbreathiness4.setText("你會聽到一個音檔，請你以100mm長視覺類比量表評估音檔的氣息聲的程度；最左邊代表正常, 最右邊代表嚴重粗糙，請拉動標示至適當位置，你可以按圖示重覆聆聽聽覺錨，每個最多五次。完成後請按確定答案按鈕，之後音檔會再播放一次。");
		txtpnroughnessbreathiness4.setBounds((frame.getWidth()/100)*6+50, (frame.getHeight()/20)*7+100, (frame.getWidth()/23)*20, 100);
        txtpnroughnessbreathiness4.setLogicalStyle(style);
        txtpnroughnessbreathiness4.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness4);
		
		JLabel lblNewLabel_4 = new JLabel("4)");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*7+100, 25, 47);
		frame.getContentPane().add(lblNewLabel_4);
		/*****************************************************/
		JTextPane txtpnroughnessbreathiness5 = new JTextPane();
		txtpnroughnessbreathiness5.setEditable(false);
		txtpnroughnessbreathiness5.setBackground(SystemColor.control);
		txtpnroughnessbreathiness5.setText("與專家評分相差8mm以內為正確，完成12題後會告訴你準確率。");
		txtpnroughnessbreathiness5.setBounds( 164, 600, (frame.getWidth()/23)*20, 40);
		txtpnroughnessbreathiness5.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness5.setLogicalStyle(style);
        txtpnroughnessbreathiness5.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness5);
		
		JLabel lblNewLabel_5 = new JLabel("5)");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(114, 595, 25, 48);
		frame.getContentPane().add(lblNewLabel_5);
		/*****************************************************/
		JTextPane txtpnroughnessbreathiness6 = new JTextPane();
		txtpnroughnessbreathiness6.setEditable(false);
		txtpnroughnessbreathiness6.setBackground(SystemColor.control);
		txtpnroughnessbreathiness6.setText("一共有3組訓練；1組12題。");
		txtpnroughnessbreathiness6.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*10+150, (frame.getWidth()/23)*20, 40);
		txtpnroughnessbreathiness6.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness6.setLogicalStyle(style);
        txtpnroughnessbreathiness6.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness6);
		
		JLabel lblNewLabel_6 = new JLabel("6)");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*10+150, 25, 48);
		frame.getContentPane().add(lblNewLabel_6);
		/*****************************************************/

		ImageIcon icon = new ImageIcon(".\\.\\img\\77.jpg");
		JButton btn = new JButton("  \u958B\u59CB\u8A13\u7DF4",icon);
		btn.setFont(new Font("標楷體", Font.PLAIN, 30));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Time = System.currentTimeMillis();
				File fileout = new File(System.getProperty("user.dir") + "/(NF組)訓練_" + page1.str + "_" + page1.strN + ".csv");
				try {
					BufferedWriter w = new BufferedWriter(new FileWriter(fileout,true));
					w.write("題號," + "R," + "B,");
					w.newLine();
					w.write("訓練1");
					w.newLine();
					w.flush();
					w.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				page14.main(null);
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
		btn.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, SystemColor.control));
		btn.setBounds( (frame.getWidth()/100)*43, (frame.getHeight()/20)*17, 250,84);
		frame.getContentPane().add(btn);

				
	}
}
