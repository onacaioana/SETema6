package mta.se.mvc;

import mta.se.mvc.controllers.TempController;
import mta.se.mvc.model.TempModel;
import mta.se.mvc.views.TempView;

/**
 * Main class
 * @author uioana
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TempView mView = new TempView();
		TempModel mModel = new TempModel();

		TempController mController = new TempController(mModel, mView);
		mView.setVisible(true);
	
		
	}

}
