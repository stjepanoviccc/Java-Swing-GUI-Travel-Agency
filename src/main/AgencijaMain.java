package main;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import controller.LoginController;

public class AgencijaMain {

    public static void main(String[] args) {
    	// set window properties
    	try {
    	    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
    	        if ("Nimbus".equals(info.getName())) {
    	            UIManager.setLookAndFeel(info.getClassName());
    	            break;
    	        }
    	    }
    	} catch (Exception e) {
    	    // If Nimbus is not available, you can set the GUI to another look and feel.
    	}
    	
    	LoginController.tryLogin();
    }
}