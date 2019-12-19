package chat;

import javax.swing.SwingUtilities;

import chat.view.MainDialog;

public class ChatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 0) {
		    System.err.println("usage: java chat.ChatMain");
		    System.exit(1);
		}
		
		SwingUtilities.invokeLater( new Runnable() {
			public void run() {
	            /*MainDialog ig =*/ new MainDialog();
	        }
		});
    }
}


