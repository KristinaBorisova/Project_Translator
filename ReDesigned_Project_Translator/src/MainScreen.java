import java.awt.EventQueue;

public class MainScreen extends PannelLayout2 {

public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PannelLayout2 window = new PannelLayout2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
