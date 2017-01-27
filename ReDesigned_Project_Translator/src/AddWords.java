import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddWords extends JFrame {

	private JPanel contentPane;
    public JButton btnAddWord = new JButton("Äîáàâè Äóìàòà");
    private JTextField userInputTextField;
    private JTextField userOutputTextField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddWords frame = new AddWords();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public void wordsToFiles() {
		String userInputWord = userInputTextField.getText();
		String userOutputWord = userOutputTextField.getText();
		
		if (userInputWord.split(" ").length != 1 && userOutputWord.split(" ").length != 1) {
			JOptionPane.showMessageDialog(null, "Error,try again");
		}
		 else {
	
			addWordsToBulgarianTextFile(userInputWord);
			addWordsToEnglishTextFile(userOutputWord);
			JOptionPane.showMessageDialog(null, "Word Succesfully Added!");
		}
	
	}
	private void addWordsToEnglishTextFile(String userOutputWord) {
		try (FileWriter fw = new FileWriter("C:\\Desktop\\Final Project\\Database\\why.txt", true); // reference to empty .txt file to check if it works
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.println(userOutputWord);
		} catch (IOException e) {
			System.out.println(e);
		}
	}	
	
	
	private void addWordsToBulgarianTextFile(String userInputWord) { 
		try (FileWriter fw = new FileWriter("C:\\Desktop\\Final Project\\Database\\bulgarianEmpty.txt", true); // reference to empty .txt file to check if it works
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.println(userInputWord);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	
			
			
		
	

	public AddWords() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		
		btnAddWord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			wordsToFiles();
			}
		});
		btnAddWord.setBounds(141, 208, 123, 25);
		contentPane.add(btnAddWord);
		
		JLabel label = new JLabel("\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u0434\u0443\u043C\u0430 \u043D\u0430 \u0431\u044A\u043B\u0433\u0430\u0440\u0441\u043A\u0438 \u0435\u0437\u0438\u043A:");
		label.setBounds(12, 9, 203, 25);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u043F\u0440\u0435\u0432\u043E\u0434\u0430 \u043D\u0430 \u0434\u0443\u043C\u0430\u0442\u0430 :");
		label_1.setBounds(12, 113, 203, 16);
		contentPane.add(label_1);
		
		userInputTextField = new JTextField();
		userInputTextField.setBounds(22, 43, 371, 57);
		contentPane.add(userInputTextField);
		userInputTextField.setColumns(10);
		
		userOutputTextField = new JTextField();
		userOutputTextField.setText("");
		userOutputTextField.setBounds(22, 142, 371, 53);
		contentPane.add(userOutputTextField);
		userOutputTextField.setColumns(10);
	}
}
