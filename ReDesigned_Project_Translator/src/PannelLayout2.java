import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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

public class PannelLayout2 extends TranslatorTextFilter {

	private static JFrame frame;
	private JTextField userInputTextField;
	private JTextField outputTextField;
	
	public JButton btnClearAll = new JButton("Clear All");
	public JButton btnEnterNewWord = new JButton("Enter word");
	public JButton btnTranslate = new JButton("Translate");

	public JMenuItem mntmCopyText = new JMenuItem("Coppy");
	public JMenuItem mntmCut_1 = new JMenuItem("Cut");
	public JMenuItem mntmPasteText_1 = new JMenuItem("Paste Text");
	public JMenuItem mntmMostCommonWord_1 = new JMenuItem("Most common Word");
	public JMenuItem mntmCountWords = new JMenuItem("Count words");


	
		// String iconPath = "C:\Desktop\Final Project\icon.png";
		// Image icon = new
		// ImageIcon(getClass().getResource(iconPath)).getImage();
		// frame.setIconImage(icon);
	}

	public PannelLayout2() {
		initialize();
		btnsActions();
	}


//Buttons Actions//
private void btnsActions() {
		btnClearAll.addActionListener(new ActionListener() { // "Clear All" Button Action
			public void actionPerformed(ActionEvent arg0) {
				clearAll();
			}
		});

		btnTranslate.addActionListener(new ActionListener() { // "Translate" Button Action
			public void actionPerformed(ActionEvent e) {
				translateInput();

			}

		});

		btnEnterNewWord.addActionListener(new ActionListener() { //"Enter Word" Button Action
			public void actionPerformed(ActionEvent e) {
				addNewWord(); // Add code to Method

			}
		});

	} // End Of method


	private void clearAll() {//function for "Clear All" button
		userInputTextField.setText("");
		outputTextField.setText("");
	}







	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(SystemColor.activeCaption);
		frame.setBounds(400, 400, 555, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.GREEN);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 230, 505, 139);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		userInputTextField = new JTextField();
		userInputTextField.setBounds(12, 13, 481, 111);
		panel_1.add(userInputTextField);
		userInputTextField.setColumns(10);

		JButton btnTranslate = new JButton("\u0422ranslate");
		btnTranslate.setBounds(195, 162, 143, 55);
		frame.getContentPane().add(btnTranslate);
		btnTranslate.setForeground(new Color(100, 149, 237));
		btnClearAll.setBounds(50, 172, 133, 45);
		frame.getContentPane().add(btnClearAll);

		btnEnterNewWord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ïðè âúâåæäàíå íà äóìà è ïðåâîäà é è íàòèñêàíå íà áóòîí
				// Âúâåäè, ðå÷íèêúò çàïîìíÿ äóìàòà.
				// Òîâà ðàáîòè ñàìî çà äóìè. Ïðè âúâåæäàíå íà ïîâå÷å îò äóìà è
				// íàòèñêàíå íà Âúâåäè - èçëèçà ãðåøêà.

			}
		});
		btnEnterNewWord.setBounds(350, 172, 133, 45);
		frame.getContentPane().add(btnEnterNewWord);

		JPanel panel = new JPanel();
		panel.setBounds(12, 19, 505, 140);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		outputTextField = new JTextField();
		outputTextField.setBounds(12, 13, 481, 111);
		panel.add(outputTextField);
		outputTextField.setColumns(10);
		btnClearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					userInputTextField.setText("");
					outputTextField.setText("");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "No text to clear");
				}
			}
		});
		btnTranslate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		mnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mnEdit.show();
			}
		});

		JMenuItem mntmCopyText = new JMenuItem("Coppy");
		mntmCopyText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					userInputTextField.copy();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "No text.Try Again!");
				}

			}
		});
		mntmCopyText.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}

			public void ancestorMoved(AncestorEvent arg0) {
			}

			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		mnEdit.add(mntmCopyText);

		JMenuItem mntmPasteText_1 = new JMenuItem("Paste Text");
		mntmPasteText_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputTextField.paste();
			}
		});
		mnEdit.add(mntmPasteText_1);

		JMenuItem mntmCut = new JMenuItem("Cut");

		JMenuItem mntmMostCommonWord_1 = new JMenuItem("Most common Word");
		mnEdit.add(mntmMostCommonWord_1);

		JMenuItem mntmCountWords = new JMenuItem("Count words");
		mnEdit.add(mntmCountWords);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
