package windowbuilder;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Cursor;

public class page2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page2 window = new page2();
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
	public page2() {
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
		
		JLabel lblNewLabel = new JLabel("\u7814\u7A76\u4ECB\u7D39");
		lblNewLabel.setBackground(SystemColor.control);
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds( (frame.getWidth()/23), (frame.getHeight()/20), (screenSize.width/6)*3, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1.setIcon(new ImageIcon(".\\.\\img\\10.jpg"));
		lblNewLabel_1.setBounds( (frame.getWidth()/23), (frame.getHeight()/20*4)+3, 25, 25);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2.setIcon(new ImageIcon(".\\.\\img\\10.jpg"));
		lblNewLabel_2.setBounds( (frame.getWidth()/23), (frame.getHeight()/20)*8+3, 25, 25);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_3.setIcon(new ImageIcon(".\\.\\img\\10.jpg"));
		lblNewLabel_3.setBounds( (frame.getWidth()/23), (frame.getHeight()/20)*12+3, 25, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		Style style=new StyleContext().new NamedStyle();
        StyleConstants.setLineSpacing(style, 0.5f);
        StyleConstants.setFontFamily(style,"微軟正黑體");
        StyleConstants.setFontSize(style, 30);
        
		JTextPane txtpnroughnessbreathiness = new JTextPane();
		txtpnroughnessbreathiness.setEditable(false);
		txtpnroughnessbreathiness.setBackground(SystemColor.control);
		txtpnroughnessbreathiness.setText("\u7814\u7A76\u76EE\u7684\uFF1A\u85C9\u807D\u89BA\u8A13\u7DF4\u8207\u807D\u89BA\u9328\u8A13\u7DF4\u8A9E\u8A00\u6CBB\u7642\u5B78\u751F\u4F7F\u7528\u807D\u77E5\u89BA\u8A55\u4F30\u8A55\u4F30\u97F3\u6A94\u7684\u7C97\u7CD9\u8072\u7A0B\u5EA6 (Roughness) \u8207\u6C23\u606F\u8072\u7A0B\u5EA6 (Breathiness)");
		txtpnroughnessbreathiness.setBounds( (frame.getWidth()/23)+30, (frame.getHeight()/20)*4, (frame.getWidth()/23)*20, 100);
        txtpnroughnessbreathiness.setLogicalStyle(style);
		txtpnroughnessbreathiness.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness);
		
		JTextPane txtpnroughnessbreathiness2 = new JTextPane();
		txtpnroughnessbreathiness2.setEditable(false);
		txtpnroughnessbreathiness2.setEnabled(true);
		txtpnroughnessbreathiness2.setBackground(SystemColor.control);
		txtpnroughnessbreathiness2.setText("研究內容：粗糙聲程度(Roughness)與氣息聲程度(Breathiness)都是常用的嗓音特質指標，並且可以藉由這兩個指標決定嗓音的整體沙啞程度");
		txtpnroughnessbreathiness2.setBounds( (frame.getWidth()/23)+30, (frame.getHeight()/20)*8, (frame.getWidth()/23)*20, 100);
        txtpnroughnessbreathiness2.setLogicalStyle(style);
		txtpnroughnessbreathiness2.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness2.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness2);
		
		JTextPane txtpnroughnessbreathiness3 = new JTextPane();
		txtpnroughnessbreathiness3.setEditable(false);
		txtpnroughnessbreathiness3.setEnabled(true);
		txtpnroughnessbreathiness3.setBackground(SystemColor.control);
		txtpnroughnessbreathiness3.setText("\u807D\u89BA\u9328\u662F\u5C0D\u61C9\u4E0D\u540C\u7C97\u7CD9\u8072\u7A0B\u5EA6 (Roughness) \u8207\u6C23\u606F\u8072\u7A0B\u5EA6 (Breathiness) \u7684\u97F3\u6A94\uFF0C\u53D7\u8A66\u8005\u53EF\u4EE5\u6BD4\u5C0D\u6E2C\u8A66\u97F3\u6A94\u4EE5\u5354\u52A9\u4F60\u6C7A\u5B9A\u8A55\u5206");
		txtpnroughnessbreathiness3.setBounds( (frame.getWidth()/23)+30, (frame.getHeight()/20)*12, (frame.getWidth()/23)*20, 100);
        txtpnroughnessbreathiness3.setLogicalStyle(style);
		txtpnroughnessbreathiness3.setSelectionColor(SystemColor.control);
        txtpnroughnessbreathiness3.setVisible(true);
		frame.getContentPane().add(txtpnroughnessbreathiness3);
		
		
		JButton btnNewButton = new JButton("\u4E0B\u4E00\u9801");
		btnNewButton.setBackground(SystemColor.control);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				page3.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new java.awt.Font("標楷體", Font.PLAIN, 25));
		btnNewButton.setBounds((frame.getWidth()/6)*5, (frame.getHeight()/20)*17, (frame.getWidth()/6)-20, (frame.getHeight()/20)+10);
		frame.getContentPane().add(btnNewButton);
		
	}
}
