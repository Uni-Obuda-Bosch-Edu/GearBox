package virtualDataBus;
import static org.junit.Assert.*;

import org.junit.Test;

import ImplBusInterface.GearBoxImpl;
import TestTools.Container;

public class GearBox_test {

	private Container bus = Container.getInstance();
	private GearBoxImpl gearBox = new GearBoxImpl();
	
	@Test
	public void testSetGearTorque() {
		bus.setEngineTorque(100);
		bus.setEngineRevolution(3000);
		
		bus.setBrakePedalPushPercent(100); // break pedal teljesen benyomva
		bus.setShiftLeverPosition(7);	// Drive
		bus.setCurrentGear(20);	// input speed
		gearBox.setGearMode(0);	// felesleges input
		
		double torque = gearBox.getGearTorque();
		System.out.format("torque %f\n",torque);
	
		double torq_calc = 100 * 5.2469;
		assertEquals((int)torque,(int)torq_calc);

	}
	@Test
	public void testSetGearTorque_reverse() {
		bus.setEngineTorque(100);
		bus.setEngineRevolution(3000);
		
		bus.setBrakePedalPushPercent(100); // break pedal teljesen benyomva
		bus.setShiftLeverPosition(10);	// Reverse
		bus.setCurrentGear(-20);	// input speed
		gearBox.setGearMode(0);	// felesleges input
		
		double torque = gearBox.getGearTorque();
		System.out.format("torque_rev %f\n",torque);
	
		double torq_calc = (100 * 5.2469) * (-1.0);
		assertEquals((int)torque,(int)torq_calc);

	}

	@Test
	public void testSetGearRevolution() {
		bus.setEngineTorque(100);
		bus.setEngineRevolution(3000);
		
		bus.setBrakePedalPushPercent(100); // break pedal teljesen benyomva
		bus.setShiftLeverPosition(7);	// Drive
		bus.setCurrentGear(20);	// input speed
		gearBox.setGearMode(0);	// felesleges input
		
		double revolution = gearBox.getGearRevolution();
		System.out.format("revolution %f\n",revolution);
		
		double rev_calc = 3000/ 5.2469;
		assertEquals((int)revolution,(int)rev_calc);
	}
	@Test
	public void testSetGearREvolution_reverse() {
		bus.setEngineTorque(100);
		bus.setEngineRevolution(3000);
		
		bus.setBrakePedalPushPercent(100); // break pedal teljesen benyomva
		bus.setShiftLeverPosition(10);	// Reverse
		bus.setCurrentGear(-20);	// input speed
		gearBox.setGearMode(0);	// felesleges input
		
		double revolution = gearBox.getGearRevolution();
		System.out.format("revolution_rev %f\n",revolution);
	
		double rev_calc = (100 * 5.2469) * (-1.0);
		assertEquals((int)revolution,(int)rev_calc);

	}

	@Test
	public void testGetShiftLeverPosition() {
				
		bus.setBrakePedalPushPercent(100); // break pedal teljesen benyomva
	
		bus.setShiftLeverPosition(7);	// Drive

		bus.setCurrentGear(2);	// input speed
		gearBox.setGearMode(0);	// felesleges input
	
		int mode = gearBox.getGearMode();
		System.out.format("mode %d\n",mode);
		assertEquals(1,mode);
		
		bus.setCurrentGear(10);	// input speed
		gearBox.setGearMode(0);	// felesleges input
	
		mode = gearBox.getGearMode();
		System.out.format("mode %d\n",mode);
		assertEquals(2,mode);
		
		bus.setCurrentGear(15);	// input speed
		gearBox.setGearMode(0);	// felesleges input
	
		mode = gearBox.getGearMode();
		System.out.format("mode %d\n",mode);
		assertEquals(3,mode);
		
		bus.setCurrentGear(25);	// input speed
		gearBox.setGearMode(0);	// felesleges input
	
		mode = gearBox.getGearMode();
		System.out.format("mode %d\n",mode);
		assertEquals(4,mode);
		
		bus.setCurrentGear(30);	// input speed
		gearBox.setGearMode(0);	// felesleges input
	
		mode = gearBox.getGearMode();
		System.out.format("mode %d\n",mode);
		assertEquals(5,mode);
		
		bus.setCurrentGear(50);	// input speed
		gearBox.setGearMode(0);	// felesleges input
	
		mode = gearBox.getGearMode();
		System.out.format("mode %d\n",mode);
		assertEquals(6,mode);
		
		
		bus.setBrakePedalPushPercent(100); // break pedal teljesen benyomva
		
		bus.setShiftLeverPosition(10);	// Reverse

		bus.setCurrentGear(-20);	// input speed
		gearBox.setGearMode(0);	// felesleges input
	
		mode = gearBox.getGearMode();
		System.out.format("mode %d\n",mode);
		assertEquals(0,mode);
	}

	
	@Test
	public void testGetGearMode() {
		bus.setBrakePedalPushPercent(100); // break pedal teljesen benyomva
		
		bus.setShiftLeverPosition(7);	// Drive

		bus.setCurrentGear(2);	// input speed
		gearBox.setGearMode(0);	// felesleges input
	
		int mode = gearBox.getGearMode();
		System.out.format("mode %d\n",mode);
		assertEquals(1,mode);
	}

}
