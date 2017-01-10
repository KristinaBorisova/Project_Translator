import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IndexWindow {

	private JFrame frame;
	private JButton useTranslatorButton = new JButton("Use Translator");
	private JButton btnMyTranslator = new JButton ("My Translator");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IndexWindow window = new IndexWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public IndexWindow() {
		initialize();
		buttonActions();
	}

	private void buttonActions() {

		this.useTranslatorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		this.btnMyTranslator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		

	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		useTranslatorButton.setBounds(89, 64, 232, 65); //First Button "Use translator"
		frame.getContentPane().add(useTranslatorButton);
		
		btnMyTranslator.setBounds(89, 142, 232, 65);   //Second button "My translator"
		frame.getContentPane().add(btnMyTranslator);
	}
}
