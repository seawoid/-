package windowbuilder;

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
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class page21 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page21 window = new page21();
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
	public page21() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame = new JFrame();
		frame.setBounds(0, 0, screenSize.width, screenSize.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(SystemColor.control);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>追蹤測驗結束!<br>恭喜你完成整個實驗!<br>謝謝你的參與!<br></html>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 60));
		lblNewLabel.setBounds((screenSize.width/6)*1+30, (screenSize.height/6)*1, (screenSize.width/6)*4, (screenSize.height/6)*3);
		frame.getContentPane().add(lblNewLabel);
		
		ImageIcon icon = new ImageIcon(".\\.\\img\\77.jpg");
		JButton btn = new JButton("  \u7D50\u675F",icon);
		btn.setFont(new Font("標楷體", Font.PLAIN, 30));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
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
		btn.setBounds( (frame.getWidth()/100)*43, (frame.getHeight()/20)*15, 300,84);
		btn.setBorderPainted(false);
		frame.getContentPane().add(btn);
	}

}
