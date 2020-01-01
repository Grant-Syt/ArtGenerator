package art_generator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ArtGeneratorEditor {

	public static void main(String[] args) {
		
		JFrame mainFrame = new JFrame("Main Frame");
		mainFrame.setSize(1920,1080);
		mainFrame.setMinimumSize(new Dimension(1200, 600));
		mainFrame.setLocation(0,0);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // if you want the X button to close the app
		
		ArtGeneratorImpl artGenerator = new ArtGeneratorImpl(720, 480);
		artGenerator.drawLightGradient();
		
		JPanel imgFrame = new JPanel();
		Dimension imgFrameDimension = new Dimension(720, 480);
		imgFrame.setSize(imgFrameDimension);
		imgFrame.setMinimumSize(new Dimension(imgFrameDimension));
		mainFrame.getContentPane().add(BorderLayout.CENTER, imgFrame);
		imgFrame.add(new JLabel(new ImageIcon(artGenerator.getImage())));
		
		
		JPanel lButtonFrame = new JPanel();
		Dimension lButtonFrameDimension = new Dimension(50, 1080);
		lButtonFrame.setSize(lButtonFrameDimension);
		lButtonFrame.setMinimumSize(new Dimension(lButtonFrameDimension));
		lButtonFrame.setLayout(new BoxLayout (lButtonFrame, BoxLayout.Y_AXIS));
		mainFrame.getContentPane().add(BorderLayout.WEST, lButtonFrame);
		final JButton button1 = new JButton("Click Me");
		lButtonFrame.add(button1);
		final JButton button2 = new JButton("Click Me");
		lButtonFrame.add(button2);
		final JButton button3 = new JButton("Click Me");
		lButtonFrame.add(button3);
		final JButton button4 = new JButton("Click Me");
		lButtonFrame.add(button4);
		final JButton button5 = new JButton("Click Me");
		lButtonFrame.add(button5);
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				artGenerator.drawLightGradient();

			}
		});
		
		JPanel rButtonFrame = new JPanel();
		Dimension rButtonFrameDimension = new Dimension(50, 1080);
		rButtonFrame.setSize(rButtonFrameDimension);
		rButtonFrame.setMinimumSize(new Dimension(rButtonFrameDimension));
		rButtonFrame.setLayout(new BoxLayout (rButtonFrame, BoxLayout.Y_AXIS));
		mainFrame.getContentPane().add(BorderLayout.EAST, rButtonFrame);
		final JButton button6 = new JButton("Click Me");
		rButtonFrame.add(button6);
		final JButton button7 = new JButton("Click Me");
		rButtonFrame.add(button7);
		final JButton button8 = new JButton("Click Me");
		rButtonFrame.add(button8);
		final JButton button9 = new JButton("Click Me");
		rButtonFrame.add(button9);
		final JButton button10 = new JButton("Click Me");
		rButtonFrame.add(button10);
		button6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				artGenerator.drawLightGradient();

			}
		});
		
		mainFrame.pack();
		mainFrame.setVisible(true);

	}

}
