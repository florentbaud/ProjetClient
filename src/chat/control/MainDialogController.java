package chat.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import chat.view.ImageDialog;
import chat.view.MainDialog;


public class MainDialogController implements ActionListener{

	private MainDialog mainDialog;
	
	
	public MainDialogController(MainDialog m) {
		mainDialog = m;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == mainDialog.getButConnect()) {
                    
                    mainDialog.createShowPanelChat();
		}
		else if(e.getSource() == mainDialog.getButSend()) {
			
		}
		
		else if(e.getSource() == mainDialog.getButImage()) {
			new ImageDialog(mainDialog);
		}
		else if (e.getSource() == mainDialog.getButExit()) {
    		System.exit(0);
		}
	}
}
