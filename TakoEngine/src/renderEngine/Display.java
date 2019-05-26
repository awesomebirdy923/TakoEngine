package renderEngine;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Display {

	private static final String TITLE = "Tako Engine";
	
	private JFrame frame;
	private JLabel display;
	
	private static final int BYTES_PER_PIXEL = 4;
	
	private BufferedImage imageBuffer;
	private byte[] backBuffer;
	
	public Display(int width, int height) {
		frame = new JFrame(TITLE);
		display = new JLabel();
		backBuffer = new byte[width*height*BYTES_PER_PIXEL];
		imageBuffer = new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
		display.setMinimumSize(new Dimension(width, height));
		display.setMaximumSize(new Dimension(width, height));
		display.setPreferredSize(new Dimension(width, height));
		frame.add(display);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	public void clearBackBuffer(float r, float b, float g, float a) {
		for (int i = 0; i < backBuffer.length; i+=4) {
			backBuffer[i] = (byte) (a*255);
			backBuffer[i+1] = (byte) (b*255);
			backBuffer[i+2] = (byte) (g*255);
			backBuffer[i+3] = (byte) (r*255);
		}
	}
	
	public void swapBuffers() {
		byte[] buffer = ((DataBufferByte)imageBuffer.getRaster().getDataBuffer()).getData();
		System.arraycopy(backBuffer, 0, buffer, 0, backBuffer.length);
		display.setIcon(new ImageIcon(imageBuffer));
		frame.pack();
	}
	
}
