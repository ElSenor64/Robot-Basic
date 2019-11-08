Joystick mobilityController;
double driveSpeedAxis;
double driveTurnAxis;

WPI_TalonSRX frontLeftMotor;
WPI_TalonSRX middleLeftMotor;
WPI_TalonSRX backLeftMotor;

WPI_TalonSRX frontRightMotor;
WPI_TalonSRX middleRightMotor;
WPI_TalonSRX backRightMotor;

SpeedControllerGroup leftMotors;
SpeedControllerGroup rightMotors;

DifferentialDrive robotDrive;

driveSpeedAxis = mobilityController.getRawAxis(1);
driveTurnAxis = mobilityController.getRawAxis(4);

robotDrive.arcadeDrive(driveSpeedAxis, driveTurnAxis);
