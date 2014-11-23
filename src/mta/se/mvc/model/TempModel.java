package mta.se.mvc.model;

import java.util.Random;

/**
 * This class is for model, where we initialize all the data
 * @author uioana
 *
 */
public class TempModel {

	private int tempValue;
	private int windValue;
	
	/**
	 * This is the constructor
	 */
	public TempModel(){

		Random randWind = new Random();
		Random randTemp = new Random();
		
		this.tempValue = randTemp.nextInt(40)+1;
		this.windValue = randWind.nextInt(100)+1;
		
	}
	//this is a method that set a random value for temeprature and wind
	public void setValues(){
		Random randTemp = new Random();
		this.tempValue = randTemp.nextInt(40);
		
		Random randWind = new Random();
		this.windValue = randWind.nextInt(100);
	}
	
	public int getTempValue() {
		Random rand = new Random();
		return rand.nextInt(40);
	}


	public int getWindValue() {
		Random rand = new Random();
		return rand.nextInt(40);
	}
	
	
}
