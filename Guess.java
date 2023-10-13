package numberGuess;

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
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Guess extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNum;
	private JTextField textShowNum;
	JLabel lblInfo;
	int compNo = 0; String str2 = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guess frame = new Guess();
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
	public Guess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(140, 50, 760, 615);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Component = new JLabel("I am thinking of a number between 1 to 100. ");
		Component.setForeground(new Color(255, 250, 240));
		Component.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
		Component.setBounds(25, 28, 524, 68);
		contentPane.add(Component);
		
		JLabel lblNewLabel_2 = new JLabel("Guess the number");
		lblNewLabel_2.setForeground(new Color(240, 230, 140));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(54, 192, 258, 33);
		contentPane.add(lblNewLabel_2);
		
		txtNum = new JTextField();
		txtNum.setForeground(new Color(139, 0, 139));
		txtNum.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtNum.setBounds(385, 194, 159, 28);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		JButton btnGuess = new JButton("Guess");
		btnGuess.setBackground(new Color(0, 0, 0));
		btnGuess.setForeground(new Color(255, 255, 255));
		btnGuess.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int myNo= Integer.parseInt(txtNum.getText());
				//compNo= (int)(Math.random() * 10);
				if(myNo == compNo) {
					lblInfo.setText("You have guessed the right number");
				}
				else if(myNo <=0 || myNo > 100) {
					lblInfo.setText("Invalid guess!!! pls think of a number between 1 to 100");
				}
				else {
					lblInfo.setText("You haven't guessed the right number");
				}
			}
		});
		btnGuess.setBounds(163, 336, 119, 33);
		contentPane.add(btnGuess);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(0, 0, 0));
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNum.setText("");
				lblInfo.setText("");
				textShowNum.setText("");
			}
		});
		btnReset.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnReset.setBounds(402, 336, 124, 33);
		contentPane.add(btnReset);
		
		JButton btnShow = new JButton("Show the number");
		btnShow.setBackground(new Color(255, 228, 181));
		btnShow.setForeground(new Color(165, 42, 42));
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				compNo= (int)(Math.random() * 100);
				str2= Integer.toString(compNo);
				textShowNum.setText(str2);
			}
		});
		btnShow.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnShow.setBounds(54, 445, 264, 33);
		contentPane.add(btnShow);
		
		lblInfo = new JLabel("");
		lblInfo.setForeground(new Color(224, 255, 255));
		lblInfo.setFont(new Font("Maiandra GD", Font.BOLD | Font.ITALIC, 20));
		lblInfo.setBounds(156, 269, 432, 33);
		contentPane.add(lblInfo);
		
		textShowNum = new JTextField();
		textShowNum.setForeground(new Color(255, 215, 0));
		textShowNum.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textShowNum.setBounds(398, 447, 151, 28);
		contentPane.add(textShowNum);
		textShowNum.setColumns(10);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		btnNewButton.setBounds(285, 510, 119, 33);
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 396, 683, 2);
		contentPane.add(separator);
		
		JLabel lblCanYouGuess = new JLabel("Can You Guess it ?");
		lblCanYouGuess.setForeground(new Color(255, 250, 240));
		lblCanYouGuess.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
		lblCanYouGuess.setBounds(163, 83, 258, 55);
		contentPane.add(lblCanYouGuess);
		
		JLabel lblPic = new JLabel("");
		lblPic.setBounds(559, 28, 159, 119);
		contentPane.add(lblPic);
		ImageIcon icon = (new ImageIcon(NoGuessGame.class.getResource("/picture/images/img2.png")));
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(lblPic.getWidth(), lblPic.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		lblPic.setIcon(scaledIcon);
	}
}
