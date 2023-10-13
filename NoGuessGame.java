package numberGuess;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class NoGuessGame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NoGuessGame frame = new NoGuessGame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NoGuessGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 502);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(72, 61, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltxt1 = new JLabel("Welcome");
		lbltxt1.setForeground(new Color(255, 218, 185));
		lbltxt1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
		lbltxt1.setBounds(322, 26, 196, 63);
		contentPane.add(lbltxt1);
		
		JButton btnYes = new JButton("YES");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Guess g = new Guess();
				g.setTitle("Welcome");
				g.setVisible(true);
				dispose();
			}
		});
		btnYes.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnYes.setBounds(128, 378, 87, 45);
		contentPane.add(btnYes);
		
		JButton btnNo = new JButton("NO");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNo.setBounds(481, 378, 87, 45);
		contentPane.add(btnNo);
		
		JLabel lblImg = new JLabel("");
		lblImg.setBounds(47, 39, 143, 148);
		contentPane.add(lblImg);
		ImageIcon icon = (new ImageIcon(NoGuessGame.class.getResource("/picture/images/img1.png")));
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		lblImg.setIcon(scaledIcon);
		
		JLabel lbltxt2 = new JLabel("to");
		lbltxt2.setForeground(new Color(255, 215, 0));
		lbltxt2.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
		lbltxt2.setBounds(390, 87, 44, 45);
		contentPane.add(lbltxt2);
		
		JLabel lbltxt3 = new JLabel("Number Guessing Game!!");
		lbltxt3.setForeground(new Color(255, 222, 173));
		lbltxt3.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
		lbltxt3.setBounds(239, 124, 424, 63);
		contentPane.add(lbltxt3);
		
		JLabel lblDoYouWant = new JLabel("Do you want to play the game ?");
		lblDoYouWant.setForeground(new Color(255, 215, 0));
		lblDoYouWant.setFont(new Font("Lucida Bright", Font.BOLD, 30));
		lblDoYouWant.setBounds(104, 263, 518, 63);
		contentPane.add(lblDoYouWant);
	}
}
