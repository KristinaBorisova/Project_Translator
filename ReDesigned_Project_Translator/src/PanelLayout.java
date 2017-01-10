import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;

public class PanelLayout {

	private JFrame frame;
	private JButton translateButton = new JButton("Translate");
	private JButton clearAllButton = new JButton("Clear All");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelLayout window = new PanelLayout();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PanelLayout() {
		initialize();

	}

	private void initialize() {
		frame = new JFrame();
		this.frame.setBounds(100, 100, 576, 383);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(12, 282, 183, 47);

		this.translateButton.setBounds(234, 126, 87, 25);
		this.translateButton.setForeground(Color.BLUE);

		this.clearAllButton.setForeground(Color.RED);
		this.clearAllButton.setBounds(225, 287, 118, 36);

		JButton btnNewButton_1 = new JButton("New button2");
		btnNewButton_1.setBounds(361, 282, 175, 47);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 524, 106);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 158, 524, 106);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(clearAllButton);
		frame.getContentPane().add(btnNewButton_1);
		frame.getContentPane().add(panel_1);
		frame.getContentPane().add(panel);
		frame.getContentPane().add(translateButton);
	}
}
