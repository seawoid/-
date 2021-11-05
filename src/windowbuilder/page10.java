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

public class page10 {
    static long Time; //Run of time (ms)
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page10 window = new page10();
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
	public page10() {
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
		lblNewLabel.setFont(new Font("�з���", Font.PLAIN, 60));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds( (screenSize.width/100)*6, (screenSize.height/100)*7, (screenSize.width/100)*50, 55);
		frame.getContentPane().add(lblNewLabel);
		
		Style style=new StyleContext().new NamedStyle();
        StyleConstants.setLineSpacing(style, 0.5f);
        StyleConstants.setFontFamily(style, "�L�n������");
        StyleConstants.setFontSize(style, 28);    
        
		JTextPane txtpnroughnessbreathiness = new JTextPane();
		txtpnroughnessbreathiness.setEditable(false);
		txtpnroughnessbreathiness.setSelectionColor(SystemColor.control);
		txtpnroughnessbreathiness.setBackground(SystemColor.control);
		txtpnroughnessbreathiness.setText("\u4F60\u6703\u807D\u52306\u500B\u807D\u89BA\u9328(Anchors)\uFF0C\u5C0D\u61C9\u4E0D\u540C\u7684\u55D3\u97F3\u7C97\u7CD9\u8072\u7A0B\u5EA6\u3002");
		txtpnroughnessbreathiness.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*4, (frame.getWidth()/23)*20, 40);
        txtpnroughnessbreathiness.setLogicalStyle(style);
		frame.getContentPane().add(txtpnroughnessbreathiness);
		
