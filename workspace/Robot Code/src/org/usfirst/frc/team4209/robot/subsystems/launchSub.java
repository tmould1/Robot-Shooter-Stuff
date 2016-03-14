package org.usfirst.frc.team4209.robot.subsystems;

import org.usfirst.frc.team4209.robot.OI;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class launchSub extends Subsystem {
	private static launchSub instance = new launchSub();
    
	
	public static launchSub getInstance() {
		return instance;
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private launchSub() { }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void start() {
    	OI.getInstance().topGunTalon(1);
    	OI.getInstance().bottomGunTalon(1);
    }
    public void stop() {
    	OI.getInstance().oneLoadTalon(0);
    }
}
