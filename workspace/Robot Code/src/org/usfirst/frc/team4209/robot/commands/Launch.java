package org.usfirst.frc.team4209.robot.commands;

import org.usfirst.frc.team4209.robot.subsystems.launchSub;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Launch extends Command {
	public static Subsystem launchsub = launchSub.getInstance();

    public Launch() {
    	super ("Launch");
    	requires(launchsub);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	((launchSub) launchsub).start();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	((org.usfirst.frc.team4209.robot.subsystems.launchSub) launchsub).stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	((launchSub) launchsub).stop();
    }
}