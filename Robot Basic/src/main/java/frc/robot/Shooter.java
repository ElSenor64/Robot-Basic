Joystick manipulatorController;
boolean shooterButton;
shooterButton = manipulatorController.getRawButton(1);

WPI_TalonSRX shooterMotor;

enum ShooterStates {
	NOT_MOVING, SPINNING
}

ShooterStates currentShooterState;
currentShooterState = ShooterStates.NOT_MOVING;

switch(currentShooterState) {
	case NOT_MOVING:
		if (shooterButton) {
			shooterMotor.set(1);
			currentShooterState = ShooterStates.SPINNING;
		}

	case SPINNING:
		if (!shooterButton) {
			shooterMotor.set(0);
			currentShooterState = ShooterStates.NOT_MOVING;
		}	
}
