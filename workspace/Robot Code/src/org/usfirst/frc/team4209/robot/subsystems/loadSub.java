package org.usfirst.frc.team4209.robot.subsystems;

import org.usfirst.frc.team4209.robot.OI;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class loadSub extends Subsystem {
	private static loadSub instance = new loadSub();
    
	
	public static loadSub getInstance() {
		return instance;
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	// RUN AS --> WPI JAVA DEPLOY (after imaging)
	//Current Issues: did not bind the buttons to launchers
	private loadSub () { }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
  //  if (OI.gunLoader() = 1);
    public void start() {
    	
    	OI.getInstance().oneLoadTalon(1);
    }
    public void stop() {
    	OI.getInstance().oneLoadTalon(0);
    }
}
