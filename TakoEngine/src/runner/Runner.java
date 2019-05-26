package runner;

import renderEngine.Display;

public class Runner {

	Display display;
	
	public Runner() {
		display = new Display(720, 720);
		display.clearBackBuffer(0, 0, 0, 1);
		display.swapBuffers();
	}
	
	public static void main(String[] args) {
		new Runner();
	}
	
}
