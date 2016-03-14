package org.usfirst.frc.team4209.robot.commands;
import org.usfirst.frc.team4209.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;
public class DefaultDrive extends Command {
	private static DriveTrain drivetrain = DriveTrain.getInstance();
	
	public DefaultDrive()  {
		super("DefaultDrive");
		requires(drivetrain);
	}
	protected void initialize() { }
	
	protected void execute() {
		drivetrain.drive();
	}

	protected boolean isFinished() {
		return false;
	}
	protected void end()  {
		drivetrain.stop();
	}
	
	protected void interrupted()  {
		drivetrain.stop();
	}
}