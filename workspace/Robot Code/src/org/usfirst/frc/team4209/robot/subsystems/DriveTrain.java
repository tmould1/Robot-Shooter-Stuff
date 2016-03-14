package org.usfirst.frc.team4209.robot.subsystems;

import org.usfirst.frc.team4209.robot.OI;
import org.usfirst.frc.team4209.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	private static DriveTrain instance = new DriveTrain();
	/**
	 * @return The singleton instance of the drive train
	 */
	public static DriveTrain getInstance() {
		return instance;
	}
	private DriveTrain () { }
	
	public void initDefaultCommand(){
}

public void drive() {
	OI oi = OI.getInstance();
	double r = Robot.deadzone(Robot.DEADZONE, oi.rightJoy.getY());
	double y = Robot.deadzone(Robot.DEADZONE, oi.leftJoy.getY());
//	double r = Robot.deadzone(robot.DEADZONE, oi.rightJoy.getX());
	oi.drive.tankDrive(y, r);
}
public void drive(double mag, double dr) {
	OI oi = OI.getInstance();
	oi.drive.tankDrive(dr, mag);
}

public void stop() {
	OI.getInstance().drive.tankDrive(0, 0);
}
}