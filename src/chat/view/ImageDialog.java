package chat.view;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import chat.control.ImageDialogController;

public class ImageDialog extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7226509081680464131L;
	
	private ImageDialogController imageDialogController;
	
	private JTextField textSearch;
	private JButton butSearch;
	private JButton butClose;
	private JPanel panImages;
	
	public ImageDialog(JFrame parent) {
		super(parent, "Image choice", true);
		
		imageDialogController = new ImageDialogController(this);
		
        JPanel panAll = new JPanel(new BorderLayout());
        
        JPanel panNorth = new JPanel();
        this.textSearch = new JTextField("", 30);
        this.butSearch = new JButton("Search");
        panNorth.add(textSearch);
        panNorth.add(butSearch);
        butSearch.addActionListener(imageDialogController);
        
        panImages = new JPanel();
        panImages.setLayout(new BoxLayout(panImages, BoxLayout.PAGE_AXIS));
        JScrollPane scrollPaneImages =  new JScrollPane (panImages);
        
        this.butClose = new JButton("Close");
        
        panAll.add(panNorth, BorderLayout.NORTH);
        panAll.add(scrollPaneImages, BorderLayout.CENTER);
        panAll.add(butClose, BorderLayout.SOUTH);
        butClose.addActionListener(imageDialogController);
        
        this.setContentPane(panAll);
        this.setLocationRelativeTo(null);
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        //setResizable(false);
        setVisible(true);
        
	}
	
	/**
	 * @return the textSearch
	 */
	public JTextField getTextSearch() {
		return textSearch;
	}

	/**
	 * @return the butSearch
	 */
	public JButton getButSearch() {
		return butSearch;
	}

	/**
	 * @return the butClose
	 */
	public JButton getButClose() {
		return butClose;
	}

	/**
	 * @return the panImages
	 */
	public JPanel getPanImages() {
		return panImages;
	}

}
