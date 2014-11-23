package mta.se.mvc.views;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;


import javax.swing.*;
/**
 * 
 * @author uioana
 *
 */
public class TempView extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel temperature = new JLabel("Temperature");
	private JLabel wind = new JLabel("Wind");
	private JButton refreshButton = new JButton("Refresh");
	private JTextField tempValue = new JTextField(4);
	private JTextField windValue = new JTextField(4);
	
	
	public TempView() {
		
		JPanel tempview = new JPanel();
		this.setFocusable(true);
		tempview.setBackground(new Color(100,0,0));
		wind.setFont(new Font("Comic", Font.ITALIC,18));
		wind.setForeground(new Color(255,255,255));
		temperature.setFont(new Font("Comic", Font.ITALIC,18));
		temperature.setForeground(new Color(255,255,255));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		
		tempValue.setText("-");
		windValue.setText("-");
		tempview.add(temperature);
		tempview.add(tempValue);
		tempview.add(wind);
		tempview.add(windValue);
		tempview.add(refreshButton);
		
		this.add(tempview);
	}


	public void setTempValue(int temp) {
		tempValue.setText(Integer.toString(temp));
	}

	public void setWindValue(int wind) {
		windValue.setText(Integer.toString(wind));
	}

	/** 
	 * Method that create an action for refresh button
	 * @param listenForRefreshButton
	*/
	public void viewTempListener(ActionListener listenForRefreshButton){
		refreshButton.addActionListener(listenForRefreshButton);	
	}
	/**
	 * Method created for errors
	 * @param err
	 */
	public void errorMessage(String err){
		JOptionPane.showMessageDialog(this, err);
	}
	
}
