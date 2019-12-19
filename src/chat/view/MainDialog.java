package chat.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import chat.control.MainDialogController;

public class MainDialog extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1111091200888663537L;
	
	private MainDialogController mainDialogController;
	
	private JTextField textPseudo;
	private JTextField textServerIP;
	private JTextField textServerPort;
	private JLabel labelErrorConnect;
	private JButton butConnect;
	
	private JList<String> listPseudos;
	private JPanel panMessages;
	private JScrollPane scrollPaneMessages;
	private JTextField textMessage;
	private JButton butSend;
	private JButton butImage;
	private JButton butExit;

	public MainDialog() {
		mainDialogController = new MainDialogController(this);
		createShowPanelConnect();
	}

	private void createShowPanelConnect() {

        JPanel panAll = new JPanel(new BorderLayout());

        JPanel panCenter = new JPanel(new BorderLayout());
        
        JPanel panConnIP = new JPanel();
        textServerIP = new JTextField("",15);
        panConnIP.add(new JLabel("Server IP : "));
        panConnIP.add(textServerIP);
        
        JPanel panConnPort = new JPanel();
        textServerPort = new JTextField("",10);
        panConnPort.add(new JLabel("Server Port : "));
        panConnPort.add(textServerPort);
        
        JPanel panPseudo = new JPanel();
        textPseudo = new JTextField("",20);
        textPseudo.setMaximumSize(textPseudo.getPreferredSize());
        panPseudo.add(new JLabel("Pseudo : "));
        panPseudo.add(textPseudo);
        
        panCenter.add(panConnIP, BorderLayout.NORTH);
        panCenter.add(panConnPort, BorderLayout.CENTER);
        panCenter.add(panPseudo, BorderLayout.SOUTH);

        JPanel panSouth = new JPanel(new BorderLayout());
        labelErrorConnect = new JLabel("         "); //astuce
        //labelErrorConnect.setVisible(false);
        labelErrorConnect.setForeground(Color.RED);
        Font font = new Font("Courier", Font.BOLD, 12);
        labelErrorConnect.setFont(font);
        labelErrorConnect.setHorizontalAlignment(JLabel.CENTER);
        butConnect = new JButton("Connect");
        butConnect.addActionListener(mainDialogController);
        panSouth.add(labelErrorConnect, BorderLayout.NORTH);
        panSouth.add(butConnect, BorderLayout.CENTER);
        
        panAll.add(panCenter, BorderLayout.CENTER);
        panAll.add(panSouth, BorderLayout.SOUTH);
        
        setTitle("Connection");
        setContentPane(panAll);
		setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }
	
	public void createShowPanelChat() {
		JPanel panAll = new JPanel(new BorderLayout());
		
		listPseudos = new JList<String>();
		listPseudos.setFixedCellWidth(150);
		JScrollPane scrollPanePseudos = new JScrollPane();
		scrollPanePseudos.getViewport().setView(listPseudos);
		scrollPanePseudos.setBorder(BorderFactory.createTitledBorder("Connected customers"));
		
		panMessages = new JPanel();
		panMessages.setLayout(new BoxLayout(panMessages, BoxLayout.PAGE_AXIS));
        scrollPaneMessages =  new JScrollPane (panMessages);
		
        JPanel panSouth = new JPanel();
        this.textMessage = new JTextField("", 50);
        this.butSend = new JButton("Send");
        this.butImage = new JButton("Image");
        this.butExit = new JButton("Exit");
        panSouth.add(textMessage);
        panSouth.add(butSend);
        panSouth.add(butImage);
        panSouth.add(butExit);
        butSend.addActionListener(mainDialogController);
        butImage.addActionListener(mainDialogController);
        butExit.addActionListener(mainDialogController);
        JScrollPane scrollPaneSouth = new JScrollPane(panSouth);
        
        panAll.add(scrollPanePseudos, BorderLayout.EAST);
        panAll.add(scrollPaneMessages, BorderLayout.CENTER);
        panAll.add(scrollPaneSouth, BorderLayout.SOUTH);
		
        butConnect.removeActionListener(mainDialogController);
        getContentPane().removeAll();
        
        this.setTitle("LPro chat - "); // titre a modifier
        setSize(800, 500);
        setContentPane(panAll);
        setLocationRelativeTo(null);
	}

	/**
	 * @return the textPseudo
	 */
	public JTextField getTextPseudo() {
		return textPseudo;
	}

	/**
	 * @return the textServerIP
	 */
	public JTextField getTextServerIP() {
		return textServerIP;
	}

	/**
	 * @return the textServerPort
	 */
	public JTextField getTextServerPort() {
		return textServerPort;
	}

	/**
	 * @return the labelErrorConnect
	 */
	public JLabel getLabelErrorConnect() {
		return labelErrorConnect;
	}

	/**
	 * @return the butConnect
	 */
	public JButton getButConnect() {
		return butConnect;
	}

	/**
	 * @return the listPseudos
	 */
	public JList<String> getListPseudos() {
		return listPseudos;
	}

	/**
	 * @return the panMessages
	 */
	public JPanel getPanMessages() {
		return panMessages;
	}

	/**
	 * @return the scrollPaneMessages
	 */
	public JScrollPane getScrollPaneMessages() {
		return scrollPaneMessages;
	}

	/**
	 * @return the textMessage
	 */
	public JTextField getTextMessage() {
		return textMessage;
	}

	/**
	 * @return the butSend
	 */
	public JButton getButSend() {
		return butSend;
	}

	/**
	 * @return the butImage
	 */
	public JButton getButImage() {
		return butImage;
	}

	/**
	 * @return the butExit
	 */
	public JButton getButExit() {
		return butExit;
	}

}
