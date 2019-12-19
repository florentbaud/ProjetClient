package chat.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import chat.view.ImageDialog;

public class ImageDialogController implements ActionListener {

	private ImageDialog imageDialog;
	
	public ImageDialogController(ImageDialog idiag) {
		imageDialog = idiag;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == imageDialog.getButSearch()) {
			
		}
		else if (e.getSource() == imageDialog.getButClose()) {
			imageDialog.dispose();
		}
	}
}
