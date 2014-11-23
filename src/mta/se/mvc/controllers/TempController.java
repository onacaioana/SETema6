package mta.se.mvc.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mta.se.mvc.model.TempModel;
import mta.se.mvc.views.TempView;

/**
 * This class is for controller 
 * Here we use view and model to create functionality of this program
 * 
 * @author uioana
 *
 */
public class TempController {

	//Members
	private TempView mView;
	private TempModel mModel;
	
	/**
	 * This is the constructor with 2 params:
	 * @param model
	 * @param view
	 */
	public TempController(TempModel model,TempView view){
		
		this.mView = view;
		this.mModel = model;
		
		this.mView.viewTempListener(new TempListener());
	}
	
	
	/**
	 * This class is used to create an action for refresh button
	 * @author uioana
	 *
	 */
	class TempListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			try{
				//set the random values for temperature and wind
				mModel.setValues();
				
				//set temperature and wind in view
				//values from model that we set above
				mView.setTempValue(mModel.getTempValue());
				mView.setWindValue(mModel.getWindValue());	
			}
			catch(NumberFormatException e){
				mView.errorMessage("You need to have 2 integer values");
				
			}	
		}
	}
	
	
}
