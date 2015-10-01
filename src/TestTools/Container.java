package TestTools;
import busInterface.DriverInput_Out;
import busInterface.Engine_Out;
import busInterface.Gearbox_Out;
import busInterface.Public_In;
import busInterface.Wheels_Out;



// Dummy container



public class Container implements Engine_Out, DriverInput_Out, Gearbox_Out, Wheels_Out, Public_In{

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
	
	@Override
	public int getMaxGear() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getShiftLeverPosition() {
		return ShiftLeverPosition;
	}

	@Override
	public double getGearTorque() {
		return GearTorque;
	}

	@Override
	public int getGearRevolution() {
		return (int)GearRevolution;
	}

	@Override
	public int getGearMode() {
		return ShiftLeverPosition;
	}

	@Override
	public double getEngineTorque() {
	
		return EngineTorque;
	}

	@Override
	public int getEngineRevolution() {
		
		return (int)EngineRevolution;
	}

	@Override
	public double getWaterTemperature() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getOilTemperature() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getOilPressure() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getServiceCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getCenterOfXAxis() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getCenterOfYAxis() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMotionVectorXWithLengthAsSpeedInKm() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMotionVectorYWithLengthAsSpeedInKm() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getWheelTorqueInNewton() {
		return WheelTorque;
	}

	@Override
	public double getMaximumTorqueInNewton() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMaximumBrakeTorqueInNewton() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getFrictionalCoefficientOfBrakes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getDiameterOfDriveAxesInMeters() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getLengthOfAxesInMeters() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getDistanceBetweenAxesInMeters() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getDiameterOfWheelsInMeters() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getWidthOfWheelsInMeters() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getDriveWheelStateZeroBasedDegree() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMaximumDriveWheelStateZeroBasedDegree() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMaximumWheelsTurnDegree() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotalMassInKg() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getInnerFrictionalCoefficientInNewton() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setGearTorque(double gearTorque) {
		GearTorque = gearTorque;
	}

	@Override
	public void setGearRevolution(int gearRevolution) {
		GearRevolution = gearRevolution;
		
	}

	@Override
	public void setGearMode(int gearMode) {
		this.gearMode = gearMode;
	}

	@Override
	public void setEngineToggleButtonState(boolean buttonState) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setWheelRotationPercent(double steeringWheelAngle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSteeringWheelMaxAngle(double steeringWheelMaxAngle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBrakePedalPushPercent(double breakPedalState) {
		BreakPedalState = breakPedalState;	
	}

	@Override
	public void setGasPedalPushPercent(double gasPedalPercent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCurrentGear(int currentGear) {
		Speed = currentGear;
		
	}

	@Override
	public void setMaxGear(int maxGear) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setShiftLeverPosition(int shiftLeverPosition) {
		this.ShiftLeverPosition = shiftLeverPosition;
	
	}

	@Override
	public void setEngineTorque(double engineTorque) {
		EngineTorque = engineTorque;
		
	}

	@Override
	public void setEngineRevolution(int engineRevolution) {
		EngineRevolution = engineRevolution;
		
	}

	@Override
	public void setWaterTemperature(double waterTemperature) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setOilTemperature(double oilTemperature) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setOilPressure(double oilPressure) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setServiceCode(int serviceCode) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public double getSteeringWheelSignedPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double getGasPedalPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean getEngineToggleButtonState() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getCurrentGear() {
		return Speed;
	}

	@Override
	public void setWheelTorqueInNewton(double newTorque) {
		// TODO Auto-generated method stub
		
	}
	
	public void setWheelRevoltuion(double revolution) {
		WheelRevolution = revolution;
		
	}


	@Override
	public void setMaximumWheelTorqueInNewton(double newTorque) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMaximumBrakeTorqueInNewton(double newTorque) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFrictionalCoefficientOfBrakes(double coefficient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDiameterOfDriveAxesInMeters(double diameter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLengthOfAxesInMeters(double length) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDistanceBetweenAxesInMeters(double distance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDiameterOfWheelsInMeters(double diameter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setWidthOfWheelsInMeters(double width) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDriveWheelStateZeroBasedDegree(double degree) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMaximumDriveWheelStateZeroBasedDegree(double degree) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMaximumWheelsTurnDegree(double degree) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTotalMassInKg(double newMass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setInnerFrictionalCoefficientInNewton(double coefficient) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public double getBrakePedalPercentage() {
		return BreakPedalState;
	}
	
}
