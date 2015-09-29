
public class gearbox {
	private double inputTorque;
	//private double inputSpeedRound;
	
	private double outputTorque;
	private double outputSpeedRound;
	
	private double inputSpeed;
	//private double outputSpeed;
	
	private int gearBoxState;

	
	//private double maxEngineRound = 3500.0;	// 3500 [1/min]
	private double wheel = 1.831861129; //[m]
	
	// R 1 2 3 4 5 6
	private double gearRatios[]={-11.2961,12.5848,7.6574,5.2469,4.0080,2.5109,1.00};
	
	public int getGearBoxStatus(){
		return gearBoxState;
	}
	public void setInputSpeed(double speed){
		inputSpeed = speed;
	}
	/*public double getOutputSpeed(){
		return outputSpeed;
	}*/
	public double getOutputTorque(){
		return outputTorque;
	}
	public double getOutputSpeedRound(){
		return outputSpeedRound;
	}
	public void setInputTorque(double torque){
		inputTorque = torque;
	}
	/*public void setInputSeedRound(double speedRound){
		inputSpeedRound = speedRound;
	}*/

	private void calcOutputData(){
	//	outputSpeed = (wheel * maxEngineRound) / (gearRatios[gearBoxState] * 60.0);
		
		outputTorque = inputTorque * gearRatios[gearBoxState];
		
		outputSpeedRound = ((inputSpeed/3.6) * 60.0 * gearRatios[gearBoxState] )/ wheel;
		if(gearBoxState == 0){
			outputSpeedRound *= (-1.0);
		}
	}
	private int shiftReverse(){
		gearBoxState = 0;
		calcOutputData();
		return 0;
	}
	
	private int shiftDrive(){
	
		if(inputSpeed >= 0 && inputSpeed < 30.57){
			gearBoxState = 1;
			calcOutputData();
		}
		else if(inputSpeed >= 30.57 && inputSpeed < 50.24){
			gearBoxState = 2;
			calcOutputData();
		}
		else if(inputSpeed <= 50.24 && inputSpeed < 73.32){
			gearBoxState = 3;
			calcOutputData();
		}
		else if(inputSpeed >= 73.32 && inputSpeed < 95.98){
			gearBoxState = 4;
			calcOutputData();
		}
		else if(inputSpeed >= 95.98 && inputSpeed < 153.21){
			gearBoxState = 5;
			calcOutputData();
		}
		else if(inputSpeed >= 153.21){
			gearBoxState = 6;
			calcOutputData();
		}
		else if(inputSpeed < 0){
			gearBoxState = 0;
			calcOutputData();
		}
		else{
			return -1;	// -ESHIFT;
		}
		return 0;
		
	}
	
	public int shift(String shiftPosition){
		int st = 0;	
		if(shiftPosition == "P" || shiftPosition == "N"){
				outputTorque = 0.0;
				outputSpeedRound = 0.0;
			
				System.out.println( "Parking or N function");
			}
			else if(shiftPosition == "R"){
		
				st = shiftReverse();
				System.out.println( "Reverse function");
			}
			else if(shiftPosition == "D"){
			
				st = shiftDrive();
				System.out.println( "Drive function");
			}else{
				 st = -1;	//@TODO: -ESHIFT -: valtohiba enumba
			}
			
			return st;
	}
}
