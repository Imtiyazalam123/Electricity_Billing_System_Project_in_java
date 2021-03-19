package electricity;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Splash extends JPanel {

	JProgressBar progressBar;

	public Splash() {
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createLineBorder(Color.RED, 5));
		Icon icon = new ImageIcon(getClass().getResource("/icons/elect.jpg"));
		add(new JLabel(icon), BorderLayout.CENTER);
		progressBar = new JProgressBar(1, 100);
		progressBar.setForeground(Color.GREEN);
		progressBar.setPreferredSize(new Dimension(500, 30));
		add(progressBar, BorderLayout.SOUTH);
	}

	public void setProgress(int progress) {
		progressBar.setValue(progress);
	}

	public static void main(String args[]) {
		Splash sp = new Splash();
		JWindow win = new JWindow();
		win.setContentPane(sp);
		win.pack();
		win.setLocationRelativeTo(null);
		win.setVisible(true);
		try {
			for (int i = 1; i <= 100; i++) {
				Thread.sleep(50);
				sp.setProgress(i);
			}
		} catch (Exception e) {
		}
		win.setVisible(false);
		win.dispose();
		new Login();
	}
}
