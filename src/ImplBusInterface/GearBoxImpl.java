package ImplBusInterface;

import virtualDataBus.Container;
import busInterface.Gearbox_Out;
import busInterface.Public_In;

public class GearBoxImpl implements Public_In, Gearbox_Out {

	Container container;

	private final double gearRatios[] = { -11.2961, 12.5848, 7.6574, 5.2469, 4.0080, 2.5109, 1.00 };

	private int gearStatus;

	@Override
	public void setGearTorque(int gearTorque) {
			shiftDrive();
			// / lehet kikene szerveyni egy fuggvenybe es meghivni itt es a
		// setGearrevolutionba is

		// setWheelTorque(calcOutputTorque())
		// setWheelRevolution(calcOutputRevolution())
	}

	@Override
	public void setGearRevolution(int gearRevolution) {
		// int gearRevoljution not used

		// setWheelTorque(calcOutputTorque())
		// setWheelRevolution(calcOutputRevolution())
	}

	@Override
	public void setGearMode(int gearMode) {

		if (true) {// if(fek pedal contaner.getpedal... valami) akkor lehet ez

			if (isShiftLeverPositionD(container.getShiftLeverPosition())) {
				ShiftLeverPositionD();
			} else if (isShiftLeverPositionN(container.getShiftLeverPosition())) {
				ShiftLeverPositionN();
			} else if (isShiftLeverPositionP(container.getShiftLeverPosition())) {
				ShiftLeverPositionP();
			} else if (isShiftLeverPositionR(container.getShiftLeverPosition())) {
				ShiftLeverPositionR();
			}

		} else {
			setGearTorque((int) container.getGearTorque());
		}
	}

	private boolean isShiftLeverPositionD(int ShiftLeverPosition) {
		return ShiftLeverPosition == 7;
	}

	private boolean isShiftLeverPositionN(int ShiftLeverPosition) {
		return ShiftLeverPosition == 8;
	}

	private boolean isShiftLeverPositionP(int ShiftLeverPosition) {
		return ShiftLeverPosition == 9;
	}

	private boolean isShiftLeverPositionR(int ShiftLeverPosition) {
		return ShiftLeverPosition == 10;
	}

	private void ShiftLeverPositionD() {
		setGearTorque((int) container.getGearTorque());// interfaceben double
														// tipusra at kell irni
		setGearRevolution(container.getGearRevolution());
	}

	private void ShiftLeverPositionN() {
		setGearTorque(0);
		setGearRevolution(0);
	}

	private void ShiftLeverPositionP() { // / P and N kozott mi a kulonbseg
		setGearTorque(0);
		setGearRevolution(0);
	}

	private void ShiftLeverPositionR() {
		setGearRevolution(-1);
	}

	private void shiftDrive() {

		double inputSpeed = container.getCurrentGear();

		if (inputSpeed >= 0 && inputSpeed < 30.57) {
			gearStatus = 1;
		} else if (inputSpeed >= 30.57 && inputSpeed < 50.24) {
			gearStatus = 2;
		} else if (inputSpeed <= 50.24 && inputSpeed < 73.32) {
			gearStatus = 3;
		} else if (inputSpeed >= 73.32 && inputSpeed < 95.98) {
			gearStatus = 4;
		} else if (inputSpeed >= 95.98 && inputSpeed < 153.21) {
			gearStatus = 5;
		} else if (inputSpeed >= 153.21) {
			gearStatus = 6;
		} else if (inputSpeed < 0) {
			gearStatus = 0;
		}
	}

	private double calcOutputTorque(int gearTorque) {
		return gearTorque * gearRatios[container.getGearMode()];
	}

	private double calcOutputRevolution() {
		double wheel = 1.831861129; // inkabb container.getWheel valamit
									// hasznalj
		return ((container.getCurrentGear() / 3.6) * 60.0 * gearRatios[container.getGearMode()]) / wheel;
	}

	/*
	 * 
	 * public int shift(String shiftPosition){ int st = 0;
	 * if(isShiftLeverPositionP(getShiftLeverPosition()) ||
	 * isShiftLeverPositionR(getShiftLeverPosition())){
	 * ShiftLeverPositionPorR(); } else
	 * if(isShiftLeverPositionR(getShiftLeverPosition())){
	 * 
	 * st = shiftReverse(); System.out.println( "Reverse function"); } else
	 * if(isShiftLeverPositionD(getShiftLeverPosition())){
	 * 
	 * st = shiftDrive(); System.out.println( "Drive function"); }else{ st = -1;
	 * //@TODO: -ESHIFT -: valtohiba enumba }
	 * 
	 * return st; }
	 * 
	 * 
	 * private double wheel = 1.831861129; //[m]
	 */

