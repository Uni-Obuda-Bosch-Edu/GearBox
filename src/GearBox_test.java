import static org.junit.Assert.*;

import org.junit.Test;

import ImplBusInterface.GearBoxImpl;
import TestTools.Container;

public class GearBox_test {

	private Container bus = new Container();
	private GearBoxImpl gearBox = new GearBoxImpl();
	
	@Test
	public void testSetGearTorque() {
		assertEquals(1,1);
		
	}

	@Test
	public void testSetGearRevolution() {
		fail("Not yet implemented");
	}


	@Test
	public void testGetShiftLeverPosition() {
		bus.setEngineRevolution(2000);
		bus.setEngineTorque(30.5);
		bus.setCurrentGear(100);
		bus.setGearMode(7);
	
		int mode = bus.getGearMode();
		System.out.format("%d\n",mode);
		fail("Not yet implemented");
	}

	@Test
	public void testGetGearTorque() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGearRevolution() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGearMode() {
		fail("Not yet implemented");
	}

}
