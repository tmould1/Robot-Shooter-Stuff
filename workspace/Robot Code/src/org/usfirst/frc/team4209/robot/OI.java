package org.usfirst.frc.team4209.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.AnalogGyro;
//import edu.wpi.first.wpilibj.Ultrasonic;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private static OI instance = null;
	public AnalogGyro Gyro;
	public RobotDrive drive;
	public Joystick leftJoy;
	public Joystick rightJoy;
	public Joystick gunJoy;
	public JoystickButton gunTrigger;
	public JoystickButton gunLoader;
	public JoystickButton aimToggle;
	public SpeedController leftFrontTalon;
	public SpeedController leftBackTalon;
	public SpeedController rightFrontTalon;
	public SpeedController rightBackTalon;
	public SpeedController topGunTalon;
	public SpeedController bottomGunTalon;
	public SpeedController oneLoadTalon;
	public SpeedController twoLoadTalon;
	public SpeedController threeLoadTalon;
	public SpeedController fourLoadTalon;
	
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	public static OI getInstance() {
		if (instance == null) {
			instance = new OI();
		}
		return instance;
	}
OI() {
	drive = new RobotDrive(leftFrontTalon, rightFrontTalon, leftBackTalon, rightBackTalon);
	drive.setInvertedMotor(MotorType.kFrontLeft, true);
	drive.setInvertedMotor(MotorType.kFrontRight, true);
	leftJoy = new Joystick(0);
	rightJoy = new Joystick(1);
	gunJoy = new Joystick(2);
	aimToggle = new JoystickButton(gunJoy, 3);
	gunTrigger = new JoystickButton(gunJoy, 2);
	gunLoader = new JoystickButton(gunJoy, 1);
	leftFrontTalon = new Talon(0);
	leftBackTalon= new Talon(1);
	rightFrontTalon= new Talon(2);
	rightBackTalon = new Talon(3);
	topGunTalon = new Talon(4);
	bottomGunTalon = new Talon(5);
	oneLoadTalon = new Talon(6);
	
	//gunLoader.whileHeld(new Load);
	//gunTrigger.whileHeld(new Launch);
	//twoLoadTalon = new Talon(7);
	//threeLoadTalon = new Talon(8);
	//fourLoadTalon = new Talon(9);
	Gyro = new AnalogGyro(0);
}
public void oneLoadTalon(int i) {
	// TODO Auto-generated method stub
	
}
public void bottomGunTalon(int i) {
	// TODO Auto-generated method stub
	
}
public void topGunTalon(int i) {
	// TODO Auto-generated method stub
	
}
}
