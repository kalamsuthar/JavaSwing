package gui;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new MainFrame();
				//JFrame frame = new JFrame("Hello World");
				
			}
		});
		
	}

}
