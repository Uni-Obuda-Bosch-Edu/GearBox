package TestTools;


// Dummy container


public class Container {//implements Engine_Out, DriverInput_Out, Gearbox_Out, Wheels_Out, Public_In{

	private double BreakPedalState;
	private int ShiftLeverPosition;
	private double EngineTorque = 0.0;
	private double EngineRevolution = 0.0;
	private double GearTorque = 0.0;
	private double GearRevolution = 0.0;
	private int gearMode = 0;
	private double WheelRevolution = 0.0;
	private double WheelTorque = 0.0;
	private int Speed = 0;
	private static Container instance = null;
	
	public static Container getInstance(){
		if(instance == null)
			instance = new Container();
		return instance;
	}
	
	
	public int getMaxGear() {
		// TODO Auto-generated method stub
		return 0;
	}



	public int getShiftLeverPosition() {
		return ShiftLeverPosition;
	}


	public double getGearTorque() {
		return GearTorque;
	}


	public int getGearRevolution() {
		return (int)GearRevolution;
	}

	public int getGearMode() {
		return ShiftLeverPosition;
	}


	public double getEngineTorque() {
	
		return EngineTorque;
	}

	public int getEngineRevolution() {
		
		return (int)EngineRevolution;
	}


	public double getWaterTemperature() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public double getOilTemperature() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getOilPressure() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int getServiceCode() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getCenterOfXAxis() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getCenterOfYAxis() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public double getMotionVectorXWithLengthAsSpeedInKm() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getMotionVectorYWithLengthAsSpeedInKm() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getWheelTorqueInNewton() {
		return WheelTorque;
	}


	public double getMaximumTorqueInNewton() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getMaximumBrakeTorqueInNewton() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getFrictionalCoefficientOfBrakes() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getDiameterOfDriveAxesInMeters() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getLengthOfAxesInMeters() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getDistanceBetweenAxesInMeters() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getDiameterOfWheelsInMeters() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getWidthOfWheelsInMeters() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public double getDriveWheelStateZeroBasedDegree() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getMaximumDriveWheelStateZeroBasedDegree() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getMaximumWheelsTurnDegree() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getTotalMassInKg() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public double getInnerFrictionalCoefficientInNewton() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public void setGearTorque(double gearTorque) {
		GearTorque = gearTorque;
	}

	public void setGearRevolution(int gearRevolution) {
		GearRevolution = gearRevolution;
		
	}


	public void setGearMode(int gearMode) {
		this.gearMode = gearMode;
	}


	public void setEngineToggleButtonState(boolean buttonState) {
		// TODO Auto-generated method stub
		
	}


	public void setWheelRotationPercent(double steeringWheelAngle) {
		// TODO Auto-generated method stub
		
	}

	
	public void setSteeringWheelMaxAngle(double steeringWheelMaxAngle) {
		// TODO Auto-generated method stub
		
	}

	
	public void setBrakePedalPushPercent(double breakPedalState) {
		
		this.BreakPedalState = breakPedalState;	
		System.out.format("%f\n", breakPedalState);
		System.out.format("%f\n",this.BreakPedalState);
	}


	public void setGasPedalPushPercent(double gasPedalPercent) {
		// TODO Auto-generated method stub
		
	}


	public void setCurrentGear(int currentGear) {
		Speed = currentGear;
		
	}


	public void setMaxGear(int maxGear) {
		// TODO Auto-generated method stub
		
	}


	public void setShiftLeverPosition(int shiftLeverPosition) {
		this.ShiftLeverPosition = shiftLeverPosition;
	
	}

	public void setEngineTorque(double engineTorque) {
		System.out.println("bus");
		EngineTorque = engineTorque;
		
	}

	public void setEngineRevolution(int engineRevolution) {
		EngineRevolution = engineRevolution;
		
	}



	public int getCurrentGear() {
		return Speed;
	}


	public void setWheelRevoltuion(double revolution) {
		WheelRevolution = revolution;
		
	}


	public double getBrakePedalPercentage() {
		System.out.println("breakget");
		System.out.format("%f\n",BreakPedalState);
		return BreakPedalState;
	}


	public void setWheelTorqueInNewton(double calcOutputTorque) {
		// TODO Auto-generated method stub
		
	}
	
}
