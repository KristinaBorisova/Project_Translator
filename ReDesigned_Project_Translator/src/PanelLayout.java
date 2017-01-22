import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.text.JTextComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;

public class PanelLayout {

	JFrame frame; // JFrame
	private JButton btnSwap = new JButton("Swap");
	private JButton btnSave = new JButton("Save");
	private JButton btnClearAll = new JButton("Clear All");
	private JButton btnTranslate = new JButton("Translate");
	private final JTextArea userInputTextArea = new JTextArea();
	private JTextArea outputTextArea = new JTextArea();

	public PanelLayout() {
		initialize();
		buttonsAction();

	}

	public void clearAll() { // Clear All Function for button "Clear All"
		userInputTextArea.setText("");
		outputTextArea.setText("");
	}

	private void buttonsAction() {

		btnSwap.addActionListener(new ActionListener() { // "Swap" Button Action
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnSave.addActionListener(new ActionListener() { // "Save" Button Action
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnClearAll.addActionListener(new ActionListener() { // "Clear All"
																// Button Action
			public void actionPerformed(ActionEvent arg0) {
				clearAll();
			}
		});

	}

	private void initialize() {
		frame = new JFrame();
		this.frame.setBounds(100, 100, 602, 412);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnSave.setBounds(406, 316, 128, 36);

		btnSwap.setBounds(229, 159, 87, 25);
		btnSwap.setForeground(Color.BLUE);
		btnTranslate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnTranslate.setForeground(Color.RED);
		btnTranslate.setBounds(200, 316, 172, 36);

		btnClearAll.setBounds(41, 316, 128, 36);

		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnSave);
		frame.getContentPane().add(btnTranslate);
		frame.getContentPane().add(btnClearAll);
		frame.getContentPane().add(btnSwap);

		userInputTextArea.setBounds(41, 41, 493, 114);
		frame.getContentPane().add(userInputTextArea);

		outputTextArea.setBounds(41, 189, 493, 114);
		frame.getContentPane().add(outputTextArea);
	}
}