	public GearBoxImpl() {
		container = Container.getInstance();
		gearStatus = 0;

	}

	@Override
	public double getSteeringWheelAngle() {
		return container.getSteeringWheelAngle();
	}

	@Override
	public double getSteeringWheelMaxAngle() {
		return container.getSteeringWheelMaxAngle();
	}

	@Override
	public double getBrakePedalAngle() {
		return container.getBrakePedalAngle();
	}

	@Override
	public double getBrakePedalMaxAngle() {
		return container.getBrakePedalMaxAngle();
	}

	@Override
	public double getGasPedalAngle() {
		return container.getGasPedalAngle();
	}

	@Override
	public double getGasPedalMaxAngle() {
		return container.getGasPedalMaxAngle();
	}

	@Override
	public int getCurrentGear() {
		return container.getCurrentGear();
	}

	@Override
	public int getMaxGear() {
		return container.getMaxGear();
	}

	@Override
	public int getShiftLeverPosition() {
		return container.getShiftLeverPosition();
	}

	@Override
	public double getGearTorque() {
		return container.getGearTorque();
	}

	@Override
	public int getGearRevolution() {
		return container.getGearRevolution();
	}

	@Override
	public int getGearMode() {
		return container.getGearMode();
	}

	@Override
	public double getEngineTorque() {
		return container.getEngineTorque();
	}

	@Override
	public int getEngineRevolution() {
		return container.getEngineRevolution();
	}

	@Override
	public double getWaterTemperature() {
		return container.getWaterTemperature();
	}

	@Override
	public double getOilTemperature() {
		return container.getOilTemperature();
	}

	@Override
	public double getOilPressure() {
		return container.getOilPressure();
	}

	@Override
	public int getServiceCode() {
		return container.getServiceCode();
	}

	@Override
	public double getCenterOfXAxis() {
		return container.getCenterOfXAxis();
	}

	@Override
	public double getCenterOfYAxis() {
		return container.getCenterOfYAxis();
	}

	@Override
	public double getMotionVectorXWithLengthAsSpeedInKm() {
		return container.getMotionVectorXWithLengthAsSpeedInKm();
	}

	@Override
	public double getMotionVectorYWithLengthAsSpeedInKm() {
		return getMotionVectorYWithLengthAsSpeedInKm();
	}

	@Override
	public double getWheelTorqueInNewton() {
		return container.getWheelTorqueInNewton();
	}

	@Override
	public double getMaximumTorqueInNewton() {
		return container.getMaximumBrakeTorqueInNewton();
	}

	@Override
	public double getFrictionalCoefficientOfBrakes() {
		return container.getFrictionalCoefficientOfBrakes();
	}

	@Override
	public double getDiameterOfDriveAxesInMeters() {
		return container.getDiameterOfDriveAxesInMeters();
	}

	@Override
	public double getLengthOfAxesInMeters() {
		return container.getLengthOfAxesInMeters();
	}

	@Override
	public double getDistanceBetweenAxesInMeters() {
		return container.getDistanceBetweenAxesInMeters();
	}

	@Override
	public double getDiameterOfWheelsInMeters() {
		return container.getDiameterOfWheelsInMeters();
	}

	@Override
	public double getWidthOfWheelsInMeters() {
		return container.getWidthOfWheelsInMeters();
	}

	@Override
	public double getDriveWheelStateZeroBasedDegree() {
		return container.getDriveWheelStateZeroBasedDegree();
	}

	@Override
	public double getMaximumDriveWheelStateZeroBasedDegree() {
		return container.getMaximumDriveWheelStateZeroBasedDegree();
	}

	@Override
	public double getMaximumWheelsTurnDegree() {
		return container.getMaximumWheelsTurnDegree();
	}

	@Override
	public double getTotalMassInKg() {
		return container.getTotalMassInKg();
	}

	@Override
	public double getInnerFrictionalCoefficientInNewton() {
		return container.getInnerFrictionalCoefficientInNewton();
	}

	@Override
	public double getMaximumBrakeTorqueInNewton() {
		return container.getMaximumBrakeTorqueInNewton();
	}

}