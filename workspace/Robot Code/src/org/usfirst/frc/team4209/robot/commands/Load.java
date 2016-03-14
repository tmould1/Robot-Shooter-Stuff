package org.usfirst.frc.team4209.robot.commands;

import org.usfirst.frc.team4209.robot.subsystems.loadSub;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Load extends Command {
	public static Subsystem loadsub = loadSub.getInstance();

    public Load() {
    	super ("Load");
    	requires(loadsub);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	((loadSub) loadsub).start();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	((org.usfirst.frc.team4209.robot.subsystems.loadSub) loadsub).stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	((loadSub) loadsub).stop();
    }
}
