package demo;

import javax.swing.JOptionPane;
import javax.xml.rpc.ServiceException;

import demo.DemoClassService;
import demo.DemoClassServiceLocator;

public class Client {

	public static void main(String[] args) {
		DemoClassServiceLocator locator = new DemoClassServiceLocator();
		try {				
		DemoClassService demoClassService = locator.getDemoClassService();
		String filmName = JOptionPane.showInputDialog("Enter film name");
		String film = demoClassService.fetchFilm(filmName);
		JOptionPane.showMessageDialog(null , "full film name is:" + film);
	}catch (Exception e ) {
		e.printStackTrace();
		JOptionPane.showMessageDialog(null,  "Sorry don't know this film :" + e.getMessage());
	}
}
}