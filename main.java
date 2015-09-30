
public class main {

	public static void main(String[] args) {

		gearbox gear = new gearbox();
		gear.setInputSpeed(30); // [km/h]
	//	gear.setInputSeedRound();	//[1/min]
		gear.setInputTorque(56);	// [Nm]
		
		gear.shift("R");
		
		
		double torque =  gear.getOutputTorque();
		double speed_round = gear.getOutputSpeedRound();
		int state = gear.getGearBoxStatus();
	/*	double speed = gear.getOutputSpeed();
		speed *= 3.6; */
		System.out.format("state : [%d]\n",state);//,speed);
		System.out.format("torque: [%f][Nm]\t speed_round: [%f][1/min]\n", torque,speed_round);

	}

}
