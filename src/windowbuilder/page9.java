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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class page9 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page9 window = new page9();
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
	public page9() {
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
		
		JLabel lblNewLabel = new JLabel("<html> 訓練結束，休息5分鐘 </html>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 60));
		lblNewLabel.setBounds((screenSize.width/6)*1+30, (screenSize.height/6)*1, (screenSize.width/6)*4, (screenSize.height/6)*3);
		frame.getContentPane().add(lblNewLabel);
		
		ImageIcon icon = new ImageIcon(".\\.\\img\\77.jpg");
		JButton btn = new JButton("  \u958B\u59CB\u5F8C\u6E2C",icon);
		btn.setFont(new Font("標楷體", Font.PLAIN, 30));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File fileout = new File(System.getProperty("user.dir") + "/後測_" + page1.str + "_" + page1.strN + ".csv");
				try {
					BufferedWriter w = new BufferedWriter(new FileWriter(fileout,true));
					w.write(",受試者編號," + "受試者姓名,");
					w.newLine();
					w.write("," + page1.str + "," + page1.strN + ",");
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
				
				
				page16.main(null);
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
		btn.setBounds( (frame.getWidth()/100)*43, (frame.getHeight()/20)*15, 300,84);
		btn.setBorderPainted(false);
		frame.getContentPane().add(btn);
	}

}
