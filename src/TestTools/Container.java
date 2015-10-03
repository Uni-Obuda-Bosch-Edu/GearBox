package TestTools;


// Dummy container


public class Container {

	private double BreakPedalState = 0.0;
	private int ShiftLeverPosition = 0;
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
	
	public double getWheelTorqueInNewton() {
		return WheelTorque;
	}

	public void setGearTorque(double gearTorque) {
		GearTorque = gearTorque;
	}

	public void setGearRevolution(int gearRevolution) {
		GearRevolution = gearRevolution;
		
	}

	public void setGearMode(int gearMode) {
		gearMode = gearMode;
	}

	public void setBrakePedalPushPercent(double breakPedalState) {
		BreakPedalState = breakPedalState;	
	}


	public void setCurrentGear(int currentGear) {
		Speed = currentGear;
		
	}


	public void setShiftLeverPosition(int shiftLeverPosition) {
		this.ShiftLeverPosition = shiftLeverPosition;
	
	}

	public void setEngineTorque(double engineTorque) {
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
		return BreakPedalState;
	}


	public void setWheelTorqueInNewton(double calcOutputTorque) {
		// TODO Auto-generated method stub
	}
	
}