		JLabel lblNewLabel_1 = new JLabel("1)");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*4-8, 25, 47);
		frame.getContentPane().add(lblNewLabel_1);
		/******************************************************/
		JTextPane txtpnroughnessbreathiness1 = new JTextPane();
		txtpnroughnessbreathiness1.setEditable(false);
		txtpnroughnessbreathiness1.setBackground(SystemColor.control);
		txtpnroughnessbreathiness1.setText("�A�|ť��@�ӭ��ɡA�ЧA�H100mm����ı����q��������ɪ����W�n�{�סF�̥���N���`, �̥k��N���Y�����W�A�Щ԰ʼХܦܾA���m�A�A�i�H���ϥܭ��в�ťťı��A�C�ӳ̦h�����C������Ы��T�w���׫��s�C");
		txtpnroughnessbreathiness1.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*5+20, (frame.getWidth()/23)*20, 100);
		txtpnroughnessbreathiness1.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness1.setLogicalStyle(style);
        txtpnroughnessbreathiness1.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness1);
		
		JLabel lblNewLabel_2 = new JLabel("2)");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*5+12, 25, 47);
		frame.getContentPane().add(lblNewLabel_2);
		/*****************************************************/
		JTextPane txtpnroughnessbreathiness3 = new JTextPane();
		txtpnroughnessbreathiness3.setEditable(false);
		txtpnroughnessbreathiness3.setBackground(SystemColor.control);
		txtpnroughnessbreathiness3.setText("\u4F60\u6703\u770B\u5230\u5EFA\u8B70\u7B54\u6848\uFF0C\u97F3\u6A94\u4E5F\u6703\u91CD\u8907\u4E00\u6B21\u3002");
		txtpnroughnessbreathiness3.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*6+70, (frame.getWidth()/23)*20, 40);
		txtpnroughnessbreathiness3.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness3.setLogicalStyle(style);
        txtpnroughnessbreathiness3.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness3);
		
		JLabel lblNewLabel_3 = new JLabel("3)");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*6+62, 25, 47);
		frame.getContentPane().add(lblNewLabel_3);
		/*****************************************************/
		JTextPane txtpnroughnessbreathiness4 = new JTextPane();
		txtpnroughnessbreathiness4.setEditable(false);
		txtpnroughnessbreathiness4.setSelectionColor(SystemColor.control);
		txtpnroughnessbreathiness4.setBackground(SystemColor.control);
		txtpnroughnessbreathiness4.setText("\u4F60\u6703\u807D\u52306\u500B\u807D\u89BA\u9328(Anchors)\uFF0C\u5C0D\u61C9\u4E0D\u540C\u7684\u55D3\u97F3\u6C23\u606F\u8072\u7684\u7A0B\u5EA6\u3002");
		txtpnroughnessbreathiness4.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*7+70, (frame.getWidth()/23)*20, 40);
        txtpnroughnessbreathiness4.setLogicalStyle(style);
        txtpnroughnessbreathiness4.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness4);
		
		JLabel lblNewLabel_4 = new JLabel("4)");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*7+62, 25, 47);
		frame.getContentPane().add(lblNewLabel_4);
		/*****************************************************/
		JTextPane txtpnroughnessbreathiness5 = new JTextPane();
		txtpnroughnessbreathiness5.setEditable(false);
		txtpnroughnessbreathiness5.setBackground(SystemColor.control);
		txtpnroughnessbreathiness5.setText("�A�|ť��@�ӭ��ɡA�ЧA�H100mm����ı����q��������ɪ����n�{�סF�̥���N���`, �̥k��N���Y�����W�A�Щ԰ʼХܦܾA���m�A�A�i�H���ϥܭ��в�ťťı��A�C�ӳ̦h�����C������Ы��T�w���׫��s�C");
		txtpnroughnessbreathiness5.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*8+80, (frame.getWidth()/23)*20, 100);
		txtpnroughnessbreathiness5.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness5.setLogicalStyle(style);
        txtpnroughnessbreathiness5.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness5);
		
		JLabel lblNewLabel_5 = new JLabel("5)");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*8+75, 25, 48);
		frame.getContentPane().add(lblNewLabel_5);
		/*****************************************************/
		JTextPane txtpnroughnessbreathiness6 = new JTextPane();
		txtpnroughnessbreathiness6.setEditable(false);
		txtpnroughnessbreathiness6.setBackground(SystemColor.control);
		txtpnroughnessbreathiness6.setText("\u4F60\u6703\u770B\u5230\u5EFA\u8B70\u7B54\u6848\uFF0C\u97F3\u6A94\u4E5F\u6703\u91CD\u8907\u4E00\u6B21\u3002");
		txtpnroughnessbreathiness6.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*9+130, (frame.getWidth()/23)*20, 40);
		txtpnroughnessbreathiness6.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness6.setLogicalStyle(style);
        txtpnroughnessbreathiness6.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness6);
		
		JLabel lblNewLabel_6 = new JLabel("6)");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*9+122, 25, 48);
		frame.getContentPane().add(lblNewLabel_6);
		/*****************************************************/
		JTextPane txtpnroughnessbreathiness7 = new JTextPane();
		txtpnroughnessbreathiness7.setEditable(false);
		txtpnroughnessbreathiness7.setBackground(SystemColor.control);
		txtpnroughnessbreathiness7.setText("�P�M�a�����ۮt8mm�H�������T�A����12�D��|�i�D�A�ǽT�v�C");
		txtpnroughnessbreathiness7.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*10+150, (frame.getWidth()/23)*20, 40);
		txtpnroughnessbreathiness7.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness7.setLogicalStyle(style);
        txtpnroughnessbreathiness7.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness7);
		
		JLabel lblNewLabel_7 = new JLabel("7)");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*10+142, 25, 48);
		frame.getContentPane().add(lblNewLabel_7);
		/*****************************************************/
		JTextPane txtpnroughnessbreathiness8 = new JTextPane();
		txtpnroughnessbreathiness8.setEditable(false);
		txtpnroughnessbreathiness8.setBackground(SystemColor.control);
		txtpnroughnessbreathiness8.setText("�@�@��3�հV�m�F1��12�D�F��3�հV�m���|���ѫ�ĳ���סC");
		txtpnroughnessbreathiness8.setBounds( (frame.getWidth()/100)*6+50, (frame.getHeight()/20)*11+170, (frame.getWidth()/23)*20, 40);
		txtpnroughnessbreathiness8.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness8.setLogicalStyle(style);
        txtpnroughnessbreathiness8.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness8);
		
		JLabel lblNewLabel_8 = new JLabel("8)");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds((frame.getWidth()/100)*6, (frame.getHeight()/20)*11+162, 25, 48);
		frame.getContentPane().add(lblNewLabel_8);
		/*****************************************************/

		ImageIcon icon = new ImageIcon(".\\.\\img\\77.jpg");
		JButton btn = new JButton("  \u958B\u59CB\u8A13\u7DF4",icon);
		btn.setFont(new Font("�з���", Font.PLAIN, 30));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Time = System.currentTimeMillis();
				File fileout = new File(System.getProperty("user.dir") + "/(F��)�V�m_" + page1.str + "_" + page1.strN + ".csv");
				try {
					BufferedWriter w = new BufferedWriter(new FileWriter(fileout,true));
					w.write("�V�m1");
					w.newLine();
					w.write("�D��," + "R," + "B,");
					w.newLine();
					w.flush();
					w.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				page11_next2.main(null);
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
