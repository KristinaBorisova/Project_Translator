import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class PannelLayout2 {

	static JFrame frame;
	private JTextField outputTextField;
	public JButton btnClearAll = new JButton("Clear All");
	protected static JTextField userInputTextField;
	public JButton btnEnterNewWord = new JButton("Enter word");
	public JButton btnTranslate = new JButton("Translate");

	public JMenuItem mntmCopyText = new JMenuItem("Coppy");
	public JMenuItem mntmCut_1 = new JMenuItem("Cut");
	public JMenuItem mntmPasteText_1 = new JMenuItem("Paste Text");
	public JMenuItem mntmCountWords = new JMenuItem("Count words");

	// String iconPath = "C:\Desktop\Final Project\icon.png";
	// Image icon = new
	// ImageIcon(getClass().getResource(iconPath)).getImage();
	// frame.setIconImage(icon);

	public PannelLayout2() {
		initializeElements();
		btnsActions();
		menuItemsActions();
	}

	private void menuItemsActions() {
		// Add Methods
		// mnEdit.addActionListener(new ActionListener() { //Menu Bar
		// public void actionPerformed(ActionEvent arg0) {
		// mnEdit.show();
		// }
		// });
		mntmCopyText.addActionListener(new ActionListener() { // Button Copy
			public void actionPerformed(ActionEvent e) {
				userInputTextField.copy();
				outputTextField.copy();
			}
		});

		mntmCut_1.addActionListener(new ActionListener() { // Button Cut
			public void actionPerformed(Action e) {
				// userInputTextField.cut();
			}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				userInputTextField.cut();

			}
		});

		mntmPasteText_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String userInput = userInputTextField.getText();
				outputTextField.paste();
			}
		});

		mntmCountWords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Initiate Result
				String userInput = userInputTextField + " "; // Add space afte the received string
				String result = "";
				String userTextInput = userInputTextField.getText();
				int i = 0;
				int count = userTextInput.length();

				try {

					for ( i = 0; i <= count - i; i++) {
						if (count >= 1) {

							String tempString = userTextInput.substring(0, userTextInput.indexOf(" "));

							if (userTextInput.contains(" ") && (!userTextInput.isEmpty())) {
								userTextInput = userTextInput.substring(userTextInput.indexOf(" ") + 1,
										userTextInput.length());
								// get substring between " " and lenght ;
							} else {
								if (!userTextInput.isEmpty()) {
									JOptionPane.showMessageDialog(null, "Empty input"); // if input is empty
																						// nothing
								}
							}
						} else {
							//nothing at all
						}

					}

				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}

				JOptionPane.showMessageDialog(mntmCountWords, i);

			}
		});
	}

	// End of menuItemsActions();

	private void btnsActions() {
		btnClearAll.addActionListener(new ActionListener() { // "Clear All"
																// Button Action
			public void actionPerformed(ActionEvent arg0) {
				clearAll();
			}
		});

		btnTranslate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				translateInput();

			}

		});

		btnEnterNewWord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNewWord(); // Add code to Method

			}
		});

	} // End Of method

	private void clearAll() {
		userInputTextField.setText("");
		outputTextField.setText("");
	}

	private void translateInput() {
		// ADDDDDDDDDDD!!!!!!!!!!!!!!!!!!!!

	}

	private void addNewWord() {
		// ADDDDDDDDDDDD!!!!!!!!!!!!!!!

	}

	private void initializeElements() {
	frame = new JFrame("Translator");
		frame.setBackground(new Color(240, 248, 255));
		frame.getContentPane().setForeground(SystemColor.activeCaption);
		frame.setBounds(400, 400, 555, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(230, 230, 250));

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 230, 505, 139);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		outputTextField = new JTextField();
		outputTextField.setBounds(12, 13, 481, 111);
		panel_1.add(outputTextField);
		outputTextField.setColumns(10);

		btnTranslate.setBounds(195, 167, 143, 55); // Translate Button
		frame.getContentPane().add(btnTranslate);
		btnTranslate.setForeground(new Color(0, 0, 139));
		btnClearAll.setBounds(50, 172, 133, 45);

		frame.getContentPane().add(btnClearAll);

		btnEnterNewWord.setBounds(350, 172, 133, 45); // Enter New Word Button
		frame.getContentPane().add(btnEnterNewWord);

		JPanel panel = new JPanel();
		panel.setBounds(12, 19, 505, 140);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		userInputTextField = new JTextField();
		userInputTextField.setBounds(12, 13, 481, 111);
		panel.add(userInputTextField);
		userInputTextField.setColumns(10);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		frame.setJMenuBar(menuBar);

		JMenu mnEdit = new JMenu("Edit");// Create Menu
		menuBar.add(mnEdit);

		mnEdit.add(mntmCopyText);

		mnEdit.add(mntmCut_1); // Add to menu
		mnEdit.add(mntmPasteText_1); // Add to menu
		mnEdit.add(mntmCountWords); // Add to menu
	}

}
